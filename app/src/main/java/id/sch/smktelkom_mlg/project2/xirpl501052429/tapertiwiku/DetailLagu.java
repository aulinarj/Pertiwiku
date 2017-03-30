package id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model.Lagu;

public class DetailLagu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_lagu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Lagu lagu = (Lagu) getIntent().getSerializableExtra(ListLagu.LAGU);
        setTitle(lagu.judul);
        TextView tvDesripsi = (TextView) findViewById(R.id.music_detail);
        tvDesripsi.setText(lagu.deskripsi);

    }
}
