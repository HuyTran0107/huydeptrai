package com.btl.pojo;

import com.btl.pojo.DeTai;
import com.btl.pojo.Diem;
import com.btl.pojo.Hdbv;
import com.btl.pojo.Sinhvien;
import com.btl.pojo.TieuChiChamDiem;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T21:34:55")
@StaticMetamodel(KhoaLuan.class)
public class KhoaLuan_ { 

    public static volatile SingularAttribute<KhoaLuan, Hdbv> hdbv;
    public static volatile SingularAttribute<KhoaLuan, Diem> diem;
    public static volatile SingularAttribute<KhoaLuan, Float> price;
    public static volatile SingularAttribute<KhoaLuan, String> name;
    public static volatile CollectionAttribute<KhoaLuan, Sinhvien> sinhvienCollection;
    public static volatile SingularAttribute<KhoaLuan, Integer> id;
    public static volatile SingularAttribute<KhoaLuan, DeTai> detai;
    public static volatile SingularAttribute<KhoaLuan, TieuChiChamDiem> tieuchichamdiem;

}