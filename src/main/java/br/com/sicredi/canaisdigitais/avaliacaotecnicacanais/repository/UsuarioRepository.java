package br.com.sicredi.canaisdigitais.avaliacaotecnicacanais.repository;

import br.com.sicredi.canaisdigitais.avaliacaotecnicacanais.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
