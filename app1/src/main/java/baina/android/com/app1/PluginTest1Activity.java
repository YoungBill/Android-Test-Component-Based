package baina.android.com.app1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import baina.android.com.core.Router;
import baina.android.com.core.RouterConfig;

public class PluginTest1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plugin_test1);

        String params = getIntent().getStringExtra(RouterConfig.ROUTER_URL_PARAMS);
        Toast.makeText(PluginTest1Activity.this, "data: " + params, Toast.LENGTH_SHORT).show();

        findViewById(R.id.toPluginTest2ActivityBt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "app2://app2.host/plugin_uri_plugintest2activity_path";
                String data = "data from app1 module's PluginTest1Activity";
                Router.push(PluginTest1Activity.this, url, data, 0);
            }
        });
    }
}
