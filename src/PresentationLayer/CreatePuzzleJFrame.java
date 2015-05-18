/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import BusinessLogic.Controller;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.SplitPaneUI;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author hasaan
 */
public class CreatePuzzleJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CreatePuzzleJFrame
     */
    private int gridSize;
    private Character[][] puzzleGrid;
    private LinkedHashMap<String, String> acrossAnsClueHM = null;
    private LinkedHashMap<String, String> downAnsClueHM = null;

    public CreatePuzzleJFrame() {
        //create table model

        initComponents();
        HelpfulStaticFunctions.locateAtCentre(this);

        //make jSpinners non-editable
        ((DefaultEditor) boxSizejSpinner.getEditor()).getTextField().setEditable(false);
        ((DefaultEditor) gridSizejSpinner.getEditor()).getTextField().setEditable(false);
        puzzlejTable.setGridColor(Color.BLACK);

        boxSizejSpinnerStateChanged(null);
//        gridSizejSpinner.setModel(new javax.swing.SpinnerNumberModel(4, 4, 150, 1));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        fileChooser1 = new javax.swing.JFileChooser();
        titlejLabel = new javax.swing.JLabel();
        controlsjPanel = new javax.swing.JPanel();
        gridSizejSpinner = new javax.swing.JSpinner();
        gridSizejLabel = new javax.swing.JLabel();
        boxSizejLabel = new javax.swing.JLabel();
        boxSizejSpinner = new javax.swing.JSpinner();
        settingsjButton = new javax.swing.JButton();
        fileNameLabel = new javax.swing.JLabel();
        boxSizejLabel1 = new javax.swing.JLabel();
        printablejPanel = new javax.swing.JPanel();
        mainjSplitPane = new javax.swing.JSplitPane();
        puzzlejPanel = new javax.swing.JPanel();
        puzzlejScrollPane = new javax.swing.JScrollPane();
        puzzlejTable = new javax.swing.JTable();
        cluesjPanel = new javax.swing.JPanel();
        cluesjSplitPane = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        acrossCluesjTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        downCluesjTextArea = new javax.swing.JTextArea();
        footjPanel = new javax.swing.JPanel();
        generatePuzzlejButton = new javax.swing.JButton();
        savePuzzlejButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crossword Puzzle Creator");
        setMinimumSize(null);
        setResizable(false);

        titlejLabel.setBackground(new java.awt.Color(204, 204, 204));
        titlejLabel.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        titlejLabel.setForeground(new java.awt.Color(204, 0, 0));
        titlejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlejLabel.setText("Crossword Puzzle Creator");
        titlejLabel.setToolTipText("");

        gridSizejSpinner.setModel(new javax.swing.SpinnerNumberModel(4, 4, 150, 1));
        gridSizejSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gridSizejSpinnerStateChanged(evt);
            }
        });

        gridSizejLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        gridSizejLabel.setText("Grid Size (N x N) :");

        boxSizejLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        boxSizejLabel.setText("Box Size:");

        boxSizejSpinner.setModel(new javax.swing.SpinnerNumberModel(40, 10, 90, 2));
        boxSizejSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                boxSizejSpinnerStateChanged(evt);
            }
        });

        settingsjButton.setText("Change");
        settingsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsjButtonActionPerformed(evt);
            }
        });

        fileNameLabel.setText("<Not Selected>");

        boxSizejLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        boxSizejLabel1.setText("Data Source:");

        javax.swing.GroupLayout controlsjPanelLayout = new javax.swing.GroupLayout(controlsjPanel);
        controlsjPanel.setLayout(controlsjPanelLayout);
        controlsjPanelLayout.setHorizontalGroup(
            controlsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsjPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(gridSizejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridSizejSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(boxSizejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxSizejSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boxSizejLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settingsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        controlsjPanelLayout.setVerticalGroup(
            controlsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(gridSizejSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(gridSizejLabel)
                .addComponent(boxSizejSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(boxSizejLabel)
                .addComponent(settingsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(boxSizejLabel1))
            .addComponent(fileNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        printablejPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        mainjSplitPane.setBorder(null);
        mainjSplitPane.setEnabled(false);
        mainjSplitPane.setFocusable(false);
        mainjSplitPane.setName(""); // NOI18N
        mainjSplitPane.setOpaque(false);
        mainjSplitPane.setRequestFocusEnabled(false);
        mainjSplitPane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainjSplitPaneMouseDragged(evt);
            }
        });
        mainjSplitPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainjSplitPaneMouseClicked(evt);
            }
        });

        puzzlejPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                puzzlejPanelMouseDragged(evt);
            }
        });

        puzzlejScrollPane.setEnabled(false);

        puzzlejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        puzzlejTable.setCellSelectionEnabled(false);
        puzzlejTable.setEnabled(false);
        puzzlejTable.setRowSelectionAllowed(false);
        puzzlejTable.setTableHeader(null);
        puzzlejScrollPane.setViewportView(puzzlejTable);

        javax.swing.GroupLayout puzzlejPanelLayout = new javax.swing.GroupLayout(puzzlejPanel);
        puzzlejPanel.setLayout(puzzlejPanelLayout);
        puzzlejPanelLayout.setHorizontalGroup(
            puzzlejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(puzzlejPanelLayout.createSequentialGroup()
                .addComponent(puzzlejScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 260, Short.MAX_VALUE))
        );
        puzzlejPanelLayout.setVerticalGroup(
            puzzlejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(puzzlejPanelLayout.createSequentialGroup()
                .addComponent(puzzlejScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 401, Short.MAX_VALUE))
        );

        mainjSplitPane.setLeftComponent(puzzlejPanel);

        cluesjSplitPane.setBorder(null);
        cluesjSplitPane.setDividerLocation(292);
        cluesjSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        cluesjSplitPane.setToolTipText("Drag to resize across and down clue areas");

        acrossCluesjTextArea.setEditable(false);
        acrossCluesjTextArea.setColumns(20);
        acrossCluesjTextArea.setLineWrap(true);
        acrossCluesjTextArea.setRows(5);
        jScrollPane1.setViewportView(acrossCluesjTextArea);

        cluesjSplitPane.setLeftComponent(jScrollPane1);

        downCluesjTextArea.setEditable(false);
        downCluesjTextArea.setColumns(20);
        downCluesjTextArea.setLineWrap(true);
        downCluesjTextArea.setRows(5);
        jScrollPane2.setViewportView(downCluesjTextArea);

        cluesjSplitPane.setRightComponent(jScrollPane2);

        javax.swing.GroupLayout cluesjPanelLayout = new javax.swing.GroupLayout(cluesjPanel);
        cluesjPanel.setLayout(cluesjPanelLayout);
        cluesjPanelLayout.setHorizontalGroup(
            cluesjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cluesjSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        cluesjPanelLayout.setVerticalGroup(
            cluesjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cluesjSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        mainjSplitPane.setRightComponent(cluesjPanel);

        javax.swing.GroupLayout printablejPanelLayout = new javax.swing.GroupLayout(printablejPanel);
        printablejPanel.setLayout(printablejPanelLayout);
        printablejPanelLayout.setHorizontalGroup(
            printablejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainjSplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        printablejPanelLayout.setVerticalGroup(
            printablejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainjSplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        generatePuzzlejButton.setText("Generate");
        generatePuzzlejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePuzzlejButtonActionPerformed(evt);
            }
        });

        savePuzzlejButton.setText("Save");
        savePuzzlejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePuzzlejButtonActionPerformed(evt);
            }
        });

        jCheckBox1.setText(" Show Answers");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footjPanelLayout = new javax.swing.GroupLayout(footjPanel);
        footjPanel.setLayout(footjPanelLayout);
        footjPanelLayout.setHorizontalGroup(
            footjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footjPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(savePuzzlejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(generatePuzzlejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addContainerGap())
        );
        footjPanelLayout.setVerticalGroup(
            footjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footjPanelLayout.createSequentialGroup()
                .addGroup(footjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(savePuzzlejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(footjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generatePuzzlejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titlejLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(printablejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(footjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controlsjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlsjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(printablejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(footjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsjButtonActionPerformed

        File dataFile = createJFileChooser();
        if (dataFile != null) {
            Controller c = Controller.getInstance();
            c.setAndLoadDataSource(dataFile);
            fileNameLabel.setText(dataFile.getName());
        }
    }//GEN-LAST:event_settingsjButtonActionPerformed

    private File createJFileChooser() {
//        final JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);

        fileChooser1.resetChoosableFileFilters();
        fileChooser1.setAcceptAllFileFilterUsed(false);

        fileChooser1.setDialogTitle("Select Datasource");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Plain Text files", "txt", "text");
        fileChooser1.setFileFilter(filter);

        if (fileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            return fileChooser1.getSelectedFile();
            //System.out.println(fileChooser.getSelectedFile().toString());
        }
        return null;
    }

    private void generatePuzzlejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePuzzlejButtonActionPerformed

        Controller controller = Controller.getInstance();
        if (controller.checkIfFileExist() == false) {
            JOptionPane.showMessageDialog(null, "Datasource not found. Kindly select a datasource.", "Datasource not found", JOptionPane.INFORMATION_MESSAGE);
        } else {
            gridSize = (int) gridSizejSpinner.getValue();

            puzzleGrid = new Character[gridSize][gridSize];
            acrossAnsClueHM = new LinkedHashMap<String, String>();
            downAnsClueHM = new LinkedHashMap<String, String>();

            jCheckBox1.setSelected(false);
            controller.generatePuzzle(puzzleGrid, acrossAnsClueHM, downAnsClueHM);

            Character[][] grid = new Character[gridSize][gridSize];
            for (int i = 0; i < gridSize; i++) {
                for (int j = 0; j < gridSize; j++) {
                    if (puzzleGrid[i][j] != '.') {
                        grid[i][j] = ' ';
                    } else {
                        grid[i][j] = '.';
                    }

                }
            }

            //set table model
            String[] nulls = new String[puzzleGrid.length];
            DefaultTableModel model = new javax.swing.table.DefaultTableModel(grid, nulls);
            puzzlejTable.setModel(model);
            //
//              for(int i=0;i<gridSize;i++)
//              {
//                  for(int j=0;j<gridSize;j++)
//                  {
//                      DefaultTableModel dtm = (DefaultTableModel) puzzlejTable.getModel();
//                      if(dtm.getValueAt(i, j).toString().matches(".")==true)
//                      {
//                         
//                      }
//                  }
//              }
            puzzlejTable.setDefaultRenderer(Object.class, new CustomCellRenderer());

            acrossCluesjTextArea.setText("");
            downCluesjTextArea.setText("");

            for (String key : acrossAnsClueHM.keySet()) {
                String value = acrossAnsClueHM.get(key);
                StringTokenizer strtok = new StringTokenizer(value, "**");
                int position = Integer.parseInt(strtok.nextToken());
                int wordNo = Integer.parseInt(strtok.nextToken());
                String clue = strtok.nextToken();

                acrossCluesjTextArea.append("" + wordNo + ". " + clue + "\n");

                for (int i = 0; i < gridSize; i++) {
                    for (int j = 0; j < gridSize; j++) {
                        if (puzzleGrid[i][j] != '.') {
                            if ((i * gridSize) + j == position) {
                                puzzlejTable.setValueAt(wordNo, i, j);
                            }
                        }
                    }
                }// bring cell number and then display starting point of word in grid

            }
            for (String key : downAnsClueHM.keySet()) {
                String value = downAnsClueHM.get(key);
                StringTokenizer strtok = new StringTokenizer(value, "**");
                int position = Integer.parseInt(strtok.nextToken());
                int wordNo = Integer.parseInt(strtok.nextToken());
                String clue = strtok.nextToken();

                downCluesjTextArea.append("" + wordNo + ". " + clue + "\n");

                for (int i = 0; i < gridSize; i++) {
                    for (int j = 0; j < gridSize; j++) {
                        if (puzzleGrid[i][j] != '.') {
                            if ((i * gridSize) + j == position) {
                                puzzlejTable.setValueAt(wordNo, i, j);
                            }
                        }
                    }
                }
            }

        }

    }//GEN-LAST:event_generatePuzzlejButtonActionPerformed


    private class CustomCellRenderer extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {
            Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (value != null) {
                String cellValue = value.toString();
                //set it so it can display unicode characters
                if (cellValue.compareTo(".") == 0) {
//                    System.out.println(cellValue);

                    cell.setFont(new Font("MS Mincho", Font.PLAIN, 5));
                    cell.setBackground(Color.BLACK);

                } else {
                    cell.setFont(new Font("MS Mincho", Font.PLAIN, 8));
                    cell.setBackground(Color.WHITE);
                }
            }
            //marks a cell red if it is a duplicate variable name
//            if(column == VARIABLE_COL)
//            {
//                
//                boolean dup = false;
//                String[] columnData = theTable.getColumnData(column);
//                //check if this is already in the list
//                for(int i =0; i < columnData.length; i++)
//                {
//                    String currTableValue = columnData[i];
//                    if(currTableValue.equals(cellValue) && i != row)
//                    {
//                        dup = true;
//                        break;
//                    }
//                }
//                //we found a dup
//                if(dup == true)
//                {
//                    cell.setBackground(Color.red);
//                }
//            }
            return cell;
        }
    }

    private void savePuzzlejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePuzzlejButtonActionPerformed
        fileChooser.resetChoosableFileFilters();
        fileChooser.setAcceptAllFileFilterUsed(false);

        fileChooser.setDialogTitle("Save Puzzle");
        
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("PDF", "pdf"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("JPEG", "jpeg"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("JPG", "jpg"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("PNG", "png"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("BMP", "bmp"));
        int r = fileChooser.showSaveDialog(printablejPanel);
        if (r == JFileChooser.APPROVE_OPTION) {

            String name = fileChooser.getSelectedFile().getAbsolutePath();
            String type = fileChooser.getFileFilter().getDescription();

            JPanel jPanelToPrint = printablejPanel;

            if (type.equals("PDF")) { //Save as pdf
                try {
//            Document document = new Document(PageSize.A4.rotate(), 50, 50, 50, 50);
                    Document document = new Document(PageSize.A4.rotate());
                    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(name+".pdf"));
                    document.open();
                    PdfContentByte cb = writer.getDirectContent();
                    PdfTemplate tp = cb.createTemplate(jPanelToPrint.getWidth(), jPanelToPrint.getHeight());
                    Graphics2D g2 = tp.createGraphics(jPanelToPrint.getWidth(), jPanelToPrint.getHeight());
                    //g2.scale(0.8, 1.0);
                    jPanelToPrint.print(g2);
                    g2.dispose();
                    cb.addTemplate(tp, 0, 0);
                    document.close();
                } catch (DocumentException ex) {
                    Logger.getLogger(CreatePuzzleJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CreatePuzzleJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else { //Save as image

                BufferedImage bi = ScreenImage.createImage(jPanelToPrint);
            try {
                ScreenImage.writeImage(bi, name+"."+type.toLowerCase());
            } catch (IOException ex) {
                Logger.getLogger(CreatePuzzleJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }        
        
    }//GEN-LAST:event_savePuzzlejButtonActionPerformed

    private void boxSizejSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_boxSizejSpinnerStateChanged
        //boxSize is new rows' width and columns' height 
        int boxSize = (int) boxSizejSpinner.getValue();

        //set new height for all rows
        puzzlejTable.setRowHeight(boxSize);

        //set new width for all columns
        TableColumnModel columnModel = puzzlejTable.getColumnModel();
        int columnCount = columnModel.getColumnCount();

        int newWidth = boxSize * columnCount + 4;
        int newHeight = boxSize * puzzlejTable.getRowCount() + 4;//+4 to avoid scroll bar
        Dimension d = new Dimension(newWidth, newHeight);
        puzzlejTable.setSize(d);
        puzzlejScrollPane.setSize(d);
        puzzlejScrollPane.setPreferredSize(d);
        //System.out.println("In BoxSizespinnerstate changed, PuzzleJpanel width:"+puzzlejPanel.getWidth());
//        for(int col=0; col< columnCount; col++){
//            columnModel.getColumn(col).setPreferredWidth(boxSize);
//        } 
    }//GEN-LAST:event_boxSizejSpinnerStateChanged

    private void gridSizejSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gridSizejSpinnerStateChanged
        //gridSize is no of rows and columns 
        gridSize = (int) gridSizejSpinner.getValue();

        puzzlejTable.setModel(new javax.swing.table.DefaultTableModel(gridSize, gridSize));
        acrossCluesjTextArea.setText("");
        downCluesjTextArea.setText("");
        boxSizejSpinnerStateChanged(evt);

//        //set new width for all columns
//        TableColumnModel columnModel = puzzlejTable.getColumnModel();
//        columnModel.addColumn(new TableColumn(WIDTH));
    }//GEN-LAST:event_gridSizejSpinnerStateChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            if (acrossAnsClueHM == null && downAnsClueHM == null) {
                jCheckBox1.setSelected(false);
                JOptionPane.showMessageDialog(null, "Nothing to display. Kindly generate the puzzle first.", "Nothing to display", JOptionPane.INFORMATION_MESSAGE);
            } else {

                //set table model
                String[] nulls = new String[puzzleGrid.length];
                DefaultTableModel model = new javax.swing.table.DefaultTableModel(puzzleGrid, nulls);
                puzzlejTable.setModel(model);

//              for(int i=0;i<gridSize;i++)
//              {
//                  for(int j=0;j<gridSize;j++)
//                  {
//                      DefaultTableModel dtm = (DefaultTableModel) puzzlejTable.getModel();
//                      if(dtm.getValueAt(i, j).toString().matches(".")==true)
//                      {
//                         
//                      }
//                  }
//              }
                puzzlejTable.setDefaultRenderer(Object.class, new CustomCellRenderer());

                acrossCluesjTextArea.setText("");
                downCluesjTextArea.setText("");

                for (String key : acrossAnsClueHM.keySet()) {
                    String value = acrossAnsClueHM.get(key);
                    StringTokenizer strtok = new StringTokenizer(value, "**");
                    int position = Integer.parseInt(strtok.nextToken());
                    int wordNo = Integer.parseInt(strtok.nextToken());
                    String clue = strtok.nextToken();

                    acrossCluesjTextArea.append("" + wordNo + ". " + clue + "\n");

                }
                for (String key : downAnsClueHM.keySet()) {
                    String value = downAnsClueHM.get(key);
                    StringTokenizer strtok = new StringTokenizer(value, "**");
                    int position = Integer.parseInt(strtok.nextToken());
                    int wordNo = Integer.parseInt(strtok.nextToken());
                    String clue = strtok.nextToken();

                    downCluesjTextArea.append("" + wordNo + ". " + clue + "\n");
                }
            }
        } else {
            Character[][] grid = new Character[gridSize][gridSize];
            for (int i = 0; i < gridSize; i++) {
                for (int j = 0; j < gridSize; j++) {
                    if (puzzleGrid[i][j] != '.') {
                        grid[i][j] = ' ';
                    } else {
                        grid[i][j] = '.';
                    }

                }
            }

            //set table model
            String[] nulls = new String[puzzleGrid.length];
            DefaultTableModel model = new javax.swing.table.DefaultTableModel(grid, nulls);
            puzzlejTable.setModel(model);
            //
//              for(int i=0;i<gridSize;i++)
//              {
//                  for(int j=0;j<gridSize;j++)
//                  {
//                      DefaultTableModel dtm = (DefaultTableModel) puzzlejTable.getModel();
//                      if(dtm.getValueAt(i, j).toString().matches(".")==true)
//                      {
//                         
//                      }
//                  }
//              }
            puzzlejTable.setDefaultRenderer(Object.class, new CustomCellRenderer());

            acrossCluesjTextArea.setText("");
            downCluesjTextArea.setText("");

            for (String key : acrossAnsClueHM.keySet()) {
                String value = acrossAnsClueHM.get(key);
                StringTokenizer strtok = new StringTokenizer(value, "**");
                int position = Integer.parseInt(strtok.nextToken());
                int wordNo = Integer.parseInt(strtok.nextToken());
                String clue = strtok.nextToken();

                acrossCluesjTextArea.append("" + wordNo + ". " + clue + "\n");

                for (int i = 0; i < gridSize; i++) {
                    for (int j = 0; j < gridSize; j++) {
                        if (puzzleGrid[i][j] != '.') {
                            if ((i * gridSize) + j == position) {
                                puzzlejTable.setValueAt(wordNo, i, j);
                            }
                        }
                    }
                }// bring cell number and then display starting point of word in grid

            }
            for (String key : downAnsClueHM.keySet()) {
                String value = downAnsClueHM.get(key);
                StringTokenizer strtok = new StringTokenizer(value, "**");
                int position = Integer.parseInt(strtok.nextToken());
                int wordNo = Integer.parseInt(strtok.nextToken());
                String clue = strtok.nextToken();

                downCluesjTextArea.append("" + wordNo + ". " + clue + "\n");

                for (int i = 0; i < gridSize; i++) {
                    for (int j = 0; j < gridSize; j++) {
                        if (puzzleGrid[i][j] != '.') {
                            if ((i * gridSize) + j == position) {
                                puzzlejTable.setValueAt(wordNo, i, j);
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    

    private void mainjSplitPaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainjSplitPaneMouseDragged
        // TODO add your handling code here:
        boxSizejSpinnerStateChanged(null);

    }//GEN-LAST:event_mainjSplitPaneMouseDragged

    private void puzzlejPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puzzlejPanelMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_puzzlejPanelMouseDragged

    private void mainjSplitPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainjSplitPaneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mainjSplitPaneMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea acrossCluesjTextArea;
    private javax.swing.JLabel boxSizejLabel;
    private javax.swing.JLabel boxSizejLabel1;
    private javax.swing.JSpinner boxSizejSpinner;
    private javax.swing.JPanel cluesjPanel;
    private javax.swing.JSplitPane cluesjSplitPane;
    private javax.swing.JPanel controlsjPanel;
    private javax.swing.JTextArea downCluesjTextArea;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JFileChooser fileChooser1;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JPanel footjPanel;
    private javax.swing.JButton generatePuzzlejButton;
    private javax.swing.JLabel gridSizejLabel;
    private javax.swing.JSpinner gridSizejSpinner;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane mainjSplitPane;
    private javax.swing.JPanel printablejPanel;
    private javax.swing.JPanel puzzlejPanel;
    private javax.swing.JScrollPane puzzlejScrollPane;
    private javax.swing.JTable puzzlejTable;
    private javax.swing.JButton savePuzzlejButton;
    private javax.swing.JButton settingsjButton;
    private javax.swing.JLabel titlejLabel;
    // End of variables declaration//GEN-END:variables

    private void updatePuzzleTable() {
    }
}
