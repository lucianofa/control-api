package com.digytal.control.webservice.core.cadastros;

import com.digytal.control.infra.http.response.Response;
import com.digytal.control.infra.http.response.ResponseFactory;
import com.digytal.control.service.core.params.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ceps")
public class CepResource {
    @Autowired
    private CepService service;
    @GetMapping("/{cep}")
    public Response obterCep(@PathVariable("cep") String cep){
        return ResponseFactory.ok(service.obterCep(cep),"Consulta realizada com sucesso");
    }
}
