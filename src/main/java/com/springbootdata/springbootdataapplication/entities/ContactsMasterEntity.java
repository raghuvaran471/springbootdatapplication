package com.springbootdata.springbootdataapplication.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name="contacts_master")
public class ContactsMasterEntity {
	@Id
	@Column(name="contact_id")
	private Integer contactId;
	
	@Column(name="contact_name")
	private String contactName;
	
	@Column(name="contact_number")
	private Integer contactNumber;
	

}
