package com.example.ahmet.museumhackathon;

import android.app.Activity;
import android.app.Dialog;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class ViewDialog {

    public void showDialog (final Activity activity){


        final Dialog dialog = new Dialog(activity);

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);

        dialog.setContentView(R.layout.scan_popup);

        Button cancel = dialog.findViewById(R.id.cancel);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        FragmentManager manager = ((FragmentActivity) activity).getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.cameraFrame, new CodeScanner());
        transaction.commit();


        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();

    }
}
