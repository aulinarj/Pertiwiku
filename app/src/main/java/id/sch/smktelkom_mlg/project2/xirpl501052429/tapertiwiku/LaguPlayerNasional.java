package id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model.LaguNasional;

public class LaguPlayerNasional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_player_nas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        LaguNasional laguNasional = (LaguNasional) getIntent().getSerializableExtra(ListLaguNasional.LAGU_NAS);
        setTitle(laguNasional.judulNas);
        TextView tvDeskripsi = (TextView) findViewById(R.id.music_detail);
        tvDeskripsi.setText(laguNasional.deskripsiNas);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

}
