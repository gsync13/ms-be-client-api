package com.clientapi.model.dto;

import lombok.Builder;

@Builder
public class ClientDto {

    private Long id;
    private String name;
    private String mail;
    private String nif;
    private String status;

}
