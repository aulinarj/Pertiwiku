package id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku;

import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.adapter.LaguAdapterNasional;
import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model.LaguNasional;


public class ListLaguNasional extends AppCompatActivity implements LaguAdapterNasional.ILaguAdapterNasional {
    public static final String LAGU_NAS = "lagu";
    public static final String TAG = "LivecycleTag";
    public static MediaPlayer mediaPlayer;
    ArrayList<LaguNasional> mListNas = new ArrayList<>();
    LaguAdapterNasional mAdapterNas;

    public static void stop() {
        if (mediaPlayer != null)
            mediaPlayer.stop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_lagu_nas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.listLaguNasional);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapterNas = new LaguAdapterNasional(this, mListNas);
        recyclerView.setAdapter(mAdapterNas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        fillData();
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.music_nas);
        String[] arDeskripsi = resources.getStringArray(R.array.pencipta);
        String[] arDetail = resources.getStringArray(R.array.desc_music_nas);

        for (int i = 0; i < arJudul.length; i++) {
            mListNas.add(new LaguNasional(arJudul[i], arDeskripsi[i], arDetail[i]));
        }
        mAdapterNas.notifyDataSetChanged();
    }

    @Override
    public void doClick(int pos) {
        Intent intent = new Intent(this, LaguPlayerNasional.class);
        intent.putExtra(LAGU_NAS, mListNas.get(pos));
        startActivity(intent);
    }

    @Override
    public void doSong(int pos) {
        switch (pos) {
            case 0:
                mediaPlayer = MediaPlayer.create(this, R.raw.ibu_kartini);
                mediaPlayer.start();
                break;
            case 1:
                mediaPlayer = MediaPlayer.create(this, R.raw.gugur_bunga);
                mediaPlayer.start();
                break;
            case 2:
                mediaPlayer = MediaPlayer.create(this, R.raw.dari_sabang);
                mediaPlayer.start();
                break;
            case 3:
                mediaPlayer = MediaPlayer.create(this, R.raw.garuda_pancasila);
                mediaPlayer.start();
                break;
            case 4:
                mediaPlayer = MediaPlayer.create(this, R.raw.halo_halo_bandung);
                mediaPlayer.start();
                break;
            case 5:
                mediaPlayer = MediaPlayer.create(this, R.raw.hymne_guru);
                mediaPlayer.start();
                break;
            case 6:
                mediaPlayer = MediaPlayer.create(this, R.raw.hymne_pramuka);
                mediaPlayer.start();
                break;
            case 7:
                mediaPlayer = MediaPlayer.create(this, R.raw.hymne);
                mediaPlayer.start();
                break;
            case 8:
                mediaPlayer = MediaPlayer.create(this, R.raw.syukur);
                mediaPlayer.start();
                break;
            case 9:
                mediaPlayer = MediaPKlayer.create(this, R.raw.mengheningkan_cipta);
                mediaPlayer.start();
                break;
            case 10:
                mediaPlayer = MediaPlayer.create(this, R.raw.indonesia_pusaka);
                mediaPlayer.start();
                break;
            case 11:
                mediaPlayer = MediaPlayer.create(this, R.raw.rayuan_pulau_kepala);
                mediaPlayer.start();
                break;
            case 12:
                mediaPlayer = MediaPlayer.create(this, R.raw.satu_nusa);
                mediaPlayer.start();
                break;


        }
    }

    @Override
    public void onBackPressed() {
        if (mediaPlayer != null)
            mediaPlayer.stop();
        super.onBackPressed();
    }
}

