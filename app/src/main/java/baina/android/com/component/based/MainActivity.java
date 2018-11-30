package baina.android.com.component.based;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import baina.android.com.core.route.Router;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.toPluginTest1ActivityBt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "app1://app1.host/plugin_uri_plugintest1activity_path";
                String data = "data from app module's MainActivity";
                Router.push(MainActivity.this, url, data, 0);
            }
        });
    }
}
