import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestController
@RequestMapping("/EstoqueHardware")

public class controller {
    
    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping // Permite acesso da Controller para "service.listarProduto"
    public ResponseEntity<list<Produto>> listar() {
        return ResponseEntity.ok(service.listarProduto); 
    }

    @PostMapping
    public ResponseEntity<Produto>cadastrar(@Valid @RequestBody Produto novo) { // Recebe um objeto, valida e salva
        Produto salvo = service.cadastrarProduto(novo);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String>excluir(@pathVariable Long id) {
        try {
            service.excluirProduto(id);
            return ResponseEntity.ok("Produto removido com sucesso!"); // Se o cliente for excluido
        } catch (RuntimeException e) { // Cobre vários tipos de erros fora de compilacao
            return ResponseEntity.notFound().build(); // Retorna erro 404
        }
    }
}
