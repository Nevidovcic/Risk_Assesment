package com.nevii.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.joda.time.DateTime;

@Generated(value="Dali", date="2016-02-06T19:03:36.279+0000")
@StaticMetamodel(Report.class)
public class Report_ {
	public static volatile SingularAttribute<Report, Long> id_report;
	public static volatile SingularAttribute<Report, Integer> reportNum;
	public static volatile SingularAttribute<Report, DateTime> year;
	public static volatile SingularAttribute<Report, DateTime> dateTime;
	public static volatile SingularAttribute<Report, Protection> protectionReport;
	public static volatile SingularAttribute<Report, Ex> exReport;
	public static volatile SingularAttribute<Report, RiskControll> riskReport;
	public static volatile SingularAttribute<Report, FacilitiesOnSite> facilitiesReport;
}
