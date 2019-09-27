package com.example.szinezes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private Button button_RGB;
    private TextView textView_RGB;
    int r,g,b = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        button_RGB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand=new Random();
                r=rand.nextInt(256);
                g=rand.nextInt(256);
                b=rand.nextInt(256);
                textView_RGB.setText("("+r+ ","+g+","+b+")");
                relativeLayout.setBackgroundColor(Color.rgb(r,g,b));
            }
        });
    }

    public void init() {


        relativeLayout = findViewById(R.id.relativeLayout);
        button_RGB=findViewById(R.id.button_RGB);
        textView_RGB=findViewById(R.id.textView_RGB);

    }
}



