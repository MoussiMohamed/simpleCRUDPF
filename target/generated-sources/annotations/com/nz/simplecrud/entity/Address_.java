package com.nz.simplecrud.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.4.0.v20120608-rNA", date="2014-08-30T00:52:35")
@StaticMetamodel(Address.class)
public class Address_ extends BaseEntity_ {

    public static volatile SingularAttribute<Address, String> suburb;
    public static volatile SingularAttribute<Address, String> street;
    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, String> country;

}