package com.example.opilane.kadi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button banaan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banaan=(Button)findViewById(R.id.link);
        //see tegevus võimaldab sul nuppule vajtamisel avada veebileht
        banaan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String url = "http://tallinnzoo.ee/";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }

//see tegevus võimaldab sul liikuda edasi ja tagasi uue activity pelae/lehele kus on näha pildid
public void pildid(View view){
    Intent intent = new Intent(MainActivity.this, pildidActivity.class);
    startActivity(intent);
}
}