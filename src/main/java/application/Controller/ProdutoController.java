package application.EstoqueHardware;

import Application.Estoquehardware.model.Produto;
import Application.Estoquehardware.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoService produtoService; // Injetando a Service e n deixando ser atribuida apos inicializada

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/produtos")
    public String listarProdutos (Model model) {
        model.addAttribute("produtos", produtoService.listar());
                return "produtos/home";
    }

    @GetMapping("/novo")
    public String abrirCadastro(Model model) {
        model.addAttribute("produto", new Produto());
        return "produto";
    }

    @PostMapping("/produtos")
    public String cadastrar(@Valid @ModelAttribute Produto produto, BindingResult result, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "produto";

        }
        produtoService.cadastrarProduto(produto);
        redirectAttributes.addFlashAttribute("mensagem", "Produto cadastrado com sucesso!");
        return "redirect:/produtos/produtos";
    }

    @PutMapping("/produtos/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto atualizado) {
        return produtoService.atualizarProduto(id, atualizado);
    }

    @DeleteMapping("/produtos/{id}")
    public void excluir(@PathVariable Long id) {
        produtoService.excluirProduto(id);
    }
}