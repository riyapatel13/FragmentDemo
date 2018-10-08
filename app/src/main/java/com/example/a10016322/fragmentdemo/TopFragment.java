package com.example.a10016322.fragmentdemo;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment; //you need this support version
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        final Button button = (Button)(view.findViewById(R.id.buttontop_id));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setText("Clicked");
                View view1 = getActivity().findViewById(R.id.replace_id);
                view1.setBackgroundColor(Color.GREEN);

            }
        });
        return view;
    }

}
