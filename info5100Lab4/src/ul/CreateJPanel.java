/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ul;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import model.Employee;
import model.EmployeeHistory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import sun.security.jca.GetInstance.Instance;

/**
 *
 * @author Clark
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
String filename = null;
byte[] person_image = null;
ImageIcon icon;


EmployeeHistory history;

    public CreateJPanel(JPanel rightPane, EmployeeHistory history) {
     this.history = history;
        initComponents();
    }
////
Employee employee;
   public CreateJPanel(Employee employee) {
     this.employee = employee;
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

        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        levelLabel = new javax.swing.JLabel();
        levelField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        emailField = new javax.swing.JTextField();
        cellphoneLabel = new javax.swing.JLabel();
        cellphoneField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        photoField = new javax.swing.JLabel();
        chooseButton = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();

        setAlignmentX(0.7F);
        setAlignmentY(0.7F);
        setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        setPreferredSize(new java.awt.Dimension(896, 849));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Employee Profile");
        titleLabel.setMaximumSize(new java.awt.Dimension(65, 14));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLabel.setText("Name");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ageLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ageLabel.setText("Age");

        levelLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        levelLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        levelLabel.setText("Level");

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cellphoneLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cellphoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cellphoneLabel.setText("CellPhone");

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLabel.setText("EmailAddress");

        genderLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        genderLabel.setText("Gender");

        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateLabel.setText("Start Date");

        photoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        photoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        photoLabel.setText("Photo");

        chooseButton.setText("choose");
        chooseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseButtonMouseClicked(evt);
            }
        });
        chooseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseButtonActionPerformed(evt);
            }
        });

        infoLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        infoLabel.setText("Contact Info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cellphoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cellphoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(levelField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(photoField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(chooseButton)
                        .addGap(6, 6, 6)))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(levelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(levelLabel))
                        .addGap(53, 53, 53)
                        .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cellphoneLabel)
                            .addComponent(cellphoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(chooseButton)
                                .addGap(87, 87, 87)
                                .addComponent(saveButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(photoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(photoField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(487, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {infoLabel, titleLabel});

    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:


Employee employee = history.addNewEmployee();
employee.setAge(ageField.getText());
employee.setCellPhonenumber(cellphoneField.getText());
employee.setEmailAddress(emailField.getText());
employee.setGender(genderField.getText());  
employee.setLevel(levelField.getText());  
employee.setName(nameField.getText()); 
employee.setStartDate(dateField.getText());
employee.setPhoto(photoField.getIcon().toString());



JOptionPane.showMessageDialog(this,"New Employee Information is added");


ageField.setText("");
cellphoneField.setText("");
emailField.setText("");
genderField.setText("");  
levelField.setText("");  
nameField.setText(""); 
dateField.setText("");
photoField.setIcon(null);







    }//GEN-LAST:event_saveButtonActionPerformed

    private void chooseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseButtonActionPerformed
        // TODO add your handling code here:
JFileChooser chooser = new JFileChooser();
chooser.showOpenDialog(null);
chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
String filepath = chooser.getSelectedFile().getPath();//System.out.println(filepath);
//employee.setPhoto(filepath);
//employee.setPhoto(filepath);
Icon icon= new ImageIcon(filepath);
photoField.setIcon(icon);
//System.out.println(ImageIcon);



    }//GEN-LAST:event_chooseButtonActionPerformed

    private void chooseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField cellphoneField;
    private javax.swing.JLabel cellphoneLabel;
    private javax.swing.JButton chooseButton;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JTextField levelField;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel photoField;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables




}
