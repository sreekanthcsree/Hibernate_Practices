package com.joc;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Theatre {
	@Id
	@Column
	int t_id;
	@Column
	String t_name;
	@Column
	Date b_date;
	
	public Theatre() {
		
	}
	public Theatre(int t_id, String t_name, Date b_date) {
		this.t_id = t_id;
		this.t_name = t_name;
		this.b_date = b_date;
	}
	@Override
	public String toString() {
		return "Theatre t_id : "+t_id +" t_name : "+t_name+" b_date : "+b_date ;
	}
}
