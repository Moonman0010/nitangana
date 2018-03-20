package com.kodexlabs.nitangana;

import android.app.ProgressDialog;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.firebase.client.Firebase;
import com.google.firebase.database.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aritra on 14-08-2017.
 */

public class  Activity_feeds extends Fragment {


    /*@Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_feeds, container, false);
        return view;
    }*/

    private RecyclerView recyclerView;

    private LinearLayoutManager layoutManager;

    private static DatabaseReference databaseReference;

    private ProgressDialog progressDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_feeds, container, false);
        //databaseReference = FirebaseDatabase.getInstance().getReference("nitrangana/feeds");
        databaseReference = FirebaseDatabase.getInstance().getReference("nitrangana/feeds/1/details");
        //databaseReference.keepSynced(true);

        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_feeds);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        //DatabaseReference id = databaseReference.child("1").child("text");
        //Toast.makeText(getContext(), ""+databaseReference, Toast.LENGTH_SHORT).show();

        //Query query = databaseReference.orderByChild("date");
        /*final FirebaseRecyclerAdapter<Feeds, Card_holder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Feeds, Card_holder>(
                Feeds.class, R.layout.cardview_feeds, Card_holder.class, databaseReference
        ) {
            @Override
            protected void populateViewHolder(Card_holder viewHolder, Feeds model, final int position) {

                //viewHolder.Feeds_Populate(model);
                progressDialog.dismiss();
                *//*viewHolder.view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(view.getContext(), ScrollingActivity.class);
                        intent.putExtra("card_id", card_id.get(position));
                        intent.putExtra("card_title", card_title.get(position));
                        view.getContext().startActivity(intent);
                    }
                });*//*
            }
        };
        recyclerView.setAdapter(firebaseRecyclerAdapter);*/

        return view;
    }

    public static class Card_holder extends RecyclerView.ViewHolder {

        View view;

        public Card_holder(final View itemView) {
            super(itemView);
            view = itemView;
        }

        public void Feeds_Populate(final Feeds model) {

            //TextView feed_text = (TextView)view.findViewById(R.id.feed_text);
            //ImageView feed_pic  = (ImageView)view.findViewById(R.id.feed_pic);

            //feed_text.setText(""+model.getText());
            //feed_pic.setImageURI(Uri.parse(model.getImage()));
        }
    }
}