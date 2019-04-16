package com.example.androidfinalproject_newsfeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends BaseAdapter {

    private ArrayList<News> news; //news article arraylist
    private Context context;
    private LayoutInflater inflater;

    /**
     *
     * @param news
     * @param context
     */
    public NewsAdapter(ArrayList<News> news, Context context) {
        this.news = news;
        this.context = context;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    /**
     *
     * @return
     */
    @Override
    public int getCount() {
        return news.size();
    }

    /**
     *
     * @param position
     * @return
     */
    @Override
    public Object getItem(int position) {
        return news.get(position);
    }

    /**
     *
     * @param position
     * @return
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.activity_news_url_list, parent, false);
        }


        News currentItem = (News) getItem(position);


        TextView textViewTitle = convertView.findViewById(R.id.news_URL);


        textViewTitle.setText(currentItem.geturl());

        return convertView;
    }
}
