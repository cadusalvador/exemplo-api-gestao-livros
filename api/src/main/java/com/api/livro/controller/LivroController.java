package com.api.livro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private IncluirLivroService incluirLivroService;

    @Autowired
    private ListarLivroService listarLivroService;

    @Autowired
    private DetalharLivroService detalharLivroService;

    @Autowired
    private AlterarLivroService alterarLivroService;

    @Autowired
    private RemoverLivroService removerLivroService;

    @PostMapping
    public IncluirLivroResponse incluir(@Valid @RequestBody IncluirLivroRequest request) {
        return incluirLivroService.incluir(request);
    }

    @GetMapping
    public List<ListarLivroResponse> listar() {
        return listarLivroService.listar();
    }

    @GetMapping("/{id}")
    public DetalharLivroResponse detalhar(@PathVariable Long id) {
        return detalharLivroService.detalhar(id);
    }

    @PutMapping("/{id}")
    public AlterarLivroResponse alterar(@Valid @RequestBody AlterarLivroRequest request,  @PathVariable Long id) {
        return alterarLivroService.alterar(request, id);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        removerLivroService.remover(id);
    }
}
