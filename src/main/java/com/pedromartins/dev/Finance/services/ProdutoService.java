package com.pedromartins.dev.Finance.services;

import com.pedromartins.dev.Finance.domain.Produto;
import com.pedromartins.dev.Finance.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

//    private Produto dadosProduto = new Produto(1, "Notebook");

    public List<Produto> getDadosProduto() {
        return produtoRepository.findAll();
//        return dadosProduto;
    }
}
