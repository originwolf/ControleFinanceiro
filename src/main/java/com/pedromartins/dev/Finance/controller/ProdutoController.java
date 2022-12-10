package com.pedromartins.dev.Finance.controller;

import com.pedromartins.dev.Finance.domain.Produto;
import com.pedromartins.dev.Finance.services.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> getProdutos(){
        return produtoService.getDadosProduto();
    }
}
