package id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model.LaguNasional;

import static id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.ListLaguNasional.stop;

public class LaguPlayerNasional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_player_nasional);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        LaguNasional laguNasional = (LaguNasional) getIntent().getSerializableExtra(ListLaguNasional.LAGU_NAS);
        setTitle(laguNasional.judulNas);
        TextView tvDeskripsi = (TextView) findViewById(R.id.music_detail_nas);
        tvDeskripsi.setText(laguNasional.detail);

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stop();
    }
}
