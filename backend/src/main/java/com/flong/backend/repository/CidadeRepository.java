package com.flong.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flong.backend.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
    
}
