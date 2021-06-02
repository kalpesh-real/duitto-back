package com.Duitto.converter;

import com.Duitto.dto.UserDto;
import com.Duitto.model.CustomerRegistrationModel;
import com.Duitto.utility.MethodsUtility;

public class ReservedUsernameConverter {

	 public static CustomerRegistrationModel dtoToEntity(UserDto userDto) {
	        CustomerRegistrationModel user = new CustomerRegistrationModel();
	        user.setIsCreatedOn(MethodsUtility.getCurrentTimestamp());
	        user.setEnabled(false);
	        user.setEmail(userDto.getEmail());
	        user.setFullName(userDto.getFullName());
	        user.setUserRole("USER");
	        user.setIp(userDto.getIp());	
	        user.setUserName(userDto.getUserName());
	       
	        return user;
	    }
	    

	    public static UserDto entityToDto(CustomerRegistrationModel user) {
	        UserDto userDto = new UserDto();
	        userDto.setId(user.getId());
	        userDto.setFullName(user.getFullName());
	 
	        userDto.setUserRole(user.getUserRole());
	        userDto.setIsCreatedOn(user.getIsCreatedOn());

	        userDto.setEmail(user.getEmail());
	        userDto.setIp(user.getIp());
	        userDto.setUserName(user.getUserName());
	        return userDto;
	        }
}
