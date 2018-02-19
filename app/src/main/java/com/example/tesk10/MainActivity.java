package com.example.tesk10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ToggleButton tb;
    Switch sc;
    LinearLayout lay;
    boolean x;
    boolean y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        tb=findViewById(R.id.tb);
        sc=findViewById(R.id.sc);
        lay=findViewById(R.id.lay);
    }

    public void check(View view) {
        x=tb.isChecked();
        y=sc.isChecked();
        if ((x==true)&&(y==true)) {
            lay.setBackgroundColor(getResources().getColor(R.color.Indigo));
        }
        if ((x==true)&&(y==false)) {
            lay.setBackgroundColor(getResources().getColor(R.color.Red));
        }
        if ((x==false)&&(y==false)) {
            lay.setBackgroundColor(getResources().getColor(R.color.Teal));
        }
        if ((x==false)&&(y==true)){
            lay.setBackgroundColor(getResources().getColor(R.color.Green));
        }
    }
}
