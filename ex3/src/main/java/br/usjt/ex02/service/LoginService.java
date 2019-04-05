package br.usjt.ex02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.ex02.model.Usuario;
import br.usjt.ex02.repository.UsuarioRepository;

@Service
public class LoginService {
	
	@Autowired
	UsuarioRepository usuarioRepo;
	
	public boolean logar(Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
		
	}

}
