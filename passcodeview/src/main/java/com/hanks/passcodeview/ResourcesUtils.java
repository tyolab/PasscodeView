/*
 * Copyright (c) 2019. TYONLINE TECHNOLOGY PTY. LTD. (TYOLAB)
 *
 */

package com.hanks.passcodeview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import androidx.appcompat.content.res.AppCompatResources;

public class ResourcesUtils {

    public static Drawable getVectorDrawable(Context context, int resId) {

        Drawable drawable;
        if (Build.VERSION.SDK_INT  >= 21)
            drawable = VectorDrawableCompat.create(context.getResources(), resId, context.getTheme());
        else
            drawable = AppCompatResources.getDrawable(context, resId);
        return drawable;
    }
}
