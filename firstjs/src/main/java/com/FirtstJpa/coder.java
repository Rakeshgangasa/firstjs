package com.FirtstJpa;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@NamedQuery(name="myquery",query="select c from Coder c")
@Table(name="MyCoder")
public class coder {
	
	@Id
	@GeneratedValue
	private int cid;
	@Column(name="codername")
	private String cname;
	private String tech;
	
	//@OneToOne(cascade=CascadeType.ALL)
	//private Laptop laptop;
	
	@OneToMany(cascade = CascadeType.ALL)
	
	private List<Laptop> laptop;
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Coder [cid=" + cid + ", cname=" + cname + ", tech=" + tech + ", laptop=" + laptop + "]";
	}		
}