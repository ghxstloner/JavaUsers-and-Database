package com.example.demo.services;
import java.util.ArrayList;
import com.example.demo.entities.Usuario;
import com.example.demo.respositories.UsuariosDB;
import com.example.demo.respositories.UsuariosDBMemoria;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    UsuariosDB usuariosDB = new UsuariosDBMemoria();

    protected UsuariosService() {}

    public UsuariosService(UsuariosDB usuariosDB) {
        this.usuariosDB = usuariosDB;
    }
    public ArrayList<Usuario> listarUsuarios() {
        return usuariosDB.obtener();
    }

    public Usuario obtenerUsuario(String username){
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;
        return usuariosDB.buscar(usuario);
    }
    public void crearUsuario(Usuario usuario){
        if(usuariosDB.buscar(usuario) != null ){ return; }
        usuariosDB.insertar(usuario);
    }
    public void borrarUsuario(String username){
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;

        usuariosDB.borrar(usuario);
    }


}

