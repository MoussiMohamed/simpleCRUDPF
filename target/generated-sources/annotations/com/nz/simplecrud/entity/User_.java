package com.nz.simplecrud.entity;

import com.nz.simplecrud.entity.Address;
import com.nz.simplecrud.entity.Role;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.4.0.v20120608-rNA", date="2014-08-30T00:52:35")
@StaticMetamodel(User.class)
public class User_ extends BaseEntity_ {

    public static volatile SingularAttribute<User, String> username;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Address> address;
    public static volatile ListAttribute<User, Role> roles;
    public static volatile SingularAttribute<User, String> lastname;
    public static volatile SingularAttribute<User, String> firstname;
    public static volatile SingularAttribute<User, String> password;

}