package daydaygarden.daydaygarden.utils;

import android.content.Context;

import com.lidroid.xutils.BitmapUtils;

import daydaygarden.daydaygarden.R;

/**
 * Created by Administrator on 2015/4/29.
 */
public class ImageLoader {
    private static BitmapUtils bitmapUtils;
    public static BitmapUtils getBitmapUitls(Context context){
        if(bitmapUtils!=null){
            return bitmapUtils;
        }
        bitmapUtils=new BitmapUtils(context,
                context.getExternalCacheDir().getPath(),
                0.35f,
                20 * 1024 * 1024);
        bitmapUtils.configDefaultConnectTimeout(5000);
        bitmapUtils.configDefaultLoadFailedImage(R.drawable.ic_launcher);
        bitmapUtils.configMemoryCacheEnabled(true);
        bitmapUtils.configDiskCacheEnabled(true);
        bitmapUtils.configThreadPoolSize(4);
        return bitmapUtils;
    }

}
