package io.sparrow.oauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/oauth")
public class ClientController {

    @Autowired
    private JdbcClientDetailsService jdbcClientDetailsService;

    @GetMapping("/listClientDetails")
    public List<ClientDetails> list(){
        List<ClientDetails> clientDetails = jdbcClientDetailsService.listClientDetails();
        return clientDetails;
    }
}
