package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.example.myapplication.constants.Urls;
import com.example.myapplication.network.ImageRequester;

public class MainActivity extends AppCompatActivity {

    TextView txtInfo;
    EditText editTxt;
    private ImageRequester imageRequester;
    private NetworkImageView myImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtInfo = findViewById(R.id.txtinfo);
        editTxt = findViewById(R.id.editText);

        imageRequester = ImageRequester.getInstance();
        myImage = findViewById(R.id.myimg);
        String urlImg = Urls.BASE+"/images/1.jpg";
        imageRequester.setImageFromUrl(myImage, urlImg);
    }
    
    public void onClickbtn (View view){
        txtInfo.setText(editTxt.getText());
    }
}