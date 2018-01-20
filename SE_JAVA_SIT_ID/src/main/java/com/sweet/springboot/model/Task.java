package com.sweet.springboot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="SweetItech")
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String RAM;
	private String MotheeBoard;
	@Temporal(TemporalType.TIMESTAMP)
	private Date DateCreated;
	private boolean Complete;
	
	
	public Task(String ram, String motherboard, Date dateCreated, boolean complete) {
		super();
		RAM = ram;
		MotheeBoard = motherboard;
		DateCreated = dateCreated;
		Complete = complete;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String ram) {
		RAM = ram;
	}
	public String getMotheeBoard() {
		return MotheeBoard;
	}
	public void setMotheeBoard(String motherboard) {
		MotheeBoard = motherboard;
	}
	public Date getDateCreated() {
		return DateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		DateCreated = dateCreated;
	}
	public boolean isComplete() {
		return Complete;
	}
	public void setComplete(boolean complete) {
		Complete = complete;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", RAM=" + RAM + ", MotheeBoard=" + MotheeBoard + ", DateCreated=" + DateCreated
				+ ", Complete=" + Complete + "]";
	}
	
}
