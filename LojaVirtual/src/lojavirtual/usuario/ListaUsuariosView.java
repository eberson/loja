/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojavirtual.usuario;

import java.util.List;
import lojavirtual.BaseView;
import lojavirtual.ViewListener;
import lojavirtual.domain.Usuario;

/**
 *
 * @author etec
 */
public interface ListaUsuariosView extends BaseView, ViewListener{
    
    String getNomeUsuarioPesquisa();
    
    void showUsuarios(List<Usuario> usuarios);
    
}
