package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

}
