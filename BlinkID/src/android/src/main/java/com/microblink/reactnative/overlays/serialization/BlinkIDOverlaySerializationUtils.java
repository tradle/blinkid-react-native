package com.microblink.reactnative.overlays.serialization;

import com.facebook.react.bridge.ReadableMap;
import com.microblink.hardware.camera.CameraType;
import com.microblink.uisettings.BaseVerificationUISettings;
import com.microblink.uisettings.DocumentUISettings;
import com.microblink.uisettings.DocumentVerificationUISettings;

public abstract class BlinkIDOverlaySerializationUtils {
    public static void extractCommonVerificationUISettings(ReadableMap jsonOverlaySettings, BaseVerificationUISettings verificationUISettings) {
        if (jsonOverlaySettings.hasKey("useFrontCamera")) {
            if (jsonOverlaySettings.getBoolean("useFrontCamera")) {
                verificationUISettings.setCameraTypeForDocumentScan(CameraType.CAMERA_FRONTFACE);
            }
        }

        if (verificationUISettings instanceof DocumentVerificationUISettings) {
            DocumentVerificationUISettings docVerSettings = (DocumentVerificationUISettings) verificationUISettings;
            if (jsonOverlaySettings.hasKey("firstSideInstructionsRID")) {
                int rid = jsonOverlaySettings.getInt("firstSideInstructionsRID");
                docVerSettings.setFirstSideInstructionsResourceID(rid);
            }

            if (jsonOverlaySettings.hasKey("firstSideTitleRID")) {
                int rid = jsonOverlaySettings.getInt("firstSideTitleRID");
                docVerSettings.setFirstSideTitleResourceID(rid);
            }

            if (jsonOverlaySettings.hasKey("secondSideInstructionsRID")) {
                int rid = jsonOverlaySettings.getInt("secondSideInstructionsRID");
                docVerSettings.setSecondSideInstructionsResourceID(rid);
            }

            if (jsonOverlaySettings.hasKey("secondSideTitleRID")) {
                int rid = jsonOverlaySettings.getInt("secondSideTitleRID");
                docVerSettings.setSecondSideTitleResourceID(rid);
            }
        }

//    if ([overlaySettings isKindOfClass:[MBBaseOverlaySettings class]]) {
//        MBBaseOverlaySettings *baseOverlaySettings = (MBBaseOverlaySettings*)overlaySettings;
//        {
//            id enableBeep = [jsonOverlaySettings objectForKey:@"enableBeep"];
//            if (enableBeep != nil && [(NSNumber*)enableBeep boolValue]) {
//                baseOverlaySettings.soundFilePath = @"PPBeep.wav";
//            }
//        }
//    }
//
//    if ([overlaySettings isKindOfClass:[MBDocumentOverlaySettings class]]) {
//        MBDocumentOverlaySettings *docOverlaySettings = (MBDocumentOverlaySettings*)overlaySettings;
//        {
//            id tooltipText = [jsonOverlaySettings objectForKey:@"tooltipText"];
//            if (tooltipText != nil && tooltipText != NSNull.null) {
//                docOverlaySettings.tooltipText = (NSString *)tooltipText;
//            }
//        }
//    }
//
//    if ([overlaySettings isKindOfClass:[MBDocumentVerificationOverlaySettings class]]) {
//        MBDocumentVerificationOverlaySettings *docVerOverlaySettings = (MBDocumentVerificationOverlaySettings*)overlaySettings;
//        {
//            id firstSideInstructions = [jsonOverlaySettings objectForKey:@"firstSideInstructions"];
//            if (firstSideInstructions != nil && firstSideInstructions != NSNull.null) {
//                docVerOverlaySettings.firstSideInstructions = (NSString *)firstSideInstructions;
//            }
//        }
//
//        {
//            id secondSideInstructions = [jsonOverlaySettings objectForKey:@"secondSideInstructions"];
//            if (secondSideInstructions != nil && secondSideInstructions != NSNull.null) {
//                docVerOverlaySettings.secondSideInstructions = (NSString *)secondSideInstructions;
//            }
//        }
//
//        {
//            id firstSideSplashMessage = [jsonOverlaySettings objectForKey:@"firstSideSplashMessage"];
//            if (firstSideSplashMessage != nil && firstSideSplashMessage != NSNull.null) {
//                docVerOverlaySettings.firstSideSplashMessage = (NSString *)firstSideSplashMessage;
//            }
//        }
//
//        {
//            id secondSideSplashMessage = [jsonOverlaySettings objectForKey:@"secondSideSplashMessage"];
//            if (secondSideSplashMessage != nil && secondSideSplashMessage != NSNull.null) {
//                docVerOverlaySettings.secondSideSplashMessage = (NSString *)secondSideSplashMessage;
//            }
//        }
//    }
//}
    }
}
