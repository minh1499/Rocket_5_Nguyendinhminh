package com.vti.lesson11.entity;

public class Group {
	private String groupName;
	private int creatorID;
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getCreatorID() {
		return creatorID;
	}
	public void setCreatorID(int creatorID) {
		this.creatorID = creatorID;
	}
	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", creatorID=" + creatorID + "]";
	}
	public Group(String groupName, int creatorID) {
		super();
		this.groupName = groupName;
		this.creatorID = creatorID;
	}
	
	
	
	
}
