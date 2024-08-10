package com.example.numcm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.main_tv);
        button=findViewById(R.id.main_btn);
        editText=findViewById(R.id.main_et);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nums=editText.getText().toString();
                int num=Integer.parseInt(nums);
                double    numinch  = num*0.0039370079;
                String formattedNumInch = String.format(Locale.ENGLISH,"%.4f", numinch);

                textView.setText(formattedNumInch);

            }
        }) ;



    }
}