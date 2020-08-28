
package com.algo;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author varun
 */
public class Result extends javax.swing.JFrame {

   
    public float fatt=0;
    public float fawt=0;
    public float snpatttt=0;
    public float snpawttt=0;
    public float spreatt11=0;
    public float spreawt11=0;
    public float priatt=0;
    public float priawt=0;
    public float rrawt=0;
    public float rrtat=0;
    public int fc=0,sjnp=0,sjp=0,p=0,r=0;
    /**
     * Creates new form Result
     */
   String minawt,mintat;

    Result(int[] pn, int[] at, int[] bt,int pp[],int ttime, int count, int optionfcfs, int optionsjfnp, int optionsjfp,int optionpriority, int optionrr) {
   initComponents(); 
   Color backgroundcolor=new Color(200,204,255);
        this.getContentPane().setBackground(backgroundcolor);
        panelfcfs.setVisible(false);
        panelsjfnp.setVisible(false);
        panelsjfpre.setVisible(false);
        panelpriority.setVisible(false);
        panelrr.setVisible(false);
        setVisible(true);
        if(optionrr==1)
        {
            rr(pn,at,bt,ttime,count);
            panelrr.setVisible(true);
            r=1;
        }
        if(optionpriority==1)
         {  
             priority(pn,at,bt,pp,count);
             panelpriority.setVisible(true);
             p=1;
         }
        if(optionfcfs==1){
        fcfs(pn,at,bt,count);
         panelfcfs.setVisible(true);
         fc=1;
        }
        if(optionsjfnp==1){
            sjfnp(pn,at,bt,count);
         panelsjfnp.setVisible(true);
         sjnp=1;
        }
        if(optionsjfp==1){
            sjfpre(pn,at,bt,count);
        panelsjfpre.setVisible(true);
        sjp=1;
        }
        finalresult();
    }
    
    

    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelsjfnp = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablesjfnp = new javax.swing.JTable();
        lblsjfnp = new javax.swing.JLabel();
        lblsjfnptt = new javax.swing.JLabel();
        lblsjfnpwt = new javax.swing.JLabel();
        panelfcfs = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableresult = new javax.swing.JTable();
        lblfcfs = new javax.swing.JLabel();
        lblfcfsavgtt = new javax.swing.JLabel();
        lblfcfsavgwt = new javax.swing.JLabel();
        panelsjfpre = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablesjfpre = new javax.swing.JTable();
        lblsjfpre = new javax.swing.JLabel();
        lblsjfprett = new javax.swing.JLabel();
        lblsjfpreawt = new javax.swing.JLabel();
        lblfinalconclusion = new javax.swing.JLabel();
        btback = new javax.swing.JButton();
        lblfinalconclusion1 = new javax.swing.JLabel();
        btexit = new javax.swing.JButton();
        lblfinalresult = new javax.swing.JLabel();
        panelrr = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablerr = new javax.swing.JTable();
        lblrr = new javax.swing.JLabel();
        lblrrtt = new javax.swing.JLabel();
        lblrrwt = new javax.swing.JLabel();
        panelpriority = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablepriority = new javax.swing.JTable();
        lblpriority = new javax.swing.JLabel();
        lblpritt = new javax.swing.JLabel();
        lblpriwt = new javax.swing.JLabel();
        lblfinalresult1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablesjfnp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tablesjfnp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process No", "Arrival Time", "Burst Time", "Completion Time", "Turn around Time", "Waiting Time"
            }
        ));
        jScrollPane3.setViewportView(tablesjfnp);

        lblsjfnp.setText("SJF(NP)");

        javax.swing.GroupLayout panelsjfnpLayout = new javax.swing.GroupLayout(panelsjfnp);
        panelsjfnp.setLayout(panelsjfnpLayout);
        panelsjfnpLayout.setHorizontalGroup(
            panelsjfnpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsjfnpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelsjfnpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                    .addGroup(panelsjfnpLayout.createSequentialGroup()
                        .addGroup(panelsjfnpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsjfnpwt, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsjfnptt, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsjfnp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelsjfnpLayout.setVerticalGroup(
            panelsjfnpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsjfnpLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblsjfnp, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsjfnptt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsjfnpwt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableresult.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tableresult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process No", "Arrival Time", "Burst Time", "Completion Time", "Turn Around Time", "Waiting Time"
            }
        ));
        jScrollPane2.setViewportView(tableresult);

        lblfcfs.setText("FCFS");

        javax.swing.GroupLayout panelfcfsLayout = new javax.swing.GroupLayout(panelfcfs);
        panelfcfs.setLayout(panelfcfsLayout);
        panelfcfsLayout.setHorizontalGroup(
            panelfcfsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfcfsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelfcfsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfcfsavgwt, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfcfsavgtt, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfcfs))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelfcfsLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        panelfcfsLayout.setVerticalGroup(
            panelfcfsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfcfsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblfcfs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfcfsavgtt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblfcfsavgwt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );

        tablesjfpre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tablesjfpre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process No", "Arrival Time", "Burst Time", "Completion Time", "Turn around Time", "Waiting Time"
            }
        ));
        jScrollPane4.setViewportView(tablesjfpre);

        lblsjfpre.setText("SJF(PRE)");

        javax.swing.GroupLayout panelsjfpreLayout = new javax.swing.GroupLayout(panelsjfpre);
        panelsjfpre.setLayout(panelsjfpreLayout);
        panelsjfpreLayout.setHorizontalGroup(
            panelsjfpreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsjfpreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelsjfpreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                    .addGroup(panelsjfpreLayout.createSequentialGroup()
                        .addGroup(panelsjfpreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsjfpreawt, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsjfprett, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsjfpre, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelsjfpreLayout.setVerticalGroup(
            panelsjfpreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsjfpreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblsjfpre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblsjfprett, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblsjfpreawt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblfinalconclusion.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblfinalconclusion.setForeground(new java.awt.Color(255, 0, 51));

        btback.setText("Back");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });

        lblfinalconclusion1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblfinalconclusion1.setForeground(new java.awt.Color(255, 0, 51));

        btexit.setText("Exit");
        btexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexitActionPerformed(evt);
            }
        });

        lblfinalresult.setFont(new java.awt.Font("Times New Roman", 3, 38)); // NOI18N
        lblfinalresult.setForeground(new java.awt.Color(204, 51, 0));

        tablerr.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tablerr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process No", "Arrival Time", "Burst Time", "Completion Time", "Turn around Time", "Waiting Time"
            }
        ));
        jScrollPane1.setViewportView(tablerr);

        lblrr.setText("ROUND ROBIN");

        javax.swing.GroupLayout panelrrLayout = new javax.swing.GroupLayout(panelrr);
        panelrr.setLayout(panelrrLayout);
        panelrrLayout.setHorizontalGroup(
            panelrrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelrrLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelrrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                    .addGroup(panelrrLayout.createSequentialGroup()
                        .addGroup(panelrrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblrrwt, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblrrtt, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblrr, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelrrLayout.setVerticalGroup(
            panelrrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelrrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblrr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblrrtt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblrrwt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablepriority.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tablepriority.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process No", "Priority", "Arrival Time", "Burst Time", "Completion Time", "Turn around Time", "Waiting Time"
            }
        ));
        jScrollPane5.setViewportView(tablepriority);

        lblpriority.setText("PRIORITY");

        javax.swing.GroupLayout panelpriorityLayout = new javax.swing.GroupLayout(panelpriority);
        panelpriority.setLayout(panelpriorityLayout);
        panelpriorityLayout.setHorizontalGroup(
            panelpriorityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpriorityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelpriorityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                    .addGroup(panelpriorityLayout.createSequentialGroup()
                        .addGroup(panelpriorityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpriwt, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpritt, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpriority, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelpriorityLayout.setVerticalGroup(
            panelpriorityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelpriorityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblpriority, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpritt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblpriwt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        lblfinalresult1.setFont(new java.awt.Font("Times New Roman", 3, 38)); // NOI18N
        lblfinalresult1.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelfcfs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelsjfpre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblfinalresult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(lblfinalresult1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelsjfnp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelrr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelpriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(lblfinalconclusion1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblfinalconclusion, javax.swing.GroupLayout.PREFERRED_SIZE, 1326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1606, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelsjfnp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelfcfs, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelsjfpre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelpriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblfinalresult, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblfinalresult1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(panelrr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(lblfinalconclusion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblfinalconclusion1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        try {
            Cal v=new Cal();
        } catch (IOException ex) {
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btbackActionPerformed

    private void btexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btexitActionPerformed

   
    
  
private void fcfs(int[] pn, int[] at, int[] bt, int count) {
        DefaultTableModel model2=(DefaultTableModel) tableresult.getModel();
        int n=count,i;
       
                int pid[] = new int[n];   // process ids
		int at1[] = new int[n];     // arrival times
		int bt1[] = new int[n];     // burst or execution times
		int ct1[] = new int[n];     // completion times
		int tat1[] = new int[n];     // turn around times
		int wt1[] = new int[n];     // waiting times 
		int temp;
		float avgwt1=0,avgta1=0;
        for(i=0;i<n;i++)
        {
            pid[i]=pn[i];
            at1[i]=at[i];
            bt1[i]=bt[i];
        }
        
      //sorting according to arrival times
		for( i = 0 ; i <n; i++)
		{
			for(int  j=0;  j < n-(i+1) ; j++)
			{
				if( at1[j] > at1[j+1] )
				{
					temp = at1[j];
					at1[j] = at1[j+1];
					at1[j+1] = temp;
					temp = bt1[j];
					bt1[j] = bt1[j+1];
					bt1[j+1] = temp;
					temp = pid[j];
					pid[j] = pid[j+1];
					pid[j+1] = temp;
				}
			}
		}
		
		// finding completion times
		for(i = 0 ; i < n; i++)
		{
			if( i == 0)
			{	
				ct1[i] = at1[i] + bt1[i];
			}
			else
			{
				if( at1[i] > ct1[i-1])
				{
					ct1[i] = at1[i] + bt1[i];
				}
				else
					ct1[i] = ct1[i-1] + bt1[i];
			}
			tat1[i] = ct1[i] - at1[i] ;          // turnaround time= completion time- arrival time
			wt1[i] = tat1[i] - bt1[i] ;          // waiting time= turnaround time- burst time
			avgwt1 += wt1[i] ;               // total waiting time
			avgta1 += tat1[i] ;               // total turnaround time
		}
                
		
		//System.out.println("\npid  arrival  brust  complete turn waiting");
		for(i = 0 ; i< n;  i++)
		{
                     model2.addRow(new Object[]{pid[i],at1[i],bt1[i],ct1[i],tat1[i],wt1[i]});
		//	System.out.println(pid[i] + "  \t " + at1[i] + "\t" + bt1[i] + "\t" + ct1[i] + "\t" + tat1[i] + "\t"  + wt1[i] ) ;
		}
	float fatt1=(float)avgta1/(float)n;
             float  fawt1=(float)avgwt1/(float)n;
             fatt=fatt1;
             fawt=fawt1;
            lblfcfsavgtt.setText("Average Turn around Time is "+fatt1);
            lblfcfsavgwt.setText("Average Waiting Time is "+fawt1);
             //   model2.addRow(new Object[]{fawt1,fatt1});
		//System.out.println("\naverage waiting time: "+ (avgwt1/n));     // printing average waiting time.
		//System.out.println("average turnaround time:"+(avgta1/n));    // printing average turnaround time.
	}
    
private void sjfnp(int[] pn,int at[], int[] bt, int count) {
        DefaultTableModel model3=(DefaultTableModel) tablesjfnp.getModel();
        int i,j,temp;
        int n=count;
        int pid[]=new int[n];
        int at1[]=new int[n];
        int bt1[]=new int[n];
        int ct1[]=new int[n];
        int tat1[]=new int[n];
        int wt1[]=new int[n];
        int f[]=new int[n];
        int st=0,tot=0;
        float avgwt=0,avgta=0;
        for(i=0;i<n;i++)
        {
            pid[i]=pn[i];
            at1[i]=at[i];
            bt1[i]=bt[i];
        }
        for( i = 0 ; i <n; i++)
		{
			for(  j=0;  j < n-(i+1) ; j++)
			{
				if( at1[j] > at1[j+1] )
				{
					temp = at1[j];
					at1[j] = at1[j+1];
					at1[j+1] = temp;
					temp = bt1[j];
					bt1[j] = bt1[j+1];
					bt1[j+1] = temp;
					temp = pid[j];
					pid[j] = pid[j+1];
					pid[j+1] = temp;
				}
			}
		}
		
        boolean a = true;
		while(true)
		{
			int c=n, min=999;
			if (tot == n) // total no of process = completed process loop will be terminated
				break;
			
			for ( i=0; i<n; i++)
			{
				/*
				 * If i'th process arrival time <= system time and its flag=0 and burst<min 
				 * That process will be executed first 
				 */ 
				if ((at1[i] <= st) && (f[i] == 0) && (bt1[i]<min))
				{
					min=bt1[i];
					c=i;
				}
			}
			
			/* If c==n means c value can not updated because no process arrival time< system time so we increase the system time */
			if (c==n) 
				st++;
			else
			{
				ct1[c]=st+bt1[c];
				st+=bt1[c];
				tat1[c]=ct1[c]-at1[c];
				wt1[c]=tat1[c]-bt1[c];
				f[c]=1;
				tot++;
			}
		}
                
             //   System.out.println("\npid  arrival brust  complete turn waiting");
		for( i=0;i<n;i++)
		{
			avgwt+= wt1[i];
			avgta+= tat1[i];
                        model3.addRow(new Object[]{pid[i],at1[i],bt1[i],ct1[i],tat1[i],wt1[i]});
			//System.out.println(pid[i]+"\t"+at1[i]+"\t"+bt1[i]+"\t"+ct1[i]+"\t"+tat1[i]+"\t"+wt1[i]);
		}
                float snpatttt1=(float)avgta/(float)n;
                 float snpawttt1=(float)avgwt/(float)n;
                 snpatttt=snpatttt1;
                 snpawttt=snpawttt1;
               // model3.addRow(new Object[]{snpawttt1,snpatttt1});
               lblsjfnptt.setText("Average Turn around Time is "+snpatttt1);
               lblsjfnpwt.setText("Average Waiting Time is "+snpawttt1);
	//	System.out.println ("\naverage tat is "+ (float)(avgta/n));
	//	System.out.println ("average wt is "+ (float)(avgwt/n));
    }

private void sjfpre(int[] pn, int[] at, int[] bt, int count) {
        DefaultTableModel model4=(DefaultTableModel) tablesjfpre.getModel();
        int i,j,temp,st=0,tot=0;
        int n=count;
        int pid[]=new int[n];
        int at1[]=new int[n];
       
        int ct1[]=new int[n];
        int tat1[]=new int[n];
        int wt1[]=new int[n];
        int f[]=new int[n];         //flag to check if process is complete
        
        int bt2[]=new int[n];
        float avgwt=0,avgta=0;
        for(i=0;i<n;i++)
        {
            pid[i]=pn[i];
            at1[i]=at[i];
            
           
            f[i]=0;
        }
        for( i = 0 ; i <n; i++)
		{
			for(  j=0;  j < n-(i+1) ; j++)
			{
				if( at1[j] > at1[j+1] )
				{
					temp = at1[j];
					at1[j] = at1[j+1];
					at1[j+1] = temp;
					temp = bt[j];
					bt[j] = bt[j+1];
					bt[j+1] = temp;
					temp = pid[j];
					pid[j] = pid[j+1];
					pid[j+1] = temp;
				}
			}
		}
	for(i=0;i<n;i++)
            bt2[i]=bt[i];
        while(true){
	    	int min=99,c=n;
	    	if (tot==n)
	    		break;
	    	
	    	for ( i=0;i<n;i++)
	    	{
	    		if ((at1[i]<=st) && (f[i]==0) && (bt[i]<min))
	    		{	
	    			min=bt[i];
	    			c=i;
	    		}
	    	}
	    	
	    	if (c==n)
	    		st++;
	    	else
	    	{
	    		bt[c]--;
	    		st++;
	    		if (bt[c]==0)
	    		{
	    			ct1[c]= st;
	    			f[c]=1;
	    			tot++;
	    		}
	    	}
	    }
	    
	    for(i=0;i<n;i++)
	    {
	    	tat1[i] = ct1[i] - at1[i];
	    	wt1[i] = tat1[i] - bt2[i];
	    	avgwt+= wt1[i];
	    	avgta+= tat1[i];
	    }
	    
	  //  System.out.println("pid  arrival  burst  complete turn waiting");
	    for(i=0;i<n;i++)
	    {
                 model4.addRow(new Object[]{pid[i],at1[i],bt2[i],ct1[i],tat1[i],wt1[i]});
	  //  	System.out.println(pid[i] +"\t"+ at[i]+"\t"+ k[i] +"\t"+ ct1[i] +"\t"+ tat1[i] +"\t"+ wt1[i]);
	    }
	    float spreatt111=(float)avgta/(float)n;
             float spreawt111=(float)avgwt/(float)n;
             spreatt11=spreatt111;
             spreawt11=spreawt111;
              lblsjfprett.setText("Average Turn around Time is "+spreatt111);
               lblsjfpreawt.setText("Average Waiting Time is "+spreawt111);
             
              //  model4.addRow(new Object[]{spreawt111,spreatt111});
	  //  System.out.println("\naverage tat is "+ (float)(avgta/n));
	  //  System.out.println("average wt is "+ (float)(avgwt/n));
    }             
private void priority(int[] pn,int at[], int[] bt1, int[] pp1, int count) {
       DefaultTableModel model5=(DefaultTableModel) tablepriority.getModel();
        int i,pos=0,temp;
        int n=count;
        int p[]=new int[n];
        int pt[]=new int[n];
        int bt[]=new int[n];
       int at1[]=new int[n];
        int tat[]=new int[n];
        int wt[]=new int[n];
       int ct1[]=new int[n];
       float avgwt=0,avwtt=0;
         for(i=0;i<n;i++)
        {
               p[i]=pn[i];
               bt[i]=bt1[i];
               pt[i]=pp1[i];
               at1[i]=at[i];
        }
 
 

for(i=0;i<n;i++){pos=i;
  for(int j=i+1;j<n;j++)
   {
    if(pt[j]<pt[pos])
    pos=j;
   }
   temp=pt[pos];
  pt[pos]=pt[i];
  pt[i]=temp;
 temp=p[pos];
 p[pos]=p[i];
 p[i]=temp;
 temp=bt[pos];
 bt[pos]=bt[i];
 bt[i]=temp;
 }
for(i = 0 ; i < n; i++)
		{
			if( i == 0)
			{	
				ct1[i] = at1[i] + bt[i];
			}
			else
			{
				if( at1[i] > ct1[i-1])
				{
					ct1[i] = at1[i] + bt[i];
				}
				else
					ct1[i] = ct1[i-1] + bt[i];
			}
                         tat[i] = ct1[i] - at1[i] ;          // turnaround time= completion time- arrival time
			wt[i] = tat[i] - bt1[i] ;  
                }

wt[0]=0;
for(i=1;i<n;i++)
{
 wt[i]=0;
 for(int j=0;j<i;j++)
 wt[i]+=bt[j];
 avgwt=avgwt+wt[i];
}
//System.out.println("Process\tBT\tpriority\twaiting time\tTAT");
for(i=0;i<n;i++)
{
tat[i]=bt[i]+wt[i];
avwtt=avwtt+tat[i];
model5.addRow(new Object[]{p[i],pt[i],at1[i],bt[i],ct1[i],tat[i],wt[i]});
}

float priatt1=(avwtt/n);
float priawt1=(avgwt/n);
priatt=priatt1;
priawt=priawt1;
 //model5.addRow(new Object[]{priawt1,priatt1});  }   
lblpritt.setText("Average Turn around Time is "+priatt1);
lblpriwt.setText("Average Waiting Time is "+priawt1);
                
}
private void rr(int[] pn1,int at[],int[] bt1,int ttime,int count) {
       DefaultTableModel model6=(DefaultTableModel) tablerr.getModel(); 
       int n1=count;
       
        int i,j,temp;
        int q=ttime;
        int a[]=new int[n1];
        int b[]=new int[n1];
        int res_a[]=new int[n1];
        int res_b[]=new int[n1];
        int w[] = new int[n1]; 
        int tat[]=new int[n1];
        
        int comp1[]=new int[n1];
        int p[]=new int[n1];
         for( i=0;i<n1;i++){
             p[i]=pn1[i];
             a[i]=at[i];
             b[i]=bt1[i];
              
         }
             // result of average times 
        int res = 0; 
        int resc = 0; 
  for( i = 0 ; i <n1; i++)
		{
			for(  j=0;  j < n1-(i+1) ; j++)
			{
				if( a[j] > a[j+1] )
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
					temp = p[j];
					p[j] = p[j+1];
					p[j+1] = temp;
				}
			}
		}
        
       
  
        for ( i = 0; i < n1; i++) 
        { 
            res_b[i] = b[i]; 
            res_a[i] = a[i]; 
        } 
  
        // critical time of system 
        int t = 0; 
  
        
       
  
        while (true) { 
            boolean flag = true; 
            for ( i = 0; i < n1; i++) { 
  
                // these condition for if 
                // arrival is not on zero 
  
                // check that if there come before qtime 
                if (res_a[i] <= t) { 
                    if (res_a[i] <= q) { 
                        if (res_b[i] > 0) { 
                            flag = false; 
                            if (res_b[i] > q) { 
  
                                // make decrease the b time 
                                t = t + q; 
                                res_b[i] = res_b[i] - q; 
                                res_a[i] = res_a[i] + q; 
                                
                            } 
                            else { 
  
                                // for last time 
                                t = t + res_b[i]; 
  
                                // store comp time 
                                
                                tat[i]=t-a[i];
                                // store wait time 
                                w[i] = t - b[i] - a[i]; 
                               
                                res_b[i] = 0; 
  
                               
                            } 
                        } 
                    } 
                    else if (res_a[i] > q) { 
  
                        // is any have less arrival time 
                        // the coming process then execute them 
                        for ( j = 0; j < n1; j++) { 
  
                            // compare 
                            if (res_a[j] < res_a[i]) { 
                                if (res_b[j] > 0) { 
                                    flag = false; 
                                    if (res_b[j] > q) { 
                                        t = t + q; 
                                        res_b[j] = res_b[j] - q; 
                                        res_a[j] = res_a[j] + q; 
                                        
                                    } 
                                    else { 
                                        t = t + res_b[j]; 
                                        
                                        tat[i]=t-a[j];
                                        w[i] = t - b[j] - a[j]; 
                                        
                                        res_b[j] = 0; 
                                       
                                    } 
                                } 
                            } 
                        } 
  
                        // now the previous porcess according to 
                        // ith is process 
                        if (res_b[i] > 0) { 
                            flag = false; 
  
                            // Check for greaters 
                            if (res_b[i] > q) { 
                                t = t + q; 
                                res_b[i] = res_b[i] - q; 
                                res_a[i] = res_a[i] + q; 
                                
                            } 
                            else { 
                                t = t + res_b[i]; 
                                
                                tat[i]=t-a[i];
                                w[i] = t - b[i] - a[i]; 
                                
                                res_b[i] = 0; 
                                
                            } 
                        } 
                    } 
                } 
  
                // if no process is come on thse critical 
                else if (res_a[i] > t) { 
                    t++; 
                    i--; 
                } 
            } 
            // for exit the while loop 
            if (flag) { 
                break; 
            } 
        } 
  for(i=0;i<n1;i++)
       {
           comp1[i]=tat[i]+a[i];
       }
      
        for ( i = 0; i < n1; i++) { 
           // System.out.println(" " + p[i] + "    " + comp[i] 
                        //       + "    " + w[i] + "    "  +a[i]+  "    " + tat[i]); 
                        model6.addRow(new Object[]{p[i],a[i],b[i],comp1[i],tat[i],w[i]});
            res = res + w[i]; 
            resc = resc + tat[i]; 
        } 
        rrtat=(float)resc / n1;
        rrawt=(float)res / n1;
               lblrrtt.setText("Average Turn around Time is "+rrtat);
               lblrrwt.setText("Average Waiting Time is "+rrawt);     
       
      
  }
void finalresult()
{   int f1=0,sn1=0,sp1=0,p1=0,r1=0;
   float min;
    float [] result={fawt,snpawttt,spreawt11,priawt,rrawt};
   // float [] result1={fatt,snpatttt,spreatt11,priatt,rrtat};
    
    
     
     if(fc==0)
     {
         fawt=1000;
     }
     if(sjnp==0){
         snpawttt=2000;
     }
     if(sjp==0){
         spreawt11=3000;
     }
     if(p==0){
         priawt=4000;
     }
     if(r==0){
         rrawt=5000;
     }
     min=fawt;
     if(min>snpawttt){
         min=snpawttt;
         
     }
     if (min>spreawt11){
         min=spreawt11;
         
     }
     if(min>priawt){
         min=priawt;
        
     }
     if(min>rrawt){
         min=rrawt;
        
     }
     if(min>fawt){
         min=fawt;
        
     }
     if(min==fawt)
         f1=1;
     if(min==snpawttt)
         sn1=1;
     if(min==spreawt11)
         sp1=1;
     if(min==priawt)
         p1=1;
     if(min==rrawt)
         r1=1;
     
     if(sn1==1){
   lblfinalresult.setText("THE MOST EFFECIENT ALGORITHM TO USE IS ");
           lblfinalresult1.setText("SJF NON PREEMPTIVE");
  
     }
       if(sp1==1){
   lblfinalresult.setText("THE MOST EFFECIENT ALGORITHM TO USE IS ");
           lblfinalresult1.setText( "SJF PREEMPTIVE");
 
     }
       if(p1==1){
   lblfinalresult.setText("THE MOST EFFECIENT ALGORITHM TO USE ");
           lblfinalresult1.setText ("IS PRIORITY");
 
     }
       if(r1==1){
   lblfinalresult.setText("THE MOST EFFECIENT ALGORITHM TO USE ");
           lblfinalresult1.setText("IS ROUND ROBIN");
 
     }
         if(f1==1){
   lblfinalresult.setText("THE MOST EFFECIENT ALGORITHM TO USE ");
           lblfinalresult1.setText( "IS FCFS");

     }
     
      
        
    
   }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btback;
    private javax.swing.JButton btexit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblfcfs;
    private javax.swing.JLabel lblfcfsavgtt;
    private javax.swing.JLabel lblfcfsavgwt;
    private javax.swing.JLabel lblfinalconclusion;
    private javax.swing.JLabel lblfinalconclusion1;
    private javax.swing.JLabel lblfinalresult;
    private javax.swing.JLabel lblfinalresult1;
    private javax.swing.JLabel lblpriority;
    private javax.swing.JLabel lblpritt;
    private javax.swing.JLabel lblpriwt;
    private javax.swing.JLabel lblrr;
    private javax.swing.JLabel lblrrtt;
    private javax.swing.JLabel lblrrwt;
    private javax.swing.JLabel lblsjfnp;
    private javax.swing.JLabel lblsjfnptt;
    private javax.swing.JLabel lblsjfnpwt;
    private javax.swing.JLabel lblsjfpre;
    private javax.swing.JLabel lblsjfpreawt;
    private javax.swing.JLabel lblsjfprett;
    private javax.swing.JPanel panelfcfs;
    private javax.swing.JPanel panelpriority;
    private javax.swing.JPanel panelrr;
    private javax.swing.JPanel panelsjfnp;
    private javax.swing.JPanel panelsjfpre;
    private javax.swing.JTable tablepriority;
    private javax.swing.JTable tableresult;
    private javax.swing.JTable tablerr;
    private javax.swing.JTable tablesjfnp;
    private javax.swing.JTable tablesjfpre;
    // End of variables declaration//GEN-END:variables
  

    
    
}

