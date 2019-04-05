package br.usjt.ex02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.ex02.model.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository <Usuario, Long>{
	
	public Usuario findOneByLoginAndSenha (String login, String senha);

}
