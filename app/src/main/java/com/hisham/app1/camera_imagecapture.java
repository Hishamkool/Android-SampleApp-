package com.hisham.app1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class camera_imagecapture extends AppCompatActivity {
    private Button captureBtn;
    private ImageView shwImg;
    private static final int Image_Capture_Code = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_imagecapture);

        captureBtn = (Button) findViewById(R.id.cameraOpen);
        shwImg = (ImageView)findViewById(R.id.imageViewCamera);

        captureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gocam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(gocam,Image_Capture_Code);

            }




        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == Image_Capture_Code){
            if(resultCode == RESULT_OK)
            {
                Bitmap bp = (Bitmap) data.getExtras().get("data");
                shwImg.setImageBitmap(bp);

            }else if(resultCode == RESULT_CANCELED){
                Toast.makeText(this, "canceled", Toast.LENGTH_SHORT).show();

            }
        }
    }
}