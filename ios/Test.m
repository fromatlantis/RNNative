//
//  Test.m
//  RNNative
//
//  Created by Vincent on 2019/10/17.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import "Test.h"

@implementation Test

/*
// Only override drawRect: if you perform custom drawing.
// An empty implementation adversely affects performance during animation.
- (void)drawRect:(CGRect)rect {
    // Drawing code
}
*/
- (instancetype)init
{
    self = [super init];
    if (self) {
         [self setup];
    }
    return self;
}
- (void)setup {
    UIButton *button = [UIButton buttonWithType:UIButtonTypeCustom];
    button.frame = CGRectMake(0, 0, 80, 40);
    button.backgroundColor = [UIColor yellowColor];
    button.titleLabel.font = [UIFont systemFontOfSize:13];
    [button setTitle:@"原生组件" forState:UIControlStateNormal];
    [button setTitleColor:[UIColor blackColor] forState:UIControlStateNormal];
  [button addTarget:self action:@selector(doClick) forControlEvents:UIControlEventTouchUpInside];
    self.button = button;
    [self addSubview:button];
}

- (void)doClick {
  NSLog(@"1111");
  if(self.onPlay)
  {
    self.onPlay(@{@"message":@"我是iOS Native传过来的值"});
  }
}
@end
