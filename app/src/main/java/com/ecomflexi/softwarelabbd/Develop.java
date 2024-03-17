package com.ecomflexi.softwarelabbd;

import android.app.Activity;
import android.os.Bundle;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Develop extends Activity {
    public static String DeV = BuildConfig.WEB_URL;
    static String dev2 = "dXJs";

    /* Foysal Tech && ict Foysal */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.develop);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

}
