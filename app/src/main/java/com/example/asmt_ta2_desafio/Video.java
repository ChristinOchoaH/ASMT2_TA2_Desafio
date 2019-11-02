package com.example.asmt_ta2_desafio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Vector;

public class Video extends AppCompatActivity  {

    RecyclerView recyclerView;
    Vector<YTVideos> ytVideos = new Vector<YTVideos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        ytVideos.add( new YTVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/C_qzmkmMldA\" frameborder=\"0\" allowfullscreen></iframe>") );
        //ytVideos.add( new YTVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KyJ71G2UxTQ\" frameborder=\"0\" allowfullscreen></iframe>") );
        //ytVideos.add( new YTVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/y8Rr39jKFKU\" frameborder=\"0\" allowfullscreen></iframe>") );
        //ytVideos.add( new YTVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8Hg1tqIwIfI\" frameborder=\"0\" allowfullscreen></iframe>") );
        //ytVideos.add( new YTVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/uhQ7mh_o_cM\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter vA = new VideoAdapter(ytVideos);

        recyclerView.setAdapter(vA);
    }
}
