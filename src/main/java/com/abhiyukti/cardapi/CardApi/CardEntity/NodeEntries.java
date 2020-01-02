package com.abhiyukti.cardapi.CardApi.CardEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DB_NODE_ENTRIES")
public class NodeEntries{
    @Id
    String id;
    String name;
    String type;
    String description;
    String styleClass;
    String icon;
    String toolTip;
    String parent;
    String tbd;
    String tbd2;

    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStyleClass() {
		return styleClass;
	}
	public void setStyleClass(String styleClass) {
		this.styleClass = styleClass;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getToolTip() {
		return toolTip;
	}
	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getTbd() {
		return tbd;
	}
	public void setTbd(String tbd) {
		this.tbd = tbd;
	}
	public String getTbd2() {
		return tbd2;
	}
	public void setTbd2(String tbd2) {
		this.tbd2 = tbd2;
	}
}