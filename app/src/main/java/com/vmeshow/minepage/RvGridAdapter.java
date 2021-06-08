package com.vmeshow.minepage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

class RvGridAdapter extends RecyclerView.Adapter<RvGridAdapter.Holder> {
    private final Context mContext;
    private final List<IconData> mIconDataList;
    private OnItemClickListener mItemClickListener;

    public RvGridAdapter(Context context, List<IconData> iconDataList) {
        this.mContext = context;
        this.mIconDataList = iconDataList;
    }

    @NonNull
    @NotNull
    @Override
    public Holder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_horizontal_rv, parent, false);
        return new Holder(view, mItemClickListener);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.tvTitle.setText(mIconDataList.get(position).getTitle());
        holder.ivIcon.setImageResource(mIconDataList.get(position).getIcon_res());
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mIconDataList.size();
    }

    static class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final OnItemClickListener itemClickListener;
        private final View itemView;
        private final TextView tvTitle;
        private final ImageView ivIcon;

        public Holder(View itemView, OnItemClickListener itemClickListener) {
            super(itemView);
            this.itemClickListener = itemClickListener;
            itemView.setOnClickListener(this);

            this.itemView = itemView;
            ivIcon = itemView.findViewById(R.id.item_icon);
            tvTitle = itemView.findViewById(R.id.item_title);
        }

        @Override
        public void onClick(View v) {
            if (itemClickListener != null) {
                itemClickListener.onItemClick((int) v.getTag());
            }

        }
    }

    public void setItemClickListener(OnItemClickListener onItemClickListener) {
        this.mItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener{
        void onItemClick(int position);
    }
}
