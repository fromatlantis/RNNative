package com.rnnative;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestManager extends SimpleViewManager<Test> {
    public static final String REACT_CLASS = "Test";
    @Override
    public String getName() {
        return REACT_CLASS;
    }
    @Override
    protected Test createViewInstance(ThemedReactContext reactContext) {
        return new Test(reactContext);
    }
    @Override
    public Map getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.builder()
                .put(
                        "topPlay",
                        MapBuilder.of(
                                "phasedRegistrationNames",
                                MapBuilder.of("bubbled", "onPlay")))
                .build();
    }
}
