package com.sistema.conversor.enums;

import java.util.Arrays;

public enum TiposEnum {

    BASE64("base64"),
    JSON("json"),
    HTML("html"),
    SQL("sql");
    
    private final String descricao;
    
    public String getDescricao() {
            return descricao;
    }

    TiposEnum(String descricao) {
        this.descricao = descricao;
    }
    
    public static TiposEnum getBuscarDescricao(String descricao) {
        return Arrays.stream(TiposEnum.values())
            .filter(tipo -> tipo.getDescricao().equals(descricao))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Não existe a descrição: " + descricao + "."));
    }
    
}
