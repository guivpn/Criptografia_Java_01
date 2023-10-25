package Criptografia;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.table.DefaultTableModel; //Importando tabela da bliblioteca swing

public class ResultadoTable {
    public void resultadoTabela(TelaPrincipal telaPrincipal, String mensagemTexto, String chaveTexto, String mensagemCriptografada, String mensagemDescriptografada) {
        //TelaPrincipal telaPrincipal = new TelaPrincipal();
        
        DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.tblResultados.getModel(); //Instanciando o modelo da tabela
        modelo.setNumRows(0); //Setando as informações na linha zero da tabela
        
        modelo.addRow(new Object[] {
            mensagemTexto, chaveTexto, mensagemCriptografada, mensagemDescriptografada  //Setando informações na primeira linha
        });
    }
}
