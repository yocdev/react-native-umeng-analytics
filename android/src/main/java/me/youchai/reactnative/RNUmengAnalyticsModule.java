
package me.youchai.reactnative;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.umeng.analytics.MobclickAgent;

import java.util.HashMap;
import java.util.Map;

public class RNUmengAnalyticsModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNUmengAnalyticsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNUmengAnalytics";
    }

    @ReactMethod
    public void start(String appKey, String channelId) {
        MobclickAgent.UMAnalyticsConfig config =
            new MobclickAgent.UMAnalyticsConfig(getReactApplicationContext(), appKey, channelId);
        MobclickAgent.startWithConfigure(config);
    }

    @ReactMethod
    public void onEvent(String eventId) {
        MobclickAgent.onEvent(getCurrentActivity(), eventId);
    }

    @ReactMethod
    public void onEventWithLabel(String eventId, String eventLabel) {
        MobclickAgent.onEvent(getCurrentActivity(), eventId, eventLabel);
    }

    @ReactMethod
    public void onEventWithParameters(String eventId, ReadableMap parameters) {
        Map<String, String> map = new HashMap<>();
        ReadableMapKeySetIterator iterator = parameters.keySetIterator();
        while (iterator.hasNextKey()) {
            String key = iterator.nextKey();
            map.put(key, parameters.getString(key));
        }
        MobclickAgent.onEvent(getCurrentActivity(), eventId, map);
    }

    @ReactMethod
    public void onPageBegin(String pageName) {
        MobclickAgent.onEvent(getCurrentActivity(), pageName);
    }

    @ReactMethod
    public void onPageEnd(String pageName) {
        MobclickAgent.onEvent(getCurrentActivity(), pageName);
    }

    @ReactMethod
    public void setDebugMode(boolean value) {
        MobclickAgent.setDebugMode(value);
    }
}
