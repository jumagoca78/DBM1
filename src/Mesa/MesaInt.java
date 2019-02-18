
package Mesa;

import java.awt.Cursor;
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MesaInt  extends javax.swing.JFrame {

    public MesaInt() {
        initComponents();
        //Elementos de primera seccion
        texto1.setVisible(false);
        texto11.setVisible(false);  
        texto12.setVisible(false);  
        texto13.setVisible(false);  
        label1.setText("Aqui!!");
       
        boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
        
        //Elementos de segunda seccion
        texto2.setVisible(false);
        texto21.setVisible(false);  
        texto22.setVisible(false);  
        texto23.setVisible(false);  
         label2.setText("Aqui");
        boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
        
        //Elementos de tercera seccion
        texto3.setVisible(false);
        texto31.setVisible(false);  
        texto32.setVisible(false);  
        texto33.setVisible(false);  
         label3.setText("Aqui");
        boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
     
        //Elementos de cuarta seccion
        texto4.setVisible(false);
        texto41.setVisible(false);  
        texto42.setVisible(false);  
        texto43.setVisible(false);  
         label4.setText("Aqui");
        boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
        
             //funcion de label4
        label4.addMouseListener(new MouseAdapter()
        {
        
            int labelc =0;
             public void mouseClicked(MouseEvent e)  
    {  
        botonc=0;
         texto4.setVisible(false);  
         texto41.setVisible(false);  
        texto42.setVisible(false);  
        texto43.setVisible(false);  
            boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
        
        labelc++;
            if(labelc==1){
                 label4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                   if(guardado==1){
                       iPhone8 iphone = new iPhone8();
             texto4.setText(iphone.Precio);
             texto41.setText(iphone.Bateria);
             texto42.setText(iphone.Camara);
             texto43.setText(iphone.Memoria);

        label4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\iphone.png")); 
        boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg"));  }
                else   if(guardado==2){
                 Nexus6P nexus = new Nexus6P();
             texto4.setText(nexus.Precio);
             texto41.setText(nexus.Bateria);
             texto42.setText(nexus.Camara);
             texto43.setText(nexus.Memoria);
               label4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\nexus.png")); 
        boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg"));  }
                  else  if(guardado==3){
                      MotoG5 moto = new MotoG5();
             texto4.setText(moto.Precio);
             texto41.setText(moto.Bateria);
             texto42.setText(moto.Camara);
             texto43.setText(moto.Memoria);
        label4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\motog5.jpeg")); 
        boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg"));  }
                  else  if(guardado==4){
                LGQ6 lg = new LGQ6();
              texto4.setText(lg.Precio);
             texto41.setText(lg.Bateria);
             texto42.setText(lg.Camara);
             texto43.setText(lg.Memoria);
   
        label4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\LG.png")); 
       boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg"));  }
                  
                   }
            if(labelc==2){
          boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   label4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   labelc=0;      
            }
        }
        });

        //funcion de label3
        label3.addMouseListener(new MouseAdapter()
        {
        
            int labelv =0;
             public void mouseClicked(MouseEvent e)  
    {  
        botont=0;
         texto3.setVisible(false);  
         texto31.setVisible(false);  
        texto32.setVisible(false);  
        texto33.setVisible(false);  
            boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
  
        labelv++;
            if(labelv==1){
                 label3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                   if(guardado==1){
                      iPhone8 iphone = new iPhone8();
             texto3.setText(iphone.Precio);
             texto31.setText(iphone.Bateria);
             texto32.setText(iphone.Camara);
             texto33.setText(iphone.Memoria);
             

        label3.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\iphone.png")); 
        boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg"));  }
                else   if(guardado==2){
                    Nexus6P nexus = new Nexus6P();
             texto3.setText(nexus.Precio);
             texto31.setText(nexus.Bateria);
             texto32.setText(nexus.Camara);
             texto33.setText(nexus.Memoria);

               label3.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\nexus.png")); 
        boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg"));  }
                  else  if(guardado==3){
                 MotoG5 moto = new MotoG5();
             texto3.setText(moto.Precio);
             texto31.setText(moto.Bateria);
             texto32.setText(moto.Camara);
             texto33.setText(moto.Memoria);
             
        label3.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\motog5.jpeg")); 
        boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg"));  }
                  else  if(guardado==4){
                                         LGQ6 lg = new LGQ6();
             texto3.setText(lg.Precio);
             texto31.setText(lg.Bateria);
             texto32.setText(lg.Camara);
             texto33.setText(lg.Memoria);
       
        label3.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\LG.png")); 
       boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg"));  }
                  
                   }
            if(labelv==2){
          boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   label3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   labelv=0;      
            }
        }
        });
        
        //Funcion de segundo label accion
        label2.addMouseListener(new MouseAdapter()
        {
            int label1 =0;
             public void mouseClicked(MouseEvent e)  
    {  
        botonp=0;
         texto2.setVisible(false);  
         texto21.setVisible(false);  
        texto22.setVisible(false);  
        texto23.setVisible(false);  
            boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
        
        label1++;
            if(label1==1){
                 label2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                   if(guardado==1){
                       iPhone8 iphone = new iPhone8();
             texto2.setText(iphone.Precio);
             texto21.setText(iphone.Bateria);
             texto22.setText(iphone.Camara);
             texto23.setText(iphone.Memoria);
             
        label2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\iphone.png")); 
        boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg"));  }
                else   if(guardado==2){
                     Nexus6P nexus = new Nexus6P();
             texto2.setText(nexus.Precio);
             texto21.setText(nexus.Bateria);
             texto22.setText(nexus.Camara);
             texto23.setText(nexus.Memoria);

               label2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\nexus.png")); 
        boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg"));  }
                  else  if(guardado==3){
         MotoG5 moto = new MotoG5();
             texto2.setText(moto.Precio);
             texto21.setText(moto.Bateria);
             texto22.setText(moto.Camara);
             texto23.setText(moto.Memoria);
        label2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\motog5.jpeg")); 
        boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg"));  }
                  else  if(guardado==4){
        LGQ6 lg = new LGQ6();
              texto2.setText(lg.Precio);
             texto21.setText(lg.Bateria);
             texto22.setText(lg.Camara);
             texto23.setText(lg.Memoria);
        label2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\LG.png")); 
       boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg"));  }
                  
                   }
            if(label1==2){
          boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   label2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   label1=0;
                   
                 
                 
            }
        }
        });
        //
        label1.addMouseListener(new MouseAdapter()      
    {  
 
        int label =0;
    public void mouseClicked(MouseEvent e)  
    {  
         boton=0;
                texto1.setVisible(false);
        texto11.setVisible(false);  
        texto12.setVisible(false);  
        texto13.setVisible(false);  
            boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
        
        label ++;
        if(label==1){
        label1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        if(guardado==1){
        iPhone8 iphone = new iPhone8();
             texto1.setText(iphone.Precio);
             texto21.setText(iphone.Bateria);
             texto12.setText(iphone.Camara);
             texto13.setText(iphone.Memoria);

        label1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\iphone.png")); 
        boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
       }
         else if(guardado==2){
            Nexus6P nexus = new Nexus6P();
             texto1.setText(nexus.Precio);
             texto21.setText(nexus.Bateria);
             texto12.setText(nexus.Camara);
             texto13.setText(nexus.Memoria);
       //  boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png"));   
        label1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\nexus.png")); 
      //  boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
       boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\recio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
      //  boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
         }
         else if(guardado==3){
                  MotoG5 moto = new MotoG5();
             texto1.setText(moto.Precio);
             texto21.setText(moto.Bateria);
             texto12.setText(moto.Camara);
             texto13.setText(moto.Memoria);
               
     // boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png"));   
      label1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\motog5.jpeg")); 
      boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
        //boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
         
         }
         else if(guardado==4){
             LGQ6 lg = new LGQ6();
              texto1.setText(lg.Precio);
             texto21.setText(lg.Bateria);
             texto12.setText(lg.Camara);
             texto13.setText(lg.Memoria);
             
 
            // texto14.setText(" ");
       // boton1.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\fondo.png"));   
        label1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\LG.png")); 
       boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
        //boton14.setIcon(new ImageIcon("C:\\Users\\mitre\\Desktop\\dbm\\pro1\\DBM1\\src\\Mesa\\imagenes\\precio.png")); 
         
         }
    } 
         else if(label==2){
                  boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   label1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   label=0;
                }
    }
    
    
   
    });   
        
   
}
    
//VAriables auxiliares y arreglo de informacion de los telefonos
    public String Size;   
    private List<Celular> Celular; 
      int guardado;
      int celu;
     int boton;
     int botonp;
     int botont;
     int botonc;

  
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
        texto21 = new javax.swing.JTextField();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        texto12 = new javax.swing.JTextField();
        boton13 = new javax.swing.JButton();
        texto13 = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        boton2 = new javax.swing.JButton();
        boton21 = new javax.swing.JButton();
        boton22 = new javax.swing.JButton();
        boton23 = new javax.swing.JButton();
        texto2 = new javax.swing.JTextField();
        texto11 = new javax.swing.JTextField();
        texto22 = new javax.swing.JTextField();
        texto23 = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        boton3 = new javax.swing.JButton();
        boton31 = new javax.swing.JButton();
        boton32 = new javax.swing.JButton();
        boton33 = new javax.swing.JButton();
        texto33 = new javax.swing.JTextField();
        texto31 = new javax.swing.JTextField();
        texto3 = new javax.swing.JTextField();
        texto32 = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        boton4 = new javax.swing.JButton();
        boton41 = new javax.swing.JButton();
        boton42 = new javax.swing.JButton();
        boton43 = new javax.swing.JButton();
        texto4 = new javax.swing.JTextField();
        texto41 = new javax.swing.JTextField();
        texto43 = new javax.swing.JTextField();
        texto42 = new javax.swing.JTextField();

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

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        label1.setBackground(new java.awt.Color(153, 153, 153));
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
        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/andr.jpg"))); // NOI18N
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        texto21.setBackground(new java.awt.Color(51, 51, 51));
        texto21.setForeground(new java.awt.Color(255, 255, 255));
        texto21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto21ActionPerformed(evt);
            }
        });

        boton11.setBackground(new java.awt.Color(51, 51, 51));
        boton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/cam.jpg"))); // NOI18N
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });

        boton12.setBackground(new java.awt.Color(51, 51, 51));
        boton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/bat.jpg"))); // NOI18N
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

        boton13.setBackground(new java.awt.Color(51, 51, 51));
        boton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/memo.jpg"))); // NOI18N
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

        label2.setBackground(new java.awt.Color(153, 153, 153));
        label2.setLabelFor(nexus);

        boton2.setBackground(new java.awt.Color(51, 51, 51));
        boton2.setForeground(new java.awt.Color(51, 51, 51));
        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/peso.jpg"))); // NOI18N
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton21.setBackground(new java.awt.Color(51, 51, 51));
        boton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/bat.jpg"))); // NOI18N
        boton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton21ActionPerformed(evt);
            }
        });

        boton22.setBackground(new java.awt.Color(51, 51, 51));
        boton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/cam.jpg"))); // NOI18N
        boton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton22ActionPerformed(evt);
            }
        });

        boton23.setBackground(new java.awt.Color(51, 51, 51));
        boton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/memo.jpg"))); // NOI18N
        boton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton23ActionPerformed(evt);
            }
        });

        texto2.setBackground(new java.awt.Color(51, 51, 51));
        texto2.setForeground(new java.awt.Color(255, 255, 255));
        texto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto2ActionPerformed(evt);
            }
        });

        texto11.setBackground(new java.awt.Color(51, 51, 51));
        texto11.setForeground(new java.awt.Color(255, 255, 255));
        texto11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto11ActionPerformed(evt);
            }
        });

        texto22.setBackground(new java.awt.Color(51, 51, 51));
        texto22.setForeground(new java.awt.Color(255, 255, 255));
        texto22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto22ActionPerformed(evt);
            }
        });

        texto23.setBackground(new java.awt.Color(51, 51, 51));
        texto23.setForeground(new java.awt.Color(255, 255, 255));
        texto23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto23ActionPerformed(evt);
            }
        });

        label3.setBackground(new java.awt.Color(153, 153, 153));
        label3.setLabelFor(nexus);

        boton3.setBackground(new java.awt.Color(51, 51, 51));
        boton3.setForeground(new java.awt.Color(51, 51, 51));
        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/peso.jpg"))); // NOI18N
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton31.setBackground(new java.awt.Color(51, 51, 51));
        boton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/bat.jpg"))); // NOI18N
        boton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton31ActionPerformed(evt);
            }
        });

        boton32.setBackground(new java.awt.Color(51, 51, 51));
        boton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/cam.jpg"))); // NOI18N
        boton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton32ActionPerformed(evt);
            }
        });

        boton33.setBackground(new java.awt.Color(51, 51, 51));
        boton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/memo.jpg"))); // NOI18N
        boton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton33ActionPerformed(evt);
            }
        });

        texto33.setBackground(new java.awt.Color(51, 51, 51));
        texto33.setForeground(new java.awt.Color(255, 255, 255));
        texto33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto33ActionPerformed(evt);
            }
        });

        texto31.setBackground(new java.awt.Color(51, 51, 51));
        texto31.setForeground(new java.awt.Color(255, 255, 255));
        texto31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto31ActionPerformed(evt);
            }
        });

        texto3.setBackground(new java.awt.Color(51, 51, 51));
        texto3.setForeground(new java.awt.Color(255, 255, 255));
        texto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto3ActionPerformed(evt);
            }
        });

        texto32.setBackground(new java.awt.Color(51, 51, 51));
        texto32.setForeground(new java.awt.Color(255, 255, 255));
        texto32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto32ActionPerformed(evt);
            }
        });

        label4.setBackground(new java.awt.Color(153, 153, 153));
        label4.setLabelFor(nexus);

        boton4.setBackground(new java.awt.Color(51, 51, 51));
        boton4.setForeground(new java.awt.Color(51, 51, 51));
        boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/peso.jpg"))); // NOI18N
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton41.setBackground(new java.awt.Color(51, 51, 51));
        boton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/bat.jpg"))); // NOI18N
        boton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton41ActionPerformed(evt);
            }
        });

        boton42.setBackground(new java.awt.Color(51, 51, 51));
        boton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/cam.jpg"))); // NOI18N
        boton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton42ActionPerformed(evt);
            }
        });

        boton43.setBackground(new java.awt.Color(51, 51, 51));
        boton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mesa/imagenes/memo.jpg"))); // NOI18N
        boton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton43ActionPerformed(evt);
            }
        });

        texto4.setBackground(new java.awt.Color(51, 51, 51));
        texto4.setForeground(new java.awt.Color(255, 255, 255));
        texto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto4ActionPerformed(evt);
            }
        });

        texto41.setBackground(new java.awt.Color(51, 51, 51));
        texto41.setForeground(new java.awt.Color(255, 255, 255));
        texto41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto41ActionPerformed(evt);
            }
        });

        texto43.setBackground(new java.awt.Color(51, 51, 51));
        texto43.setForeground(new java.awt.Color(255, 255, 255));
        texto43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto43ActionPerformed(evt);
            }
        });

        texto42.setBackground(new java.awt.Color(51, 51, 51));
        texto42.setForeground(new java.awt.Color(255, 255, 255));
        texto42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(texto11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(texto21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton21, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(texto22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton22, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(texto23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton23, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(boton33, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(texto43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton43, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(boton31, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(texto41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton41, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(boton32, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(texto42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton42, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(texto21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(texto11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(texto12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(texto22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(texto23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton31, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(texto31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(texto41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton41, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton32, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(texto32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(texto42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton42, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton33, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(texto33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(texto43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton43, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        label1.getAccessibleContext().setAccessibleName("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
       //Separacion en tipo de telefono
       iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto1.setText(iphone8.Precio);}
        if(guardado==2){
           texto1.setText(iphone8.Bateria);}
        if(guardado==3){
           texto1.setText(iphone8.Camara);}
        if(guardado==4){
           texto1.setText(iphone8.Memoria);}
        }
        if(boton==2){ 
             iPhone8 iphone8 = new iPhone8();
        texto1.setText(iphone8.Precio);
        boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
       boton=0;
          texto1.setVisible(false);     
        }
       
    }//GEN-LAST:event_boton1ActionPerformed

    private void nexusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nexusActionPerformed
guardado=2;
       
    }//GEN-LAST:event_nexusActionPerformed

    private void motoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motoActionPerformed
guardado=3;
      
    }//GEN-LAST:event_motoActionPerformed

    private void texto21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto21ActionPerformed

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
        boton++;
        if(boton==1){
              texto11.setVisible(true);  
        boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
      iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto11.setText(iphone8.Precio);}
        if(guardado==2){
           texto11.setText(iphone8.Bateria);}
        if(guardado==3){
           texto11.setText(iphone8.Camara);}
        if(guardado==4){
           texto11.setText(iphone8.Memoria);}
        }
        if(boton==2){
       texto11.setText(" ");
         boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
       boton=0;
        texto11.setVisible(false);  
        }
       
    }//GEN-LAST:event_boton11ActionPerformed

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
        boton++;
        if(boton==1){
              texto12.setVisible(true); 
        boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
   iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto12.setText(iphone8.Precio);}
        if(guardado==2){
           texto12.setText(iphone8.Bateria);}
        if(guardado==3){
           texto12.setText(iphone8.Camara);}
        if(guardado==4){
           texto12.setText(iphone8.Memoria);}
        }
        if(boton==2){   
            texto12.setText(" ");
            boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
       boton=0;    
        texto12.setVisible(false);      
        }
       
           
    }//GEN-LAST:event_boton12ActionPerformed

    private void texto12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto12ActionPerformed

    private void boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton13ActionPerformed
        boton++;
        if(boton==1){
            texto13.setVisible(true);     
        boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
       boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto13.setText(iphone8.Precio);}
        if(guardado==2){
           texto13.setText(iphone8.Bateria);}
        if(guardado==3){
           texto13.setText(iphone8.Camara);}
        if(guardado==4){
           texto13.setText(iphone8.Memoria);}
        
        }
        if(boton==2){
             texto13.setText(" ");
       boton1.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton11.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton12.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton13.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
        boton=0;
        texto13.setVisible(false);  
        }
    }//GEN-LAST:event_boton13ActionPerformed

    private void texto13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto13ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        botonp++;
        if(botonp==1){
              texto2.setVisible(true);    
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto2.setText(iphone8.Precio);}
        if(guardado==2){
           texto2.setText(iphone8.Bateria);}
        if(guardado==3){
           texto2.setText(iphone8.Camara);}
        if(guardado==4){
           texto2.setText(iphone8.Memoria);}
        }
        if(botonp==2){
        texto2.setText(" ");
        boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
      botonp=0;
        texto2.setVisible(false);      
        }
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton21ActionPerformed

        botonp++;
        if(botonp==1){
              texto21.setVisible(true);    
        boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto21.setText(iphone8.Precio);}
        if(guardado==2){
           texto21.setText(iphone8.Bateria);}
        if(guardado==3){
           texto21.setText(iphone8.Camara);}
        if(guardado==4){
           texto21.setText(iphone8.Memoria);}
        }
        if(botonp==2){
        texto21.setText(" ");
        boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
      botonp=0;
        texto21.setVisible(false);      
        }
    }//GEN-LAST:event_boton21ActionPerformed

    private void boton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton22ActionPerformed

        botonp++;
        if(botonp==1){
              texto22.setVisible(true);    
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto22.setText(iphone8.Precio);}
        if(guardado==2){
           texto22.setText(iphone8.Bateria);}
        if(guardado==3){
           texto22.setText(iphone8.Camara);}
        if(guardado==4){
           texto22.setText(iphone8.Memoria);}
        }
        if(botonp==2){
        texto22.setText(" ");
        boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
      botonp=0;
        texto22.setVisible(false);      
        }
    }//GEN-LAST:event_boton22ActionPerformed

    private void boton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton23ActionPerformed

        botonp++;
        if(botonp==1){
              texto23.setVisible(true);    
        boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
      iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto23.setText(iphone8.Precio);}
        if(guardado==2){
           texto23.setText(iphone8.Bateria);}
        if(guardado==3){
           texto23.setText(iphone8.Camara);}
        if(guardado==4){
           texto23.setText(iphone8.Memoria);}
        }
        if(botonp==2){
        texto23.setText(" ");
        boton2.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton21.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton22.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton23.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
      botonp=0;
        texto23.setVisible(false);      
        }
    }//GEN-LAST:event_boton23ActionPerformed

    private void texto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto2ActionPerformed

    private void texto11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto11ActionPerformed

    private void texto22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto22ActionPerformed

    private void texto23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto23ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
             botont++;
        if(botont==1){
              texto3.setVisible(true); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
       //Separacion en tipo de telefono
        iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto3.setText(iphone8.Precio);}
        if(guardado==2){
           texto3.setText(iphone8.Bateria);}
        if(guardado==3){
           texto3.setText(iphone8.Camara);}
        if(guardado==4){
           texto3.setText(iphone8.Memoria);}
        }
        if(botont==2){   
        texto3.setText(" ");
        boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
       botont=0;
          texto3.setVisible(false);     
        }
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton31ActionPerformed
        botont++;
        if(botont==1){
              texto31.setVisible(true); 
        boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
       //Separacion en tipo de telefono
        iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto31.setText(iphone8.Precio);}
        if(guardado==2){
           texto31.setText(iphone8.Bateria);}
        if(guardado==3){
           texto31.setText(iphone8.Camara);}
        if(guardado==4){
           texto31.setText(iphone8.Memoria);}
        }
        if(botont==2){   
        texto31.setText(" ");
        boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
       botont=0;
          texto31.setVisible(false);     
        }
    }//GEN-LAST:event_boton31ActionPerformed

    private void boton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton32ActionPerformed
        botont++;
        if(botont==1){
              texto32.setVisible(true); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
       //Separacion en tipo de telefono
       iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto32.setText(iphone8.Precio);}
        if(guardado==2){
           texto32.setText(iphone8.Bateria);}
        if(guardado==3){
           texto32.setText(iphone8.Camara);}
        if(guardado==4){
           texto32.setText(iphone8.Memoria);}
        }
        if(botont==2){   
        texto32.setText(" ");
        boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
       botont=0;
          texto32.setVisible(false);     
        }
    }//GEN-LAST:event_boton32ActionPerformed

    private void boton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton33ActionPerformed
        botont++;
        if(botont==1){
              texto33.setVisible(true); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
       //Separacion en tipo de telefono
       iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto33.setText(iphone8.Precio);}
        if(guardado==2){
           texto33.setText(iphone8.Bateria);}
        if(guardado==3){
           texto33.setText(iphone8.Camara);}
        if(guardado==4){
           texto33.setText(iphone8.Memoria);}
        }
        if(botont==2){   
        texto33.setText(" ");
        boton3.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton31.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton32.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton33.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
       botont=0;
          texto33.setVisible(false);     
        }
    }//GEN-LAST:event_boton33ActionPerformed

    private void texto33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto33ActionPerformed

    private void texto31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto31ActionPerformed

    private void texto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto3ActionPerformed

    private void texto32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto32ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
             botonc++;
        if(botonc==1){
              texto4.setVisible(true); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
       //Separacion en tipo de telefono
       iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto4.setText(iphone8.Precio);}
        if(guardado==2){
           texto4.setText(iphone8.Bateria);}
        if(guardado==3){
           texto4.setText(iphone8.Camara);}
        if(guardado==4){
           texto4.setText(iphone8.Memoria);}
        }
        if(botonc==2){   
        texto4.setText(" ");
        boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
       botonc=0;
          texto4.setVisible(false);     
        }
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton41ActionPerformed
        botonc++;
        if(botonc==1){
              texto41.setVisible(true); 
        boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
       //Separacion en tipo de telefono
        iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto41.setText(iphone8.Precio);}
        if(guardado==2){
           texto41.setText(iphone8.Bateria);}
        if(guardado==3){
           texto41.setText(iphone8.Camara);}
        if(guardado==4){
           texto41.setText(iphone8.Memoria);}
        }
        if(botonc==2){   
        texto41.setText(" ");
        boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
       botonc=0;
          texto41.setVisible(false);     
        }
    }//GEN-LAST:event_boton41ActionPerformed

    private void boton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton42ActionPerformed
         botonc++;
        if(botonc==1){
              texto42.setVisible(true); 
        boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
       //Separacion en tipo de telefono
        iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto42.setText(iphone8.Precio);}
        if(guardado==2){
           texto42.setText(iphone8.Bateria);}
        if(guardado==3){
           texto42.setText(iphone8.Camara);}
        if(guardado==4){
           texto42.setText(iphone8.Memoria);}
        }
        if(botonc==2){   
        texto42.setText(" ");
        boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
       botonc=0;
          texto42.setVisible(false);     
        }
    }//GEN-LAST:event_boton42ActionPerformed

    private void boton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton43ActionPerformed
       botonc++;
        if(botonc==1){
              texto43.setVisible(true); 
        boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png")); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\fondo.png"));
       //Separacion en tipo de telefono
        iPhone8 iphone8 = new iPhone8();
        if(guardado==1){
             texto43.setText(iphone8.Precio);}
        if(guardado==2){
           texto43.setText(iphone8.Bateria);}
        if(guardado==3){
           texto43.setText(iphone8.Camara);}
        if(guardado==4){
           texto43.setText(iphone8.Memoria);}
        }
        if(botonc==2){   
        texto43.setText(" ");
        boton4.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\precio.png")); 
        boton41.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\bat.jpg")); 
        boton42.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\cam.jpg")); 
        boton43.setIcon(new ImageIcon("C:\\Users\\valeria\\Documents\\NetBeansProjects\\Mesa\\src\\Mesa\\imagenes\\memo.jpg")); 
       botonc=0;
          texto43.setVisible(false);     
        }
    }//GEN-LAST:event_boton43ActionPerformed

    private void texto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto4ActionPerformed

    private void texto41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto41ActionPerformed

    private void texto43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto43ActionPerformed

    private void texto42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto42ActionPerformed

    
    
    
    
    
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
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton21;
    private javax.swing.JButton boton22;
    private javax.swing.JButton boton23;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton31;
    private javax.swing.JButton boton32;
    private javax.swing.JButton boton33;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton41;
    private javax.swing.JButton boton42;
    private javax.swing.JButton boton43;
    private javax.swing.JButton iphone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JButton lg;
    private javax.swing.JButton moto;
    private javax.swing.JButton nexus;
    private javax.swing.JTextField texto1;
    private javax.swing.JTextField texto11;
    private javax.swing.JTextField texto12;
    private javax.swing.JTextField texto13;
    private javax.swing.JTextField texto2;
    private javax.swing.JTextField texto21;
    private javax.swing.JTextField texto22;
    private javax.swing.JTextField texto23;
    private javax.swing.JTextField texto3;
    private javax.swing.JTextField texto31;
    private javax.swing.JTextField texto32;
    private javax.swing.JTextField texto33;
    private javax.swing.JTextField texto4;
    private javax.swing.JTextField texto41;
    private javax.swing.JTextField texto42;
    private javax.swing.JTextField texto43;
    // End of variables declaration//GEN-END:variables
}
