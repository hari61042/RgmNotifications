package com.example.rgmnotifications;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder{

    TextView mName;
    TextView mLink;
    Button mDownload;

    public MyViewHolder(@NonNull View itemView) {

        super(itemView);

        mName=(TextView)itemView.findViewById(R.id.name);
        mLink=(TextView)itemView.findViewById(R.id.link);

        mDownload=(Button)itemView.findViewById(R.id.down);

    }
}
