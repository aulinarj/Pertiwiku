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

import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.adapter.LaguAdapterDaerah;
import id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model.LaguDaerah;


public class ListLaguDaerah extends AppCompatActivity implements LaguAdapterDaerah.ILaguAdapterDaerah {

    public static final String LAGU_DAE = "lagu dae";

    ArrayList<LaguDaerah> mList = new ArrayList<>();
    LaguAdapterDaerah mAdapter;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_lagu_daerah);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.listLaguDae);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new LaguAdapterDaerah(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.music_daerah);
        String[] arDeskripsi = resources.getStringArray(R.array.asal);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new LaguDaerah(arJudul[i], arDeskripsi[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void doClick(int pos) {
        Intent intent = new Intent(this, LaguPlayerDaerah.class);
        intent.putExtra(LAGU_DAE, mList.get(pos));
        startActivity(intent);
    }

    @Override
    public void doSong(int pos) {
        switch (pos) {
            case 0:
                mediaPlayer = MediaPlayer.create(this, R.raw.ampar_ampar);
                mediaPlayer.start();
                break;
            case 1:
                mediaPlayer = MediaPlayer.create(this, R.raw.anak_kambing_saya);
                mediaPlayer.start();
                break;
            case 2:
                mediaPlayer = MediaPlayer.create(this, R.raw.apuse);
                mediaPlayer.start();
                break;
            case 3:
                mediaPlayer = MediaPlayer.create(this, R.raw.ayam_den_lapeh);
                mediaPlayer.start();
                break;
            case 4:
                mediaPlayer = MediaPlayer.create(this, R.raw.ayo_mama);
                mediaPlayer.start();
                break;
            case 5:
                mediaPlayer = MediaPlayer.create(this, R.raw.buka_pintu);
                mediaPlayer.start();
                break;
            case 6:
                mediaPlayer = MediaPlayer.create(this, R.raw.burung_kakak_tua);
                mediaPlayer.start();
                break;
            case 7:
                mediaPlayer = MediaPlayer.create(this, R.raw.cublak_cublak_suweng);
                mediaPlayer.start();
                break;
            case 8:
                mediaPlayer = MediaPlayer.create(this, R.raw.perahu_layar);
                mediaPlayer.start();
                break;
            case 9:
                mediaPlayer = MediaPlayer.create(this, R.raw.yangko_rambe_yamko);
                mediaPlayer.start();
                break;
            case 10:
                mediaPlayer = MediaPlayer.create(this, R.raw.gambang_suling);
                mediaPlayer.start();
                break;
            case 11:
                mediaPlayer = MediaPlayer.create(this, R.raw.lir_ilir);
                mediaPlayer.start();
                break;
            case 12:
                mediaPlayer = MediaPlayer.create(this, R.raw.manuk_dadali);
                mediaPlayer.start();
                break;
            case 13:
                mediaPlayer = MediaPlayer.create(this, R.raw.oinanikeke);
                mediaPlayer.start();
                break;
            case 14:
                mediaPlayer = MediaPlayer.create(this, R.raw.bubuy_bulan);
                mediaPlayer.start();
                break;
        }
    }
}

