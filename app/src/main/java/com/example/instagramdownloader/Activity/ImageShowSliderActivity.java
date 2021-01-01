package com.example.instagramdownloader.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.instagramdownloader.Adapters.ImageAdapter;
import com.example.instagramdownloader.R;
import com.example.instagramdownloader.model.Edge_sidecar_to_children;
import com.example.instagramdownloader.model.Edges;

import java.util.ArrayList;

public class ImageShowSliderActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    ViewPager viewPage;
    Toolbar toptoolbar;
    Edge_sidecar_to_children edge_sidecar_to_children;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);
        toptoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toptoolbar);

        initView();
    }


    public void initView(){
        edge_sidecar_to_children=(Edge_sidecar_to_children)getIntent().getSerializableExtra("image_slider_list");

        viewPage = findViewById(R.id.viewPage);
        viewPage.addOnPageChangeListener(this);
        ImageAdapter adapterView = new ImageAdapter(ImageShowSliderActivity.this,edge_sidecar_to_children);
        viewPage.setAdapter(adapterView);

    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {


    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
