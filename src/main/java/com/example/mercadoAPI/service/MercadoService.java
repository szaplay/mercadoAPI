package com.example.mercadoAPI.service;

import com.example.mercadoAPI.entity.Clientes;
import java.util.List;

public interface MercadoService{
    
    public Clientes createClientes(Clientes c);
    
    public List<Clientes> getClientes();
    
    public void deleteClientes(Long idClientes);
    
    public Clientes updateClientes(Long idClientes, Clientes c);

}