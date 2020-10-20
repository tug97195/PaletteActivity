package edu.temple.paletteactivity;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PaletteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PaletteFragment extends Fragment {

    private static final String ITEMS_KEYS = "items";
    private String[] colors;
    ItemPickedInterface mainActivity;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof ItemPickedInterface) {
            mainActivity = (ItemPickedInterface) context;
        }
        else {
            throw new RuntimeException("Error: unable to render gridView");
        }
    }

    public PaletteFragment() {
        // Required empty public constructor
    }


    public static PaletteFragment newInstance(String[] colors) {
        PaletteFragment fragment = new PaletteFragment();
        Bundle args = new Bundle();
        args.putStringArray(ITEMS_KEYS, colors);
        fragment.setArguments(args);
        return fragment;
    }

    // Your PaletteFragment class will allow a user to pick/select a color
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            colors = getArguments().getStringArray(ITEMS_KEYS);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_palette, container, false);
        GridView gridView = view.findViewById(R.id.fragment_gridview);
        gridView.setAdapter(new CustomAdapter((Context) mainActivity, colors));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mainActivity.itemPicked(i);
            }
        });

        return view;
    }

    interface ItemPickedInterface {
        void itemPicked(int index);
    }

}

