package com.clientapi.service;

import com.clientapi.model.dto.ClientDto;
import com.clientapi.model.input.ClientInput;

public interface IClientService {

    ClientDto findClientById(Long id);

    void createClient(ClientInput clientInput);

}
