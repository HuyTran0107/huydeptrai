package com.btl.pojo;

import com.btl.pojo.Admin;
import com.btl.pojo.Giangvien;
import com.btl.pojo.Giaovu;
import com.btl.pojo.Sinhvien;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T21:34:55")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> firstname;
    public static volatile SingularAttribute<User, String> password;
    public static volatile CollectionAttribute<User, Giangvien> giangvienCollection;
    public static volatile CollectionAttribute<User, Admin> adminCollection;
    public static volatile CollectionAttribute<User, Giaovu> giaovuCollection;
    public static volatile CollectionAttribute<User, Sinhvien> sinhvienCollection;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> userRole;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> lastname;
    public static volatile SingularAttribute<User, String> username;

}