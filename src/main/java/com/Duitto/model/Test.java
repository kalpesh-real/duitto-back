package com.Duitto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "seq", initialValue = 111313)
@Table(name = "sh_test")
public class Test {

	

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
		@Column(name = "id", unique = true, nullable = false)
		private Long id;

		@Column(name = "customer_id" ,columnDefinition = "long default 0")
		private long customerId;

<<<<<<< HEAD
		@Column(name = "user_name")
		private String reservedName;
		
		@Column(name = "is_available" ,columnDefinition = "integer default 0")
		private String isAvailable;
=======
	
>>>>>>> 845f8e7baff6f180eee1cea1fe543439793addf1
		
		@Column(name = "request" ,columnDefinition = "integer default 0")
		private int isRequest;
		
		@Column(name = "reason" ,columnDefinition = "text")
		private String reason;

}