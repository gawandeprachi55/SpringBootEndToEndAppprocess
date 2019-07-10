package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="etab")
public class Emplyee {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private Double empSal;
	@Column(name="dept")
	private String empDept;
	@Column(name="addr")
	private String empAddr;
	@Transient
	private String email;
	@Transient
	private MultipartFile fileOb;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public MultipartFile getFileOb() {
		return fileOb;
	}
	public void setFileOb(MultipartFile fileOb) {
		this.fileOb = fileOb;
	}
	
	public Emplyee() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	@Override
	public String toString() {
		return "Emplyee [id=" + id + ", empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDept="
				+ empDept + ", empAddr=" + empAddr + ", email=" + email + ", fileOb=" + fileOb + "]";
	}



}
