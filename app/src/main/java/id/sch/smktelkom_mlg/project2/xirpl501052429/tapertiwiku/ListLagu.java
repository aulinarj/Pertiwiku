package id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.adapter.LaguAdapter;
import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model.Lagu;

public class ListLagu extends AppCompatActivity implements LaguAdapter.ILaguAdapter {

    public static final String LAGU = "lagu";

    ArrayList<Lagu> mList = new ArrayList<>();
    LaguAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_lagu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.listLagu);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new LaguAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.music);
        String[] arDeskripsi = resources.getStringArray(R.array.desc_music);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Lagu(arJudul[i], arDeskripsi[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void doClick(int pos) {
        Intent intent = new Intent(this, DetailLagu.class);
        intent.putExtra(LAGU, mList.get(pos));
        startActivity(intent);
    }
}
