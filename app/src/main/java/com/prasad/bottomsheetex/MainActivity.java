package com.prasad.bottomsheetex;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    BottomSheetDialog bottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                createModelBottomSheet();

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), PersistentBottomSheet.class);
                startActivity(intent);
            }
        });

    }

    private void createModelBottomSheet() {

        bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
        View view = getLayoutInflater().inflate(R.layout.bottom_sheet_modal, null);
        bottomSheetDialog.setContentView(view);
        bottomSheetDialog.show();

        Button button = (Button) view.findViewById(R.id.btn_cancel);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bottomSheetDialog.hide();
            }
        });


    }
}
