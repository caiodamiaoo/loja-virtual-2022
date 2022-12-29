package com.flong.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flong.backend.entity.CarrinhoCompra;
import com.flong.backend.service.CarrinhoCompraService;

@RestController
@RequestMapping("/api/carrinhocompra")
public class CarrinhoCompraController {
    
    @Autowired
    private CarrinhoCompraService carrinhoCompraService;

    @GetMapping("/")
    public List<CarrinhoCompra> buscarTodos(){
       return carrinhoCompraService.buscarTodos();
    }

    @PostMapping("/")
    public CarrinhoCompra inserir(@RequestBody CarrinhoCompra carrinhoCompra){
        return carrinhoCompraService.inserir(carrinhoCompra);
    }
    
    @PutMapping("/")
    public CarrinhoCompra alterar (@RequestBody CarrinhoCompra carrinhoCompra){
        return carrinhoCompraService.alterar(carrinhoCompra);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> Excluir(@PathVariable("id") Long id){
        carrinhoCompraService.excluir(id);
        return ResponseEntity.ok().build();
    }

}
