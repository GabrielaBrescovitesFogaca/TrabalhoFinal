/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bsi.trabalhofinal.control;

import br.edu.ifpr.bsi.trabalhofinal.model.Tarefa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabis
 */
public class ControllerTarefa {
    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public void addTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }

    public void editarTarefa(int index, Tarefa novaTarefa) {
        if(index >= 0 && index < listaTarefas.size()){
            listaTarefas.set(index, novaTarefa);
        }
    }
    
    public void atualizaTabela(JTable tabela){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        for(Tarefa t : listaTarefas){
            Object[] linha = {t.getTitulo(), t.getDescricao(), t.getData().toString(), t.isConcluida()};
            modelo.addRow(linha);  
        }
    }
    public Tarefa getTarefa(int index) {
        if (index >= 0 && index < listaTarefas.size()){
            return listaTarefas.get(index);
        }
        return null;
    }

    public void excluirTarefa(int index) {
        if(index >= 0 && index < listaTarefas.size()){
            listaTarefas.remove(index);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum produto foi selecionado", "Erro ao excluirProduto", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Tarefa> getListaDeTarefas() {
        return listaTarefas;
    }
}
