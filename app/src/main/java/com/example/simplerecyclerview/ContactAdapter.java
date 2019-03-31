package com.example.simplerecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder>
{
    private String[] data;
    public ContactAdapter(String[] data){
        this.data=data;

    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater= LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,viewGroup,false);
        ContactViewHolder vh = new ContactViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder contactViewHolder, int i) {
            String title = data[i];
            contactViewHolder.tvTitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {

        ImageView imgIcon;
        TextView tvTitle;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon =itemView.findViewById(R.id.imgIcon);
            tvTitle= itemView.findViewById(R.id.tvTitle);

        }
    }
}
