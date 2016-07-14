/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridades;

import archivo.PerArcBloNot;
import java.io.File;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author prof_tes_a
 */
public class PerPanPri extends javax.swing.JFrame
{

    private String strRut="C:\\";   //Ruta
    
    /**
     * Creates new form PerPanPri
     */
    public PerPanPri()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskGen = new javax.swing.JDesktopPane();
        panBarEst = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArc = new javax.swing.JMenu();
        mnuArcNue = new javax.swing.JMenuItem();
        mnuArcAbr = new javax.swing.JMenuItem();
        mnuArcGua = new javax.swing.JMenuItem();
        mnuArcGuaCom = new javax.swing.JMenuItem();
        mnuArcCer = new javax.swing.JMenuItem();
        mnuArcSep1 = new javax.swing.JPopupMenu.Separator();
        mnuArcLogIngSis = new javax.swing.JMenuItem();
        mnuArcSep2 = new javax.swing.JPopupMenu.Separator();
        mnuArcSal = new javax.swing.JMenuItem();
        mnuVer = new javax.swing.JMenu();
        mnuVerBarEst = new javax.swing.JCheckBoxMenuItem();
        mnuMae = new javax.swing.JMenu();
        mnuMaePer = new javax.swing.JMenuItem();
        mnuMaeLisPer = new javax.swing.JMenuItem();
        mnuAyu = new javax.swing.JMenu();
        mnuAyuAceDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PerfumeTES");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout dskGenLayout = new javax.swing.GroupLayout(dskGen);
        dskGen.setLayout(dskGenLayout);
        dskGenLayout.setHorizontalGroup(
            dskGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dskGenLayout.setVerticalGroup(
            dskGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        getContentPane().add(dskGen, java.awt.BorderLayout.CENTER);

        panBarEst.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Usuario:");
        panBarEst.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(panBarEst, java.awt.BorderLayout.SOUTH);

        mnuArc.setMnemonic('A');
        mnuArc.setText("Archivo");

        mnuArcNue.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnuArcNue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.jpg"))); // NOI18N
        mnuArcNue.setText("Nuevo...");
        mnuArcNue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArcNueActionPerformed(evt);
            }
        });
        mnuArc.add(mnuArcNue);

        mnuArcAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.gif"))); // NOI18N
        mnuArcAbr.setText("Abrir...");
        mnuArcAbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArcAbrActionPerformed(evt);
            }
        });
        mnuArc.add(mnuArcAbr);

        mnuArcGua.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mnuArcGua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        mnuArcGua.setText("Guardar...");
        mnuArcGua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArcGuaActionPerformed(evt);
            }
        });
        mnuArc.add(mnuArcGua);

        mnuArcGuaCom.setText("Guardar como...");
        mnuArcGuaCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArcGuaComActionPerformed(evt);
            }
        });
        mnuArc.add(mnuArcGuaCom);

        mnuArcCer.setText("Cerrar");
        mnuArcCer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArcCerActionPerformed(evt);
            }
        });
        mnuArc.add(mnuArcCer);
        mnuArc.add(mnuArcSep1);

        mnuArcLogIngSis.setText("Log de ingreso al Sistema...");
        mnuArcLogIngSis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArcLogIngSisActionPerformed(evt);
            }
        });
        mnuArc.add(mnuArcLogIngSis);
        mnuArc.add(mnuArcSep2);

        mnuArcSal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuArcSal.setText("Salir");
        mnuArcSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArcSalActionPerformed(evt);
            }
        });
        mnuArc.add(mnuArcSal);

        jMenuBar1.add(mnuArc);

        mnuVer.setMnemonic('V');
        mnuVer.setText("Ver");

        mnuVerBarEst.setSelected(true);
        mnuVerBarEst.setText("Barra de estado");
        mnuVer.add(mnuVerBarEst);

        jMenuBar1.add(mnuVer);

        mnuMae.setMnemonic('M');
        mnuMae.setText("Maestros");

        mnuMaePer.setText("Perfumes...");
        mnuMaePer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMaePerActionPerformed(evt);
            }
        });
        mnuMae.add(mnuMaePer);

        mnuMaeLisPer.setText("Listado de perfumes...");
        mnuMae.add(mnuMaeLisPer);

        jMenuBar1.add(mnuMae);

        mnuAyu.setMnemonic('y');
        mnuAyu.setText("Ayuda");

        mnuAyuAceDe.setText("Acerca de...");
        mnuAyu.add(mnuAyuAceDe);

        jMenuBar1.add(mnuAyu);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(640, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArcSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArcSalActionPerformed
        //if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea salir?", "PerfumeTES", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        //if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea salir?", "PerfumeTES", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
        Icon objIco=new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.jpg"));
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea salir?", "PerfumeTES", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, objIco)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_mnuArcSalActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        mnuArcSalActionPerformed(null);
    }//GEN-LAST:event_formWindowClosing

    private void mnuArcNueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArcNueActionPerformed
        archivo.PerArcBloNot objArcBloNot=new archivo.PerArcBloNot();
        dskGen.add(objArcBloNot, JLayeredPane.DEFAULT_LAYER);
        objArcBloNot.setVisible(true);
    }//GEN-LAST:event_mnuArcNueActionPerformed

    private void mnuArcGuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArcGuaActionPerformed
        guardarPerArcBloNot();
    }//GEN-LAST:event_mnuArcGuaActionPerformed

    private void mnuArcAbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArcAbrActionPerformed
        abrirPerArcBloNot();
    }//GEN-LAST:event_mnuArcAbrActionPerformed

    private void mnuArcGuaComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArcGuaComActionPerformed
        guardarComoPerArcBloNot();
    }//GEN-LAST:event_mnuArcGuaComActionPerformed

    private void mnuArcCerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArcCerActionPerformed
        if (dskGen.getSelectedFrame()!=null)
            dskGen.getSelectedFrame().dispose();
    }//GEN-LAST:event_mnuArcCerActionPerformed

    private void mnuArcLogIngSisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArcLogIngSisActionPerformed
        archivo.PerArcLogIngSis objArcLogIngSis=new archivo.PerArcLogIngSis();
        dskGen.add(objArcLogIngSis, JLayeredPane.DEFAULT_LAYER);
        objArcLogIngSis.setVisible(true);
    }//GEN-LAST:event_mnuArcLogIngSisActionPerformed

    private void mnuMaePerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMaePerActionPerformed
        teacher.PerMaePer objMaePer=new teacher.PerMaePer();
        dskGen.add(objMaePer, JLayeredPane.DEFAULT_LAYER);
        objMaePer.setVisible(true);
    }//GEN-LAST:event_mnuMaePerActionPerformed

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
            java.util.logging.Logger.getLogger(PerPanPri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerPanPri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerPanPri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerPanPri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerPanPri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskGen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuArc;
    private javax.swing.JMenuItem mnuArcAbr;
    private javax.swing.JMenuItem mnuArcCer;
    private javax.swing.JMenuItem mnuArcGua;
    private javax.swing.JMenuItem mnuArcGuaCom;
    private javax.swing.JMenuItem mnuArcLogIngSis;
    private javax.swing.JMenuItem mnuArcNue;
    private javax.swing.JMenuItem mnuArcSal;
    private javax.swing.JPopupMenu.Separator mnuArcSep1;
    private javax.swing.JPopupMenu.Separator mnuArcSep2;
    private javax.swing.JMenu mnuAyu;
    private javax.swing.JMenuItem mnuAyuAceDe;
    private javax.swing.JMenu mnuMae;
    private javax.swing.JMenuItem mnuMaeLisPer;
    private javax.swing.JMenuItem mnuMaePer;
    private javax.swing.JMenu mnuVer;
    private javax.swing.JCheckBoxMenuItem mnuVerBarEst;
    private javax.swing.JPanel panBarEst;
    // End of variables declaration//GEN-END:variables

    private boolean guardarArcTex(String strNomArc, String strTex)
    {
        boolean blnRes=true;
        try
        {
            java.io.FileWriter objFilWri=new java.io.FileWriter(strNomArc);
            java.io.BufferedWriter objBufWri=new java.io.BufferedWriter(objFilWri);
            java.io.PrintWriter objPriWri=new java.io.PrintWriter(objBufWri);
            objPriWri.print(strTex);
            objPriWri.close();
        }
        catch(java.io.IOException e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }
    
    private boolean abrirArcTex(String strNomArc, JTextArea txaTex)
    {
        boolean blnRes=true;
        try
        {
            String strCon=""; //Contenido del archivo.
            java.io.FileReader objFilRea=new java.io.FileReader(strNomArc);
            java.io.BufferedReader objBufRea=new java.io.BufferedReader(objFilRea);
            String strLin;
            while((strLin=objBufRea.readLine())!=null)
                strCon+=strLin + "\n";
            objBufRea.close();
            txaTex.setText(strCon);
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        catch(java.io.IOException e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }
    
    private boolean guardarPerArcBloNot()
    {
        boolean blnRes=true;
        try
        {
            String strArc;
            if (((PerArcBloNot)dskGen.getSelectedFrame()).getTitle().equals("Bloc de notas"))
            {
                JFileChooser objFilCho=new JFileChooser();
                objFilCho.setDialogTitle("Guardar");
                objFilCho.setFileSelectionMode(JFileChooser.FILES_ONLY);
                //objFilCho.setCurrentDirectory(new File("C:\\"));
                objFilCho.setCurrentDirectory(new File(strRut));
                //Filtrado (Opción 1):
                FileNameExtensionFilter objFilNamExt=new FileNameExtensionFilter("Archivos de texto", "txt");
                objFilCho.setFileFilter(objFilNamExt);
                //Filtrado (Opción 2):
//                objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
//                objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos java", "java"));
//                objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos php", "php", "php4", "phtml"));
                if (objFilCho.showSaveDialog(this)==JFileChooser.APPROVE_OPTION)
                {
                    strRut=objFilCho.getCurrentDirectory().getAbsolutePath() + "\\";
                    strArc=objFilCho.getSelectedFile().getPath();
                    //Si no tiene la extensión "txt" agregarsela.
                    if (!strArc.toLowerCase().endsWith(".txt"))
                        strArc+=".txt";
                    if (guardarArcTex(strArc, ((PerArcBloNot)dskGen.getSelectedFrame()).txaPag.getText()))
                        ((PerArcBloNot)dskGen.getSelectedFrame()).setTitle(strArc);
        //            System.out.println("Directorio seleccionado: " + strArc);
        //            System.out.println("Texto: " + ((MenArcBloNot)dskGen.getSelectedFrame()).txaPag.getText());
                }
                else
                {
                    System.out.println("El usuario canceló");
                }
            }
            else
                guardarArcTex(((PerArcBloNot)dskGen.getSelectedFrame()).getTitle(), ((PerArcBloNot)dskGen.getSelectedFrame()).txaPag.getText());
        }
        catch(Exception e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }
    
    private boolean abrirPerArcBloNot()
    {
        boolean blnRes=true;
        try
        {
            String strArc;
            JFileChooser objFilCho=new JFileChooser();
            objFilCho.setDialogTitle("Abrir");
            objFilCho.setFileSelectionMode(JFileChooser.FILES_ONLY);
            //objFilCho.setCurrentDirectory(new File("C:\\"));
            objFilCho.setCurrentDirectory(new File(strRut));
            //Filtrado (Opción 1):
            FileNameExtensionFilter objFilNamExt=new FileNameExtensionFilter("Archivos de texto", "txt");
            objFilCho.setFileFilter(objFilNamExt);
            //Filtrado (Opción 2):
    //        objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
    //        objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos java", "java"));
    //        objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos php", "php", "php4", "phtml"));
            if (objFilCho.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
            {
                strRut=objFilCho.getCurrentDirectory().getAbsolutePath() + "\\";
                strArc=objFilCho.getSelectedFile().getPath();
                //Si no tiene la extensión "txt" agregarsela.
    //            if (!strArc.toLowerCase().endsWith(".txt"))
    //                strArc+=".txt";

                PerArcBloNot objArcBloNot=new PerArcBloNot();
                dskGen.add(objArcBloNot, JLayeredPane.DEFAULT_LAYER);
                objArcBloNot.setVisible(true);

                //abrirArcTex(strArc, ((MenArcBloNot)dskGen.getSelectedFrame()).txaPag);
                abrirArcTex(strArc, objArcBloNot.txaPag);
                ((PerArcBloNot)dskGen.getSelectedFrame()).setTitle(strArc);
    //            System.out.println("Directorio seleccionado: " + strArc);
    //            System.out.println("Texto: " + ((ifrProPal)dskGen.getSelectedFrame()).txaPag.getText());
            }
            else
            {
                System.out.println("El usuario canceló");
            }
        }
        catch(Exception e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }

    private boolean guardarComoPerArcBloNot()
    {
        boolean blnRes=true;
        try
        {
            String strArc;
//            if (((PerArcBloNot)dskGen.getSelectedFrame()).getTitle().equals("Bloc de notas"))
//            {
                JFileChooser objFilCho=new JFileChooser();
                objFilCho.setDialogTitle("Guardar");
                objFilCho.setFileSelectionMode(JFileChooser.FILES_ONLY);
                //objFilCho.setCurrentDirectory(new File("C:\\"));
                objFilCho.setCurrentDirectory(new File(strRut));
                //Filtrado (Opción 1):
                FileNameExtensionFilter objFilNamExt=new FileNameExtensionFilter("Archivos de texto", "txt");
                objFilCho.setFileFilter(objFilNamExt);
                //Filtrado (Opción 2):
//                objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
//                objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos java", "java"));
//                objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos php", "php", "php4", "phtml"));
                if (objFilCho.showSaveDialog(this)==JFileChooser.APPROVE_OPTION)
                {
                    strRut=objFilCho.getCurrentDirectory().getAbsolutePath() + "\\";
                    strArc=objFilCho.getSelectedFile().getPath();
                    //Si no tiene la extensión "txt" agregarsela.
                    if (!strArc.toLowerCase().endsWith(".txt"))
                        strArc+=".txt";
                    if (guardarArcTex(strArc, ((PerArcBloNot)dskGen.getSelectedFrame()).txaPag.getText()))
                        ((PerArcBloNot)dskGen.getSelectedFrame()).setTitle(strArc);
        //            System.out.println("Directorio seleccionado: " + strArc);
        //            System.out.println("Texto: " + ((MenArcBloNot)dskGen.getSelectedFrame()).txaPag.getText());
                }
                else
                {
                    System.out.println("El usuario canceló");
                }
//            }
//            else
//                guardarArcTex(((PerArcBloNot)dskGen.getSelectedFrame()).getTitle(), ((PerArcBloNot)dskGen.getSelectedFrame()).txaPag.getText());
        }
        catch(Exception e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }

    
}
