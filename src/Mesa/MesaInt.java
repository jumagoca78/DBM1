
package Mesa;

import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MesaInt extends javax.swing.JFrame {

    public MesaInt() {
        initComponents();
        texto1.setVisible(false);
        texto11.setVisible(false);  
        texto12.setVisible(false);  
        texto13.setVisible(false);  
        texto14.setVisible(false);  
   
    }
    
    public String Size;   
    private List<Celular> Celular; 
      int guardado;
     int boton;
   
    public void AcomodarCelulares(Celular Celular[]){
        
    }
  
    //public void actionPerformed(ActionEvent e) { textfield.setText("123");}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nexus = new javax.swing.JButton();
        moto = new javax.swing.JButton();
        iphone = new javax.swing.JButton();
        lg = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        texto1 = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        texto11 = new javax.swing.JTextField();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        texto12 = new javax.swing.JTextField();
        boton14 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        texto13 = new javax.swing.JTextField();
        texto14 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nexus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/nexus.png"))); // NOI18N
        nexus.setText("Nexus");
        nexus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nexusActionPerformed(evt);
            }
        });

        moto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/motog5.jpeg"))); // NOI18N
        moto.setText("Moto G5");
        moto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motoActionPerformed(evt);
            }
        });

        iphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/iphone.png"))); // NOI18N
        iphone.setText("iPhone8");
        iphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iphoneActionPerformed(evt);
            }
        });

        lg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/LG.png"))); // NOI18N
        lg.setText("LGQ6");
        lg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(moto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nexus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iphone))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(iphone)
                .addGap(7, 7, 7)
                .addComponent(nexus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moto)
                .addGap(18, 18, 18)
                .addComponent(lg)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        label1.setLabelFor(nexus);

        texto1.setBackground(new java.awt.Color(51, 51, 51));
        texto1.setForeground(new java.awt.Color(255, 255, 255));
        texto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto1ActionPerformed(evt);
            }
        });

        boton1.setBackground(new java.awt.Color(51, 51, 51));
        boton1.setForeground(new java.awt.Color(51, 51, 51));
        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/precio.png"))); // NOI18N
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Aqui");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        texto11.setBackground(new java.awt.Color(51, 51, 51));
        texto11.setForeground(new java.awt.Color(255, 255, 255));
        texto11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto11ActionPerformed(evt);
            }
        });

        boton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/precio.png"))); // NOI18N
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });

        boton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/precio.png"))); // NOI18N
        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });

        texto12.setBackground(new java.awt.Color(51, 51, 51));
        texto12.setForeground(new java.awt.Color(255, 255, 255));
        texto12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto12ActionPerformed(evt);
            }
        });

        boton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/fondo.png"))); // NOI18N
        boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton14ActionPerformed(evt);
            }
        });

        boton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/precio.png"))); // NOI18N
        boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton13ActionPerformed(evt);
            }
        });

        texto13.setBackground(new java.awt.Color(51, 51, 51));
        texto13.setForeground(new java.awt.Color(255, 255, 255));
        texto13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto13ActionPerformed(evt);
            }
        });

        texto14.setBackground(new java.awt.Color(51, 51, 51));
        texto14.setForeground(new java.awt.Color(255, 255, 255));
        texto14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(texto14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(texto11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(texto12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texto13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(446, 612, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.getAccessibleContext().setAccessibleName("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iphoneActionPerformed
        guardado=1; 
       
    }//GEN-LAST:event_iphoneActionPerformed

    private void lgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgActionPerformed
guardado=4;
       
    }//GEN-LAST:event_lgActionPerformed

    private void texto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto1ActionPerformed
       
    }//GEN-LAST:event_texto1ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
       boton++;
        if(boton==1){
              texto1.setVisible(true); 
        texto11.setVisible(false);  
        texto12.setVisible(false);  
        texto13.setVisible(false);  
        texto14.setVisible(false);      
        boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
         // boton12.setVisible(false);
        texto1.setText("Intento");
        }
        if(boton==2){
            texto11.setVisible(true);
             texto12.setVisible(true);
              texto13.setVisible(true);
               texto14.setVisible(true);
        texto1.setText(" ");
        texto11.setText(" ");
             texto12.setText(" ");
             texto13.setText(" ");
             texto14.setText(" ");
      //  label1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\iphone.png")); 
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton=0;
          texto1.setVisible(false); 
        texto11.setVisible(false);  
        texto12.setVisible(false);  
        texto13.setVisible(false);  
        texto14.setVisible(false);      
        }
       
    }//GEN-LAST:event_boton1ActionPerformed

    private void nexusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nexusActionPerformed
guardado=2;
       
    }//GEN-LAST:event_nexusActionPerformed

    private void motoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motoActionPerformed
guardado=3;
      
    }//GEN-LAST:event_motoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //  texto1.setVisible(true);
          //texto11.setVisible(true);
         // boton11.setVisible(true);
        if(guardado==1){
        //   texto1.setVisible(true);
             texto1.setText(" ");
             texto11.setText(" ");
             texto12.setText(" ");
             texto13.setText(" ");
             texto14.setText(" ");
        label1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\iphone.png")); 
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        }
         else if(guardado==2){
          texto1.setText(" ");
          texto11.setText(" ");
           texto12.setText(" ");
             texto13.setText(" ");
             texto14.setText(" ");
         boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png"));   
        label1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\nexus.png")); 
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
          boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
         }
         else if(guardado==3){
               texto1.setText(" ");
                texto11.setText(" ");
           texto12.setText(" ");
             texto13.setText(" ");
             texto14.setText(" ");
      boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png"));   
      label1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\motog5.jpeg")); 
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
         
         }
         else if(guardado==4){
              texto1.setText(" ");
               texto11.setText(" ");
           texto12.setText(" ");
             texto13.setText(" ");
             texto14.setText(" ");
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png"));   
        label1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\LG.png")); 
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
         
         }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void texto11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto11ActionPerformed

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
       boton++;
        if(boton==1){
            texto11.setVisible(true);  
        texto1.setVisible(false);  
        texto12.setVisible(false);  
        texto13.setVisible(false);  
        texto14.setVisible(false);      
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
         // boton12.setVisible(false);
        texto11.setText("Intento");
        }
        if(boton==2){
            texto1.setVisible(true);
             texto12.setVisible(true);
              texto13.setVisible(true);
               texto14.setVisible(true);
               texto1.setText(" ");
        texto11.setText(" ");
             texto12.setText(" ");
             texto13.setText(" ");
             texto14.setText(" ");
      //  label1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\iphone.png")); 
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton=0;
         texto1.setVisible(false); 
        texto11.setVisible(false);  
        texto12.setVisible(false);  
        texto13.setVisible(false);  
        texto14.setVisible(false); 
        }
    }//GEN-LAST:event_boton11ActionPerformed

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
      boton++;
        if(boton==1){
        texto1.setVisible(false);  
        texto11.setVisible(false);  
        texto13.setVisible(false);  
        texto14.setVisible(false); 
         texto12.setVisible(true); 
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        texto12.setText("Intento");
        }
        if(boton==2){
            texto1.setVisible(true);
             texto11.setVisible(true);
              texto13.setVisible(true);
               texto14.setVisible(true);
               texto12.setText(" ");
        texto11.setText(" ");
             texto12.setText(" ");
             texto13.setText(" ");
             texto14.setText(" ");
      //  label1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\iphone.png")); 
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton=0;
         texto1.setVisible(false); 
        texto11.setVisible(false);  
        texto12.setVisible(false);  
        texto13.setVisible(false);  
        texto14.setVisible(false); 
        }
           
    }//GEN-LAST:event_boton12ActionPerformed

    private void texto12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto12ActionPerformed

    private void boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton14ActionPerformed
         boton++;
        if(boton==1){
            texto14.setVisible(true);  
        texto1.setVisible(false);  
        texto11.setVisible(false);  
        texto13.setVisible(false);  
        texto12.setVisible(false);      
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
         // boton12.setVisible(false);
        texto14.setText("Intento");
        }
        if(boton==2){
            texto1.setVisible(true);
             texto11.setVisible(true);
              texto13.setVisible(true);
               texto14.setVisible(true);
               texto1.setText(" ");
        texto11.setText(" ");
             texto12.setText(" ");
             texto13.setText(" ");
             texto14.setText(" ");
      //  label1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\iphone.png")); 
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton=0;
         texto1.setVisible(false); 
        texto11.setVisible(false);  
        texto12.setVisible(false);  
        texto13.setVisible(false);  
        texto14.setVisible(false); 
        }
    }//GEN-LAST:event_boton14ActionPerformed

    private void boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton13ActionPerformed
         boton++;
        if(boton==1){
            texto13.setVisible(true);  
        texto1.setVisible(false);  
        texto11.setVisible(false);  
        texto14.setVisible(false);  
        texto12.setVisible(false);      
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png")); 
         // boton12.setVisible(false);
        texto13.setText("Intento");
        }
        if(boton==2){
            texto1.setVisible(true);
             texto11.setVisible(true);
              texto13.setVisible(true);
               texto14.setVisible(true);
               texto1.setText(" ");
        texto11.setText(" ");
             texto12.setText(" ");
             texto13.setText(" ");
             texto14.setText(" ");
      //  label1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\iphone.png")); 
        boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
        boton=0;
         texto1.setVisible(false); 
        texto11.setVisible(false);  
        texto12.setVisible(false);  
        texto13.setVisible(false);  
        texto14.setVisible(false); 
        }
    }//GEN-LAST:event_boton13ActionPerformed

    private void texto13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto13ActionPerformed

    private void texto14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto14ActionPerformed

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
            java.util.logging.Logger.getLogger(MesaInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesaInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesaInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesaInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MesaInt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton iphone;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label1;
    private javax.swing.JButton lg;
    private javax.swing.JButton moto;
    private javax.swing.JButton nexus;
    private javax.swing.JTextField texto1;
    private javax.swing.JTextField texto11;
    private javax.swing.JTextField texto12;
    private javax.swing.JTextField texto13;
    private javax.swing.JTextField texto14;
    // End of variables declaration//GEN-END:variables
}
