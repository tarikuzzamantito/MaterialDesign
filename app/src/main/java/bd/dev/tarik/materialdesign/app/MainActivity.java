package bd.dev.tarik.materialdesign.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Objects;

import bd.dev.tarik.materialdesign.R;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("HomePage !");
        //toolbar.setSubtitle("Folks !");

        toolbar.inflateMenu(R.menu.menu_main);

        setUpRecyclerView();





        /*toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String msg = "";
                switch (item.getItemId()) {
                    case R.id.discard:
                        msg = "Delete";
                        break;
                    case R.id.search:
                        msg = "Search";
                        break;
                    case R.id.edit:
                        msg = "Edit";
                        break;
                    case R.id.settings:
                        msg = "Settings";
                        break;
                    case R.id.exit:
                        msg = "Exit";
                        break;
                }
                Toast.makeText(MainActivity.this, msg + " clicked !", Toast.LENGTH_SHORT).show();
                return false;
            }
        });*/
        // toolbar.setNavigationOnClickListener();

       /* toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Welcome !");
        toolbar.setSubtitle("Folks !");*/

        //toolbar.setLogo();
        //toolbar.setNavigationIcon();

        // Compatibility by JAVA
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setElevation(10f);
        }*/


    }

    private void setUpRecyclerView() {

    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        String msg = "";
        switch (item.getItemId()) {
            case R.id.discard:
                msg = "Delete";
                break;
            case R.id.search:
                msg = "Search";
                break;
            case R.id.edit:
                msg = "Edit";
                break;
            case R.id.settings:
                msg = "Settings";
                break;
            case R.id.exit:
                msg = "Exit";
                break;
        }
        Toast.makeText(this, msg + " clicked !", Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);

    }*/
}
