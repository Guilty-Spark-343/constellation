/*
 * Copyright 2010-2020 Australian Signals Directorate
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package au.gov.asd.tac.constellation.graph.utilities.hashmod;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.openide.awt.Mnemonics;
import org.openide.util.NbBundle;
import org.openide.util.NbBundle.Messages;

/**
 * UI panel for the entry of the hashmod attributes
 *
 * @author CrucisGamma
 */
@Messages(
        {
            "MSG_fg=Select foreground color",
            "MSG_bg=Select background color"
        })
public class HashmodPanel extends javax.swing.JPanel {

    private static final String HASHMOD_CSV_FILE = "user.home";
    private String hashmodCSVFileStr = "";

    /**
     * Creates new form HashmodPanel.
     *
     * @param hashmod The Hashmod to be used in the panel.
     */
    public HashmodPanel(final Hashmod hashmod) {
        initComponents();
    }

    public Hashmod getHashmod() {
        return new Hashmod(hashmodCSVFileStr);
    }

    public void setAttributeNames(final String key, final String attribute1, final String attribute2) {
        keyAttributeTextField.setText(key);
        value1AttributeTextField.setText(attribute1);
        if (attribute2 != null) {
            value2AttributeTextField.setText(attribute2);
        }
    }

    public boolean getCreateVertexes() {
        return createAllCheckbox.isSelected();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hashmodLabel = new JLabel();
        hashmodCSVFile = new JTextField();
        hashmodButton = new JButton();
        hashmodLabel1 = new JLabel();
        hashmodLabel2 = new JLabel();
        hashmodLabel3 = new JLabel();
        keyAttributeTextField = new JTextField();
        value1AttributeTextField = new JTextField();
        value2AttributeTextField = new JTextField();
        createAllCheckbox = new JCheckBox();
        hashmodLabel4 = new JLabel();

        Mnemonics.setLocalizedText(hashmodLabel, NbBundle.getMessage(HashmodPanel.class, "Hashmod.csv.label")); // NOI18N

        hashmodCSVFile.setText(NbBundle.getMessage(HashmodPanel.class, "Hashmod.csv.textfield")); // NOI18N

        Mnemonics.setLocalizedText(hashmodButton, NbBundle.getMessage(HashmodPanel.class, "Hashmod.csv.button")); // NOI18N
        hashmodButton.setMargin(new Insets(2, 0, 2, 0));
        hashmodButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                hashmodButtonActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(hashmodLabel1, NbBundle.getMessage(HashmodPanel.class, "HashmodPanel.hashmodLabel1.text")); // NOI18N

        Mnemonics.setLocalizedText(hashmodLabel2, NbBundle.getMessage(HashmodPanel.class, "HashmodPanel.hashmodLabel2.text")); // NOI18N

        Mnemonics.setLocalizedText(hashmodLabel3, NbBundle.getMessage(HashmodPanel.class, "HashmodPanel.hashmodLabel3.text")); // NOI18N

        keyAttributeTextField.setText(NbBundle.getMessage(HashmodPanel.class, "HashmodPanel.keyAttributeTextField.text")); // NOI18N
        keyAttributeTextField.setEnabled(false);
        keyAttributeTextField.setName("keyAttributeTextField"); // NOI18N

        value1AttributeTextField.setText(NbBundle.getMessage(HashmodPanel.class, "HashmodPanel.value1AttributeTextField.text")); // NOI18N
        value1AttributeTextField.setEnabled(false);
        value1AttributeTextField.setName("value1AttributeTextField"); // NOI18N

        value2AttributeTextField.setText(NbBundle.getMessage(HashmodPanel.class, "HashmodPanel.value2AttributeTextField.text")); // NOI18N
        value2AttributeTextField.setEnabled(false);
        value2AttributeTextField.setName("value2AttributeTextField"); // NOI18N

        Mnemonics.setLocalizedText(createAllCheckbox, NbBundle.getMessage(HashmodPanel.class, "HashmodPanel.createAllCheckbox.text")); // NOI18N

        Mnemonics.setLocalizedText(hashmodLabel4, NbBundle.getMessage(HashmodPanel.class, "HashmodPanel.hashmodLabel4.text")); // NOI18N

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(hashmodLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hashmodCSVFile))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(hashmodLabel2)
                            .addComponent(hashmodLabel1))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(keyAttributeTextField)
                            .addComponent(value1AttributeTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(hashmodLabel3)
                            .addComponent(hashmodLabel4))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createAllCheckbox)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(value2AttributeTextField))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hashmodButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(hashmodLabel)
                    .addComponent(hashmodButton)
                    .addComponent(hashmodCSVFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(hashmodLabel1)
                    .addComponent(keyAttributeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(hashmodLabel2)
                    .addComponent(value1AttributeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(hashmodLabel3)
                    .addComponent(value2AttributeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(createAllCheckbox)
                    .addComponent(hashmodLabel4))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hashmodButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_hashmodButtonActionPerformed
    {//GEN-HEADEREND:event_hashmodButtonActionPerformed
        final JFileChooser fc = new JFileChooser(System.getProperty(HASHMOD_CSV_FILE));
        final String hashmodCSV = hashmodCSVFile.getText().trim();
        if (!hashmodCSV.isEmpty()) {
            fc.setSelectedFile(new File(hashmodCSV));
        }
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setFileFilter(new FileNameExtensionFilter(("CSV files [.csv]"), "csv"));

        if (fc.showDialog(this, "Select a CSV for the Hashmod") == JFileChooser.APPROVE_OPTION) {
            final String fname = fc.getSelectedFile().getPath();
            hashmodCSVFile.setText(fname);
            hashmodCSVFileStr = fname;
            Hashmod thisHashmod = getHashmod();
            setAttributeNames(thisHashmod.getCSVKey(), thisHashmod.getCSVHeader(1), thisHashmod.getCSVHeader(2));

        }
    }//GEN-LAST:event_hashmodButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField hashmodCSVFile;
    private JCheckBox createAllCheckbox;
    private JTextField keyAttributeTextField;
    private JTextField value1AttributeTextField;
    private JTextField value2AttributeTextField;
    private JButton hashmodButton;
    private JLabel hashmodLabel;
    private JLabel hashmodLabel1;
    private JLabel hashmodLabel2;
    private JLabel hashmodLabel3;
    private JLabel hashmodLabel4;
    // End of variables declaration//GEN-END:variables
}
