//
//  WHSwiftClass.m
//  TwillioTesting
//
//  Created by Apple on 16/03/21.
//

#import <Foundation/Foundation.h>

#import "React/RCTBridgeModule.h"

@interface RCT_EXTERN_MODULE (WHSwiftClass, NSObject)

RCT_EXTERN_METHOD(printMeNow: (NSString*)paramValue callback: (RCTResponseSenderBlock)callback)

@end
