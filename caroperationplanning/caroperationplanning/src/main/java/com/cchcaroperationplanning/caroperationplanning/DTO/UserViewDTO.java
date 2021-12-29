package com.cchcaroperationplanning.caroperationplanning.DTO;

import com.cchcaroperationplanning.caroperationplanning.Model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter

public final class UserViewDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String firsName;
    private final String lastName;



    public UserViewDTO(String firsName, String lastName) {

        this.firsName = firsName;
        this.lastName = lastName;
    }



    public static UserViewDTO of(User user){

        return  new UserViewDTO(user.getLastName(), user.getFirstName());
    }


}
