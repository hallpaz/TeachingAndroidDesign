package br.edu.infnet.aulasdesigninterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void birthDayCardLL(View v){
        Intent intent = new Intent(this, BirthdayCardLL.class);
        startActivity(intent);
    }

    public void birthDayCardRL(View v){
        Intent intent = new Intent(this, BirthdayCardRL.class);
        startActivity(intent);
    }

    public void birthDayCardFrameLayout(View v){
        Intent intent = new Intent(this, BirthdayCardFrameLayout.class);
        startActivity(intent);
    }

    public void emailComposer(View v){
        Intent intent = new Intent(this, EmailComposerActivity.class);
        startActivity(intent);
    }
}
