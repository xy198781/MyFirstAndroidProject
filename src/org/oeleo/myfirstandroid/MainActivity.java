package org.oeleo.myfirstandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import org.oeleo.myfirstandroid.R;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "org.oeleo.myfirstandroid";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
