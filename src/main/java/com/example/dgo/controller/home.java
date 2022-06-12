package com.example.dgo.controller;

import com.example.dgo.models.Usuario;
import com.example.dgo.sevice.UsuarioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class home {

    @Autowired
    private UsuarioImpl usuario;

    @GetMapping(value="usuarios")
    public String home1(Model model){

        model.addAttribute("usuario", usuario.listarUsuarios());
        return "usuarios";// retorna el html renderizado
    }

    @GetMapping(value="/usuarios/formulario")
    public String formularioUsuario(Model model){
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        return "crear_usuario";// retorna el html renderizado de usuario
    }

    @PostMapping("/crear")
    public String crearUsuario(@ModelAttribute("usuario") Usuario user){
        usuario.crearUsuario(user);
        return "redirect:/usuarios";

    }


}
