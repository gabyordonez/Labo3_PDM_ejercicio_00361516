package com.gordonez.laboTarea;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText mEdit;
    private Button mButton;
    private RadioGroup mRadio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdit = findViewById(R.id.et_username);
        mEdit = findViewById(R.id.et_password);
        mEdit = findViewById(R.id.et_email);

        mButton = findViewById(R.id.b_submit);

        mRadio = findViewById(R.id.rg_radioGroup);



        String textUsername = mEdit.getText().toString();
        String textPassword = mButton.getText().toString();
        String textEmail = mEdit.getText().toString();


        mButton.setOnClickListener(v -> {
            String text = mEdit.getText().toString();
            Intent mIntent = new Intent(MainActivity.this, ActivityTwo.class);
            mIntent.putExtra( "textKey", text);
            startActivity(mIntent);
            startActivity(mIntent);
            });

    }


}
