package com.example.szinezes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;

    private TextView textView_RGB;
    private TextView textR;
    private TextView textG;
    private TextView textB;
    private TextView valueR;
    private TextView valueG;
    private TextView valueB;
    private SeekBar seek_R;
    private SeekBar seek_G;
    private SeekBar seek_B;

    int r,g,b = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        szinTarolas();


        seek_R.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean n) {

                        r=i;
                        szinTarolas();
                        valueR.setText(String.valueOf(r));
                        textView_RGB.setText("("+r+ ","+g+","+b+")");
                        relativeLayout.setBackgroundColor(Color.rgb(r,g,b));


                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        seek_G.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean n) {
                        g=i;

                        szinTarolas();

                        valueG.setText(String.valueOf(g));

                        textView_RGB.setText("("+r+ ","+g+","+b+")");
                        relativeLayout.setBackgroundColor(Color.rgb(r,g,b));

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        seek_B.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean n) {
                        b=i;
                        szinTarolas();

                        valueB.setText(String.valueOf(b));

                        textView_RGB.setText("("+r+ ","+g+","+b+")");
                        relativeLayout.setBackgroundColor(Color.rgb(r,g,b));

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );




    }

    public void init() {


        relativeLayout = findViewById(R.id.relativeLayout);

        textView_RGB=findViewById(R.id.textView_RGB);
        textR=findViewById(R.id.textR);
        textG=findViewById(R.id.textG);
        textB=findViewById(R.id.textB);
        valueR=findViewById(R.id.valueR);
        valueG=findViewById(R.id.valueG);
        valueB=findViewById(R.id.valueB);
        seek_R=findViewById(R.id.seek_R);
        seek_G=findViewById(R.id.seek_G);
        seek_B=findViewById(R.id.seek_B);
        relativeLayout.setBackgroundColor(Color.rgb(r,g,b));
        textView_RGB.setText("("+r+ ","+g+","+b+")");
        valueR.setText(String.valueOf(r));
        valueG.setText(String.valueOf(g));
        valueB.setText(String.valueOf(b));


    }

    private void szinTarolas() {
        int color = Color.rgb(r, g, b);

    }
}



