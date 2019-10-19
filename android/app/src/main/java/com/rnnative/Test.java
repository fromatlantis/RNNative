package com.rnnative;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Toast;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class Test extends View {
    public Test(Context context) {
        super(context);
        this.setBackgroundColor(Color.rgb(255,0,0));
        this.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {
//                  TODO Auto-generated method stub
                 Toast.makeText(getContext(),"You click edit button",
                         Toast.LENGTH_LONG).show();
                 System.out.println("点击事件");
                 onReceiveNativeEvent();
            }
        });
    }
    public void onReceiveNativeEvent() {
        WritableMap event = Arguments.createMap();
        event.putString("message", "我是android Native传过来的值");
        ReactContext reactContext = (ReactContext)getContext();
        reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                "topPlay",
                event);
    }


}
