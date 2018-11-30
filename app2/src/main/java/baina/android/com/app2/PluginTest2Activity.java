package baina.android.com.app2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import baina.android.com.core.route.RouterConfig;
import baina.android.com.core.service.TestApp1ExportService;

@Route(path = "/app2/plugintest2")
public class PluginTest2Activity extends AppCompatActivity {

    @Autowired
    public TestApp1ExportService testApp1ExportService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plugin_test2);
        // 要使用TestApp1ExportService，必须要注入
        ARouter.getInstance().inject(this);

        String params = getIntent().getStringExtra(RouterConfig.ROUTER_URL_PARAMS);
        Toast.makeText(PluginTest2Activity.this, "data: " + params, Toast.LENGTH_SHORT).show();

        findViewById(R.id.cWithApp1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PluginTest2Activity.this, "调用反馈:" + testApp1ExportService.sayHello("World!"), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
