package com.backend.agrilink.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {

    private String token;

    private String id;
    private String nome;
    private String telefone;
    private String tipo;
    private String provincia;
}