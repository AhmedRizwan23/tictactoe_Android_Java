package com.example.tictactoe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleContactAdapter extends RecyclerView.Adapter<RecycleContactAdapter.ViewHolder> {

    Context context;

    ArrayList<contactmodel> arrcontact;

    RecycleContactAdapter(Context context, ArrayList<contactmodel> arrcontact) {
        this.context = context;
        this.arrcontact = arrcontact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgcontact.setImageResource(arrcontact.get(position).img);
        holder.txtname.setText(arrcontact.get(position).name);
        holder.txtnumber.setText(arrcontact.get(position).number);

    }

    @Override
    public int getItemCount() {
        return arrcontact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtname, txtnumber;
        ImageView imgcontact;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname = itemView.findViewById(R.id.textview_name);
            txtnumber = itemView.findViewById(R.id.textview_number);
            imgcontact = itemView.findViewById(R.id.imageview_picture);
        }

    }


}
