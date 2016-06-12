package com.nevii.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-06T19:03:36.277+0000")
@StaticMetamodel(Protection.class)
public class Protection_ {
	public static volatile SingularAttribute<Protection, Long> id_protection;
	public static volatile SingularAttribute<Protection, String> fenced;
	public static volatile SingularAttribute<Protection, String> illuminated;
	public static volatile SingularAttribute<Protection, String> fireBrigade;
	public static volatile SingularAttribute<Protection, String> security;
	public static volatile SingularAttribute<Protection, String> fireProtectionMan;
	public static volatile SingularAttribute<Protection, Hydrant> hydrant;
	public static volatile SingularAttribute<Protection, FireExtinguisher> fireExtinguisher;
	public static volatile SingularAttribute<Protection, LightningConductor> lightningConductor;
	public static volatile SingularAttribute<Protection, FireAlarm> fireAlarm;
	public static volatile SingularAttribute<Protection, FireFightingIns> fireFightingIns;
	public static volatile SingularAttribute<Protection, String> theftSystem;
	public static volatile SingularAttribute<Protection, String> videoSurve;
	public static volatile SingularAttribute<Protection, String> mark;
}
