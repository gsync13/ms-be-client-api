package com.clientapi.service;

import com.clientapi.enums.ClientStatus;
import com.clientapi.model.dto.ClientDto;
import com.clientapi.model.entity.Client;
import com.clientapi.model.input.ClientInput;
import com.clientapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ClientService implements IClientService {

    @Autowired
    ClientRepository clientRepository;


    @Override
    public ClientDto findClientById(Long id) {
        return findClientById(id);
    }

    @Override
    public void createClient(ClientInput clientInput) {
        Client client = Client.builder()
                .name(clientInput.getName())
                .nif(clientInput.getNif())
                .mail(clientInput.getMail())
                .status(ClientStatus.ACTIVE.getCode())
                .createdAt(LocalDate.now())
                .createdBy("Development")
                .updatedAt(LocalDate.now())
                .updatedBy("Development")
                .build();

        clientRepository.save(client);
    }
}
