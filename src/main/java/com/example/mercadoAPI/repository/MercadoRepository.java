package com.example.mercadoAPI.repository;
import com.example.mercadoAPI.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MercadoRepository extends JpaRepository<Clientes, Long>{
    
}
