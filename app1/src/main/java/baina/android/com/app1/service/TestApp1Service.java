package baina.android.com.app1.service;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;

import baina.android.com.core.service.TestApp1ExportService;

/**
 * Created by taochen on 18-11-30.
 */

@Route(path = "/app1/TestApp1Service")
public class TestApp1Service implements TestApp1ExportService {

    private static final String TAG = TestApp1Service.class.getSimpleName();

    @Override
    public String sayHello(String s) {
        return "Hello " + s;
    }

    @Override
    public void init(Context context) {
        Log.d(TAG, "init");
    }
}
