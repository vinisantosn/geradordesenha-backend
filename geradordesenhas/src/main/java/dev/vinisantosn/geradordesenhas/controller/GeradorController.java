package dev.vinisantosn.geradordesenhas.controller;

import dev.vinisantosn.geradordesenhas.gerador.Gerador;
import dev.vinisantosn.geradordesenhas.gerador.GeradorDeSenha;
import dev.vinisantosn.geradordesenhas.gerador.GeradorReponseDTO;
import dev.vinisantosn.geradordesenhas.gerador.GeradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gerador")
public class GeradorController {
	@Autowired
	private GeradorDeSenha geradorDeSenha;
    @Autowired
    private GeradorRepository repository;
    
//    @GetMapping
//    public List<GeradorReponseDTO> getAll(){
//        List<GeradorReponseDTO> geradorList = repository.findAll().stream().map(GeradorReponseDTO::new).toList();
//        return geradorList;
//
//    }
//    
    @CrossOrigin(origins = "*",allowedHeaders = "*")
    @GetMapping
    public String generatePassword(@RequestParam(defaultValue = "12") int length) {
        String newPassword = geradorDeSenha.generatePassword(length);
        Gerador passwordEntity = new Gerador();
        passwordEntity.setSenha(newPassword);
        repository.save(passwordEntity);
        return newPassword;
    }
}
