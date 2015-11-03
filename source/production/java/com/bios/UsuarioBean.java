package com.bios;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class UsuarioBean {

    private List<Usuario> usuarios;

    @PostConstruct
    public void init() {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario(12313, "Paco", 30));
        usuarios.add(new Usuario(456, "Julio", 31));
        usuarios.add(new Usuario(370, "Marta", 28));
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
