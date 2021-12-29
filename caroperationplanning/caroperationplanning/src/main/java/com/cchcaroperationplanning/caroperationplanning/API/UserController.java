package com.cchcaroperationplanning.caroperationplanning.API;

import Service.UserService;
import com.cchcaroperationplanning.caroperationplanning.DTO.UserViewDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("v1/user/{id}")
    public ResponseEntity<UserViewDTO> getUserById(@PathVariable Long id){
    final UserViewDTO user = userService.getUserById(id);
    return ResponseEntity.ok(user);

    }

}
