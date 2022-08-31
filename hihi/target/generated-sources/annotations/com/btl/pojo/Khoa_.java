package com.btl.pojo;

import com.btl.pojo.Sinhvien;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T21:34:55")
@StaticMetamodel(Khoa.class)
public class Khoa_ { 

    public static volatile SingularAttribute<Khoa, String> tenKhoa;
    public static volatile CollectionAttribute<Khoa, Sinhvien> sinhvienCollection;
    public static volatile SingularAttribute<Khoa, Integer> id;

}