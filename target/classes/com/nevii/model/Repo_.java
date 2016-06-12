package com.nevii.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.joda.time.DateTime;

@Generated(value="Dali", date="2016-02-09T21:30:32.901+0000")
@StaticMetamodel(Repo.class)
public class Repo_ {
	public static volatile SingularAttribute<Repo, Long> id_report;
	public static volatile SingularAttribute<Repo, Integer> reportNum;
	public static volatile SingularAttribute<Repo, Integer> year;
	public static volatile SingularAttribute<Repo, DateTime> dateTime;
	public static volatile SingularAttribute<Repo, Protection> protectionReport;
	public static volatile SingularAttribute<Repo, Ex> exReport;
	public static volatile SingularAttribute<Repo, RiskControll> riskReport;
	public static volatile SingularAttribute<Repo, FacilitiesOnSite> facilitiesReport;
}
