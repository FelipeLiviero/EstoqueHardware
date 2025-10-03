package application.controller;

import application.model.Produto;
import application.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    // Página inicial lista produtos
    @GetMapping
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoService.listarProdutos());
        return "home"; // seu home.html
    }

    // Form para cadastro de produto
    @GetMapping("/novo")
    public String abrirCadastro(Model model) {
        model.addAttribute("produto", new Produto());
        return "produto"; // seu produto.html
    }

    // Salvar produto
    @PostMapping
    public String cadastrar(@Valid @ModelAttribute Produto produto, BindingResult result, @RequestParam("imagem") MultipartFile imagem, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "produto";
        }
        try {
            if (!imagem.isEmpty()) {
                produto.setImagem(imagem.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Tratar erro
        }
        produtoService.cadastrarProduto(produto);
        redirectAttributes.addFlashAttribute("mensagem", "Produto cadastrado com sucesso!");
        return "redirect:/produtos";
    }


    // Atualizar produto
    @PutMapping("/{id}")
    @ResponseBody
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto atualizado) {
        return produtoService.atualizarProduto(id, atualizado);
    }

    // Deletar produto
    @DeleteMapping("/{id}")
    @ResponseBody
    public void excluir(@PathVariable Long id) {
        produtoService.excluirProduto(id);
    }

    // Endpoint para retornar imagem do produto
    @GetMapping(value = "/imagem/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] getImagemProduto(@PathVariable Long id) {
        Produto produto = produtoService.buscarProduto(id);
        if (produto.getImagem() != null) {
            return produto.getImagem();
        } else {
            // Retorna uma imagem padrão vazia (você pode colocar uma imagem padrão no projeto)
            return new byte[0];
        }
    }
}
