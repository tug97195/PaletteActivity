package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent intent = getIntent();
        String message = intent.getStringExtra(PaletteActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView);

        if(message.equals("Black")){
            findViewById(R.id.background).setBackgroundColor(Color.BLACK);
            textView.setTextColor(Color.WHITE);
        }
        else if(message.equals("DKGray")){
            findViewById(R.id.background).setBackgroundColor(Color.DKGRAY);
            textView.setTextColor(Color.WHITE);
        }
        else if(message.equals("LTGray")){
            findViewById(R.id.background).setBackgroundColor(Color.LTGRAY);
        }
        else{
            findViewById(R.id.background).setBackgroundColor(Color.parseColor(message));
        }
        textView.setText(message);
    }


}