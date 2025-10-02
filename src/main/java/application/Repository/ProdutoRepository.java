ProdutoRepository.java

package com.example.EstoqueHarware.repository;
import com.example.EstoqueHarware.model.Produto; import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}