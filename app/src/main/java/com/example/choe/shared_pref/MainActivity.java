package com.example.choe.shared_pref;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameText = (TextView) findViewById(R.id.name);
        TextView passText = (TextView) findViewById(R.id.pass);
        TextView text1 = (TextView) findViewById(R.id.field1);
        TextView text2 = (TextView) findViewById(R.id.field2);

        Button save = (Button) findViewById(R.id.button);
        save.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                SharedPreferences sharedPreferences = getSharedPreferences(name, mode);
            }
        });

        String name = nameText.getText().toString();
        String pass = passText.getText().toString();
        String textOne = text1.getText().toString();
        String textTwo = text2.getText().toString();
    }

    public void onClick(){

    }
}
