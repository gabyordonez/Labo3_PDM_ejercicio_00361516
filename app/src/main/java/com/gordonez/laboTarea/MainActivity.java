package com.gordonez.laboTarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText mEdit;
    private Button mButton;
    private RadioGroup mRadio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdit = findViewById(R.id.et_nombre);
        mEdit = findViewById(R.id.et_apellido);
        mEdit = findViewById(R.id.et_email);

        mButton = findViewById(R.id.b_submit);

        mRadio = findViewById(R.id.rg_radioGroup);

        mButton.setOnClickListener(v ->{
            Intent mIntent = new Intent(MainActivity.this, ActivityTwo.class);

            String textNombre = mEdit.getText().toString();
            String textApellido = mButton.getText().toString();
            String textEmail = mEdit.getText().toString();


            mIntent.putExtra(Intent.EXTRA_TEXT, textNombre);
            mIntent.putExtra(Intent.EXTRA_TEXT, textApellido);
            mIntent.putExtra(Intent.EXTRA_TEXT, textEmail);

            startActivity(mIntent);

        });

    }
}
