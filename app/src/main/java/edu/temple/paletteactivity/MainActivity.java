package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.res.Resources;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PaletteFragment.ItemPickedInterface{
    FragmentManager frag_man;
    CanvasFragment canvasFragment = new CanvasFragment();

    //Main project and Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(getString(R.string.activity_1));

        frag_man = getSupportFragmentManager();
        frag_man.beginTransaction().add(R.id.container_1, PaletteFragment.newInstance(getResources().getStringArray(R.array.hexArr))).add(R.id.container_2, canvasFragment).commit();


    }
    @Override
    public void itemPicked(int index) {
        Resources res = getResources();
        String[] hex = res.getStringArray(R.array.hexArr);
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

        canvasFragment.displayText(colors[index], hex[index]);
    }
}