package com.backend.agrilink.controller;

import com.backend.agrilink.dto.LoginRequest;
import com.backend.agrilink.dto.LoginResponse;
import com.backend.agrilink.model.User;
import com.backend.agrilink.repository.UserRepository;
import com.backend.agrilink.security.JwtService;
import com.backend.agrilink.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AuthController {

    private final UserService userService;
    private final UserRepository userRepository;
    private final JwtService jwtService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable UUID id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {

    User user = userRepository.findByTelefone(request.getTelefone())
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

    if (!user.getSenha().equals(request.getSenha())) {
        throw new RuntimeException("Senha inválida");
    }

    String token = jwtService.generateToken(user.getTelefone());

    LoginResponse response = LoginResponse.builder()
            .token(token)
            .id(user.getId().toString())
            .nome(user.getNome())
            .telefone(user.getTelefone())
            .tipo(user.getTipo())
            .provincia(user.getProvincia())
            .build();

    return ResponseEntity.ok(response);
    }

}