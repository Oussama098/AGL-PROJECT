package IHM;


import dao.oeuvreController;
import entity.*;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Diallo & Janati
 */
public class ModificationOeuvre extends javax.swing.JDialog {

    public ModificationOeuvre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
    }

    public ModificationOeuvre(java.awt.Frame parent, boolean modal,
            oeuvre oeuvre) {
        this(parent, modal);
        //typeOeuvreCombo.setSelectedItem(oeuvre.getClass().getSimpleName());
        isbnfield.setText(oeuvre.getISBN());
        titreField.setText(oeuvre.getTitre());
        auteurField.setText(oeuvre.getAuteur());
        categorieField.setText(oeuvre.getCategorie());
        this.oeuvre = oeuvre;
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
        panAjoutOeuvre = new javax.swing.JPanel();
        panAjoutBas = new javax.swing.JPanel();
        identifiantLabel = new javax.swing.JLabel();
        auteurField = new javax.swing.JFormattedTextField();
        isbnfield = new javax.swing.JFormattedTextField();
        auteurLabel = new javax.swing.JLabel();
        titreLabel = new javax.swing.JLabel();
        titreField = new javax.swing.JFormattedTextField();
        categorieLabel = new javax.swing.JLabel();
        categorieField = new javax.swing.JFormattedTextField();
        modifierBouton = new javax.swing.JButton();
        annulerBouton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modification Oeuvre");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.setName("Gestion personnel"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1162, 608));
        jPanel1.setRequestFocusEnabled(false);

        panAjoutOeuvre.setBackground(new java.awt.Color(204, 255, 255));

        panAjoutBas.setBackground(new java.awt.Color(204, 255, 255));
        panAjoutBas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        identifiantLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        identifiantLabel.setText("ISBN");

        auteurField.setPreferredSize(new java.awt.Dimension(123, 26));

        isbnfield.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        isbnfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        isbnfield.setToolTipText("");
        isbnfield.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        isbnfield.setPreferredSize(new java.awt.Dimension(123, 26));

        auteurLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        auteurLabel.setText("Auteur");

        titreLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        titreLabel.setText("Titre");

        titreField.setPreferredSize(new java.awt.Dimension(123, 26));

        categorieLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        categorieLabel.setText("Catégorie");

        categorieField.setPreferredSize(new java.awt.Dimension(123, 26));

        modifierBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        modifierBouton.setText("Modifier");
        modifierBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier(evt);
            }
        });

        annulerBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
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
                        .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(auteurLabel)
                            .addComponent(titreLabel)
                            .addComponent(identifiantLabel)
                            .addComponent(categorieLabel))
                        .addGap(106, 106, 106)
                        .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(isbnfield, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(titreField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(auteurField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categorieField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAjoutBasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(annulerBouton)
                        .addGap(34, 34, 34)
                        .addComponent(modifierBouton)))
                .addContainerGap())
        );
        panAjoutBasLayout.setVerticalGroup(
            panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutBasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(identifiantLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(isbnfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titreLabel)
                    .addComponent(titreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(auteurLabel)
                    .addComponent(auteurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categorieLabel)
                    .addComponent(categorieField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifierBouton)
                    .addComponent(annulerBouton))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout panAjoutOeuvreLayout = new javax.swing.GroupLayout(panAjoutOeuvre);
        panAjoutOeuvre.setLayout(panAjoutOeuvreLayout);
        panAjoutOeuvreLayout.setHorizontalGroup(
            panAjoutOeuvreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAjoutOeuvreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panAjoutBas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panAjoutOeuvreLayout.setVerticalGroup(
            panAjoutOeuvreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutOeuvreLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panAjoutBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        titleLabel.setText("Modification");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panAjoutOeuvre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(2, 2, 2)
                .addComponent(panAjoutOeuvre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifier(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier

        try {
            oeuvre oe = getOeuvreInfos();
            oeuvreController.modifier(oe);
            ((DefaultTableModel) GestionOeuvres.tableListeOeuvre.getModel())
                    .setValueAt(new Object[]{oe.getId(), oe.getISBN(),oe.getTitre(), oe.getAuteur(),
                                oe.getCategorie()},
                            GestionOeuvres.tableListeOeuvre.getSelectedRow(),3);
            JOptionPane.showMessageDialog(null,"Oeuvre modifiée avec succès");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_modifier

    private void annulerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        this.dispose();
    }//GEN-LAST:event_annulerBoutonActionPerformed

    private oeuvre getOeuvreInfos() {
        //int identifiant = Integer.parseInt(identifiantField.getText());
        String isbn = isbnfield.getText();
        String titre = titreField.getText();
        String auteur = auteurField.getText();
        String categorie = categorieField.getText();
        
        
        return new oeuvre(isbn, titre, auteur, categorie);
    }

    private oeuvre oeuvre;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerBouton;
    private javax.swing.JFormattedTextField auteurField;
    private javax.swing.JLabel auteurLabel;
    private javax.swing.JFormattedTextField categorieField;
    private javax.swing.JLabel categorieLabel;
    private javax.swing.JLabel identifiantLabel;
    private javax.swing.JFormattedTextField isbnfield;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modifierBouton;
    private javax.swing.JPanel panAjoutBas;
    private javax.swing.JPanel panAjoutOeuvre;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JFormattedTextField titreField;
    private javax.swing.JLabel titreLabel;
    // End of variables declaration//GEN-END:variables
    private oeuvreController oeuvreController= new oeuvreController();
}