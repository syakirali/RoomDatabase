package com.sam.roomdatabase;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

class AsdfAdapter extends RecyclerView.Adapter<AsdfAdapter.ViewHolder> {
    @Override
    public AsdfAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AsdfAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
