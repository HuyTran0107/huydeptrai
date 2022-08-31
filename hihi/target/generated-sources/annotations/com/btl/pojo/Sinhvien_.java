package com.btl.pojo;

import com.btl.pojo.ChuyenNganh;
import com.btl.pojo.Khoa;
import com.btl.pojo.KhoaHoc;
import com.btl.pojo.KhoaLuan;
import com.btl.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T21:34:55")
@StaticMetamodel(Sinhvien.class)
public class Sinhvien_ { 

    public static volatile SingularAttribute<Sinhvien, KhoaHoc> khoahoc;
    public static volatile SingularAttribute<Sinhvien, String> firstname;
    public static volatile SingularAttribute<Sinhvien, String> password;
    public static volatile SingularAttribute<Sinhvien, ChuyenNganh> chuyennganh;
    public static volatile SingularAttribute<Sinhvien, Integer> id;
    public static volatile SingularAttribute<Sinhvien, Khoa> khoa;
    public static volatile SingularAttribute<Sinhvien, User> user;
    public static volatile SingularAttribute<Sinhvien, String> email;
    public static volatile SingularAttribute<Sinhvien, String> lastname;
    public static volatile SingularAttribute<Sinhvien, String> username;
    public static volatile SingularAttribute<Sinhvien, KhoaLuan> khoaLuan;

}