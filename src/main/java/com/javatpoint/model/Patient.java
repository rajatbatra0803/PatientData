package com.javatpoint.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Patient 
{
	//mark id as primary key
	/*
	 * @Id //defining id as column name
	 * 
	 * @Column private int id;
	 */
@Column
private String name;
	
@Column
private String gender;
@Id
@Column
private String phonenumber;

/*
 * public int getId() { return id; }
 * 
 * public void setId(int id) { this.id = id;
 */
//}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getPhoneNumber() {
	return phonenumber;
}

public void setPhoneNumber(String phonenumber) {
	this.phonenumber = phonenumber;
}


}