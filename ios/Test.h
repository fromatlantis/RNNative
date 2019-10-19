//
//  Test.h
//  RNNative
//
//  Created by Vincent on 2019/10/17.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <React/RCTComponent.h>
NS_ASSUME_NONNULL_BEGIN

@interface Test : UIView
@property (strong, nonatomic) UIButton *button;
@property (nonatomic, copy) RCTBubblingEventBlock onPlay;
@end

NS_ASSUME_NONNULL_END
