package baina.android.com.app2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import baina.android.com.core.RouterConfig;

public class PluginTest2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plugin_test2);

        String params = getIntent().getStringExtra(RouterConfig.ROUTER_URL_PARAMS);
        Toast.makeText(PluginTest2Activity.this, "data: " + params, Toast.LENGTH_SHORT).show();
    }
}
