#import "BlinkIDReactNativeOverlayViewController.h"

@interface BlinkIDReactNativeOverlayViewController ()

@end

@implementation BlinkIDReactNativeOverlayViewController
- (void) viewDidLoad {
    [super viewDidLoad];
    if (self.customTooltipLabel) {
        self.idCardSubview.tooltipLabel.text = self.customTooltipLabel;
        self.idCardSubview.tooltipLabel.numberOfLines = 0;
        self.idCardSubview.tooltipLabel.lineBreakMode = NSLineBreakByWordWrapping;
    }
}

@end
