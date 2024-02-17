package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pId;
	@JoinColumn(name = "project_name")
	private String projectName;
	@ManyToMany(mappedBy = "projects")
	private List<Employee> emps;

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int pId, String projectName, List<Employee> emps) {
		super();
		this.pId = pId;
		this.projectName = projectName;
		this.emps = emps;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

}
