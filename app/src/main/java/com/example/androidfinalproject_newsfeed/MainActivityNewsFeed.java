package com.example.androidfinalproject_newsfeed;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;


public class MainActivityNewsFeed extends AppCompatActivity {
    SharedPreferences sp; //edit search shared prefs
    TextView editSearch; //edit search view

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.newsfeedmain);

        //search button
        Button nextPageButton = findViewById(R.id.seachButton);
        editSearch = findViewById(R.id.search_textInput);

        //Button saveBtn = findViewById(R.id.save_btn_hd);

        //edit tex shared preferences
        sp = getSharedPreferences("searchedArticle", Context.MODE_PRIVATE);
        String savedString = sp.getString("savedSearch", "");
        editSearch.setText(savedString);

        nextPageButton.setOnClickListener(c -> {
            Intent nextPage = new Intent(MainActivityNewsFeed.this, NewFeedAsyncSearchResult.class);
            nextPage.putExtra("searchedArticle", editSearch.getText().toString());
            startActivity(nextPage);
            //startActivityForResult(nextPage, 30);
        });

//        saveBtn.setOnClickListener(c->{
//            Intent nextPage = new Intent(MainActivityNewsFeed.this, NewsFeedSavedArticles.class );
//            startActivity(nextPage);
//
//        });


//        Toolbar tBar = (Toolbar) findViewById(R.id.toolbar_hd);
//        setSupportActionBar(tBar);


    }//onCreate


    @Override
    protected void onPause(){
        super.onPause();
        //get an editor object
        SharedPreferences.Editor editor = sp.edit();

        //save what was typed under the name "editSearch"
        String whatWasTyped = editSearch.getText().toString();
        // xml tag name is editSearch
        editor.putString("savedSearch", whatWasTyped);

        //write it to disk:
        editor.commit();
    }
}
