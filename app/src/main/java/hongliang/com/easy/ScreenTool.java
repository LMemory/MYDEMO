package hongliang.com.easy;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by hongliang on 16/4/18.
 */
public class ScreenTool {

    // 获取指定Activity的截屏，保存到png文件

    static Bitmap takeScreenShot(Activity activity) {

        Log.i("TAG","tackScreenShot");
        // View是你须要截图的View
        View view = activity.getWindow().getDecorView();
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap b1 = view.getDrawingCache();

        // 获取状况栏高度
        Rect frame = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
        int statusBarHeight = frame.top;
        Log.i("TAG", "statusBarHeight = " + statusBarHeight);

        // 获取屏幕长和高
        int width = activity.getWindowManager().getDefaultDisplay().getWidth();
        int height = activity.getWindowManager().getDefaultDisplay()
                .getHeight();

        // 去掉题目栏
        // Bitmap b = Bitmap.createBitmap(b1, 0, 25, 320, 455);
        Bitmap b = Bitmap.createBitmap(b1, 0, statusBarHeight, width, height
                - statusBarHeight);
        view.destroyDrawingCache();
        return b;
    }

    // 保存到sdcard
    private static void savePic(Bitmap b, String strFileName) {

        FileOutputStream fos = null;
        try {
            Log.i("TAG","start savePic");
            fos = new FileOutputStream(strFileName);
            Log.i("TAG","strFileName = " + strFileName);
            if (null != fos) {
                b.compress(Bitmap.CompressFormat.PNG, 90, fos);
                fos.flush();
                fos.close();
                Log.i("TAG","save pic");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void shoot(Activity a,String b) {
        Log.i("TAG","shot");
        Bitmap bitmap = ScreenTool.takeScreenShot(a);
        ScreenTool.savePic(bitmap, b);
    }
}
