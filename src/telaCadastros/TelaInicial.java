/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaCadastros;

import com.lowagie.text.Cell;
import ferramentas.ConfereTipo;
import ferramentas.ImportaCte;
import ferramentas.RpaIntegrador;
import ferramentas.VerificaFrame;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public final class TelaInicial extends javax.swing.JFrame {

    public static int usuariosys;
    private static VincularConhecimentos vincularConhecimentos;

    private RpaIntegrador rpa = new RpaIntegrador();
    private ImportaCte cte = new ImportaCte();

    /**
     * Inicial a Tela Inicial do Facilitador. Executa na inicialização a thread
     * <code>buscaCteAutorizado</code>, para atualizar o banco de dados local.
     */
    public TelaInicial() {
        initComponents();
        setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        //cte.buscaCteAutorizado(0, false, this, false);
        //jDPTelaPrincipal.setBackground(Color.DARK_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDPTelaPrincipal = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jTxtUsuario = new javax.swing.JLabel();
        jTxtUsuario1 = new javax.swing.JLabel();
        jTxtStatus = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facilitador");

        jDPTelaPrincipal.setBackground(new java.awt.Color(0, 102, 102));
        jDPTelaPrincipal.setAutoscrolls(true);
        jDPTelaPrincipal.setOpaque(false);

        javax.swing.GroupLayout jDPTelaPrincipalLayout = new javax.swing.GroupLayout(jDPTelaPrincipal);
        jDPTelaPrincipal.setLayout(jDPTelaPrincipalLayout);
        jDPTelaPrincipalLayout.setHorizontalGroup(
            jDPTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDPTelaPrincipalLayout.setVerticalGroup(
            jDPTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        jTxtUsuario.setText("Login");

        jTxtUsuario1.setText("Status");
        jTxtUsuario1.setEnabled(false);

        jTxtStatus.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtStatus.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxtUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(jTxtUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtUsuario)
                    .addComponent(jTxtUsuario1)
                    .addComponent(jTxtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jMenu1.setBackground(new java.awt.Color(0, 51, 51));
        jMenu1.setText("Controle");

        jMenuItem6.setText("Configurações");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem10.setText("Fechamento");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Manutenção");
        jMenu2.setName("kasdhei"); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem5.setText("Emitir Recibo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);
        jMenu2.add(jSeparator2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItem4.setText("Recibos Avulsos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem11.setText("Alterar Conhecimentos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem9.setText("Vincular Conhecimentos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Relatórios");

        jMenuItem7.setText("Acompanhamento de Recibos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Impressão de Recibos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Utilitários");

        jMenuItem1.setText("Sincronizar Conhecimentos");
        jMenuItem1.setToolTipText("Atualiza a base local. Informe \"0\" para buscar todos os conhecimentos.");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem2.setText("Integração Financeira em Lote");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuItem12.setText("Resumo da Integração");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPTelaPrincipal)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDPTelaPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        abreTelaInterna(new EmitirRpa());

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ConfereTipo conf = new ConfereTipo();

        String resposta = JOptionPane.showInputDialog(null, "Informe um Conhecimento para importar: ", "Importação manual", JOptionPane.QUESTION_MESSAGE);

        inicio:
        if (resposta != null) {

            while (conf.tipoInteger(resposta) == false) {
                resposta = JOptionPane.showInputDialog(null, "Informe um Conhecimento para importar: ", "Importação manual", JOptionPane.QUESTION_MESSAGE);
                if (resposta == null) {
                    break inicio;
                }
            }

            int numero = Integer.parseInt(resposta);
            ferramentas.ImportaCte x = new ImportaCte();
            x.buscaCteAutorizado(numero, false, this, true);
        }

        if (resposta == null) {
            JOptionPane.showMessageDialog(this, "Nenhum conhecimento foi importado.", "Importação manual", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int lctos = rpa.integraFinanceiroMult();

        if (lctos > 1) {
            JOptionPane.showMessageDialog(this, "Lançamentos importados com sucesso: " + lctos + ".");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        abreTelaInterna(new Configuracoes());

        /*try {
            Configuracoes x = new Configuracoes();
            x.setVisible(true);
            jDPTelaPrincipal.add(x);
            setPosicao(x);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Não foi possível abrir a tela de Consulta. " + e);
        }*/
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        abreTelaInterna(new RelRpa());

        /*try {
            RelRpa x = new RelRpa();
            x.setVisible(true);
            jDPTelaPrincipal.add(x);
            x.setSelected(true);
            setPosicao(x);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Não foi possível abrir a tela de Consulta. " + e);
        }*/
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        abreTelaInterna(new RelRpaRecibo());

        /*try {
            RelRpaRecibo x = new RelRpaRecibo();
            x.setVisible(true);
            jDPTelaPrincipal.add(x);
            x.setSelected(true);
            setPosicao(x);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Não foi possível abrir a tela de Consulta. " + e);
        }*/
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        abreTelaInterna(new RpaAnterior());

        /*try {
            RpaAnterior x = new RpaAnterior();
            x.setVisible(true);
            jDPTelaPrincipal.add(x);
            x.setSelected(true);
            setPosicao(x);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Não foi possível abrir a tela de Consulta. " + e);
        }*/
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        vincularConhecimentos = new VincularConhecimentos();
        abreTelaInterna(vincularConhecimentos);
        vincularConhecimentos.setFramePai(this);

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        abreTelaInterna(new Fechamento());

        /* try {
            Fechamento x = new Fechamento();
            x.setVisible(true);
            jDPTelaPrincipal.add(x);
            x.setSelected(true);
            setPosicao(x);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Não foi possível abrir a tela de Consulta. " + e);
        }*/
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        abreTelaInterna(new AlteraConhecimentos());

        /*try {
            AlteraConhecimentos x = new AlteraConhecimentos();
            x.setVisible(true);
            jDPTelaPrincipal.add(x);
            x.setSelected(true);
            setPosicao(x);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Não foi possível abrir a tela de Consulta. " + e);
        }*/
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDPTelaPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField jTxtStatus;
    private javax.swing.JLabel jTxtUsuario;
    private javax.swing.JLabel jTxtUsuario1;
    // End of variables declaration//GEN-END:variables

    public void recebendo(String usuariolog, int id) {
        jTxtUsuario.setText(id + " - " + usuariolog);
        usuariosys = id;
    }

    public int getUsuariosys() {
        return usuariosys;
    }

    /**
     * Define a mensagem de Status da tela inicial. Recebe um parâmetro do
     * método <code>{@link ImportaCte}</code> e exibe a mensagem para o usuário.
     * 1 = Sincronizando 2 = Sincronizado 99 = Não Sincronizado
     *
     * @param x Número inteiro que manipula o método.
     */
    public void setStatus(int x) {

        System.out.println("Definindo mensagem de status para o usuário");

        switch (x) {
            case 1:
                jTxtStatus.setText("Sincronizando...");
                break;
            case 2:
                jTxtStatus.setText("Sincronizado com Sucesso");
                break;
            default:
                jTxtStatus.setText("Falha na Sincronização");
        }

    }

    private void setPosicao(JInternalFrame x) {
        Dimension d = x.getDesktopPane().getSize();
        x.setLocation((d.width - x.getSize().width) / 2, (d.height - x.getSize().height) / 2);
    }

    private void abreTelaInterna(JInternalFrame tela) {

        try {
            //PREPARAÇÃO PARA RECEBER INSTRUÇÕES PARA NAO ABRIR VÁRIAS JANELAS
            if (false) {
                tela.setSelected(true);
            } else {
                tela.setVisible(true);
                jDPTelaPrincipal.add(tela);
                tela.setSelected(true);
                setPosicao(tela);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Não foi possível abrir a tela '" + tela + "'. \nErro: " + e);
        }
    }
}
