package eu.ensup.microservicetest.controller;

import eu.ensup.microservicetest.dto.VirementRequestDTO;
import eu.ensup.microservicetest.service.CompteService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {

    private CompteService compteService;

    public AccountRestController(CompteService compteService) {
        this.compteService = compteService;
    }

    @PutMapping(path = "comptes/virmement")
    public void virement(@RequestBody VirementRequestDTO requestDTO){
        compteService.virement(requestDTO.getCodeCompteSource(), requestDTO.getCodeCompteDestination(), requestDTO.getMontant());
    }
}
