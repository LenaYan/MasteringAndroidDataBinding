package com.liangfeizc.databinding.utils;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;

import com.liangfeizc.databinding.core.App;
import com.squareup.picasso.Picasso;

/**
 * Created by Android Studio.
 * ProjectName: MasteringAndroidDataBinding
 * Author:  Lena.t.Yan
 * Date: 1/11/16
 * Time: 15:29
 * \ ___________________
 * \| Happy New Year!  |
 * \ -------------------
 * \  \
 * \   \   \_\_    _/_/
 * \    \      \__/
 * \           (oo)\_______
 * \           (__)\       )\/\
 * \               ||----w |
 * \               ||     ||
 */
public class BindAdapterUtil {

    @BindingAdapter({"imageUrl", "error"})
    public static void loadImage(ImageView view, String url, Drawable error) {
        Log.d(App.TAG, "load image");
        Picasso.with(view.getContext()).load(url).error(error).into(view);
    }

}
