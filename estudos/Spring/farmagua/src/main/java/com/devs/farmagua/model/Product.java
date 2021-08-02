package com.devs.farmagua.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_product")
public class Product {
	   
	   
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
       
	   @NotBlank
	   @Size(min = 5, max = 100)
	   private String name;
	   
	   /*
	   @ManyToOne
	   @JsonIgnoreProperties("categoria")
	   private Category category;
	   */

	   @Temporal(TemporalType.TIMESTAMP)
	   private Date date = new java.sql.Date(System.currentTimeMillis());
	   
      public void setId(Long id){
	     this.id = id;
	  }
	  
	  public Long getId(){
		 return this.id;
	  }
      
	  public void setName(String name){
		  this.name = name;
	  }
	  
	  public String getName(){
	      return this.name;
	  }
	  
	  /*
	  public void setCategory(Category category){
		  this.category = category;
	  }
	  
	  public Category getCategory(){
		  return this.category;
	  }
	  */
	  
	  public void setDate(Date date){
		  this.date = date;
	  }
	  
	  public Date getDate(){
	      return this.date;
	  }
	  
	  
}