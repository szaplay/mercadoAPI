package com.example.mercadoAPI.controller;
import com.example.mercadoAPI.entity.Clientes;
import com.example.mercadoAPI.service.MercadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MercadoController {
    
    @Autowired
    private MercadoService mercadoService;
    
    @PostMapping("/Clientes")
    public Clientes createClientes(@RequestBody Clientes cliente){
        return mercadoService.createClientes(cliente);
    }
    
    @GetMapping("/Clientes")
    public List<Clientes> readClientes() {
        return mercadoService.getClientes();
    }
    
    @PutMapping("/Clientes/{id}")
    public Clientes updateClientes(@RequestBody Clientes cliente, @PathVariable Long id){
        return mercadoService.updateClientes(id, cliente);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteClientes(@PathVariable Long id) {
        mercadoService.deleteClientes(id);
    }
}
