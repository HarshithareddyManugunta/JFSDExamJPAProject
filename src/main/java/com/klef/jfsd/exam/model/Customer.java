package com.klef.jfsd.exam.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_table")
public class Customer 
{
 @Id
 private int cid;
 
 @Column(nullable = false)
 private String cname;
 
 @Column(nullable = false)
 private String cemail;
 
 @Column(nullable = false)
 private String caddress;
 
 @Column(nullable = false,unique = true)
 private String cphno;
 
 @Column(nullable = false)
 private String cdob;

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

public String getCemail() {
	return cemail;
}

public void setCemail(String cemail) {
	this.cemail = cemail;
}

public String getCaddress() {
	return caddress;
}

public void setCaddress(String caddress) {
	this.caddress = caddress;
}

public String getCphno() {
	return cphno;
}

public void setCphno(String cphno) {
	this.cphno = cphno;
}

public String getCdob() {
	return cdob;
}

public void setCdob(String cdob) {
	this.cdob = cdob;
}
  
}
