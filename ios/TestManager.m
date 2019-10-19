//
//  TestManager.m
//  RNNative
//
//  Created by Vincent on 2019/10/17.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import "TestManager.h"
#import "Test.h"
@implementation TestManager
RCT_EXPORT_MODULE()
RCT_EXPORT_VIEW_PROPERTY(onPlay, RCTBubblingEventBlock)
- (UIView *)view
{
    return [[Test alloc] init];
}
@end
