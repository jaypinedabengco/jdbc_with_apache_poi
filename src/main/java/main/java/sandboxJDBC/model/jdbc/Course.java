package main.java.sandboxJDBC.model.jdbc;

import main.java.sandboxJDBC.model.XLSXPoiModel;

public class Course {

	private Integer id;
	private boolean active = true;
	private String name;
	private Integer duration_weeks;
	private String cricos_code;
	private String vet_national_code;
	private String course_code;
	private Double cost;
	private String language;
	private boolean work_component;
	private boolean foundation_studies;
	private String keywords;
	private String course_level;
	private boolean dual_qualification;

	private Integer award_id;
	private Integer institution_id;
	private Integer level_of_study_id;

	public Course(){}
	
	public Course(XLSXPoiModel model){
		
		this.id = model.getCourse_ID().intValue();
		this.name = model.getCourse_Name();
		this.duration_weeks = model.getDuration_Weeks().intValue();
		this.cricos_code = model.getCRICOS_Course_Code();
		this.vet_national_code = model.getVET_National_Code();

		//this.course_code
		
		if(model.getEstimated_Total_Course_Cost() != null )
			this.cost = Double.parseDouble(model.getEstimated_Total_Course_Cost().split(" ")[1].replace(",", ""));
		
		this.language = model.getCourse_Language();
		this.work_component = this.getBooleanValue(model.getWork_Component(),"yes");
		this.foundation_studies = this.getBooleanValue(model.getFoundation_Studies(),"yes");
		
		this.keywords = model.getCourse_Name() + "|" + 
						model.getBroad_Field_1() + "|" + 
						model.getNarrow_Field_1() + "|" + 
						model.getDetailed_Field_1();
		
		this.course_level = model.getCourse_Level();
		this.dual_qualification = this.getBooleanValue(model.getDual_Qualification(),"yes");
		
	}
	
	private boolean getBooleanValue(String value, String expectedTrue){
		return (value != null)?value.trim().toLowerCase().equals(expectedTrue):false;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDuration_weeks() {
		return duration_weeks;
	}

	public void setDuration_weeks(Integer duration_weeks) {
		this.duration_weeks = duration_weeks;
	}

	public String getCricos_code() {
		return cricos_code;
	}

	public void setCricos_code(String cricos_code) {
		this.cricos_code = cricos_code;
	}

	public String getVet_national_code() {
		return vet_national_code;
	}

	public void setVet_national_code(String vet_national_code) {
		this.vet_national_code = vet_national_code;
	}

	public String getCourse_code() {
		return course_code;
	}

	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isWork_component() {
		return work_component;
	}

	public void setWork_component(boolean work_component) {
		this.work_component = work_component;
	}

	public boolean isFoundation_studies() {
		return foundation_studies;
	}

	public void setFoundation_studies(boolean foundation_studies) {
		this.foundation_studies = foundation_studies;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getCourse_level() {
		return course_level;
	}

	public void setCourse_level(String course_level) {
		this.course_level = course_level;
	}

	public boolean isDual_qualification() {
		return dual_qualification;
	}

	public void setDual_qualification(boolean dual_qualification) {
		this.dual_qualification = dual_qualification;
	}

	public Integer getAward_id() {
		return award_id;
	}

	public void setAward_id(Integer award_id) {
		this.award_id = award_id;
	}

	public Integer getInstitution_id() {
		return institution_id;
	}

	public void setInstitution_id(Integer institution_id) {
		this.institution_id = institution_id;
	}

	public Integer getLevel_of_study_id() {
		return level_of_study_id;
	}

	public void setLevel_of_study_id(Integer level_of_study_id) {
		this.level_of_study_id = level_of_study_id;
	}

}
