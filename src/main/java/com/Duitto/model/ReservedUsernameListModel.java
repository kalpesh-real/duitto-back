package com.Duitto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sh_reserved_usernamelist")
public class ReservedUsernameListModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "customer_id" ,columnDefinition = "long default 0")
	private long customerId;
	/*
	 * public CustomerRegistrationModel getCustomer() { return customer; }
	 * 
	 * public void setCustomer(CustomerRegistrationModel customer) { this.customer =
	 * customer; }
	 */

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public int getIsRequest() {
		return isRequest;
	}

	public void setIsRequest(int isRequest) {
		this.isRequest = isRequest;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	/*
	 * @OneToOne(optional = false, fetch = FetchType.EAGER) private
	 * CustomerRegistrationModel customer;
	 */
	
	@Column(name = "user_name")
	private String reservedUserName;
	
	@Column(name = "is_available" ,columnDefinition = "integer default 0")
	private String isAvailable;
	
	@Column(name = "is_request" ,columnDefinition = "integer default 0")
	private int isRequest;
	
	@Column(name = "reason" ,columnDefinition = "text")
	private String reason;

	public ReservedUsernameListModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReservedUsernameListModel(Long id, String reservedUserName, String isAvailable) {
		super();
		this.id = id;
		this.reservedUserName = reservedUserName;
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "ReservedUsernameList [id=" + id + ", reservedUserName=" + reservedUserName + ", isAvailable="
				+ isAvailable + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReservedUserName() {
		return reservedUserName;
	}

	public void setReservedUserName(String reservedUserName) {
		this.reservedUserName = reservedUserName;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}


}
