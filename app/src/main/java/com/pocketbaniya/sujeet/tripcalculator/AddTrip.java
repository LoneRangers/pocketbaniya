package com.pocketbaniya.sujeet.tripcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
//                Intent mainActivity = new Intent(getBaseContext(), MainActivity.class);
//                startActivity(mainActivity);
                finish();
            }
        });

        final EditText txtNumberOfFriends = (EditText) findViewById(R.id.txtNumberOfFriends);

        txtNumberOfFriends.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {

                Editable numberOfFriends = txtNumberOfFriends.getText();

            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
    }

}
