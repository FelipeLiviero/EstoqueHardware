package application.EstoqueHardware;

import application.EstoqueHardware.model.Cliente;
import application.EstoqueHardware.repository.ClienteRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoService produtoService;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public list<Produtos> listarProdutos () {
        return produtoRepository.findAll(Sort.by("id").ascending());
    }

    public Produto buscarProduto(Long id) {
        return produtoRepository.findById(id).orElseThrow(() -> new RuntimeException('Produto nao encontrado'));
    }

    public voida cadastrarProduto(Produto produto) {
        produtoRepository.save(produto)
    };

    public void atualizarProduto(Long id,Produto produtoAtualizado) {
        Produto produto = produtoRepository.findById(id).orElse(null);

        if (produto != null) {
            produto.setImagem(produtoAtualizado.getImagem());
            produto.setTipo(produtoAtualizado.getTipo());
            produto.setNome(produtoAtualizado.getNome());
            produto.setMarca(produtoAtualizado.getMarca());
            produto.setMemoria(produtoAtualizado.getMemoria());
            produto.setQuantidade(produtoAtualizado.getQuantidade());
        }

        else {
           throw new RuntimeException("Produto nao encontrado");
        }

    public void excluirProduto(Long id) {
            if (!clienteRepository.existByid(id)) {
                throw new RuntimeExceprion("Cliente nao encontrado");
            }
            clienteRepository.deleteById(id);
        }
    }
}
