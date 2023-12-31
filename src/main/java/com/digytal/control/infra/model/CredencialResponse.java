package com.digytal.control.infra.model;

import lombok.Data;

@Data
public class CredencialResponse {
    private Long expiracao;
    private Integer usuario;
    private String login;
    private String nome;
    private String token;
}
