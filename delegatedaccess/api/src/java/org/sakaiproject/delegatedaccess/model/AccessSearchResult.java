package org.sakaiproject.delegatedaccess.model;

import java.io.Serializable;
import java.util.List;

public class AccessSearchResult implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String eid;
	private String displayName;
	private String sortName;
	private int level;
	private int type;
	private List<String> hierarchyNodes;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getSortName() {
		return sortName;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<String> getHierarchyNodes() {
		return hierarchyNodes;
	}
	public void setHierarchyNodes(List<String> hierarchyNodes) {
		this.hierarchyNodes = hierarchyNodes;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
}
