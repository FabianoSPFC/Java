package aps;

import java.text.DecimalFormat;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 *
 * @author Fabiano Filho
 */
public class Interface1 extends javax.swing.JFrame implements ChangeListener{
    public Interface1() {
        initComponents();
        Unico_Botao.add(bot_Cel);
        Unico_Botao.add(bot_Far);
        Unico_Botao.add(bot_Kel);
        valor_DE.setDocument(new Numeros());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSlider5 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Unico_Botao = new javax.swing.ButtonGroup();
        temp_Kel = new javax.swing.JSlider();
        temp_Cel = new javax.swing.JSlider();
        temp_Far = new javax.swing.JSlider();
        sair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_Cel = new javax.swing.JLabel();
        label_Far = new javax.swing.JLabel();
        label_Kel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        de = new javax.swing.JLabel();
        bot_Cel = new javax.swing.JRadioButton();
        bot_Far = new javax.swing.JRadioButton();
        bot_Kel = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        PARA_Temp = new javax.swing.JComboBox<>();
        para = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        valor_DE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        converter = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        temp_Kel.setMajorTickSpacing(37);
        temp_Kel.setMaximum(373);
        temp_Kel.setPaintLabels(true);
        temp_Kel.setPaintTicks(true);
        temp_Kel.setValue(0);
        temp_Kel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                temp_KelStateChanged(evt);
            }
        });

        temp_Cel.setMajorTickSpacing(45);
        temp_Cel.setMinimum(-274);
        temp_Cel.setPaintLabels(true);
        temp_Cel.setPaintTicks(true);
        temp_Cel.setValue(0);
        temp_Cel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                temp_CelStateChanged(evt);
            }
        });
        temp_Cel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                temp_CelMouseMoved(evt);
            }
        });

        temp_Far.setMajorTickSpacing(95);
        temp_Far.setMaximum(220);
        temp_Far.setMinimum(-460);
        temp_Far.setPaintLabels(true);
        temp_Far.setPaintTicks(true);
        temp_Far.setValue(0);
        temp_Far.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                temp_FarStateChanged(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel2.setText("Celsius");

        jLabel3.setText("Farenheit");

        jLabel4.setText("Kelvin");

        label_Cel.setText(" 0");

        label_Far.setText("0");

        label_Kel.setText("0");

        Titulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Conversor de Temperaturas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        de.setText("De");

        bot_Cel.setText("Celsius");
        bot_Cel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_CelActionPerformed(evt);
            }
        });

        bot_Far.setText("Farenheit");

        bot_Kel.setText("Kelvin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bot_Far)
                            .addComponent(bot_Kel)
                            .addComponent(bot_Cel)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(de, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(de, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot_Cel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bot_Far)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(bot_Kel)
                .addGap(19, 19, 19))
        );

        PARA_Temp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Celsius", "Farenheit", "Kelvin" }));

        para.setText("Para");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(PARA_Temp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(para, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(para)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PARA_Temp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Resultado da Conversão");

        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor Inicial");

        converter.setText("Converter");
        converter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(valor_DE, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(converter)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(17, 17, 17))))
            .addComponent(resultado)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(valor_DE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(converter)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(temp_Kel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_Kel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(temp_Cel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_Cel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(temp_Far, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_Far, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(temp_Cel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Cel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(temp_Far, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Far, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(temp_Kel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Kel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void temp_CelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temp_CelMouseMoved

    }//GEN-LAST:event_temp_CelMouseMoved

    private void temp_CelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_temp_CelStateChanged
       DecimalFormat df = new DecimalFormat("###,##0.00");
       label_Cel.setText(Integer.toString(temp_Cel.getValue()));
       double cel = Double.parseDouble(Double.toString(temp_Cel.getValue()));
       double far = cel * 1.8 + 32;
       label_Far.setText(""+df.format(far));
       temp_Far.setValue((int)far);
       double kel = cel + 273;
       label_Kel.setText(""+df.format(kel));
       temp_Kel.setValue((int)kel);
    }//GEN-LAST:event_temp_CelStateChanged

    private void temp_FarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_temp_FarStateChanged
        DecimalFormat df = new DecimalFormat("###,##0.00");
        label_Far.setText(Integer.toString(temp_Far.getValue()));
        double fare = Double.parseDouble(Double.toString(temp_Far.getValue()));
        double celc = (fare - 32)/1.8;
        label_Cel.setText(""+df.format(celc));
        temp_Cel.setValue((int)celc);        
        double kelv = ((5*fare + 2297)/9);
        label_Kel.setText(""+df.format(kelv));
        temp_Kel.setValue((int)kelv);
    }//GEN-LAST:event_temp_FarStateChanged

    private void temp_KelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_temp_KelStateChanged
        DecimalFormat df = new DecimalFormat("###,##0.00");
        label_Kel.setText(Integer.toString(temp_Kel.getValue()));
        double kelvin = Double.parseDouble(Double.toString(temp_Kel.getValue()));
        double celsius = (kelvin - 273.16);
        label_Cel.setText(""+df.format(celsius));
        temp_Cel.setValue((int)celsius);
        double farenheit = (((kelvin - 273) * 9/5) + 32);
        label_Far.setText(""+df.format(farenheit));
        //temp_Far.setValue((int)farenheit);
    }//GEN-LAST:event_temp_KelStateChanged

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    private void converterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converterActionPerformed
        DecimalFormat df = new DecimalFormat("###,##0.00");
        String var = (String)PARA_Temp.getSelectedItem();
        String valor = valor_DE.getText();        
        if(bot_Cel.isSelected()||bot_Far.isSelected()||bot_Kel.isSelected()&&var.equals("Selecionar")&&valor_DE.getText().trim().equals("")){
            resultado.setText("Selecione uma Temperatura");
        }
        if(bot_Cel.isSelected()||bot_Far.isSelected()||bot_Kel.isSelected()&&var.equals("Celsius")&&valor_DE.getText().trim().equals("")){
            resultado.setText("Coloque um valor");
        }
        if(bot_Cel.isSelected()||bot_Far.isSelected()||bot_Kel.isSelected()&&var.equals("Farenheit")&&valor_DE.getText().trim().equals("")){
            resultado.setText("Coloque um valor");
        }
        if(bot_Cel.isSelected()||bot_Far.isSelected()||bot_Kel.isSelected()&&var.equals("Kelvin")&&valor_DE.getText().trim().equals("")){
            resultado.setText("Coloque um valor");
        }
        if(bot_Cel.isSelected()&&var.equals("Selecionar")){           
            resultado.setText("Escolha uma das Temperaturas");
        }
        if(bot_Cel.isSelected()&&var.equals("Celsius")){           
            resultado.setText("Opção Inválida");
        }
        if(bot_Cel.isSelected()&&var.equals("Farenheit")){            
            double c = Double.parseDouble(valor);
            double f = c * 1.8 + 32;
            resultado.setText(""+df.format(f));
        }
        if(bot_Cel.isSelected()&&var.equals("Kelvin")){            
            double c = Double.parseDouble(valor);
            double k = c + 273;
            resultado.setText(""+df.format(k));
        }        
        if(bot_Far.isSelected()&&var.equals("Selecionar")){
            resultado.setText("Selecione uma Temperatura");
        }                   
        if(bot_Far.isSelected()&&var.equals("Celsius")){                     
            double f = Double.parseDouble(valor);
            double c = (f - 32)/1.8;
            resultado.setText(""+df.format(c));
        }
        if(bot_Far.isSelected()&&var.equals("Farenheit")){
            resultado.setText("Opção Inválida");
        }
        if(bot_Far.isSelected()&&var.equals("Kelvin")){            
            double fa = Double.parseDouble(valor);
            double k = k = ((5*fa + 2297)/9);
            resultado.setText(""+df.format(k));
        }        
        if(bot_Kel.isSelected()&&var.equals("Selecionar")){
            resultado.setText("Selecione uma Temperatura");
        }                   
        if(bot_Kel.isSelected()&&var.equals("Celsius")){                   
            double kel = Double.parseDouble(valor);
            double cel = (kel - 273);
            resultado.setText(""+df.format(cel));
        }
        if(bot_Kel.isSelected()&&var.equals("Farenheit")){           
            double k = Double.parseDouble(valor);
            double fa = ((9*k - 2297)/5);
            resultado.setText(""+df.format(fa));
        }
        if(bot_Kel.isSelected()&&var.equals("Kelvin")){
            resultado.setText("Opção Inválida");
        }
    }//GEN-LAST:event_converterActionPerformed

    private void bot_CelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_CelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_CelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PARA_Temp;
    private javax.swing.JLabel Titulo;
    private javax.swing.ButtonGroup Unico_Botao;
    private javax.swing.JRadioButton bot_Cel;
    private javax.swing.JRadioButton bot_Far;
    private javax.swing.JRadioButton bot_Kel;
    private javax.swing.JButton converter;
    private javax.swing.JLabel de;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_Cel;
    private javax.swing.JLabel label_Far;
    private javax.swing.JLabel label_Kel;
    private javax.swing.JLabel para;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton sair;
    private javax.swing.JSlider temp_Cel;
    private javax.swing.JSlider temp_Far;
    private javax.swing.JSlider temp_Kel;
    private javax.swing.JTextField valor_DE;
    // End of variables declaration//GEN-END:variables

    @Override
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
