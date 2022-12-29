package com.flong.backend.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity@SequenceGenerator(name = "carrinhocompra_seq" ,initialValue = 1,  sequenceName = "carrinhocompra_seq", allocationSize = 1)
@Table(name = "carrinho_compra")
@Data
public class CarrinhoCompra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carrinhocompra_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carrinhoCompra")
    private List<Produto> produto;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCompra;
    private String observacao;
    private String situacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

}
