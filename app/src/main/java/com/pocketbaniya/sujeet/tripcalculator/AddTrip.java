package com.pocketbaniya.sujeet.tripcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by sujeet on 26/9/15.
 */
public class AddTrip extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.trip_add);

        //set behavior for cancel button
        Button btnCancel = (Button) findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(getBaseContext(), MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }

}
