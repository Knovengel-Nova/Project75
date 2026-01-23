package com.project75.jforms;

import javax.swing.DefaultListModel;
import com.project75.core.*;
import com.project75.jpanels.DailySubjectCard;
import com.project75.jpanels.DailySubjectCardHolderPanel;
import com.project75.jpanels.SubjectCard;
import com.project75.jpanels.subjectCardsHolderPanel;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aryan
 */
public class MainFrame extends javax.swing.JFrame {
    
    private Student studentUser;
    private Data data;
    private final int day;
    
    private DefaultListModel<Subject> listModel;
    private DefaultTableModel tableModel;
    
    private ArrayList<Subject> todaysSubject = new ArrayList<>();
    
    private final subjectCardsHolderPanel cardsHolder;
    private final DailySubjectCardHolderPanel dailyHolder;

    public Student getStudentUser(){
        return studentUser;
    }
    
    private void init() {
        this.listModel = new DefaultListModel<>();

        if (this.data.getTimetableData() == null) {
            this.tableModel = new DefaultTableModel(new Object[10][5], new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"});
            textAreaText.setText("Welcome "+studentUser.getStuName());
        } else {
            this.tableModel = new DefaultTableModel(this.data.getTimetableData(), this.data.getTimetableColumns());
            textAreaText.setText("Welcome Back "+studentUser.getStuName());
        }
        tableTable.setModel(tableModel);

        if (this.data.getListData() != null) {
            for (int i = 0; i < this.data.getListData().length; i++) {
                listModel.addElement(this.data.getListData()[i]);
            }
        }

        //  set model for listSubject list and listSecondaryList
        listSubjectLis.setModel(listModel);
        listSecondaryList.setModel(listModel);
    }

    public MainFrame(Student student) {
        
        this.studentUser = student;
        this.data = student.getStudentData();

        //  data retrieval
        day = Utility.getDayOfTheWeekInt();

        initComponents();
        labelNotes.setText("file: _"+studentUser.getStuUID()+"_DATA.ser loaded successfully from saves/"+studentUser.getStuUID());
        
        cardsHolder = new subjectCardsHolderPanel();
        dailyHolder = new DailySubjectCardHolderPanel(this);

        init();
        initDaily();

        //  initialze day date section
        labelDateOfTheMonth.setText(Utility.getDateOfTheMonth());
        labelDayOfTheWeek.setText(Utility.getDayOfTheWeek());
        labelMonthOfTheYear.setText(Utility.getMonthOfTheYear());
        labelYear.setText(Utility.getYear());
        //  set the CardHolder Panel

        loadSubjectCards();

        //  set up scroll panel for SubjectCards
        JScrollPane scroll = new JScrollPane(cardsHolder);
        scroll.setBorder(null);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        
        JScrollPane scroll2 = new JScrollPane(dailyHolder);
        scroll2.setBorder(null);
        scroll2.getVerticalScrollBar().setUnitIncrement(16);

        //  set border layout to accomodate Subject cards in 3xN form
        panelAttendanceStats.setLayout(new java.awt.BorderLayout());
        panelAttendanceStats.add(scroll, java.awt.BorderLayout.CENTER);
        
        panelDaily.setLayout(new java.awt.BorderLayout());
        panelDaily.add(scroll2, java.awt.BorderLayout.CENTER);
    }
    
    private void loadDailyCards(){
        for(int i=0; i<todaysSubject.size(); i++){
            DailySubjectCard temp = new DailySubjectCard(todaysSubject.get(i));
            dailyHolder.addDailyCard(temp);
        }
        
        dailyHolder.revalidate();
        dailyHolder.repaint();
    }

    private void initDaily() {
        todaysSubject.clear();
        if (day > 4) {
            return;
        }

        DefaultTableModel tt = tableModel;

        Object obj;

        for (int i = 0; i < tt.getRowCount(); i++) {
            if (tt.getValueAt(i, day) == null) {
                continue;
            }

            obj = tt.getValueAt(i, day);

            if (obj instanceof Subject) {
                todaysSubject.add((Subject) obj);
            }
        }
        
        loadDailyCards();

        System.out.println("Todays Subjects: ");
        for (Subject s : todaysSubject) {
            System.out.println(s);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        panelSubjectList = new javax.swing.JPanel();
        scrollPaneListScroll = new javax.swing.JScrollPane();
        listSubjectLis = new javax.swing.JList<>();
        scrollPaneTextScroll = new javax.swing.JScrollPane();
        textAreaText = new javax.swing.JTextArea();
        labelSubjects = new javax.swing.JLabel();
        buttonRemoveSubject = new javax.swing.JButton();
        buttonAddNewSubject = new javax.swing.JButton();
        panelAttendanceStats = new javax.swing.JPanel();
        panelTimeTable = new javax.swing.JPanel();
        scrollPaneTable = new javax.swing.JScrollPane();
        tableTable = new javax.swing.JTable();
        scrollPaneSecondaryList = new javax.swing.JScrollPane();
        listSecondaryList = new javax.swing.JList<>();
        buttonRemove = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        panelDayDate = new javax.swing.JPanel();
        labelDayOfTheWeek = new javax.swing.JLabel();
        labelDateOfTheMonth = new javax.swing.JLabel();
        labelMonthOfTheYear = new javax.swing.JLabel();
        labelYear = new javax.swing.JLabel();
        panelDaily = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelNotes = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemSave = new javax.swing.JMenuItem();
        menuItemLoad = new javax.swing.JMenuItem();
        menuItemQuit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project75");
        setMaximumSize(new java.awt.Dimension(1016, 600));
        setMinimumSize(new java.awt.Dimension(1016, 600));
        setResizable(false);

        listSubjectLis.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 24)); // NOI18N
        listSubjectLis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSubjectLisMouseClicked(evt);
            }
        });
        scrollPaneListScroll.setViewportView(listSubjectLis);

        textAreaText.setEditable(false);
        textAreaText.setColumns(20);
        textAreaText.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        textAreaText.setRows(5);
        scrollPaneTextScroll.setViewportView(textAreaText);

        labelSubjects.setFont(new java.awt.Font("Exo 2 ExtraBold", 1, 36)); // NOI18N
        labelSubjects.setForeground(new java.awt.Color(255, 255, 255));
        labelSubjects.setText("Subjects");

        buttonRemoveSubject.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 40)); // NOI18N
        buttonRemoveSubject.setForeground(new java.awt.Color(255, 255, 255));
        buttonRemoveSubject.setText("Remove Subject");
        buttonRemoveSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveSubjectActionPerformed(evt);
            }
        });

        buttonAddNewSubject.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 40)); // NOI18N
        buttonAddNewSubject.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddNewSubject.setText("Add New Subject");
        buttonAddNewSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddNewSubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSubjectListLayout = new javax.swing.GroupLayout(panelSubjectList);
        panelSubjectList.setLayout(panelSubjectListLayout);
        panelSubjectListLayout.setHorizontalGroup(
            panelSubjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSubjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSubjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTextScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addComponent(buttonRemoveSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAddNewSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelSubjectListLayout.setVerticalGroup(
            panelSubjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSubjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSubjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSubjectListLayout.createSequentialGroup()
                        .addComponent(labelSubjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPaneListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSubjectListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonAddNewSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonRemoveSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPaneTextScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        tabbedPane.addTab("Subject List", panelSubjectList);

        javax.swing.GroupLayout panelAttendanceStatsLayout = new javax.swing.GroupLayout(panelAttendanceStats);
        panelAttendanceStats.setLayout(panelAttendanceStatsLayout);
        panelAttendanceStatsLayout.setHorizontalGroup(
            panelAttendanceStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        panelAttendanceStatsLayout.setVerticalGroup(
            panelAttendanceStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Attendance Stats", panelAttendanceStats);

        tableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
            }
        ));
        tableTable.setToolTipText("Time Tabel");
        tableTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableTable.setShowGrid(true);
        tableTable.getTableHeader().setReorderingAllowed(false);
        tableTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTableMouseClicked(evt);
            }
        });
        scrollPaneTable.setViewportView(tableTable);

        listSecondaryList.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 14)); // NOI18N
        scrollPaneSecondaryList.setViewportView(listSecondaryList);

        buttonRemove.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 14)); // NOI18N
        buttonRemove.setText("Remove");
        buttonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveActionPerformed(evt);
            }
        });

        buttonAdd.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 14)); // NOI18N
        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        panelDayDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelDayOfTheWeek.setFont(new java.awt.Font("Exo 2 Medium", 3, 24)); // NOI18N
        labelDayOfTheWeek.setForeground(new java.awt.Color(255, 255, 255));
        labelDayOfTheWeek.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelDayOfTheWeek.setText("SATURDAY");

        labelDateOfTheMonth.setFont(new java.awt.Font("Exo 2 ExtraBold", 3, 110)); // NOI18N
        labelDateOfTheMonth.setForeground(new java.awt.Color(255, 255, 255));
        labelDateOfTheMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDateOfTheMonth.setText("17");

        labelMonthOfTheYear.setFont(new java.awt.Font("Exo 2 Medium", 3, 40)); // NOI18N
        labelMonthOfTheYear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMonthOfTheYear.setText("JANUARY");

        labelYear.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 36)); // NOI18N
        labelYear.setText("2026");

        javax.swing.GroupLayout panelDayDateLayout = new javax.swing.GroupLayout(panelDayDate);
        panelDayDate.setLayout(panelDayDateLayout);
        panelDayDateLayout.setHorizontalGroup(
            panelDayDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDayDateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDayDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMonthOfTheYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDayOfTheWeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelDayDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDateOfTheMonth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelDayDateLayout.setVerticalGroup(
            panelDayDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDayDateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelDayDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDayDateLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDayOfTheWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelMonthOfTheYear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(panelDayDateLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelDateOfTheMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout panelTimeTableLayout = new javax.swing.GroupLayout(panelTimeTable);
        panelTimeTable.setLayout(panelTimeTableLayout);
        panelTimeTableLayout.setHorizontalGroup(
            panelTimeTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimeTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTimeTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneSecondaryList, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTimeTableLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDayDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTimeTableLayout.setVerticalGroup(
            panelTimeTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTimeTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTimeTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTimeTableLayout.createSequentialGroup()
                        .addComponent(scrollPaneSecondaryList, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTimeTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panelDayDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Time Table", panelTimeTable);

        javax.swing.GroupLayout panelDailyLayout = new javax.swing.GroupLayout(panelDaily);
        panelDaily.setLayout(panelDailyLayout);
        panelDailyLayout.setHorizontalGroup(
            panelDailyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        panelDailyLayout.setVerticalGroup(
            panelDailyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Daily ", panelDaily);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Report", jPanel1);

        labelNotes.setBackground(new java.awt.Color(102, 102, 102));
        labelNotes.setFont(new java.awt.Font("Exo 2 SemiBold", 3, 14)); // NOI18N

        menuFile.setText("File");

        menuItemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project75/images/save.png"))); // NOI18N
        menuItemSave.setText("Save Data");
        menuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaveActionPerformed(evt);
            }
        });
        menuFile.add(menuItemSave);

        menuItemLoad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project75/images/sync.png"))); // NOI18N
        menuItemLoad.setText("Load Data");
        menuItemLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLoadActionPerformed(evt);
            }
        });
        menuFile.add(menuItemLoad);

        menuItemQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project75/images/quit.png"))); // NOI18N
        menuItemQuit.setText("Quit");
        menuItemQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemQuitActionPerformed(evt);
            }
        });
        menuFile.add(menuItemQuit);

        menuBar.add(menuFile);

        jMenu2.setText("Edit");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNotes, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //  pop addsubjectform 
    private void buttonAddNewSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddNewSubjectActionPerformed
        AddSubjectForm subForm = new AddSubjectForm(this);
        subForm.setVisible(true);
    }//GEN-LAST:event_buttonAddNewSubjectActionPerformed

    //  remove selected subject form subject list
    private void buttonRemoveSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveSubjectActionPerformed
        textAreaText.setText("");   //  clear the text area

        if (listSubjectLis.getSelectedIndex() != -1) {
//            textAreaText.append("Removed Subject: \""+listModel.getElementAt(listSubjectLis.getSelectedIndex())+"\"");
            labelNotes.setText("Removed Subject: \""+listModel.getElementAt(listSubjectLis.getSelectedIndex())+"\"");
            System.out.println("\"Removed Subject: \\\"\"+listModel.getElementAt(listSubjectLis.getSelectedIndex())+\"\\\"\"");
            Subject temp = listModel.getElementAt(listSubjectLis.getSelectedIndex());

            //  remove from Subject Cards
            cardsHolder.removeCard(temp, data.getSemester().getNoOfSubjects());

            //  remove subject from time table
            removeSubjectFromTable(temp);

            //  remove from semester class subjects array
            data.getSemester().removeSub(temp);

            //  remove from the model
            listModel.removeElementAt(listSubjectLis.getSelectedIndex());
        } else if (listModel.getSize() == 0) {  // if the list is empty
            labelNotes.setText("Subject List is Empty. Can't Delete");
            System.out.println("Subject List is Empty. Can't Delete");
        } else {     //if no student is selected
            labelNotes.setText("Please First select any subject from the Subject List.");
            System.out.println("Please First select any subject from the Subject List.");
        }
    }//GEN-LAST:event_buttonRemoveSubjectActionPerformed

    public void removeSubjectFromTable(Subject temp) {
        DefaultTableModel model = tableModel;
        for (int row = 0; row < model.getRowCount(); row++) {
            for (int col = 0; col < model.getColumnCount(); col++) {

                Object value = model.getValueAt(row, col);
                if (value == null) {
                    continue;
                }

                if (value instanceof Subject sub) {
                    if (sub.getSubCode().equalsIgnoreCase(temp.getSubCode())) {
                        model.setValueAt(null, row, col);
                    }
                }
            }
        }
    }

    //  display info about selected subject
    private void listSubjectLisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSubjectLisMouseClicked

        if (listSubjectLis.getSelectedIndex() == -1) { // if the list is empty
            return;
        }

        textAreaText.setText("");
        Subject temp = data.getSemester().getSubject(listSubjectLis.getSelectedIndex());
        String str
                = "Subject Code: " + temp.getSubCode() + "\n"
                + "Subject: " + temp.getSubName() + "\n"
                + "Subject Professor: " + temp.getSubProfessor() + "\n";
        textAreaText.append(str);
    }//GEN-LAST:event_listSubjectLisMouseClicked

    private void tableTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTableMouseClicked

    }//GEN-LAST:event_tableTableMouseClicked

    //  Time Table Add Button
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        if (listModel.getSize() == 0) {  //  check for subject list is empty or not
            labelNotes.setText("Subject List is Empty. Can't Add Null Subject to TimeTable");
            System.out.println("Subject List is Empty. Can't Add Null Subject to TimeTable");
            return;
        } else if (listSecondaryList.getSelectedIndex() == -1) {    //  if no subject is selected
            labelNotes.setText("Please Select a Valid Subject from the Subject List.");
            System.out.println("Please Select a Valid Subject from the Subject List.");
            return;
        }
        //  if no cell is selected from the table
        if (tableTable.getSelectedColumn() > 5 || tableTable.getSelectedColumn() < 0 || tableTable.getSelectedRow() > 10 || tableTable.getSelectedRow() < 0) {
            labelNotes.setText("Please First Select a valid cell from the Table.");
            System.out.println("Please First Select a valid cell from the Table.");
            return;
        }

        tableTable.setValueAt(listModel.getElementAt(listSecondaryList.getSelectedIndex()), tableTable.getSelectedRow(), tableTable.getSelectedColumn());
        labelNotes.setText("Subject: "+listModel.getElementAt(listSecondaryList.getSelectedIndex())+" Added into the Time Table at location ("+tableTable.getSelectedRow()+", "+tableTable.getSelectedColumn()+").");
        System.out.println("Subject: "+listModel.getElementAt(listSecondaryList.getSelectedIndex())+" Added into the Time Table at location ("+tableTable.getSelectedRow()+", "+tableTable.getSelectedColumn()+").");
    }//GEN-LAST:event_buttonAddActionPerformed

    //  Time Table cell data remove button
    private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveActionPerformed
        tableTable.setValueAt(null, tableTable.getSelectedRow(), tableTable.getSelectedColumn());
        labelNotes.setText("Subject Removed from the Time Table from location ("+tableTable.getSelectedRow()+", "+tableTable.getSelectedColumn()+").");
        System.out.println("Subject Removed from the Time Table from location ("+tableTable.getSelectedRow()+", "+tableTable.getSelectedColumn()+").");
    }//GEN-LAST:event_buttonRemoveActionPerformed

    //  file menu save button clicked
    private void menuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaveActionPerformed
        saveUIToData();
        studentUser.setStudentData(data);
        Utility.saveStudentDataFile(studentUser);
        labelNotes.setText("file: _"+studentUser.getStuUID()+"_DATA.ser saved successfully in saves/"+studentUser.getStuUID());
    }//GEN-LAST:event_menuItemSaveActionPerformed

    private void saveUIToData() {
        Subject[] lsData = new Subject[listModel.getSize()];
        for (int i = 0; i < lsData.length; i++) {
            lsData[i] = listModel.getElementAt(i);
        }
        data.setListData(lsData);

        int r = tableModel.getRowCount();
        int c = tableModel.getColumnCount();

        Subject[][] tbData = new Subject[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Object val = tableModel.getValueAt(i, j);
                if (val instanceof Subject) {
                    tbData[i][j] = (Subject) val;
                } else {
                    tbData[i][j] = null;
                }
            }
        }
        data.setTimetableData(tbData);
        data.setTimetableColumns(new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"});
    }

    //  file menu retrieve button clicked
    private void menuItemLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLoadActionPerformed
        this.data = studentUser.getStudentData();
        labelNotes.setText("file: _"+studentUser.getStuUID()+"_DATA.ser loaded successfully from saves/"+studentUser.getStuUID());
        reload();
    }//GEN-LAST:event_menuItemLoadActionPerformed

    private void menuItemQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemQuitActionPerformed

    //  after retrieval of data reload the mainFrame Components
    private void reload() {

        listModel.clear();

        if (data.getListData() != null) {
            for (Subject s : data.getListData()) {
                listModel.addElement(s);
            }
        }

        tableModel.setDataVector(data.getTimetableData(),data.getTimetableColumns());

        loadSubjectCards();
        initDaily();
    }

    //  set Teable model to the given table model
    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
        tableTable.setModel(tableModel);
        tableTable.setAutoCreateRowSorter(false);
        tableTable.getTableHeader().setReorderingAllowed(false);
        tableTable.revalidate();
        tableTable.repaint();
    }

    public void setSemester(Semester sem) {
        data.setSemester(sem);
    }

    public Semester getSemester() {
        return data.getSemester();
    }

    private void loadSubjectCards() {
        cardsHolder.removeAll();

        if (data.getListData() == null) {
            return;
        }

        for (Subject s : data.getListData()) {
            cardsHolder.addCard(new SubjectCard(s));
        }

        cardsHolder.revalidate();
        cardsHolder.repaint();
    }

    //  used to add subject to list using addnewsubjectform
    public void addSubjectToList(Subject subject) {

        if (data.getSemester().hasSubject(subject.getSubCode())) {
            labelNotes.setText("Subject: "+subject.toString()+" Already present in Subject List!");
            System.out.println("Subject: "+subject.toString()+" Already present in Subject List!");
            return;
        }
        listModel.addElement(subject);
        data.getSemester().addSub(subject);
        cardsHolder.addCard(new SubjectCard(subject));
        labelNotes.setText("Subject: "+subject.toString()+" Added in the Subject List!");
        System.out.println("Subject: "+subject.toString()+" Added in the Subject List!");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAddNewSubject;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JButton buttonRemoveSubject;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDateOfTheMonth;
    private javax.swing.JLabel labelDayOfTheWeek;
    private javax.swing.JLabel labelMonthOfTheYear;
    private javax.swing.JLabel labelNotes;
    private javax.swing.JLabel labelSubjects;
    private javax.swing.JLabel labelYear;
    private javax.swing.JList<Subject> listSecondaryList;
    private javax.swing.JList<Subject> listSubjectLis;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemLoad;
    private javax.swing.JMenuItem menuItemQuit;
    private javax.swing.JMenuItem menuItemSave;
    private javax.swing.JPanel panelAttendanceStats;
    private javax.swing.JPanel panelDaily;
    private javax.swing.JPanel panelDayDate;
    private javax.swing.JPanel panelSubjectList;
    private javax.swing.JPanel panelTimeTable;
    private javax.swing.JScrollPane scrollPaneListScroll;
    private javax.swing.JScrollPane scrollPaneSecondaryList;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JScrollPane scrollPaneTextScroll;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tableTable;
    private javax.swing.JTextArea textAreaText;
    // End of variables declaration//GEN-END:variables
}
