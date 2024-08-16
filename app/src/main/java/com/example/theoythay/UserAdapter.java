package com.example.theoythay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<user> users;
    private LayoutInflater inflater;

    public UserAdapter(Context context, ArrayList<user> users) {
        this.context = context;
        this.users = users;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView =inflater.inflate(android.R.layout.simple_list_item_1,parent,false);

        }
        TextView textView =convertView.findViewById(android.R.id.text1);
        user use = users.get(position);
        textView.setText(use.toString());


        return convertView;
    }
}
