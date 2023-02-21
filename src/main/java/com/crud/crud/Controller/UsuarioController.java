package com.crud.crud.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.crud.crud.Models.usuario;
import com.crud.crud.Interfaces.UsuarioInterface;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioInterface usuariodao;

@RequestMapping(value = "usuarios")
    public List<usuario> GetUsuarios()
    {
        return usuariodao.GetUsuarios();
    }
}
