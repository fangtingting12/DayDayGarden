package daydaygarden.daydaygarden;

import android.app.Application;

import com.lidroid.xutils.DbUtils;


/**
 * Created by Administrator on 2015/4/29.
 */
public class MyApplication extends Application{
    private static DbUtils dbUtils;
    @Override
    public void onCreate() {
        super.onCreate();
        dbUtils=DbUtils.create(this);
    }
    public DbUtils getDbUtils(){
        return dbUtils;
    }

}
