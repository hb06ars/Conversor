package com.sistema.conversor.modelos;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.swing.JOptionPane;

public class Base64Converter {

    public static String execute(String conteudo, boolean codificar){
        try{
            byte[] bytes;
            if(codificar){
                bytes = conteudo.getBytes("UTF-8");
                return Base64.getEncoder().encodeToString(bytes);
            }
            byte[] decoded = Base64.getDecoder().decode(conteudo);
            return new String(decoded, StandardCharsets.UTF_8);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao converter!", "Erro", JOptionPane.ERROR_MESSAGE);
            return "";
        }
    }
}
