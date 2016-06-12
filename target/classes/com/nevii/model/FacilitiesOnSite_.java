package com.nevii.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-06T19:03:36.262+0000")
@StaticMetamodel(FacilitiesOnSite.class)
public class FacilitiesOnSite_ {
	public static volatile SingularAttribute<FacilitiesOnSite, Long> id_facilities;
	public static volatile SingularAttribute<FacilitiesOnSite, String> accessLocation;
	public static volatile SingularAttribute<FacilitiesOnSite, Neighbors> neighbor;
	public static volatile SingularAttribute<FacilitiesOnSite, String> objectConstruction;
	public static volatile SingularAttribute<FacilitiesOnSite, String> exteriorWalls;
	public static volatile SingularAttribute<FacilitiesOnSite, String> roofConstruction;
	public static volatile SingularAttribute<FacilitiesOnSite, String> roofCover;
	public static volatile SingularAttribute<FacilitiesOnSite, String> markFacilities;
}
