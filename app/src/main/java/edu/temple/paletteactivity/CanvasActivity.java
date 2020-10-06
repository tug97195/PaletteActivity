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
        if(message.equals("White")) {
            findViewById(R.id.background).setBackgroundColor(Color.WHITE);
        }
        else if(message.equals("Black")){
            findViewById(R.id.background).setBackgroundColor(Color.BLACK);
            textView.setTextColor(Color.WHITE);
        }
        else if(message.equals("Blue")){
            findViewById(R.id.background).setBackgroundColor(Color.BLACK);
        }
        else if(message.equals("Cyan")){
            findViewById(R.id.background).setBackgroundColor(Color.CYAN);
        }
        else if(message.equals("DKGray")){
            findViewById(R.id.background).setBackgroundColor(Color.DKGRAY);
            textView.setTextColor(Color.WHITE);
        }
        else if(message.equals("Gray")){
            findViewById(R.id.background).setBackgroundColor(Color.GRAY);
        }
        else if(message.equals("LTGray")){
            findViewById(R.id.background).setBackgroundColor(Color.LTGRAY);
        }
        else if(message.equals("Magenta")){
            findViewById(R.id.background).setBackgroundColor(Color.MAGENTA);
        }
        else if(message.equals("Green")){
            findViewById(R.id.background).setBackgroundColor(Color.GREEN);
        }
        else if(message.equals("Red")){
            findViewById(R.id.background).setBackgroundColor(Color.RED);
        }
        else if(message.equals("Yellow")){
            findViewById(R.id.background).setBackgroundColor(Color.YELLOW);
        }
        textView.setText(message);
    }


}