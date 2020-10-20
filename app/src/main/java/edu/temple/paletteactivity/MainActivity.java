package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements PaletteFragment.ItemPickedInterface{
    FragmentManager fm;
    CanvasFragment canvasFragment = new CanvasFragment();

    //Main project and Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(R.string.activity_1);


        Resources res = getResources();
        String[] hexVals = res.getStringArray(R.array.hexArr);

        fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.frameLayoutTop, PaletteFragment.newInstance(hexVals)).add(R.id.frameLayoutBot, canvasFragment).commit();


    }
    @Override
    public void itemPicked(int index) {
        Resources res = getResources();
        String[] hexVals = res.getStringArray(R.array.hexArr);
        String[] colors = {
                getString(R.string.White),
                getString(R.string.Black),
                getString(R.string.Cyan),
                getString(R.string.DKGray),
                getString(R.string.Gray),
                getString(R.string.LTGray),
                getString(R.string.Magenta),
                getString(R.string.Green),
                getString(R.string.Red),
                getString(R.string.Yellow),
                getString(R.string.Blue)

        };

        canvasFragment.displayText(colors[index], hexVals[index]);
    }
}