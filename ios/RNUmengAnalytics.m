
#import "RNUmengAnalytics.h"
#import <UMMobClick/MobClick.h>

@implementation RNUmengAnalytics
RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(start:(NSString *)key channelId:(NSString *)channelId) {
  UMConfigInstance.appKey = key;
  UMConfigInstance.channelId = channelId;
  [MobClick startWithConfigure:UMConfigInstance];
}

RCT_EXPORT_METHOD(setAppVersion:(NSString *)appVersion) {
  [MobClick setAppVersion:appVersion];
}

RCT_EXPORT_METHOD(onEvent:(NSString*)eventId) {
  [MobClick event:eventId];
}

RCT_EXPORT_METHOD(onEventWithLabel:(NSString *)eventId label:(NSString *)label) {
  [MobClick event:eventId label:label];
}

RCT_EXPORT_METHOD(onEventWithParameters:(NSString *)eventId attributes:(NSDictionary *)attributes) {
  [MobClick event:eventId attributes:attributes];
}

RCT_EXPORT_METHOD(onEventValue:(NSString *)eventId attributes:(NSDictionary *)attributes counter:(int)counter) {
  [MobClick event:eventId attributes:attributes counter:counter];
}

RCT_EXPORT_METHOD(onPageBegin:(NSString *)pageName) {
  [MobClick beginLogPageView:pageName];
}

RCT_EXPORT_METHOD(onPageEnd:(NSString *)pageName) {
  [MobClick endLogPageView:pageName];
}

RCT_EXPORT_METHOD(onProfileSignIn:(NSString *)puid) {
  [MobClick profileSignInWithPUID:puid];
}

RCT_EXPORT_METHOD(onProfileSignIn:(NSString *)provider puid:(NSString *)puid) {
  [MobClick profileSignInWithPUID:puid provider:provider];
}

RCT_EXPORT_METHOD(onProfileSignOff) {
  [MobClick profileSignOff];
}

RCT_EXPORT_METHOD(setDebugMode:(BOOL)value) {
  [MobClick setLogEnabled:value];
}

@end
