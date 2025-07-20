/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bsi.trabalhofinal.control;

import br.edu.ifpr.bsi.trabalhofinal.model.Usuario;
import br.edu.ifpr.bsi.trabalhofinal.view.Principal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabis
 */
public class ControllerUsuario {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public void addUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public Usuario login(String email, String senha) {
        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    
    
}
