package id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model.LaguNasional;

public class LaguPlayerNasional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_player_nasional);

        LaguNasional laguNasional = (LaguNasional) getIntent().getSerializableExtra(ListLaguNasional.LAGU_NAS);
        setTitle(laguNasional.judulNas);
    }
}
