package com.example.recyclewithdetails;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detail);

        getIncomingIntent();


    }

    private void getIncomingIntent(){
        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") && getIntent().hasExtra("image_desc")){

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String imageDesc = getIntent().getStringExtra("image_desc");

            setImage(imageUrl,imageName,imageDesc);
        }

    }

    private void setImage(String imageUrl, String imageName, String imageDesc){
        TextView name = findViewById(R.id.img_desc);
        name.setText(imageName);
        TextView det = findViewById(R.id.img_det);
        det.setText(imageDesc);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}
