package com.btl.pojo;

import com.btl.pojo.Hdbv;
import com.btl.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T21:34:55")
@StaticMetamodel(Giangvien.class)
public class Giangvien_ { 

    public static volatile SingularAttribute<Giangvien, String> firstname;
    public static volatile SingularAttribute<Giangvien, String> password;
    public static volatile CollectionAttribute<Giangvien, Hdbv> hdbvCollection;
    public static volatile CollectionAttribute<Giangvien, Hdbv> hdbvCollection1;
    public static volatile SingularAttribute<Giangvien, Integer> id;
    public static volatile SingularAttribute<Giangvien, User> user;
    public static volatile SingularAttribute<Giangvien, String> email;
    public static volatile CollectionAttribute<Giangvien, Hdbv> hdbvCollection2;
    public static volatile SingularAttribute<Giangvien, String> lastname;
    public static volatile SingularAttribute<Giangvien, String> username;

}