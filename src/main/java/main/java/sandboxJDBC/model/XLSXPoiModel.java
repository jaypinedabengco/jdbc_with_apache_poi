package main.java.sandboxJDBC.model;

import java.lang.reflect.Field;

import org.apache.poi.ss.usermodel.Row;

public class XLSXPoiModel extends PoiModel{

	private Double Course_ID;
	private String Course_Name;
	private String CRICOS_Course_Code;
	private String VET_National_Code;
	private String Dual_Qualification;
	private String Field_Of_Education_1st;
	private String Broad_Field_1;
	private String Narrow_Field_1;
	private String Detailed_Field_1;
	private String Course_Level;
	private String Foundation_Studies;
	private String Work_Component;
	private String Course_Language;
	private Double Duration_Weeks;
	private String Tuition_Fee;
	private String Non_Tuition_Fee;
	private String Estimated_Total_Course_Cost;
	private String State1;
	private String Course_Locations1;
	private String State2;
	private String Course_Locations2;
	private String State3;
	private String Course_Locations3;
	private String CRICOS_Provider_Code;
	private String Institution_Trading_Name;
	private String Institution_Name;
	private String Institution_Type;
	private String Website;
	private String Institution_Postal_Address;

	public XLSXPoiModel(){}
	
	public XLSXPoiModel(Row row) throws IllegalArgumentException, IllegalAccessException{
		
		Class<?> c = this.getClass();
		
		Field[] fields = c.getDeclaredFields();
		for ( int x = 0; x < fields.length; x++ ){
			Field t_field = fields[x];
			t_field.setAccessible(true);
			t_field.set(this, this.getValue(row.getCell(x)));
		}
	}

	public Double getCourse_ID() {
		return Course_ID;
	}

	public void setCourse_ID(Double course_ID) {
		Course_ID = course_ID;
	}

	public String getCourse_Name() {
		return Course_Name;
	}

	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}

	public String getCRICOS_Course_Code() {
		return CRICOS_Course_Code;
	}

	public void setCRICOS_Course_Code(String cRICOS_Course_Code) {
		CRICOS_Course_Code = cRICOS_Course_Code;
	}

	public String getVET_National_Code() {
		return VET_National_Code;
	}

	public void setVET_National_Code(String vET_National_Code) {
		VET_National_Code = vET_National_Code;
	}

	public String getDual_Qualification() {
		return Dual_Qualification;
	}

	public void setDual_Qualification(String dual_Qualification) {
		Dual_Qualification = dual_Qualification;
	}

	public String getField_Of_Education_1st() {
		return Field_Of_Education_1st;
	}

	public void setField_Of_Education_1st(String field_Of_Education_1st) {
		Field_Of_Education_1st = field_Of_Education_1st;
	}

	public String getBroad_Field_1() {
		return Broad_Field_1;
	}

	public void setBroad_Field_1(String broad_Field_1) {
		Broad_Field_1 = broad_Field_1;
	}

	public String getNarrow_Field_1() {
		return Narrow_Field_1;
	}

	public void setNarrow_Field_1(String narrow_Field_1) {
		Narrow_Field_1 = narrow_Field_1;
	}

	public String getDetailed_Field_1() {
		return Detailed_Field_1;
	}

	public void setDetailed_Field_1(String detailed_Field_1) {
		Detailed_Field_1 = detailed_Field_1;
	}

	public String getCourse_Level() {
		return Course_Level;
	}

	public void setCourse_Level(String course_Level) {
		Course_Level = course_Level;
	}

	public String getFoundation_Studies() {
		return Foundation_Studies;
	}

	public void setFoundation_Studies(String foundation_Studies) {
		Foundation_Studies = foundation_Studies;
	}

	public String getWork_Component() {
		return Work_Component;
	}

	public void setWork_Component(String work_Component) {
		Work_Component = work_Component;
	}

	public String getCourse_Language() {
		return Course_Language;
	}

	public void setCourse_Language(String course_Language) {
		Course_Language = course_Language;
	}

	public Double getDuration_Weeks() {
		return Duration_Weeks;
	}

	public void setDuration_Weeks(Double duration_Weeks) {
		Duration_Weeks = duration_Weeks;
	}

	public String getTuition_Fee() {
		return Tuition_Fee;
	}

	public void setTuition_Fee(String tuition_Fee) {
		Tuition_Fee = tuition_Fee;
	}

	public String getNon_Tuition_Fee() {
		return Non_Tuition_Fee;
	}

	public void setNon_Tuition_Fee(String non_Tuition_Fee) {
		Non_Tuition_Fee = non_Tuition_Fee;
	}

	public String getEstimated_Total_Course_Cost() {
		return Estimated_Total_Course_Cost;
	}

	public void setEstimated_Total_Course_Cost(String estimated_Total_Course_Cost) {
		Estimated_Total_Course_Cost = estimated_Total_Course_Cost;
	}

	public String getState1() {
		return State1;
	}

	public void setState1(String state1) {
		State1 = state1;
	}

	public String getCourse_Locations1() {
		return Course_Locations1;
	}

	public void setCourse_Locations1(String course_Locations1) {
		Course_Locations1 = course_Locations1;
	}

	public String getState2() {
		return State2;
	}

	public void setState2(String state2) {
		State2 = state2;
	}

	public String getCourse_Locations2() {
		return Course_Locations2;
	}

	public void setCourse_Locations2(String course_Locations2) {
		Course_Locations2 = course_Locations2;
	}

	public String getState3() {
		return State3;
	}

	public void setState3(String state3) {
		State3 = state3;
	}

	public String getCourse_Locations3() {
		return Course_Locations3;
	}

	public void setCourse_Locations3(String course_Locations3) {
		Course_Locations3 = course_Locations3;
	}

	public String getCRICOS_Provider_Code() {
		return CRICOS_Provider_Code;
	}

	public void setCRICOS_Provider_Code(String cRICOS_Provider_Code) {
		CRICOS_Provider_Code = cRICOS_Provider_Code;
	}

	public String getInstitution_Trading_Name() {
		return Institution_Trading_Name;
	}

	public void setInstitution_Trading_Name(String institution_Trading_Name) {
		Institution_Trading_Name = institution_Trading_Name;
	}

	public String getInstitution_Name() {
		return Institution_Name;
	}

	public void setInstitution_Name(String institution_Name) {
		Institution_Name = institution_Name;
	}

	public String getInstitution_Type() {
		return Institution_Type;
	}

	public void setInstitution_Type(String institution_Type) {
		Institution_Type = institution_Type;
	}

	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}

	public String getInstitution_Postal_Address() {
		return Institution_Postal_Address;
	}

	public void setInstitution_Postal_Address(String institution_Postal_Address) {
		Institution_Postal_Address = institution_Postal_Address;
	}
	
}
