package id.sch.smktelkom_mlg.project2.xirpl501052429.tapertiwiku.model;

import java.io.Serializable;

/**
 * Created by Aulina on 30/03/2017.
 */

public class LaguNasional implements Serializable {
    public String judulNas;
    public String deskripsiNas;
    public String detail;


    public LaguNasional(String judulNas, String deskripsiNas, String detail) {
        this.judulNas = judulNas;
        this.deskripsiNas = deskripsiNas;
        this.detail = detail;
    }
}
