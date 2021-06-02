package com.Duitto.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "seq", initialValue = 111313)
@Table(name = "sh_reserve_username")
public class ReserveUserNameModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "customer_id" ,columnDefinition = "long default 0")
	private long customerId;

	@Column(name = "user_name")
	private String reservedUserName;
	
	@Column(name = "is_available" ,columnDefinition = "integer default 0")
	private String isAvailable;
	
	@Column(name = "is_request" ,columnDefinition = "integer default 0")
	private int isRequest;
	
	@Column(name = "reason" ,columnDefinition = "text")
	private String reason;

	public ReserveUserNameModel(Long id, long customerId, String reservedUserName, String isAvailable, int isRequest,
			String reason) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.reservedUserName = reservedUserName;
		this.isAvailable = isAvailable;
		this.isRequest = isRequest;
		this.reason = reason;
	}

	public ReserveUserNameModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ReserveUserNameModel [id=" + id + ", customerId=" + customerId + ", reservedUserName="
				+ reservedUserName + ", isAvailable=" + isAvailable + ", isRequest=" + isRequest + ", reason=" + reason
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
}
