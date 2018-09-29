package com.example.ahmet.museumhackathon;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

        LinearLayout.LayoutParams cardParams = new LinearLayout.LayoutParams(  (int) (750*scale*0.5f), ViewGroup.LayoutParams.WRAP_CONTENT);

        cardParams.gravity = Gravity.CENTER_HORIZONTAL;
        cardParams.leftMargin = (int) (22*scale*0.5f);
        cardParams.rightMargin = (int) (22*scale*0.5f);

        LinearLayout.LayoutParams spacer = new LinearLayout.LayoutParams( ViewGroup.LayoutParams.WRAP_CONTENT, (int) (50*scale*0.5f));



        LinearLayout.LayoutParams spacer1 = new LinearLayout.LayoutParams( ViewGroup.LayoutParams.WRAP_CONTENT, (int) (80*scale*0.5f));

        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        LinearLayout.LayoutParams txtParams = new LinearLayout.LayoutParams( ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        txtParams.gravity = Gravity.CENTER_HORIZONTAL;

        View space1 = new View(getContext());
        space1.setLayoutParams(spacer1);
        cont.addView(space1);


        for (int i = 0; i <999; i++){

/*
            LinearLayout img = new LinearLayout(getContext());
            img.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            img.setLayoutParams(cardParams);
            img.setOrientation(LinearLayout.VERTICAL);
            cont.addView(img);
*/


            LinearLayout box = new LinearLayout(getContext());
            box.setOrientation(LinearLayout.VERTICAL);


            ImageView img = new ImageView(getContext());
            img.setImageResource(R.drawable.img_2);
            img.setLayoutParams(imageParams);
            img.setAdjustViewBounds(true);

            box.addView(img);

            TextView txt = new TextView(getContext());
            txt.setText("Naslov");
            txt.setPadding(25,0,0,20);

            //txt.setLayoutParams(txtParams);
            txt.setTextSize(30);

            box.addView(txt);

            CardView card = new CardView(getContext());
            card.setLayoutParams(cardParams);
            card.setRadius(40);

            card.addView(box);


            cont.addView(card);
            View space = new View(getContext());
            space.setLayoutParams(spacer);
            cont.addView(space);

        }

        return view;
    }
}
