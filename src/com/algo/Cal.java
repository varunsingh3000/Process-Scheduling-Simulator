
package com.algo;


import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author varun
 */
public class Cal extends javax.swing.JFrame {
            InputStreamReader r=new InputStreamReader(System.in); 
        BufferedReader input=new BufferedReader(r);
     int optionfcfs=0,optionsjfnp=0,optionsjfp=0,optionpriority=0,optionrr=0;
    int count=0;
    
      String pno1;
      String at1;
      String bt1;
      String pri;
      String tt;
      int pno;
      int atime;
      int btime;
      int pp1;
      int ttime;
     public int i2=0,j2=0,k2=0,l2=0;
     public int i3=0,j3=0,k3=0,l3=0;
     public  int pn[]=new int[10];
     public  int at[]=new int[10];
     public  int bt[]=new int[10];
     public int pp[]=new int[10];
   
    /**
     * Creates new form Cal
     */
    public Cal() throws IOException {
        initComponents();
        Color backgroundcolor=new Color(200,204,255);
        this.getContentPane().setBackground(backgroundcolor);
        panelprocessdetails.setVisible(false);
        btstart.setEnabled(false);
        btresetoptions.setEnabled(false);
         lbltimedisplay.setVisible(false);
       lbltimequantum.setVisible(false);
       txttimequantum.setVisible(false);
        lblpriority.setVisible(false);
        txtpriority.setVisible(false);
        setVisible(true);
        
                                   
            
              
    }
     
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprocessdetails = new javax.swing.JPanel();
        txtprocessno = new javax.swing.JTextField();
        lblprocessno = new javax.swing.JLabel();
        txtarrivaltime = new javax.swing.JTextField();
        lblarrivaltime = new javax.swing.JLabel();
        txtbursttime = new javax.swing.JTextField();
        lblbursttime = new javax.swing.JLabel();
        btaddprocess = new javax.swing.JButton();
        btreset = new javax.swing.JButton();
        lblprocessdetails = new javax.swing.JLabel();
        lblpriority = new javax.swing.JLabel();
        txtpriority = new javax.swing.JTextField();
        btcalculate = new javax.swing.JButton();
        lbltimequantum = new javax.swing.JLabel();
        txttimequantum = new javax.swing.JTextField();
        lbltimedisplay = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableprocessdetails = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblselector = new javax.swing.JLabel();
        rbfcfs = new javax.swing.JRadioButton();
        rbsjfnp = new javax.swing.JRadioButton();
        rbsjfp = new javax.swing.JRadioButton();
        rbpriority = new javax.swing.JRadioButton();
        rbroundrobin = new javax.swing.JRadioButton();
        btstart = new javax.swing.JButton();
        btresetoptions = new javax.swing.JButton();
        btback = new javax.swing.JButton();
        btexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1000000000, 1000000000));

        txtprocessno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprocessnoKeyTyped(evt);
            }
        });

        lblprocessno.setText("Process No");

        txtarrivaltime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtarrivaltimeKeyTyped(evt);
            }
        });

        lblarrivaltime.setText("Arrival Time");

        txtbursttime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbursttimeKeyTyped(evt);
            }
        });

        lblbursttime.setText("Burst Time");

        btaddprocess.setText("Add Process");
        btaddprocess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddprocessActionPerformed(evt);
            }
        });

        btreset.setText("Reset Table");
        btreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresetActionPerformed(evt);
            }
        });

        lblprocessdetails.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblprocessdetails.setForeground(new java.awt.Color(255, 102, 102));
        lblprocessdetails.setText("Process Details");

        lblpriority.setText("Priority");

        btcalculate.setText("Calculate");
        btcalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcalculateActionPerformed(evt);
            }
        });

        lbltimequantum.setText("Time Quantum");

        tableprocessdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process No", "Arrival Time", "Burst Time", "Priority"
            }
        ));
        jScrollPane1.setViewportView(tableprocessdetails);

        javax.swing.GroupLayout panelprocessdetailsLayout = new javax.swing.GroupLayout(panelprocessdetails);
        panelprocessdetails.setLayout(panelprocessdetailsLayout);
        panelprocessdetailsLayout.setHorizontalGroup(
            panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprocessdetailsLayout.createSequentialGroup()
                .addGroup(panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprocessdetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprocessdetailsLayout.createSequentialGroup()
                                .addGroup(panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblprocessno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblarrivaltime, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblbursttime, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblpriority, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbltimequantum, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtarrivaltime, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(txtprocessno)
                                    .addComponent(txtbursttime)
                                    .addComponent(txtpriority)
                                    .addComponent(txttimequantum)))
                            .addComponent(lblprocessdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelprocessdetailsLayout.createSequentialGroup()
                                .addComponent(btaddprocess)
                                .addGap(66, 66, 66)
                                .addComponent(btcalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelprocessdetailsLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btreset, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltimedisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178))
        );
        panelprocessdetailsLayout.setVerticalGroup(
            panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprocessdetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblprocessdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(lbltimedisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprocessno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblprocessno))
                .addGap(4, 4, 4)
                .addGroup(panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprocessdetailsLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelprocessdetailsLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtarrivaltime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblarrivaltime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbursttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblbursttime))
                        .addGap(59, 59, 59)
                        .addGroup(panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpriority))
                        .addGap(62, 62, 62)
                        .addGroup(panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltimequantum)
                            .addComponent(txttimequantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(panelprocessdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btaddprocess)
                            .addComponent(btcalculate))
                        .addGap(52, 52, 52)
                        .addComponent(btreset)
                        .addGap(52, 52, 52))))
        );

        lblselector.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblselector.setForeground(new java.awt.Color(255, 0, 51));
        lblselector.setText("Choose your algo...");

        rbfcfs.setText("FCFS");
        rbfcfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbfcfsActionPerformed(evt);
            }
        });

        rbsjfnp.setText("SJF(NP)");
        rbsjfnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsjfnpActionPerformed(evt);
            }
        });

        rbsjfp.setText("SJF(PRE)");
        rbsjfp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsjfpActionPerformed(evt);
            }
        });

        rbpriority.setText("PRIORITY");
        rbpriority.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbpriorityMouseClicked(evt);
            }
        });
        rbpriority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbpriorityActionPerformed(evt);
            }
        });

        rbroundrobin.setText("ROUND ROBIN");
        rbroundrobin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbroundrobinActionPerformed(evt);
            }
        });

        btstart.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btstart.setText("Start");
        btstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstartActionPerformed(evt);
            }
        });

        btresetoptions.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btresetoptions.setText("Clear");
        btresetoptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresetoptionsActionPerformed(evt);
            }
        });

        btback.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btback.setText("Back ");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });

        btexit.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btexit.setText("Exit");
        btexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblselector, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(rbfcfs))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btstart, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(rbsjfnp)
                        .addGap(79, 79, 79)
                        .addComponent(rbsjfp)
                        .addGap(78, 78, 78)
                        .addComponent(rbpriority))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btresetoptions, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbroundrobin)
                    .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbfcfs)
                            .addComponent(rbsjfnp)
                            .addComponent(rbsjfp)
                            .addComponent(rbpriority)
                            .addComponent(rbroundrobin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btstart)
                            .addComponent(btresetoptions)
                            .addComponent(btback)
                            .addComponent(btexit)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblselector, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(panelprocessdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2605, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(panelprocessdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbpriorityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbpriorityMouseClicked
        
    }//GEN-LAST:event_rbpriorityMouseClicked

    private void rbsjfpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsjfpActionPerformed
      optionsjfp=1;
      
       btstart.setEnabled(true);
        btresetoptions.setEnabled(true);
  
    }//GEN-LAST:event_rbsjfpActionPerformed

    private void btaddprocessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddprocessActionPerformed
        
        if(optionpriority==0)
        {      
      
        DefaultTableModel model=(DefaultTableModel)tableprocessdetails.getModel();
        if(txtprocessno.getText().equals("")||(txtarrivaltime.getText().equals(""))||(txtbursttime.getText().equals("")))
            ;
        else{
            
            if(optionrr==1&&count==0){
                tt=txttimequantum.getText();
                ttime=Integer.parseInt(tt);
                lbltimequantum.setVisible(false);
                txttimequantum.setVisible(false);
                lbltimedisplay.setText("Time Quantum is\t  " +ttime);
                lbltimedisplay.setVisible(true);
            }
            pno1=txtprocessno.getText();
            at1=txtarrivaltime.getText();
            bt1=txtbursttime.getText();
             pno=Integer.parseInt(pno1);
             atime=Integer.parseInt(at1);
             btime=Integer.parseInt(bt1);
      
           pnarray(pno,atime,btime);
                model.addRow(new Object[]{pno,atime,btime,"-------------"});
            
                txtprocessno.setText("");//DON'T EVER PUT SPACE HERE...IT WILL BE THE BIGGEST MISTAKE OF YOUR ENGGINEERING,TRUST ME...          //IT WILL BE SETTING THE SPACE CHARACTER TO THE TEXTFIELD 
                txtarrivaltime.setText("");//DON'T EVER PUT SPACE HERE...IT WILL BE THE BIGGEST MISTAKE OF YOUR ENGGINEERING,TRUST ME...        //THE FIRST PROCESS WOULD GET ADDED TOT THE TABLE
                txtbursttime.setText("");//DON'T EVER PUT SPACE HERE...IT WILL BE THE BIGGEST MISTAKE OF YOUR ENGGINEERING,TRUST ME...          //BUT THE SECOND PROCESS WON'T AS IT EXPECTING AN INTEGER BUT YOU HAVE ALREADY
                count++;                                                                                                                        //SET A CHARACTER IN THAT TEXTFIELD. 
        
           
        }
        }
        if(optionpriority==1)
        {   
              lblpriority.setVisible(true);
        txtpriority.setVisible(true);
            DefaultTableModel model=(DefaultTableModel)tableprocessdetails.getModel();
        if(txtprocessno.getText().equals("")||txtarrivaltime.getText().equals("")||txtbursttime.getText().equals("")||txtpriority.getText().equals(""))
            ;
        else{
            if(optionrr==1&&count==0){
                tt=txttimequantum.getText();
                ttime=Integer.parseInt(tt);
                lbltimequantum.setVisible(false);
                txttimequantum.setVisible(false);
                lbltimedisplay.setText("Time Quantum is\t   " +ttime);
                lbltimedisplay.setVisible(true);
            }
            pno1=txtprocessno.getText();
            at1=txtarrivaltime.getText();
            bt1=txtbursttime.getText();
            pri=txtpriority.getText();
             pno=Integer.parseInt(pno1);
             atime=Integer.parseInt(at1);
             btime=Integer.parseInt(bt1);
             pp1=Integer.parseInt(pri);
            
      pnarray(pno,atime,btime,pp1);
        model.addRow(new Object[]{ pno,atime,btime,pp1});
        txtprocessno.setText("");//DON'T EVER PUT SPACE HERE...IT WILL BE THE BIGGEST MISTAKE OF YOUR ENGGINEERING,TRUST ME...
        txtarrivaltime.setText("");//DON'T EVER PUT SPACE HERE...IT WILL BE THE BIGGEST MISTAKE OF YOUR ENGGINEERING,TRUST ME...  //IT WILL BE SETTING THE SPACE CHARACTER TO THE TEXTFIELD 
        txtbursttime.setText("");//DON'T EVER PUT SPACE HERE...IT WILL BE THE BIGGEST MISTAKE OF YOUR ENGGINEERING,TRUST ME...    //THE FIRST PROCESS WOULD GET ADDED TOT THE TABLE
        txtpriority.setText("");//DON'T EVER PUT SPACE HERE...IT WILL BE THE BIGGEST MISTAKE OF YOUR ENGGINEERING,TRUST ME...     //BUT THE SECOND PROCESS WON'T AS IT EXPECTING AN INTEGER BUT YOU HAVE ALREADY
       count++;                                     }                                                                             //SET A CHARACTER IN THAT TEXTFIELD. 
        }
        
        
    }//GEN-LAST:event_btaddprocessActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        App a1=new App();
       dispose();
    }//GEN-LAST:event_btbackActionPerformed

    private void rbfcfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbfcfsActionPerformed
       optionfcfs=1;
    
        btstart.setEnabled(true);
        btresetoptions.setEnabled(true);
     
    }//GEN-LAST:event_rbfcfsActionPerformed

    private void rbsjfnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsjfnpActionPerformed
      optionsjfnp=1;
   
       btstart.setEnabled(true);
        btresetoptions.setEnabled(true);
 
    }//GEN-LAST:event_rbsjfnpActionPerformed

    private void rbpriorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbpriorityActionPerformed
        optionpriority=1;
       // DefaultTableModel model2=(DefaultTableModel)tableprocessdetails.getModel();
       
       lblpriority.setVisible(true);
        txtpriority.setVisible(true);
         btstart.setEnabled(true);
        btresetoptions.setEnabled(true);
    }//GEN-LAST:event_rbpriorityActionPerformed

    private void rbroundrobinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbroundrobinActionPerformed
      optionrr=1;
       
lbltimequantum.setVisible(true);
       txttimequantum.setVisible(true);
       btstart.setEnabled(true);
        btresetoptions.setEnabled(true);
     
    }//GEN-LAST:event_rbroundrobinActionPerformed

    private void btstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstartActionPerformed
             
                            
        panelprocessdetails.setVisible(true);
        rbfcfs.setEnabled(false);
       rbsjfnp.setEnabled(false);
       rbsjfp.setEnabled(false);
       rbpriority.setEnabled(false);
       rbroundrobin.setEnabled(false);
    }//GEN-LAST:event_btstartActionPerformed

    private void btresetoptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresetoptionsActionPerformed
                
                
                
                    
                    optionfcfs=0;
                    optionsjfnp=0;
                    optionsjfp=0;
                    optionpriority=0;
                    optionrr=0;
                   
                    DefaultTableModel model1=(DefaultTableModel)tableprocessdetails.getModel();
                    while(model1.getRowCount() > 0)
                    {
                    model1.removeRow(0);
                    }
                    
                    
                    
                    rbfcfs.setSelected(false);
                    rbsjfnp.setSelected(false);
                    rbsjfp.setSelected(false);
                    rbpriority.setSelected(false);
                    rbroundrobin.setSelected(false);
                    btstart.setEnabled(false);
                    btresetoptions.setEnabled(false);
                    panelprocessdetails.setVisible(false);
                    rbfcfs.setEnabled(true);
                    rbsjfnp.setEnabled(true);
                    rbsjfp.setEnabled(true);
                    rbpriority.setEnabled(true);
                    rbroundrobin.setEnabled(true);
                    lblpriority.setVisible(false);
                    txtpriority.setVisible(false);
                     lbltimequantum.setVisible(false);
                     txttimequantum.setVisible(false);
                    lbltimedisplay.setVisible(false);
                    
                  
          
                    
    
                
    }//GEN-LAST:event_btresetoptionsActionPerformed

    private void btresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresetActionPerformed
        DefaultTableModel model2=(DefaultTableModel)tableprocessdetails.getModel();
       while(model2.getRowCount() > 0)
{
    model2.removeRow(0);
}
    }//GEN-LAST:event_btresetActionPerformed

    
    
    private void btcalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcalculateActionPerformed
   
    
   
     if(optionfcfs==1||optionsjfp==1||optionsjfnp==1||optionpriority==1||optionrr==1)
     { 
     Result r1=new Result(pn,at,bt,pp,ttime,count,optionfcfs,optionsjfnp,optionsjfp,optionpriority,optionrr);
     dispose();
     }
     
             
    
                
   
    }//GEN-LAST:event_btcalculateActionPerformed

    private void txtprocessnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprocessnoKeyTyped
        
    }//GEN-LAST:event_txtprocessnoKeyTyped

    private void txtarrivaltimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtarrivaltimeKeyTyped
       
    }//GEN-LAST:event_txtarrivaltimeKeyTyped

    private void txtbursttimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbursttimeKeyTyped

    }//GEN-LAST:event_txtbursttimeKeyTyped

    private void btexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexitActionPerformed
       System.exit(1);
    }//GEN-LAST:event_btexitActionPerformed

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
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Cal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Cal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaddprocess;
    private javax.swing.JButton btback;
    private javax.swing.JButton btcalculate;
    private javax.swing.JButton btexit;
    private javax.swing.JButton btreset;
    private javax.swing.JButton btresetoptions;
    private javax.swing.JButton btstart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblarrivaltime;
    private javax.swing.JLabel lblbursttime;
    private javax.swing.JLabel lblpriority;
    private javax.swing.JLabel lblprocessdetails;
    private javax.swing.JLabel lblprocessno;
    private javax.swing.JLabel lblselector;
    private javax.swing.JLabel lbltimedisplay;
    private javax.swing.JLabel lbltimequantum;
    private javax.swing.JPanel panelprocessdetails;
    private javax.swing.JRadioButton rbfcfs;
    private javax.swing.JRadioButton rbpriority;
    private javax.swing.JRadioButton rbroundrobin;
    private javax.swing.JRadioButton rbsjfnp;
    private javax.swing.JRadioButton rbsjfp;
    private javax.swing.JTable tableprocessdetails;
    private javax.swing.JTextField txtarrivaltime;
    private javax.swing.JTextField txtbursttime;
    private javax.swing.JTextField txtpriority;
    private javax.swing.JTextField txtprocessno;
    private javax.swing.JTextField txttimequantum;
    // End of variables declaration//GEN-END:variables

    private void pnarray(int pno, int atime, int btime) {
        pn[i2]=pno;
        i2++;
        at[j2]=atime;
        j2++;
        bt[k2]=btime;
        k2++;
       
    }


    private void pnarray(int pno1, int at1, int bt1, int pt1) {
        pn[i3]=pno1;
        i3++;
        at[j3]=at1;
        j3++;
        bt[k3]=bt1;
        k3++;
        pp[l3]=pt1;
        l3++;
        
    }

   

   

   
   

    
}
