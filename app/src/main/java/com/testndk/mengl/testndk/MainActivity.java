package com.testndk.mengl.testndk;

import android.app.Activity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Load load = new Load();
        int r = load.addInt(100, 50);
        ((TextView)findViewById(R.id.tv)).setText("C++库计算“100+50”的结果是：" + String.valueOf(r));
    }
}
