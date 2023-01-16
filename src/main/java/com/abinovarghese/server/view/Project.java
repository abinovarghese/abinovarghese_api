package com.abinovarghese.server.view;

public class Project {
	
	private String ProjectName;
	private String ProjectShortDesc;
	private String ProjectDesc;
	private String SnapLocation;
	
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getProjectShortDesc() {
		return ProjectShortDesc;
	}
	public void setProjectShortDesc(String projectShortDesc) {
		ProjectShortDesc = projectShortDesc;
	}
	public String getProjectDesc() {
		return ProjectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		ProjectDesc = projectDesc;
	}
	public String getSnapLocation() {
		return SnapLocation;
	}
	public void setSnapLocation(String snapLocation) {
		SnapLocation = snapLocation;
	}

}
