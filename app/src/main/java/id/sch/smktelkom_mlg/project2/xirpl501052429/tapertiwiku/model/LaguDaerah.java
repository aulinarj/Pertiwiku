package id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model;

import java.io.Serializable;

/**
 * Created by Aulina on 30/03/2017.
 */

public class LaguDaerah implements Serializable {
    public String judul;
    public String deskripsi;
    public String lagu;


    public LaguDaerah(String judul, String deskripsi) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.lagu = lagu;
    }
}
