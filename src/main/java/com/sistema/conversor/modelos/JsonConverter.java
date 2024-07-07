package com.sistema.conversor.modelos;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import javax.swing.JOptionPane;

public class JsonConverter {

    public static String execute(String conteudo){
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readTree(conteudo);
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            String formattedJson = mapper.writeValueAsString(jsonNode);
            return formattedJson;
        } catch (Exception ex) {
            JOptionPane.showOptionDialog(null, "Ocorreu um erro: \n" + ex, "ATENÇÃO", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            return "";
        }
    }
    
}
