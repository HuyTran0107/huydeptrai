package com.btl.pojo;

import com.btl.pojo.Giangvien;
import com.btl.pojo.KhoaLuan;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T21:34:55")
@StaticMetamodel(Hdbv.class)
public class Hdbv_ { 

    public static volatile SingularAttribute<Hdbv, Giangvien> chuTich;
    public static volatile CollectionAttribute<Hdbv, KhoaLuan> khoaLuanCollection;
    public static volatile SingularAttribute<Hdbv, Giangvien> phanBien;
    public static volatile SingularAttribute<Hdbv, Integer> id;
    public static volatile SingularAttribute<Hdbv, Giangvien> thuKy;

}