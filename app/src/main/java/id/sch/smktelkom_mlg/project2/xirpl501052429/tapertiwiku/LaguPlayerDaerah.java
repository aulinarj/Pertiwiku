package id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model.LaguDaerah;

import static id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.ListLaguDaerah.stop;

public class LaguPlayerDaerah extends AppCompatActivity {
    private static final String TAG = "LivecycleTag";
    public static MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_player_dae);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        LaguDaerah daerah = (LaguDaerah) getIntent().getSerializableExtra(ListLaguDaerah.LAGU_DAE);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                stop();
            }
        });
    }
}
