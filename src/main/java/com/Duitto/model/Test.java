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

		@Column(name = "ip")
		private String ip;
}
