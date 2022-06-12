package com.example.dgo.sevice;

import com.example.dgo.models.Usuario;

import java.util.List;

public interface UsuarioServis {
    public List<Usuario> listarUsuarios();

    public Usuario crearUsuario(Usuario usuario);


}
