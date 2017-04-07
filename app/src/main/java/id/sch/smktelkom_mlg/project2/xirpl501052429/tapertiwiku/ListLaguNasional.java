package id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku;

import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.adapter.LaguAdapterNasional;
import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model.LaguNasional;


public class ListLaguNasional extends AppCompatActivity implements LaguAdapterNasional.ILaguAdapterNasional {
    public static final String LAGU_NAS = "lagu";

    ArrayList<LaguNasional> mListNas = new ArrayList<>();
    LaguAdapterNasional mAdapterNas;
    MediaPlayer mediaPlayer;

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

        fillData();
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.music_nas);
        String[] arDeskripsi = resources.getStringArray(R.array.pencipta);

        for (int i = 0; i < arJudul.length; i++) {
            mListNas.add(new LaguNasional(arJudul[i], arDeskripsi[i]));
        }
        mAdapterNas.notifyDataSetChanged();
    }

    @Override
    public void doClick(int pos) {
        Intent intent = new Intent(this, LaguPlayerDaerah.class);
        intent.putExtra(LAGU_NAS, mListNas.get(pos));
        startActivity(intent);
    }

    @Override
    public void doSong(int pos) {
        switch (pos) {
            case 0:
                mediaPlayer = MediaPlayer.create(this, R.raw.bendera_kita);
                mediaPlayer.start();
                break;
            case 1:
                mediaPlayer = MediaPlayer.create(this, R.raw.apuse);
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
                mediaPlayer = MediaPlayer.create(this, R.raw.mengheningkan_cipta);
                mediaPlayer.start();
                break;
            case 10:
                mediaPlayer = MediaPlayer.create(this, R.raw.tanah_airku);
                mediaPlayer.start();
                break;
            case 11:
                mediaPlayer = MediaPlayer.create(this, R.raw.indonesia_pusaka);
                mediaPlayer.start();
                break;
            case 12:
                mediaPlayer = MediaPlayer.create(this, R.raw.rayuan_pulau_kepala);
                mediaPlayer.start();
                break;
            case 13:
                mediaPlayer = MediaPlayer.create(this, R.raw.satu_nusa);
                mediaPlayer.start();
                break;
            case 14:
                mediaPlayer = MediaPlayer.create(this, R.raw.tanah_air_beta);
                mediaPlayer.start();
                break;
        }
    }
}

