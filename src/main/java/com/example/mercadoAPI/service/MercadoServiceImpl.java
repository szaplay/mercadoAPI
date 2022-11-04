package com.example.mercadoAPI.service;

import com.example.mercadoAPI.entity.Clientes;
import com.example.mercadoAPI.repository.MercadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MercadoServiceImpl implements MercadoService{
    
    @Autowired //crea una instancia del repo
    MercadoRepository mercadoRepository;
    
    @Override
    public Clientes createClientes(Clientes c) {
        return mercadoRepository.save(c);
    }
    
    @Override
    public List<Clientes> getClientes() {
        return mercadoRepository.findAll();
    }
    
    @Override
    public void deleteClientes(Long idClientes) {
        mercadoRepository.deleteById(idClientes);
    }
    
    @Override
    public Clientes updateClientes(Long idClientes, Clientes c) {
        Clientes cliente = mercadoRepository.findById(idClientes).get();
        cliente.setNombre(c.getNombre());
        cliente.setApellido(c.getApellido());
        cliente.setDni(c.getDni());
        cliente.setDireccion(c.getDireccion());
        cliente.setFechaNac(c.getFechaNac());

        return mercadoRepository.save(cliente);

    }
}
