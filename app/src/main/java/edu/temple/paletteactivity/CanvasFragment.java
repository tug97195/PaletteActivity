package edu.temple.paletteactivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CanvasFragment extends Fragment {

    TextView textView;
    View bg;

    public CanvasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_canvas, container, false);
        textView = view.findViewById(R.id.fragment_textView);
        bg = view.findViewById(R.id.fragment_canvas_bg);
        return view;
    }

    public void displayText(String message, String hexValues) {
        textView.setText(message);
        bg.setBackgroundColor(Color.parseColor(hexValues));

    }
}