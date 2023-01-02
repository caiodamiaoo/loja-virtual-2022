package com.flong.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flong.backend.entity.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long>{
    
    List<Permissao> findByNome(String nome);

}
