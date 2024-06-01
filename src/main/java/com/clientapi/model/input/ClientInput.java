package com.clientapi.model.input;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClientInput {
    private String name;
    private String mail;
    private String nif;
}
