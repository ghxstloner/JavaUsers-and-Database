package com.example.demo.respositories;

import java.util.ArrayList;

import com.example.demo.entities.Usuario;

public class UsuariosDBMemoria implements UsuariosDB  {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    private int totalEliminaciones = 0;
    private int totalInserciones = 0;
    @Override
    public ArrayList<Usuario> obtener() {
        return usuarios;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        for(Usuario usuarioActual : obtener()){
            if(usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)){
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void insertar(Usuario usuario) {
        for(Usuario usuarioActual : usuarios){
            if(usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)){
                return;
            }
        }
        usuarios.add(usuario);
        totalInserciones++;
    }

    @Override
    public void borrar(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)){
                usuarios.remove(i);
                totalEliminaciones++;
            }
        }
    }

}
