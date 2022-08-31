package com.btl.pojo;

import com.btl.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T21:34:55")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile SingularAttribute<Admin, String> firstname;
    public static volatile SingularAttribute<Admin, String> password;
    public static volatile SingularAttribute<Admin, Integer> id;
    public static volatile SingularAttribute<Admin, User> user;
    public static volatile SingularAttribute<Admin, String> email;
    public static volatile SingularAttribute<Admin, String> lastname;
    public static volatile SingularAttribute<Admin, String> username;

}