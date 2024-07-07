package com.sistema.conversor;

import com.sistema.conversor.modelos.HtmlConverter;
import com.sistema.conversor.modelos.SqlConverter;
import com.sistema.conversor.modelos.JsonConverter;
import com.sistema.conversor.modelos.Base64Converter;
import com.sistema.conversor.enums.TiposEnum;
import javax.swing.ButtonGroup;



public class Conversor extends javax.swing.JFrame {
    public static String conversaoAtual = TiposEnum.BASE64.getDescricao();
    
    public Conversor() {
        initComponents();
        
        ButtonGroup group = new ButtonGroup();
        group.add(base);
        group.add(json);
        group.add(query);
        group.add(html);
        conteudotxt.requestFocusInWindow();
                
        // tela -------------------------------
        setSize(800,700); 
        this.setLocationRelativeTo(null);
        // -----------------------------------------------
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        base = new javax.swing.JRadioButton();
        query = new javax.swing.JRadioButton();
        html = new javax.swing.JRadioButton();
        json = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        conteudotxt = new javax.swing.JTextArea();
        labelResultado = new javax.swing.JLabel();
        labelInput = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultadotxt = new javax.swing.JTextArea();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONVERSOR");
        setResizable(false);
        setSize(new java.awt.Dimension(743, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("SELECIONE O TIPO DE CONVERSÃO:");

        base.setSelected(true);
        base.setText("BASE 64");
        base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseActionPerformed(evt);
            }
        });

        query.setText("QUERY SQL");
        query.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryActionPerformed(evt);
            }
        });

        html.setText("HTML");
        html.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htmlActionPerformed(evt);
            }
        });

        json.setText("JSON");
        json.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsonActionPerformed(evt);
            }
        });

        conteudotxt.setColumns(20);
        conteudotxt.setRows(5);
        conteudotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conteudotxtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(conteudotxt);

        labelResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelResultado.setForeground(new java.awt.Color(51, 102, 0));
        labelResultado.setText("RESULTADO:");

        labelInput.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelInput.setText("TEXTO CODIFICADO OU DECODIFICADO:");

        resultadotxt.setColumns(20);
        resultadotxt.setRows(5);
        resultadotxt.setMinimumSize(new java.awt.Dimension(743, 20));
        resultadotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultadotxtMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(resultadotxt);

        botao1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botao1.setText("DECODIFICAR");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botao2.setText("CODIFICAR");
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botaoLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoLimpar.setText("LIMPAR");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(query, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(json, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(html, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelResultado)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(30, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(base)
                    .addComponent(query)
                    .addComponent(json)
                    .addComponent(html))
                .addGap(18, 18, 18)
                .addComponent(labelInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(labelResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void baseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseActionPerformed
        alterarConversor(TiposEnum.BASE64.getDescricao());
    }//GEN-LAST:event_baseActionPerformed

    private void resultadotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultadotxtMouseClicked
       resultadotxt.setSelectionStart(0);
       resultadotxt.setSelectionEnd(resultadotxt.getText().length());
    }//GEN-LAST:event_resultadotxtMouseClicked

    private void conteudotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conteudotxtMouseClicked
        conteudotxt.setSelectionStart(0);
        conteudotxt.setSelectionEnd(conteudotxt.getText().length());
    }//GEN-LAST:event_conteudotxtMouseClicked

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        conteudotxt.setText("");
        resultadotxt.setText("");
        conteudotxt.requestFocusInWindow();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void queryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryActionPerformed
        alterarConversor(TiposEnum.SQL.getDescricao());
    }//GEN-LAST:event_queryActionPerformed

    private void jsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsonActionPerformed
        alterarConversor(TiposEnum.JSON.getDescricao());
    }//GEN-LAST:event_jsonActionPerformed

    private void htmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htmlActionPerformed
        alterarConversor(TiposEnum.HTML.getDescricao());
    }//GEN-LAST:event_htmlActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        resultadotxt.setText(chamarConverter(conteudotxt.getText().toString()));
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        resultadotxt.setText(chamarConverterBase64Codificar(conteudotxt.getText().toString()));
    }//GEN-LAST:event_botao2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton base;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JTextArea conteudotxt;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JRadioButton html;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton json;
    private javax.swing.JLabel labelInput;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JRadioButton query;
    private javax.swing.JTextArea resultadotxt;
    // End of variables declaration//GEN-END:variables

    private void alterarConversor(String tipo) {
        if(!tipo.equals(conversaoAtual)){
            conversaoAtual = tipo;
            switch (conversaoAtual) {
                case "base64" -> mostrarPainelBase64();
                case "json" -> mostrarPainelJson();
                case "sql" -> mostrarPainelSql();
                case "html" -> mostrarPainelHtml();
                default -> {}
            }
            manterTamanhoTextArea();
        }
    }

    private void mostrarPainelBase64() {
        labelInput.setText("TEXTO CODIFICADO OU NÃO CODIFICADO:");
        padraoBotoes(true, "DECODIFICAR");
    }

    private void mostrarPainelJson() {
        labelInput.setText("DIGITE O JSON NÃO IDENTADO:");
        padraoBotoes(false, "FORMATAR");
    }

    private void mostrarPainelSql() {
        labelInput.setText("DIGITE A QUERY NÃO IDENTADA:");
        padraoBotoes(false, "FORMATAR");
    }

    private void mostrarPainelHtml() {
        labelInput.setText("DIGITE O HTML NÃO IDENTADO:");
        padraoBotoes(false, "FORMATAR");
    }

    private void manterTamanhoTextArea() {
        resultadotxt.setAutoscrolls(false);
    }

    private void padraoBotoes(boolean botao2Mostrar, String decodificar) {
        botao2.setVisible(botao2Mostrar);
        botao1.setText(decodificar);
        conteudotxt.requestFocusInWindow();
    }

    private String chamarConverter(String conteudo) {
        return switch (conversaoAtual) {
            case "base64" -> Base64Converter.execute(conteudo, false);
            case "json" -> JsonConverter.execute(conteudo);
            case "sql" -> SqlConverter.execute(conteudo);
            case "html" -> HtmlConverter.execute(conteudo);
            default -> "";
        };
    }

    private String chamarConverterBase64Codificar(String conteudo) {
        return Base64Converter.execute(conteudo, true);
    }


}
