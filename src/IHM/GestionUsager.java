package IHM;

import dao.connexion;
import dao.usagerController;
import utility.*;
//import static utility.Utility.YMDtoDMY;
//import static Utility.Utility.closeStatementResultSet;
//import static Utility.Utility.dateToStr;
//import static Utility.Utility.formatDate;
//import static Utility.Utility.initialiseRequetePreparee;
//import static Utility.Utility.showMessageSucces;
//import control.UsagerControl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
//import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;
import entity.usager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 * 
 * @author Diallo & Janati
 */
public class GestionUsager extends javax.swing.JFrame implements MouseListener {

    public GestionUsager() {

        initComponents();
        setResizable(false);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
        tableListeUsager.addMouseListener(this);
        tableListeUsager.setModel(new DefaultTableModel(new Object[0][0],new String[]{"Identifiant", "Nom","Prénom", "Date de naissance", "Sexe", "Téléphone", "Adresse"}));
        tableListeUsager.setRowHeight(30);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panRecherch = new javax.swing.JPanel();
        RecherchParLabel = new javax.swing.JLabel();
        RecherchField = new javax.swing.JFormattedTextField();
        RecherchCombo = new javax.swing.JComboBox();
        RecherchBouton = new javax.swing.JButton();
        panListeUsager = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListeUsager = new javax.swing.JTable();
        panAjoutUsager = new javax.swing.JPanel();
        panAjoutBas = new javax.swing.JPanel();
        civiliteLabel = new javax.swing.JLabel();
        prenomField = new javax.swing.JFormattedTextField();
        prenomLabel = new javax.swing.JLabel();
        nomLabel = new javax.swing.JLabel();
        telLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        nomField = new javax.swing.JFormattedTextField();
        civiliteCombo = new javax.swing.JComboBox();
        prenomLabel1 = new javax.swing.JLabel();
        adresseField = new javax.swing.JFormattedTextField();
        dateNaisPicker = new com.toedter.calendar.JDateChooser();
        telField = new javax.swing.JTextField();
        annulerBouton = new javax.swing.JButton();
        ajouterBouton = new javax.swing.JButton();
        modifierBouton = new javax.swing.JButton();
        supprimerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        retourButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Usagers");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setName("Gestion personnel"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1162, 608));
        jPanel1.setRequestFocusEnabled(false);

        panRecherch.setBackground(new java.awt.Color(204, 255, 255));
        panRecherch.setBorder(javax.swing.BorderFactory.createTitledBorder("Rechercher"));

        RecherchParLabel.setText("Rechercher par  ");

        RecherchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecherchField.setPreferredSize(new java.awt.Dimension(123, 26));

        RecherchCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Identifiant", "Nom", "Tout afficher" }));
        RecherchCombo.setPreferredSize(new java.awt.Dimension(123, 26));
        RecherchCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchComboActionPerformed(evt);
            }
        });

        RecherchBouton.setText("Rechercher");
        RecherchBouton.setPreferredSize(new java.awt.Dimension(47, 26));
        RecherchBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchBoutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRecherchLayout = new javax.swing.GroupLayout(panRecherch);
        panRecherch.setLayout(panRecherchLayout);
        panRecherchLayout.setHorizontalGroup(
            panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRecherchLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRecherchLayout.createSequentialGroup()
                        .addComponent(RecherchParLabel)
                        .addGap(41, 41, 41)
                        .addComponent(RecherchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panRecherchLayout.createSequentialGroup()
                        .addComponent(RecherchField, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RecherchBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        panRecherchLayout.setVerticalGroup(
            panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRecherchLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecherchParLabel)
                    .addComponent(RecherchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecherchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecherchBouton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panListeUsager.setBackground(new java.awt.Color(255, 255, 255));
        panListeUsager.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des Usagers"));

        jScrollPane1.getViewport().setBackground(Color.white);
        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableListeUsager.setBackground(new java.awt.Color(204, 255, 255));
        tableListeUsager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant", "Nom", "Prénom", "Date de naissance", "Sexe", "Téléphone", "Adresse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListeUsager.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableListeUsager.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableListeUsager);

        javax.swing.GroupLayout panListeUsagerLayout = new javax.swing.GroupLayout(panListeUsager);
        panListeUsager.setLayout(panListeUsagerLayout);
        panListeUsagerLayout.setHorizontalGroup(
            panListeUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panListeUsagerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panListeUsagerLayout.setVerticalGroup(
            panListeUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panAjoutUsager.setBackground(new java.awt.Color(255, 255, 255));
        panAjoutUsager.setBorder(javax.swing.BorderFactory.createTitledBorder("Ajout Usager"));

        panAjoutBas.setBackground(new java.awt.Color(204, 255, 255));
        panAjoutBas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        civiliteLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        civiliteLabel.setText("Civilité : ");

        prenomField.setPreferredSize(new java.awt.Dimension(123, 26));

        prenomLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prenomLabel.setText("Prénom  ");

        nomLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nomLabel.setText("Nom  ");

        telLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        telLabel.setText("Téléphone  ");

        dateLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dateLabel.setText("Date de naissance  ");

        nomField.setPreferredSize(new java.awt.Dimension(123, 26));

        civiliteCombo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        civiliteCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "Mme" }));
        civiliteCombo.setPreferredSize(new java.awt.Dimension(123, 26));

        prenomLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prenomLabel1.setText("Adresse");

        adresseField.setPreferredSize(new java.awt.Dimension(123, 26));

        telField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAjoutBasLayout = new javax.swing.GroupLayout(panAjoutBas);
        panAjoutBas.setLayout(panAjoutBasLayout);
        panAjoutBasLayout.setHorizontalGroup(
            panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutBasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAjoutBasLayout.createSequentialGroup()
                        .addComponent(civiliteLabel)
                        .addGap(118, 118, 118)
                        .addComponent(civiliteCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panAjoutBasLayout.createSequentialGroup()
                        .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telLabel)
                            .addComponent(dateLabel)
                            .addComponent(prenomLabel)
                            .addComponent(nomLabel)
                            .addComponent(prenomLabel1))
                        .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panAjoutBasLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(nomField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(prenomField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adresseField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panAjoutBasLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(dateNaisPicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAjoutBasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panAjoutBasLayout.setVerticalGroup(
            panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutBasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(civiliteLabel)
                    .addComponent(civiliteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomLabel)
                    .addComponent(nomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomLabel)
                    .addComponent(prenomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel)
                    .addComponent(dateNaisPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomLabel1)
                    .addComponent(adresseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telLabel)
                    .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        annulerBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
            }
        });

        ajouterBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ajouterBouton.setText("Ajouter");
        ajouterBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter(evt);
            }
        });

        modifierBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        modifierBouton.setText("Modifier");
        modifierBouton.setEnabled(false);
        modifierBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier(evt);
            }
        });

        supprimerButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        supprimerButton.setText("Supprimer");
        supprimerButton.setEnabled(false);
        supprimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer(evt);
            }
        });

        javax.swing.GroupLayout panAjoutUsagerLayout = new javax.swing.GroupLayout(panAjoutUsager);
        panAjoutUsager.setLayout(panAjoutUsagerLayout);
        panAjoutUsagerLayout.setHorizontalGroup(
            panAjoutUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panAjoutBas, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panAjoutUsagerLayout.createSequentialGroup()
                .addComponent(annulerBouton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supprimerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modifierBouton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajouterBouton)
                .addGap(10, 10, 10))
        );
        panAjoutUsagerLayout.setVerticalGroup(
            panAjoutUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutUsagerLayout.createSequentialGroup()
                .addComponent(panAjoutBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panAjoutUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterBouton)
                    .addComponent(modifierBouton)
                    .addComponent(annulerBouton)
                    .addComponent(supprimerButton)))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Gestion Des Usagers");

        retourButton.setText("Retour");
        retourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panAjoutUsager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(retourButton)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panRecherch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panListeUsager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retourButton)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panRecherch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panListeUsager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panAjoutUsager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1164, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(1178, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void annulerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        clearField();
        modifierBouton.setEnabled(false);
        supprimerButton.setEnabled(false);
        ajouterBouton.setEnabled(true);
        
    }//GEN-LAST:event_annulerBoutonActionPerformed

    private void retourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourButtonActionPerformed
        Menu m = new Menu();
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_retourButtonActionPerformed

    private void modifier(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier

//        try {
//            usager usager = getUsagerInfos();
//            UsagerControl.modifier(usager);
//            setIdentifiant();
//            clearField();
//            ((DefaultTableModel) tableListeUsager.getModel()).updateRow(
//                    new Object[]{usager.getId(), usager.getNom(), usager.getPrenom(),
//                        dateToStr(usager.getDateNais()), usager.getSexe(),
//                        usager.getTel(), usager.getAdresse()},
//                    tableListeUsager.getSelectedRow());
//            modifierBouton.setEnabled(false);
//            supprimerButton.setEnabled(false);
//            ajouterBouton.setEnabled(true);
//            showMessageSucces("Les modifications ont été enregistrées");
//        } catch (ErrorException e) {
//            System.out.println("IHM.GestionUsager.modifierBoutonActionPerformed()");
//        }
    }//GEN-LAST:event_modifier

    private void supprimer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer
        try {
            usager usager = getUsagerInfos();
            usagerController.supprimerUsager(usager);
            JOptionPane.showMessageDialog(null,"L'enregistrement a bien été supprimé");
            //setIdentifiant();
            clearField();
            ((DefaultTableModel) tableListeUsager.getModel()).removeRow(tableListeUsager.getSelectedRow());
            modifierBouton.setEnabled(false);
            supprimerButton.setEnabled(false);
            ajouterBouton.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Impossible de supprimer cet usager");
        }
    }//GEN-LAST:event_supprimer

    private void RecherchBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecherchBoutonActionPerformed
//        String rechPar = RecherchCombo.getSelectedItem().toString();
//        String textARechercher = RecherchField.getText().trim();
//        if (textARechercher.length() > 0) {
//            ArrayList<Usager> listUsagers;
//            try {
//                switch (rechPar) {
//                    case "Identifiant":
//                        int identifiant = parseInt(textARechercher);
//                        Usager usager = UsagerControl.findById(identifiant);
//                        fillUsagerJtable(new ArrayList<Usager>() {
//                            {
//                                add(usager);
//                            }
//                        });
//                        break;
//                    case "Nom":
//                        listUsagers = UsagerControl.findByNom(textARechercher);
//                        fillUsagerJtable(listUsagers);
//                        break;
//                    case "Tout afficher":
//                        listUsagers = UsagerControl.getListUsagers();
//                        fillUsagerJtable(listUsagers);
//                        break;
//                }
//            } catch (ErrorException e) {
//                System.out.println("IHM.GestionUsager.RecherchBoutonActionPerformed() : Erreurs");
//            } catch (NumberFormatException e) {
//                showMessageSucces("Identifiant non valide");
//            }
//        }
    }//GEN-LAST:event_RecherchBoutonActionPerformed

    private void RecherchComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecherchComboActionPerformed

        if (RecherchCombo.getSelectedItem().equals("Tout afficher")) {
            try {
                ArrayList<usager> listUsagers = usagerController.getAll();
                fillUsagerJtable(listUsagers);
                RecherchBouton.setEnabled(false);
                RecherchField.setEnabled(false);
            } catch (Exception e) {
                System.out.println("IHM.GestionUsager.RecherchComboActionPerformed() : Erreurs");
            }
        } else {
            RecherchBouton.setEnabled(true);
            RecherchField.setEnabled(true);
        }
    }//GEN-LAST:event_RecherchComboActionPerformed

    private void ajouter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter
        try {
            usager usager = getUsagerInfos();
            usagerController.ajouterUsager(usager);
            //setIdentifiant();
            clearField();
            ((DefaultTableModel) tableListeUsager.getModel()).addRow(
                    new Object[]{usager.getId(), usager.getNom(), usager.getPrenom(),
                        usager.getDateNais(), usager.getSexe(),
                        usager.getTel(), usager.getAdresse()});
            JOptionPane.showMessageDialog(null,"Usager ajouté avec succès");
            clearField();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ajouter

    private void telFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telFieldActionPerformed
        
    }//GEN-LAST:event_telFieldActionPerformed
    
    private usager getUsagerInfos() {
        //int identifiant = parseInt(identifiantField.getText());
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        Date dateNais = (java.sql.Date)dateNaisPicker.getDate();
        String sexe = civiliteCombo.getSelectedItem().toString();
        String adresse = adresseField.getText();
        String tel = telField.getText().replace("-", "").trim();
        return new usager(0, nom, prenom, (java.sql.Date)dateNais, sexe, adresse, tel);
    }

    private void fillUsagerJtable(ArrayList<usager> listUsagers) {
        String titre[] = new String[]{"Identifiant", "Nom",
            "Prénom", "Date de naissance", "Sexe", "Téléphone", "Adresse"};
        if (listUsagers.size() > 0) {
            int nbLigne = (null == listUsagers.get(0)) ? 0 : listUsagers.size();
            Object data[][] = new Object[nbLigne][titre.length];
            for (int i = 0; i < nbLigne; i++) {
                usager usager = listUsagers.get(i);
                data[i][0] = usager.getId();
                data[i][1] = usager.getNom();
                data[i][2] = usager.getPrenom();
                data[i][3] = usager.getDateNais();
                data[i][4] = usager.getSexe();
                data[i][5] = usager.getTel();
                data[i][6] = usager.getAdresse();
            }
            DefaultTableModel model = new DefaultTableModel(data, titre);
            tableListeUsager.setModel(model);
            tableListeUsager.setRowHeight(30);
        } else {
            //afficher tableau vide
            Object data[][] = new Object[1][titre.length];
            DefaultTableModel model = new DefaultTableModel(data, titre);
            tableListeUsager.setModel(model);
            tableListeUsager.setRowHeight(1);
        }
    }

    private void clearField() {
        nomField.setText("");
        prenomField.setText("");
        adresseField.setText("");
        telField.setText("");
    }

//    private void setIdentifiant() {
//        PreparedStatement preparedStatement = null;
//        ResultSet resultSet = null;
//        try {
//            final String SQL_SELECT_ID = "SELECT id FROM usager ORDER BY id DESC LIMIT 1";
//            preparedStatement = initialiseRequetePreparee(connexion.getInstance().getConnection(),
//                    SQL_SELECT_ID, new Object[0]);
//            resultSet = preparedStatement.executeQuery();
//            int identifiant = 1;
//            if (resultSet.first()) {
//                identifiant = resultSet.getInt("id");
//            }
//            //identifiantField.setText((identifiant + 1) + "");
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Erreurs d'accès à la base de données" +e.getMessage(),
//                    "Erreurs", JOptionPane.ERROR_MESSAGE);
//        } 
//    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int row = tableListeUsager.getSelectedRow();
        int nbreCol = tableListeUsager.getColumnCount();

        Object dataLigneSelected[] = new Object[nbreCol];
        if (row >= 0) {
            for (int i = 0; i < nbreCol; i++) {
                dataLigneSelected[i] = tableListeUsager.getModel().getValueAt(row, i);
            }
            //identifiantField.setText(dataLigneSelected[0].toString());
            nomField.setText(dataLigneSelected[1].toString());
            prenomField.setText(dataLigneSelected[2].toString());
            try {
                SimpleDateFormat s= new SimpleDateFormat("yyyy-MM-dd");
                dateNaisPicker.setDate(s.parse(dataLigneSelected[3].toString()));
            } catch (Exception ex) {
                System.out.println("IHM.GestionUsager.mouseReleased()");
            }
            String sexe = dataLigneSelected[4].toString();
            String civilite = sexe.equalsIgnoreCase("M") ? "M" : "Mme";
            civiliteCombo.setSelectedItem(civilite);
            telField.setText(dataLigneSelected[5].toString());
            adresseField.setText(dataLigneSelected[6].toString());
            modifierBouton.setEnabled(true);
            supprimerButton.setEnabled(true);
            ajouterBouton.setEnabled(false);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecherchBouton;
    private javax.swing.JComboBox RecherchCombo;
    private javax.swing.JFormattedTextField RecherchField;
    private javax.swing.JLabel RecherchParLabel;
    private javax.swing.JFormattedTextField adresseField;
    private javax.swing.JButton ajouterBouton;
    private javax.swing.JButton annulerBouton;
    private javax.swing.JComboBox civiliteCombo;
    private javax.swing.JLabel civiliteLabel;
    private javax.swing.JLabel dateLabel;
    private com.toedter.calendar.JDateChooser dateNaisPicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifierBouton;
    private javax.swing.JFormattedTextField nomField;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JPanel panAjoutBas;
    private javax.swing.JPanel panAjoutUsager;
    private javax.swing.JPanel panListeUsager;
    private javax.swing.JPanel panRecherch;
    private javax.swing.JFormattedTextField prenomField;
    private javax.swing.JLabel prenomLabel;
    private javax.swing.JLabel prenomLabel1;
    private javax.swing.JButton retourButton;
    private javax.swing.JButton supprimerButton;
    private javax.swing.JTable tableListeUsager;
    private javax.swing.JTextField telField;
    private javax.swing.JLabel telLabel;
    // End of variables declaration//GEN-END:variables
    private usagerController usagerController = new usagerController();
}