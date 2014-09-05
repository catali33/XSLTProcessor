/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dataaccessioner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author sshaw6
 */
public class SwingView extends javax.swing.JFrame {

    /**
     * Creates new form SwingView
     */
    public SwingView() {
        
        //Load any xslt found
        for(File transform: new File("xslt").listFiles(new FilenameFilter() {
            private final String[] okFileExtensions = new String[]{"xsl", "xslt"};
            
            @Override
            public boolean accept(File dir, String name) {
                for (String extension : okFileExtensions) {
                    if (name.toLowerCase().endsWith(extension)) {
                        return true;
                    }
                }
                return false;
            }
        })){
            transLstMdl.addElement(transform.getAbsolutePath());
        }
        
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

        addSrcBtn = new javax.swing.JButton();
        srcSP = new javax.swing.JScrollPane();
        srcLst = new javax.swing.JList();
        rmvSrcBtn = new javax.swing.JButton();
        outDirBtn = new javax.swing.JButton();
        outDirTxt = new javax.swing.JTextField();
        addTransBtn = new javax.swing.JButton();
        rmvTransBtn = new javax.swing.JButton();
        transSP = new javax.swing.JScrollPane();
        transLst = new javax.swing.JList();
        runBtn = new javax.swing.JButton();
        runProgress = new javax.swing.JProgressBar();
        statusSP = new javax.swing.JScrollPane();
        statusTxt = new javax.swing.JTextArea();
        cancelBtn = new javax.swing.JButton();
        srcSep = new javax.swing.JSeparator();
        transSep = new javax.swing.JSeparator();
        runSep = new javax.swing.JSeparator();
        clearStatusBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addSrcBtn.setText("Add Source");
        addSrcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSrcBtnActionPerformed(evt);
            }
        });

        srcLst.setModel(srcLstMdl);
        srcSP.setViewportView(srcLst);

        rmvSrcBtn.setText("Remove Source");
        rmvSrcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmvSrcBtnActionPerformed(evt);
            }
        });

        outDirBtn.setText("Set Output Dir");
        outDirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outDirBtnActionPerformed(evt);
            }
        });

        addTransBtn.setText("Add Transform");
        addTransBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTransBtnActionPerformed(evt);
            }
        });

        rmvTransBtn.setText("Remove Transform");
        rmvTransBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmvTransBtnActionPerformed(evt);
            }
        });

        transLst.setModel(transLstMdl);
        transSP.setViewportView(transLst);

        runBtn.setText("Run Transforms");
        runBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runBtnActionPerformed(evt);
            }
        });

        statusTxt.setEditable(false);
        statusTxt.setColumns(20);
        statusTxt.setRows(5);
        statusSP.setViewportView(statusTxt);

        cancelBtn.setText("Cancel");

        clearStatusBtn.setText("Clear Results");
        clearStatusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearStatusBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(runSep)
                    .addComponent(srcSep)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(runProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(runBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outDirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addSrcBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rmvTransBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addTransBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearStatusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rmvSrcBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outDirTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(transSP, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                            .addComponent(srcSP)
                            .addComponent(statusSP)))
                    .addComponent(transSep, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addSrcBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rmvSrcBtn))
                    .addComponent(srcSP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srcSep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addTransBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rmvTransBtn))
                    .addComponent(transSP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transSep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outDirBtn)
                    .addComponent(outDirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(runSep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(runBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(runProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearStatusBtn)
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addComponent(statusSP))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearStatusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearStatusBtnActionPerformed
        statusTxt.setText("");
    }//GEN-LAST:event_clearStatusBtnActionPerformed

    private void addSrcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSrcBtnActionPerformed
        JFileChooser addSrcSelector = new JFileChooser();
        addSrcSelector.setMultiSelectionEnabled(true);
        addSrcSelector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (addSrcSelector.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            for (File file : addSrcSelector.getSelectedFiles()) {
                if (file.isFile() && file.canRead()) {
                    srcLstMdl.addElement(file);
                }
            }
        }
    }//GEN-LAST:event_addSrcBtnActionPerformed

    private void addTransBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTransBtnActionPerformed
        JFileChooser addSrcSelector = new JFileChooser();
        addSrcSelector.setMultiSelectionEnabled(true);
        addSrcSelector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (addSrcSelector.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            for (File file : addSrcSelector.getSelectedFiles()) {
                if (file.isFile() && file.canRead()) {
                    transLstMdl.addElement(file);
                }
            }
        }
    }//GEN-LAST:event_addTransBtnActionPerformed

    private void rmvSrcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmvSrcBtnActionPerformed
        for(Object selected: srcLst.getSelectedValues()){
            srcLstMdl.removeElement(selected);
        }
    }//GEN-LAST:event_rmvSrcBtnActionPerformed

    private void rmvTransBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmvTransBtnActionPerformed
        for(Object selected: transLst.getSelectedValues()){
            transLstMdl.removeElement(selected);
        }
    }//GEN-LAST:event_rmvTransBtnActionPerformed

    private void outDirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outDirBtnActionPerformed
        JFileChooser outDirSelector = new JFileChooser();
        outDirSelector.setMultiSelectionEnabled(false);
        outDirSelector.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(outDirSelector.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            File outDir = outDirSelector.getSelectedFile();
            if(outDir.isDirectory() && outDir.canWrite()){
                outDirTxt.setText(outDir.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(this,
                        "The selected output directory ("+outDir.getPath()
                                +")\n is invalid or you cannot write to it.\n"
                                +"Select a valid directory.",
                        "Invalid Output Directory",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_outDirBtnActionPerformed

    private void runBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runBtnActionPerformed
        TransformTask transform = new TransformTask();
        transform.execute();
    }//GEN-LAST:event_runBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SwingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSrcBtn;
    private javax.swing.JButton addTransBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton clearStatusBtn;
    private javax.swing.JButton outDirBtn;
    private javax.swing.JTextField outDirTxt;
    private javax.swing.JButton rmvSrcBtn;
    private javax.swing.JButton rmvTransBtn;
    private javax.swing.JButton runBtn;
    private javax.swing.JProgressBar runProgress;
    private javax.swing.JSeparator runSep;
    private javax.swing.JList srcLst;
    private javax.swing.JScrollPane srcSP;
    private javax.swing.JSeparator srcSep;
    private javax.swing.JScrollPane statusSP;
    private javax.swing.JTextArea statusTxt;
    private javax.swing.JList transLst;
    private javax.swing.JScrollPane transSP;
    private javax.swing.JSeparator transSep;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel transLstMdl = new DefaultListModel();
    private DefaultListModel srcLstMdl = new DefaultListModel();

    class TransformTask extends SwingWorker<String, Object> {

        @Override
        protected String doInBackground() throws Exception {
            statusTxt.append("Preparing to run transformations...\n");
            statusTxt.append("Checking destination... ");
            File out = new File(outDirTxt.getText());
            statusTxt.append(out.getPath());
            if(out.isDirectory() && out.canWrite()){
                statusTxt.append(" is good.\n");
            } else {
                statusTxt.append(" is either not a directory or not writable.\n"
                        + "Canceling...\n");
                return "Canceled";
            }
            statusTxt.append("Checking sources.\n");
            ArrayList<String> sources = new ArrayList<String>();
            for (Object obj : srcLstMdl.toArray()) {
                statusTxt.append(obj.toString());
                if (new File(obj.toString()).canRead()) {
                    sources.add(obj.toString());
                    statusTxt.append(" ... is added.\n");
                } else {
                    statusTxt.append(" ... cannot be read and was not added.\n");
                }
            }

            statusTxt.append("Checking transforms.\n");
            ArrayList<String> transforms = new ArrayList<String>();
            for (Object obj : transLstMdl.toArray()) {
                statusTxt.append(obj.toString());
                if (new File(obj.toString()).canRead()) {
                    transforms.add(obj.toString());
                    statusTxt.append(" ... is added.\n");
                } else {
                    statusTxt.append(" ... cannot be read and was not added.\n");
                }
            }
            statusTxt.append("Starting transformations... \n");
            new XSLTProcessor().runTransforms(sources, transforms, outDirTxt.getText());
            statusTxt.append("Transformations complete.\n");
            return "Done.";
        }
    }
}
