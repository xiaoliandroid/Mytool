package com.example.lgb.mytool;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Window;

public class ToolGetScreenInfo {
    private Context context;

    public ToolGetScreenInfo(Context context) {
        this.context = context;
    }

    //    获取状态栏高度
    //    注意，要在onWindowFocusChanged中调用，在onCreate中获取高度为0
    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    public static int getStatusBarHeight(Activity activity) {
        Rect frame = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
        return frame.top;
    }

    //    获取状态栏高度＋标题栏(ActionBar)高度
    //    (注意，如果没有ActionBar，那么获取的高度将和上面的是一样的，只有状态栏的高度)
    public static int getTopBarHeight(Activity activity) {
        return activity.getWindow().findViewById(Window.ID_ANDROID_CONTENT)
                .getTop();
    }

}
