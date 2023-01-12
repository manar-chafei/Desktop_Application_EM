/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestionemp;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author kh-info
 */
public class FicheP extends MoveJFrame {


   Connection con;
         ResultSet rs;
         PreparedStatement Pst;
    public FicheP() {
        initComponents();
        showTable1();
        affiche();
        clock();
this.setLocationRelativeTo(null);    
}
public void clock(){
 horloge.setText(
 DateFormat.getDateInstance().format(new Date())
 );}
public void showTable1(){
         try{
          String url="jdbc:mysql://localhost/Emp"; 
                con = DriverManager.getConnection(url, "root","");
                Pst = con.prepareStatement("select * from demandefiche");
                rs=Pst.executeQuery();
                jTable5.setModel(DbUtils.resultSetToTableModel(rs));
                 }catch(Exception ex){
              JOptionPane.showMessageDialog(null,ex);
                       }
}

private void Reaserch(MouseEvent evt) {                                         
     try {   
               String url="jdbc:mysql://localhost/Emp"; 
                    con = DriverManager.getConnection(url, "root","");
                    Pst = con.prepareStatement("select FirstName,LastName,IDU,Address,City,Departmet,Job,Today,Mat from emp where FirstName = ?");
                       Pst.setString(1,txtRE1.getText());
                    ResultSet rs = Pst.executeQuery();

                    if(rs.next()==true)
                    {
                        String Nom = rs.getString(1);
                        String Prénom = rs.getString(2);
                        String IDU = rs.getString(3);
                        String Address = rs.getString(4);
                        String City = rs.getString(5);
                        String Departmet = rs.getString(6);
                        String Job = rs.getString(7);
                        String Today = rs.getString(8);
                        String Mat = rs.getString(9);

                       txtNom.setText(Nom);
                       txtPrénom.setText(Prénom);
                       txtIDU.setText(IDU);
                        txtAdress.setText(Address);
                        txtCity.setText(City);
                        txtDep.setText(Departmet);
                        txtJob.setText(Job);
                        horloge.setText(Today);
                       txtMat.setText(Mat);
                    }
                    else
                    {
                        txtNom.setText("");
                        txtPrénom.setText("");
                        txtIDU.setText("");
                        txtMat.setText("");
                        txtAdress.setText("");
                        txtCity.setText("");
                        txtDep.setText("");
                        txtJob.setText("");
                        horloge.setText("");
                        JOptionPane.showMessageDialog(null,"Invalid Name");

                    }
        System.out.println("Success");
    }
    catch (Exception e){
    
        e.printStackTrace();
    }
    }

public void affiche(){
try {   
               String url="jdbc:mysql://localhost/Emp"; 
                    con = DriverManager.getConnection(url, "root","");
                    Pst = con.prepareStatement("select FirstName,LastName,IDU,Address,City,Departmet,Job,Today,Mat from emp where FirstName = ?");
                       Pst.setString(1,txtRE1.getText());
                    ResultSet rs = Pst.executeQuery();

                    if(rs.next()==true)
                    {
                        String Nom = rs.getString(1);
                        String Prénom = rs.getString(2);
                        String IDU = rs.getString(3);
                        String Address = rs.getString(4);
                        String City = rs.getString(5);
                        String Departmet = rs.getString(6);
                        String Job = rs.getString(7);
                        String Today = rs.getString(8);
                        String Mat = rs.getString(9);
                        String basic = Net.getText();
                        String so= Float.toString((float) (Double.parseDouble(basic))/100);
                        String he= Float.toString((float) (Double.parseDouble(basic))/100);
                        String tr= Float.toString((float) (Double.parseDouble(basic))/30);
                        String ho= Float.toString((float) (Double.parseDouble(basic)*1.33333333333/100));
                        String to= Float.toString((float) (Double.parseDouble(basic))+(float) (Double.parseDouble(ho))+(float) (Double.parseDouble(tr)));
                        String ne = Float.toString((float) (Double.parseDouble(to))-(float) (Double.parseDouble(he))-(float) (Double.parseDouble(so)));
             //     try{
     //    Image im=new Image("C:\\Users\\Copytop\\Documents\\NetBeansProjects\\OnTime\\tmk.jpg");}
//catch (Exception e){
    
      //  e.printStackTrace();
    //}
                       txtNom.setText(Nom);
                       txtNom1.setText(Nom);

                       txtPrénom1.setText(Prénom);
                       txtPrénom.setText(Prénom);
                       txtIDU.setText(IDU);
                        txtAdress.setText(Address);
                        txtCity.setText(City);
                        txtDep.setText(Departmet);
                        txtJob.setText(Job);
                        horloge.setText(Today);
                       txtMat.setText(Mat);
                       Ba.setText(basic);
                       So.setText(so);
                       He.setText(he);
                       Tr.setText(tr);
                       Ho.setText(ho);
                       To1.setText(to);
                       Ne.setText(ne);

                 // Affiche.setText(Affiche.getText()+"================================\n");
                  //Affiche.setText(Affiche.getText()+Nom+"\t"++"\t"++"\t"++"\t"+);
                       }
}
catch (Exception e){
    
        e.printStackTrace();
    }
}

private void logout(ActionEvent evt) {                                         
    Welcom in=new  Welcom();
in.setVisible(true);
this.hide();
}
private void minimise(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        this.setState(1);
    }

    private void Print(MouseEvent evt) {                                         
    
             try{
             printReoord(Affiche);
             }catch(Exception e){};
    }

private void exite(java.awt.event.MouseEvent evt) {                                     
        System.exit(0);}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hi = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtRE1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        txtRE2 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        Net = new javax.swing.JTextField();
        Affiche = new javax.swing.JPanel();
        txtPrénom = new javax.swing.JLabel();
        txtNom = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtMat = new javax.swing.JLabel();
        txtCity = new javax.swing.JLabel();
        txtJob = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        txtNom1 = new javax.swing.JLabel();
        txtPrénom1 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        txtAdress = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        txtDep = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        txtIDU = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        horloge = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Ho = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        Ba = new javax.swing.JLabel();
        Ne = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        Tr = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        So = new javax.swing.JLabel();
        He = new javax.swing.JLabel();
        To1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        hi.setBackground(new java.awt.Color(78, 15, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Request Management");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hello! Let's get started");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(78, 15, 153));
        jButton2.setText("ACCEPT");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(225, 225, 225));
        jLabel12.setText("Created By Manar Programmer");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionemp/icons8-ccleaner-64.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("<<");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        txtRE1.setBackground(new java.awt.Color(78, 15, 153));
        txtRE1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRE1.setForeground(new java.awt.Color(255, 255, 255));
        txtRE1.setText("write a name   .  .  .");
        txtRE1.setBorder(null);
        txtRE1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtRE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRE1ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("_______________________________________________________________");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(165, 139, 211));
        jLabel4.setText("Sershing");

        jTable5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable5.setForeground(new java.awt.Color(78, 15, 153));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FirstName", "LastName", "IDU", "Today"
            }
        ));
        jTable5.setSelectionBackground(new java.awt.Color(165, 139, 211));
        jTable5.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(3).setResizable(false);
        }

        txtRE2.setBackground(new java.awt.Color(78, 15, 153));
        txtRE2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRE2.setForeground(new java.awt.Color(255, 255, 255));
        txtRE2.setText("Basic Salary :");
        txtRE2.setBorder(null);
        txtRE2.setCaretColor(new java.awt.Color(255, 255, 255));
        txtRE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRE2ActionPerformed(evt);
            }
        });

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("                              ____________________________________________________");

        Net.setBackground(new java.awt.Color(78, 15, 153));
        Net.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Net.setForeground(new java.awt.Color(255, 255, 255));
        Net.setBorder(null);
        Net.setCaretColor(new java.awt.Color(255, 255, 255));
        Net.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hiLayout = new javax.swing.GroupLayout(hi);
        hi.setLayout(hiLayout);
        hiLayout.setHorizontalGroup(
            hiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(97, 97, 97)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(178, 178, 178))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hiLayout.createSequentialGroup()
                .addGroup(hiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(hiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hiLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(hiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(hiLayout.createSequentialGroup()
                                .addGroup(hiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(hiLayout.createSequentialGroup()
                                        .addGroup(hiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(hiLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(149, 149, 149)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtRE1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel1))
                                    .addGroup(hiLayout.createSequentialGroup()
                                        .addComponent(txtRE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Net, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(36, 36, 36))
        );
        hiLayout.setVerticalGroup(
            hiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hiLayout.createSequentialGroup()
                .addGroup(hiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hiLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(hiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(hiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hiLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(hiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hiLayout.createSequentialGroup()
                        .addComponent(txtRE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(hiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Net, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        Affiche.setBackground(new java.awt.Color(242, 242, 242));
        Affiche.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrénom.setFont(new java.awt.Font("Gill Sans Nova Light", 0, 20)); // NOI18N
        txtPrénom.setForeground(new java.awt.Color(153, 153, 153));
        txtPrénom.setText("LastN");
        Affiche.add(txtPrénom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 80, -1));

        txtNom.setFont(new java.awt.Font("Gill Sans Nova Light", 0, 20)); // NOI18N
        txtNom.setForeground(new java.awt.Color(153, 153, 153));
        txtNom.setText("FirstName");
        Affiche.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, -1));

        jLabel9.setFont(new java.awt.Font("Gill Sans Nova Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Tamkiin");
        Affiche.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 80, -1));

        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("______________   ");
        Affiche.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 110, 20));

        jLabel13.setForeground(new java.awt.Color(255, 153, 51));
        jLabel13.setText("________________");
        Affiche.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel16.setText("HEAD OFFICE");
        Affiche.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 420, 60, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel17.setText("___________");
        Affiche.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 50, 20));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel18.setText("PRODUCTION ");
        Affiche.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 421, 60, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel19.setText("___________");
        Affiche.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 410, 60, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel20.setText("MANAGER");
        Affiche.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel21.setText("Tamkiin");
        Affiche.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 10));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel22.setText("Akrem");
        Affiche.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 410, 30, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Affiche.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 130, 50));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setForeground(new java.awt.Color(255, 183, 76));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        Affiche.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 15, 8, 8));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        Affiche.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 13, 13));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        Affiche.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 3, 6, 6));

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        Affiche.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 5, 8, 8));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        Affiche.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 8, 8, 8));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Affiche.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 120, 30));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Affiche.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 350, 10));

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Affiche.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 100, 30));

        jPanel15.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Affiche.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionemp/lmlm.png"))); // NOI18N
        Affiche.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 50, 60));

        txtMat.setFont(new java.awt.Font("Gill Sans Nova", 0, 11)); // NOI18N
        txtMat.setForeground(new java.awt.Color(51, 51, 51));
        txtMat.setText("0000");
        Affiche.add(txtMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 70, -1));

        txtCity.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        txtCity.setText("City");
        Affiche.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        txtJob.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        txtJob.setForeground(new java.awt.Color(51, 51, 51));
        txtJob.setText("job");
        Affiche.add(txtJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans Nova", 1, 6)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("E M P L O Y E E I N F O R M A T I O N");
        Affiche.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel26.setFont(new java.awt.Font("Gill Sans Nova", 0, 8)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("Avenue Farhat Hached, Downtown, Gabes 6000");
        Affiche.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 10));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(153, 153, 153));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel13.setForeground(new java.awt.Color(153, 153, 153));

        jLabel32.setFont(new java.awt.Font("Gill Sans Nova Light", 1, 8)); // NOI18N
        jLabel32.setText("Date of Joining");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        jPanel16.setBackground(new java.awt.Color(153, 153, 153));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel16.setForeground(new java.awt.Color(153, 153, 153));

        jLabel29.setFont(new java.awt.Font("Gill Sans Nova Light", 1, 9)); // NOI18N
        jLabel29.setText("  Address");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel17.setForeground(new java.awt.Color(153, 153, 153));

        jLabel30.setFont(new java.awt.Font("Gill Sans Nova Light", 1, 8)); // NOI18N
        jLabel30.setText("IDU");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(153, 153, 153));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel18.setForeground(new java.awt.Color(153, 153, 153));

        jLabel28.setFont(new java.awt.Font("Gill Sans Nova Light", 1, 8)); // NOI18N
        jLabel28.setText("Employee Name");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(153, 153, 153));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel19.setForeground(new java.awt.Color(153, 153, 153));

        jLabel31.setFont(new java.awt.Font("Gill Sans Nova Light", 1, 8)); // NOI18N
        jLabel31.setText("Department");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel20.setForeground(new java.awt.Color(153, 153, 153));

        txtNom1.setFont(new java.awt.Font("Gill Sans Nova Light", 0, 9)); // NOI18N
        txtNom1.setForeground(new java.awt.Color(153, 153, 153));
        txtNom1.setText("FirstName");

        txtPrénom1.setFont(new java.awt.Font("Gill Sans Nova Light", 0, 9)); // NOI18N
        txtPrénom1.setForeground(new java.awt.Color(153, 153, 153));
        txtPrénom1.setText("LastN");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNom1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrénom1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtNom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPrénom1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel21.setForeground(new java.awt.Color(153, 153, 153));

        txtAdress.setFont(new java.awt.Font("Gill Sans Nova Light", 0, 8)); // NOI18N
        txtAdress.setForeground(new java.awt.Color(102, 102, 102));
        txtAdress.setText("  Address");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAdress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(txtAdress, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel24.setBackground(new java.awt.Color(204, 204, 204));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel24.setForeground(new java.awt.Color(153, 153, 153));

        txtDep.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        txtDep.setText("Dep");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDep, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel23.setForeground(new java.awt.Color(153, 153, 153));

        txtIDU.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        txtIDU.setText("IDU");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIDU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIDU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel25.setBackground(new java.awt.Color(204, 204, 204));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel25.setForeground(new java.awt.Color(153, 153, 153));

        horloge.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        horloge.setForeground(new java.awt.Color(51, 51, 51));
        horloge.setText("00/00/0000");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(horloge, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(horloge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Affiche.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 330, 70));

        jLabel27.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 153));
        jLabel27.setText("Payslipt");
        Affiche.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, -1));

        jLabel10.setFont(new java.awt.Font("Gill Sans Nova", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Registration Number :");
        Affiche.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, -1));

        jLabel14.setFont(new java.awt.Font("Gill Sans Nova", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("City :");
        Affiche.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 30, -1));

        jLabel23.setFont(new java.awt.Font("Gill Sans Nova", 0, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("Job :");
        Affiche.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 30, -1));

        Ho.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        Ho.setText("00");
        Affiche.add(Ho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 60, -1));

        jLabel24.setFont(new java.awt.Font("Gill Sans Nova", 0, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Hosing Allowance :");
        Affiche.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, -1));

        jLabel33.setFont(new java.awt.Font("Gill Sans Nova", 0, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 153, 153));
        jLabel33.setText("Basic :");
        Affiche.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 30, -1));

        Ba.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        Ba.setForeground(new java.awt.Color(51, 51, 51));
        Ba.setText("00");
        Affiche.add(Ba, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 90, -1));

        Ne.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        Ne.setText("00");
        Affiche.add(Ne, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 60, -1));

        jLabel34.setFont(new java.awt.Font("Gill Sans Nova", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Total Gross Salary :");
        Affiche.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 100, -1));

        jLabel35.setFont(new java.awt.Font("Gill Sans Nova", 0, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 153, 153));
        jLabel35.setText("Transportation Allowance :");
        Affiche.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, -1));

        Tr.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        Tr.setForeground(new java.awt.Color(51, 51, 51));
        Tr.setText("00");
        Affiche.add(Tr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 50, -1));

        jLabel36.setFont(new java.awt.Font("Gill Sans Nova", 0, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 153, 153));
        jLabel36.setText("Social Security :");
        Affiche.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 70, -1));

        jLabel37.setFont(new java.awt.Font("Gill Sans Nova", 0, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(153, 153, 153));
        jLabel37.setText("Health Recovery :");
        Affiche.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 90, -1));

        jLabel38.setFont(new java.awt.Font("Gill Sans Nova", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Net Salary :");
        Affiche.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 60, -1));

        So.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        So.setText("00");
        Affiche.add(So, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 40, -1));

        He.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        He.setForeground(new java.awt.Color(51, 51, 51));
        He.setText("00");
        Affiche.add(He, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 30, -1));

        To1.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        To1.setText("00");
        Affiche.add(To1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 60, -1));

        jLabel8.setPreferredSize(new java.awt.Dimension(453, 640));
        Affiche.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 480));

        jLabel39.setFont(new java.awt.Font("Vivaldi", 2, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 153));
        jLabel39.setText("Signature");
        Affiche.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 70, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionemp/icons8-print-64.png"))); // NOI18N
        jLabel7.setText("PRINT");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(hi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel7))
                    .addComponent(Affiche, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Affiche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7))
                    .addComponent(hi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(78, 15, 153));

        jMenu1.setForeground(new java.awt.Color(78, 15, 153));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionemp/icons8-xbox-menu-64.png"))); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(223, 205, 223));
        jMenuItem1.setForeground(new java.awt.Color(78, 15, 153));
        jMenuItem1.setText("LOGOUT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionemp/icons8-minimize-window-64.png"))); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionemp/icons8-close-64.png"))); // NOI18N
        jMenu3.setHideActionText(true);
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        logout(evt);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        minimise(evt);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        exite(evt);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AccepterActionPerformed(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        AnnulerActionPerformed(evt);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        GoBack(evt);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void txtRE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRE1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Print (evt);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtRE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRE2ActionPerformed

    private void NetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NetActionPerformed
private void GoBack(MouseEvent evt) {                                         
    EspaceAdm in=new  EspaceAdm();
in.setVisible(true);
this.hide();
}
  private void AnnulerActionPerformed(MouseEvent evt) {                                        
                        txtNom.setText("");
                        txtPrénom.setText("");
                        txtIDU.setText("");
                        txtMat.setText("");
                        txtAdress.setText("");
                        txtCity.setText("");
                        txtDep.setText("");
                        txtJob.setText("");
                        horloge.setText("");

    }


 private void AccepterActionPerformed(java.awt.event.ActionEvent evt) {                                         

      affiche();

    }

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
            java.util.logging.Logger.getLogger(FicheP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FicheP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FicheP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FicheP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FicheP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Affiche;
    private javax.swing.JLabel Ba;
    private javax.swing.JLabel He;
    private javax.swing.JLabel Ho;
    private javax.swing.JLabel Ne;
    private javax.swing.JTextField Net;
    private javax.swing.JLabel So;
    private javax.swing.JLabel To1;
    private javax.swing.JLabel Tr;
    private javax.swing.JPanel hi;
    private javax.swing.JLabel horloge;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable5;
    private javax.swing.JLabel txtAdress;
    private javax.swing.JLabel txtCity;
    private javax.swing.JLabel txtDep;
    private javax.swing.JLabel txtIDU;
    private javax.swing.JLabel txtJob;
    private javax.swing.JLabel txtMat;
    private javax.swing.JLabel txtNom;
    private javax.swing.JLabel txtNom1;
    private javax.swing.JLabel txtPrénom;
    private javax.swing.JLabel txtPrénom1;
    private javax.swing.JTextField txtRE1;
    private javax.swing.JTextField txtRE2;
    // End of variables declaration//GEN-END:variables

private void printReoord(JPanel panel){
PrinterJob printerJob = PrinterJob.getPrinterJob();
printerJob.setJobName ("printReoord");
printerJob.setPrintable (new Printable(){
    @Override
public int print (Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
if (pageIndex > 0) {

return Printable.NO_SUCH_PAGE;

}

Graphics2D graphics2D =(Graphics2D)graphics; 

graphics2D.translate(pageFormat.getImageableX()*2,pageFormat.getImageableY()*2);

graphics2D.scale (1.8,1.75);

panel.paint(graphics2D);

return Printable.PAGE_EXISTS;

}});
boolean returningResult=printerJob.printDialog();

if (returningResult) {


try{
printerJob.print();

}catch(PrinterException printerException){

JOptionPane.showMessageDialog(this, "Print Error: " +printerException.getMessage());
     }
}
}


}
