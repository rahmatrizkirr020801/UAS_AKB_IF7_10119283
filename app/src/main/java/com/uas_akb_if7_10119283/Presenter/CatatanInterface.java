package com.uas_akb_if7_10119283.Presenter;

import android.database.Cursor;

import com.uas_akb_if7_10119283.Model.Catatan;

// selasa 13 Agustus 2022, 1011983, Rahmatullah Rizki, IF7
public interface CatatanInterface {
    public Cursor read();
    public boolean save(Catatan catatan);
    public boolean update(Catatan catatan);
    public boolean delete(String id_catatan);

}
