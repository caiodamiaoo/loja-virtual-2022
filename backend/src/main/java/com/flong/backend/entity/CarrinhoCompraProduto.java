package com.flong.backend.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@SequenceGenerator(name = "carrinhocompraproduto_seq" ,initialValue = 1,  sequenceName = "carrinhocompraproduto_seq", allocationSize = 1)
@Table(name = "carrinho_compra_produto")
@Data
public class CarrinhoCompraProduto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carrinhocompraproduto_seq")
    private Long id;

    @OneToMany(mappedBy = "carrinhoCompraProduto")
    private List<Produto> produto;

    private Double valor;
    private Double quantidade;
    private String observacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

}
