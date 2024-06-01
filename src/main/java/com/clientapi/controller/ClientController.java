package com.clientapi.controller;

import com.clientapi.model.dto.ClientDto;
import com.clientapi.model.input.ClientInput;
import com.clientapi.repository.ClientRepository;
import com.clientapi.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {


    @Autowired
    private IClientService clientService;


    @GetMapping("/{client-id}")
    public ClientDto getClientById(@PathVariable("client-id") Long clientId){
        return clientService.findClientById(clientId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createClient(@RequestBody ClientInput clientInput){
        clientService.createClient(clientInput);
    }

}
