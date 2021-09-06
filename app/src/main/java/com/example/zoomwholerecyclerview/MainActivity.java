package com.example.zoomwholerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ImgItemInteraction{

    RecyclerView rv_images;
    ImageAdapter adapter;

    private ZoomView zoomView;

    LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        root = findViewById(R.id.root);


        View v = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.zoomableview, null, false);
        v.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));

        zoomView = new ZoomView(this);
        zoomView.addView(v);
//
//        main_container = (LinearLayout) findViewById(R.id.main_container);
        root.addView(zoomView);





        List<ImgModel> list = new ArrayList<>();
        list.add(new ImgModel("https://assets-global.website-files.com/6005fac27a49a9cd477afb63/60576840e7d265198541a372_bavassano_homepage_gp.jpg" , null));
        list.add(new ImgModel("https://s3.amazonaws.com/images.seroundtable.com/google-shorts-1522934915.jpg", null ));
        list.add(new ImgModel("https://s3.amazonaws.com/images.seroundtable.com/google-shorts-1522934915.jpg", null ));
        list.add(new ImgModel("https://assets-global.website-files.com/6005fac27a49a9cd477afb63/60576840e7d265198541a372_bavassano_homepage_gp.jpg",  null));
        list.add(new ImgModel("https://assets-global.website-files.com/6005fac27a49a9cd477afb63/60576840e7d265198541a372_bavassano_homepage_gp.jpg",  null));
        list.add(new ImgModel("https://s3.amazonaws.com/images.seroundtable.com/google-shorts-1522934915.jpg",  null));
        list.add(new ImgModel("https://s3.amazonaws.com/images.seroundtable.com/google-shorts-1522934915.jpg",  null));
        list.add(new ImgModel("https://assets-global.website-files.com/6005fac27a49a9cd477afb63/60576840e7d265198541a372_bavassano_homepage_gp.jpg",  null));
        list.add(new ImgModel("https://assets-global.website-files.com/6005fac27a49a9cd477afb63/60576840e7d265198541a372_bavassano_homepage_gp.jpg",  null));
        list.add(new ImgModel("https://s3.amazonaws.com/images.seroundtable.com/google-shorts-1522934915.jpg", null));

        list.add(new ImgModel("https://assets-global.website-files.com/6005fac27a49a9cd477afb63/60576840e7d265198541a372_bavassano_homepage_gp.jpg" , null));
        list.add(new ImgModel("https://s3.amazonaws.com/images.seroundtable.com/google-shorts-1522934915.jpg", null ));
        list.add(new ImgModel("https://s3.amazonaws.com/images.seroundtable.com/google-shorts-1522934915.jpg", null ));
        list.add(new ImgModel("https://assets-global.website-files.com/6005fac27a49a9cd477afb63/60576840e7d265198541a372_bavassano_homepage_gp.jpg",  null));
        list.add(new ImgModel("https://assets-global.website-files.com/6005fac27a49a9cd477afb63/60576840e7d265198541a372_bavassano_homepage_gp.jpg",  null));
        list.add(new ImgModel("https://s3.amazonaws.com/images.seroundtable.com/google-shorts-1522934915.jpg",  null));
        list.add(new ImgModel("https://s3.amazonaws.com/images.seroundtable.com/google-shorts-1522934915.jpg",  null));
        list.add(new ImgModel("https://assets-global.website-files.com/6005fac27a49a9cd477afb63/60576840e7d265198541a372_bavassano_homepage_gp.jpg",  null));
        list.add(new ImgModel("https://assets-global.website-files.com/6005fac27a49a9cd477afb63/60576840e7d265198541a372_bavassano_homepage_gp.jpg",  null));
        list.add(new ImgModel("https://s3.amazonaws.com/images.seroundtable.com/google-shorts-1522934915.jpg", null));


        rv_images = findViewById(R.id.rv_images);
        rv_images.setLayoutManager(new GridLayoutManager(this,2));
        adapter = new ImageAdapter(list, this);
        adapter.setListener(this);
        rv_images.setAdapter(adapter);




    }

    @Override
    public void imageItemOnClick(ImgModel model) {

    }
}