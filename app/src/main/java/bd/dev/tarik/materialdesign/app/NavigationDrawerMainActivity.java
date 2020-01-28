package bd.dev.tarik.materialdesign.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;

import bd.dev.tarik.materialdesign.R;
import bd.dev.tarik.materialdesign.adapter.RecyclerAdapter;
import bd.dev.tarik.materialdesign.model.Landscape;

public class NavigationDrawerMainActivity extends AppCompatActivity {

    MaterialToolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpToolbar();
        setUpDrawer();;

        setUpRecyclerView();



    }


    private void setUpToolbar(){
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Navigation Drawer Demo !");
        //toolbar.setSubtitle("Folks !");

        toolbar.inflateMenu(R.menu.menu_main);
    }

    private void setUpDrawer(){

    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerAdapter adapter = new RecyclerAdapter(this, Landscape.getData());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager mLinearLayoutManagerVertical = new LinearLayoutManager(this);
        mLinearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLinearLayoutManagerVertical);

        recyclerView.setItemAnimator(new DefaultItemAnimator()); // Even if we don't use it then also our items shows default animation # Check Docs

    }

}
