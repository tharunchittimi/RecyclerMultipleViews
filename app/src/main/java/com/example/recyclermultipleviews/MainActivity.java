package com.example.recyclermultipleviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RvModelClass>rvModelClasses = new ArrayList<>();
        rvModelClasses.add(new RvModelClass(RvModelClass.IMAGE_TYPE,R.drawable.harrypoter,"Harry Potter","",""));
        rvModelClasses.add(new RvModelClass(RvModelClass.TEXT_TYPE,0,"","Released In 2001","Harry Potter is a British-American film series based on the eponymous novels by author J. K. Rowling."));
        rvModelClasses.add(new RvModelClass(RvModelClass.IMAGE_TYPE,R.drawable.hpp,"Harry Potter","",""));
        rvModelClasses.add(new RvModelClass(RvModelClass.TEXT_TYPE,0,"","Released In 2003","Harry Potter is a British-American film series based on the eponymous novels by author J. K. Rowling."));
        rvModelClasses.add(new RvModelClass(RvModelClass.IMAGE_TYPE,R.drawable.hobit,"The Hobbit","",""));
        rvModelClasses.add(new RvModelClass(RvModelClass.TEXT_TYPE,0,"","Released In 2005","Harry Potter is a British-American film series based on the eponymous novels by author J. K. Rowling."));
        rvModelClasses.add(new RvModelClass(RvModelClass.IMAGE_TYPE,R.drawable.hpp,"Harry Potter","",""));
        rvModelClasses.add(new RvModelClass(RvModelClass.TEXT_TYPE,0,"","Released In 2011","Harry Potter is a British-American film series based on the eponymous novels by author J. K. Rowling."));


        RvAdapter rvAdapter = new RvAdapter(rvModelClasses,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView=findViewById(R.id.rv);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(rvAdapter);
    }
}
