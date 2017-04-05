package id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model.LaguDaerah;

public class LaguPlayerDaerah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_player_dae);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        LaguDaerah laguDaerah = (LaguDaerah) getIntent().getSerializableExtra(ListLaguDaerah.LAGU_DAE);
        setTitle(laguDaerah.judul);
        TextView tvDeskripsi = (TextView) findViewById(R.id.music_detail);
        tvDeskripsi.setText(laguDaerah.deskripsi);

    }

}
