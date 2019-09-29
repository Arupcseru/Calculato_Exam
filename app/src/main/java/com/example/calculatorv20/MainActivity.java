package com.example.calculatorv20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button_0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_point;
    private Button button_equal;
    private Button button_plus;
    private Button button_minus;
    private Button button_mul;
    private Button button_div;
    private Button button_c;
    private Button button_sqrt;
    private Button button_pow;
    private Button button_mod;
    private ImageButton backspace;
    TextView output, input,sub_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_views();
        init_variables();
        init_functions();
        init_listeners();

    }

    private void init_views() {
        button_point=(Button)findViewById(R.id.btn_point);
        button_0=(Button)findViewById(R.id.btn_0);
        button_equal=(Button)findViewById(R.id.btn_equal);
        button_mod=(Button)findViewById(R.id.btn_mod);

        button_1=(Button)findViewById(R.id.btn_1);
        button_2=(Button)findViewById(R.id.btn_2);
        button_3=(Button)findViewById(R.id.btn_3);
        button_div=(Button)findViewById(R.id.btn_div);

        button_4=(Button)findViewById(R.id.btn_4);
        button_5=(Button)findViewById(R.id.btn_5);
        button_6=(Button)findViewById(R.id.btn_6);
        button_mul=(Button)findViewById(R.id.btn_mul);

        button_7=(Button)findViewById(R.id.btn_7);
        button_8=(Button)findViewById(R.id.btn_8);
        button_9=(Button)findViewById(R.id.btn_9);
        button_minus=(Button)findViewById(R.id.btn_minus);

        button_c=(Button)findViewById(R.id.btn_c);
        button_sqrt=(Button)findViewById(R.id.btn_root);
        button_pow=(Button)findViewById(R.id.btn_pow);
        button_plus=(Button)findViewById(R.id.btn_plus);

        backspace=(ImageButton)findViewById(R.id.btn_del);

        output =(TextView) findViewById(R.id.tv1);
        input =(TextView)findViewById(R.id.tv2);
        sub_output =(TextView)findViewById(R.id.tv3);
    }

    private void init_variables() {
    }

    private void init_functions() {
    }

    private void init_listeners() {
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        backspace.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                return false;
            }
        });
    }
}
