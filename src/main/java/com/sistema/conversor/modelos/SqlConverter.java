package com.sistema.conversor.modelos;

import com.github.vertical_blank.sqlformatter.SqlFormatter;
import javax.swing.JOptionPane;

public class SqlConverter {

    public static String execute(String conteudo){
        try {
            return SqlFormatter.format(conteudo);
        } catch (Exception ex) {
            JOptionPane.showOptionDialog(null, "Ocorreu um erro: \n" + ex, "ATENÇÃO", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            return "";
        }
    }
    
}
