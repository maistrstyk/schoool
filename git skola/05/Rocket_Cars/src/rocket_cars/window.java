/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocket_cars;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.DefaultListModel;
/**
 *
 * @author student
 */
public class window extends javax.swing.JFrame {

    
    DefaultListModel model = new DefaultListModel();
    /**
     * Creates new form window
     */
    public window() {
        initComponents();
        carList.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        removeMenu = new javax.swing.JMenuItem();
        removeAllMenu = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenuItem();
        openFileMenu = new javax.swing.JMenuItem();
        saveFileMenu = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        selectCars = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        carList = new javax.swing.JList<>();
        imageLabel = new javax.swing.JLabel();

        removeMenu.setText("Remove object");
        removeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMenuActionPerformed(evt);
            }
        });
        popupMenu.add(removeMenu);

        removeAllMenu.setText("Remove all");
        removeAllMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllMenuActionPerformed(evt);
            }
        });
        popupMenu.add(removeAllMenu);

        editMenu.setText("Edit object");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });
        popupMenu.add(editMenu);

        openFileMenu.setText("Open file");
        openFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileMenuActionPerformed(evt);
            }
        });
        popupMenu.add(openFileMenu);

        saveFileMenu.setText("Save file");
        saveFileMenu.setToolTipText("");
        saveFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileMenuActionPerformed(evt);
            }
        });
        popupMenu.add(saveFileMenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jméno");

        nameTextField.setToolTipText("Zadej jméno");
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        selectCars.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Octane", "Breakout", "Endo" }));

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        carList.setToolTipText("");
        carList.setComponentPopupMenu(popupMenu);
        jScrollPane1.setViewportView(carList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameTextField)
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addGap(113, 113, 113)
                        .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Cars auto;
        if (selectCars.getSelectedItem() == "Octane") {
            auto = new Octane(nameTextField.getText());
            imageLabel.setIcon(new javax.swing.ImageIcon("octane.png"));
        
        } else if(selectCars.getSelectedItem() == "Breakout") {
            auto = new Breakout(nameTextField.getText());
            imageLabel.setIcon(new javax.swing.ImageIcon("D:\\studenti\\IT3\\hluchnik\\pcv\\git skola\\05\\Rocket_Cars\\src\\image\\breakout.png"));
        
        } else {
            auto = new Endo(nameTextField.getText());
            imageLabel.setIcon(new javax.swing.ImageIcon("D:\\studenti\\IT3\\hluchnik\\pcv\\git skola\\05\\Rocket_Cars\\src\\image\\endo.png"));
        
        }
        model.addElement(auto);
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMenuActionPerformed
        int selectedIndex = carList.getSelectedIndex();
        if (selectedIndex != -1) {
            model.remove(selectedIndex);
        }
    }//GEN-LAST:event_removeMenuActionPerformed

    private void removeAllMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllMenuActionPerformed
        model.removeAllElements();
    }//GEN-LAST:event_removeAllMenuActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        if (carList.getSelectedIndex() > -1) {
            Cars car = (Cars) model.get(carList.getSelectedIndex());
            Edit dialog = new Edit(this, true, car);
            if (dialog.showDialog().equalsIgnoreCase("OK")) {
                model.setElementAt(dialog.getCar(), carList.getSelectedIndex());
            }
        }
    }//GEN-LAST:event_editMenuActionPerformed

    private void openFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileMenuActionPerformed
        try (BufferedReader br = new BufferedReader(new FileReader("soubor.txt"))) {
            String s;
            int i = 0;
            model.clear();
            while ((s = br.readLine()) != null) {
                if (i > 0) {
                    String[] attr = s.split(";");
                    Cars car;
                    if (attr[0].equalsIgnoreCase("Octane")) {
                        car = new Octane(attr[1]);
                    } else if(attr[0].equalsIgnoreCase("Breakout")){
                        car = new Breakout(attr[1]);
                    } else {
                        car = new Endo(attr[1]);
                    }
                    /*person.setAge(Integer.parseInt(attr[2]));
                    person.setHeight(Float.parseFloat(attr[3]));
                    person.setWeight(Integer.parseInt(attr[4]));*/
                    if (attr[2] == "GOALKEEPER") {
                        car.setPosition(Cars.Position.GOALKEEPER);
                    } else {
                        car.setPosition(Cars.Position.STRIKER);
                    }
                    
                    model.addElement(car);
                }
                i++;
            }
        } catch (Exception e) {
            System.err.println("Chyba při četení ze souboru.");
        }
    }//GEN-LAST:event_openFileMenuActionPerformed

    private void saveFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileMenuActionPerformed
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt"))) {
            bw.write("class;name;position");
            bw.newLine();
            for (int i = 0; i < model.getSize(); i++) {
                Cars car = (Cars) model.get(i);
                String output = car.getClass().getSimpleName() + ";"
                        + car.getName() + ";"
                        + car.getPosition();
                bw.write(output);
                if (i < model.getSize() - 1) {
                    bw.newLine();
                }
            }
            bw.flush();
        } catch (Exception e) {
            System.err.println("Do souboru se nepovedlo zapsat.");
        }
    }//GEN-LAST:event_saveFileMenuActionPerformed
  
    
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
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JList<String> carList;
    private javax.swing.JMenuItem editMenu;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JMenuItem openFileMenu;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JMenuItem removeAllMenu;
    private javax.swing.JMenuItem removeMenu;
    private javax.swing.JMenuItem saveFileMenu;
    private javax.swing.JComboBox<String> selectCars;
    // End of variables declaration//GEN-END:variables
}
