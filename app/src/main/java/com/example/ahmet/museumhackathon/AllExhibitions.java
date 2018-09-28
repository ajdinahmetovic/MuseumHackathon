package com.example.ahmet.museumhackathon;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class AllExhibitions extends Fragment {

    public AllExhibitions() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_all_exhibitions, container, false);

        LinearLayout cont = view.findViewById(R.id.container);


        final float scale = view.getContext().getResources().getDisplayMetrics().density;
        LinearLayout.LayoutParams cardParams = new LinearLayout.LayoutParams( (300), ViewGroup.LayoutParams.WRAP_CONTENT);


        for (int i = 0; i <10; i++){

            CardView card = new CardView(getContext());

            System.out.println("HERE");
            card.setLayoutParams(cardParams);

            card.setBackgroundColor(getResources().getColor(R.color.colorAccent));

            cont.addView(card);



/*

            TextView txt = new TextView(getContext());
            txt.setText("skdlfmjksdc");
            cont.addView(txt);
*/
        }



        return view;



    }




}
