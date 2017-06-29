package org.kshrd.template.model;

import java.sql.Date;

public class User {
	int id;
	String username;
	String gender;
	int age;
	String position;
	String office;
	Date startWork;
	double salary;
	String userHash;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Date getStartWork() {
		return startWork;
	}

	public void setStartWork(Date startWork) {
		this.startWork = startWork;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getUserHash() {
		return userHash;
	}

	public void setUserHash(String userHash) {
		this.userHash = userHash;
	}

	public User(int id, String username, String gender, int age, String position, String office, Date startWork,
			double salary, String userHash) {
		super();
		this.id = id;
		this.username = username;
		this.gender = gender;
		this.age = age;
		this.position = position;
		this.office = office;
		this.startWork = startWork;
		this.salary = salary;
		this.userHash = userHash;
	}

	public User() {
	}
}
