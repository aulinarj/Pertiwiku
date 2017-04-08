package id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model;

import java.io.Serializable;

/**
 * Created by Aulina on 30/03/2017.
 */

public class LaguDaerah implements Serializable {
    public String judul;
    public String deskripsi;
    public String detail;

    public LaguDaerah(String judul, String deskripsi, String detail) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;

    }
}
