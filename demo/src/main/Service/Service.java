import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.src.main.model;
import jakarta.servlet.annotation.WebServlet;

@Service
public class Service {
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public List<Produto> listarProduto() {
        return produtoRepository.findAll(); // Itera sobre todos os registros
    }

    public Produto cadastrarProduto(Produto novo) {
        return produtoRepository.save(novo); // Insere ou atualiza o registro pelo ID
    }
}