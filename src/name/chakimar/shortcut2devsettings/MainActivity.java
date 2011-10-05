package name.chakimar.shortcut2devsettings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent("com.android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        
        startActivity(intent);
        finish();
    }
}