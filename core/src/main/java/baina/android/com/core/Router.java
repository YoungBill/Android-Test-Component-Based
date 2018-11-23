package baina.android.com.core;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;

import java.util.List;

/**
 * Created by taochen on 18-11-22.
 */

public class Router {

    private static final String TAG = Router.class.getSimpleName();

    public static boolean push(Context context, String url, String params, int animId) {
        if (url == null)
            return false;

        Log.i(TAG, "push page== " + url + " push page params== " + params);
        Intent intent = new Intent();
        intent.setData(Uri.parse(url));
        intent.putExtra(RouterConfig.ROUTER_URL_PARAMS, params);
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> resolveInfoList = packageManager.queryIntentActivities(intent, 0);
        if (!resolveInfoList.isEmpty()) {
            try {
                context.startActivity(intent);
                // TODO: 18-11-23 加入跳转动画
//                selectTranlateAnim(activity, animId);
            } catch (Exception e) {
                Log.i(TAG, "no page");
                return false;
            }
            return true;
        } else {
            Log.i(TAG, "no page");
            return false;
        }
    }
}
