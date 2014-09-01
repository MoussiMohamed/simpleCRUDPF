package com.nz.simplecrud.entity;

import com.nz.simplecrud.entity.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.4.0.v20120608-rNA", date="2014-08-30T00:52:35")
@StaticMetamodel(Role.class)
public class Role_ extends BaseEntity_ {

    public static volatile SingularAttribute<Role, String> roledesc;
    public static volatile ListAttribute<Role, User> users;
    public static volatile SingularAttribute<Role, String> rolename;

}