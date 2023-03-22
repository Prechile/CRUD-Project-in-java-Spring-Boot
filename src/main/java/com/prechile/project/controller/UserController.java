package com.prechile.project.controller;

import com.prechile.project.Service.UserService;
import com.prechile.project.dto.RegisterRequest;
import com.prechile.project.dto.UserRequest;
import com.prechile.project.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(userService.register(request));

    }

    @PostMapping("/login")
    public ResponseEntity<UserResponse> login(@RequestBody UserRequest request){
        return ResponseEntity.ok(userService.login(request));
        }



}
