package com.forcpdlm.number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText ed1,ed2;
    String getnum1,getnum2,res;
    int num1,num2,num3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.but);
        ed1=(EditText)findViewById(R.id.num1);
        ed2=(EditText)findViewById(R.id.num2);

        b1.setOnClickListener(new View.OnClickListener() {

        @Override
            public void onClick(View view) {

                getnum1=ed1.getText().toString();
                getnum2=ed2.getText().toString();
                num1=Integer.parseInt(getnum1);
                num2=Integer.parseInt(getnum2);
                num3=num1+num2;
                res=String.valueOf(num3);
                Toast.makeText(getApplicationContext(), res,Toast.LENGTH_LONG).show();

            }
        });
    }
}




