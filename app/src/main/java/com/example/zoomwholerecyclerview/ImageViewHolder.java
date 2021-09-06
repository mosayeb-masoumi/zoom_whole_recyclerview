package com.example.zoomwholerecyclerview;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;

public class ImageViewHolder extends RecyclerView.ViewHolder {

    ImageView img;

    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.img_item);


    }

    public void bindData(ImgModel model) {

        Glide.with(itemView.getContext()).load(model.getUrl()).into(img);

        Glide.with(itemView.getContext())
                .asBitmap()
                .load(model.getUrl())
                .into(new CustomTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        img.setImageBitmap(resource);
                        model.setBitmap(resource);
                    }

                    @Override
                    public void onLoadCleared(@Nullable Drawable placeholder) {

                    }
                });
    }

    public void setOnImgHolderListener(ImgItemInteraction listener, ImgModel model, int position) {

        img.setOnClickListener(view -> {
            listener.imageItemOnClick(model);
        });
    }
}
