package br.ustj.aula1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ustj.aula1.model.Usuario;

public interface UsuarioRepository extends JpaRepository< Usuario, Long>{
public Usuario findOneByLoginAndSenha (String login, String senha);
}
