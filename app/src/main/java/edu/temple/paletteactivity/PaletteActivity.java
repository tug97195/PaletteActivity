package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;

public class PaletteActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "edu.temple.paletteactivity.MESSAGE";
    //Main project and Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView)findViewById(R.id.gridview);
        final CustomAdapter CustomAdapter = new CustomAdapter(this);
        gridView.setAdapter(CustomAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                sendMessage(view, position);
            }

            public void sendMessage(View view, int position){
                Intent intent = new Intent(view.getContext(), CanvasActivity.class);
                String message = CustomAdapter.colors[position];
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            };

        });

    }
}