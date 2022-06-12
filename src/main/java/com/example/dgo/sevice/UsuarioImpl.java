package com.example.dgo.sevice;

import com.example.dgo.models.Usuario;
import com.example.dgo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioImpl implements UsuarioServis {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();// retorna todos los usuarios
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);//usuario repositorio es la inyeccion del bean que permite ejecutar los metodos
    }
}
