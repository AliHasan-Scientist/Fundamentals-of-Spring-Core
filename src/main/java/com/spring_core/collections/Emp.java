package com.spring_core.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phonesList;
	private Set<String> addressSet;
	private Map<String, String> courseMap;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhonesList() {
		return phonesList;
	}

	public void setPhonesList(List<String> phonesList) {
		this.phonesList = phonesList;
	}

	public Set<String> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}

	public Map<String, String> getCourseMap() {
		return courseMap;
	}

	public void setCourseMap(Map<String, String> courseMap) {
		this.courseMap = courseMap;
	}

	public Emp(String name, List<String> phonesList, Set<String> addressSet, Map<String, String> courseMap) {
		super();
		this.name = name;
		this.phonesList = phonesList;
		this.addressSet = addressSet;
		this.courseMap = courseMap;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

}
