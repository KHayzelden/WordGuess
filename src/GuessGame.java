
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

//getClass().getResource("/number4.png")

public class GuessGame extends javax.swing.JFrame {

    String FindWord ;
    int correct = 0 ;

    public GuessGame() {

        initComponents();

        BufferedReader in = null;
        ArrayList<String> wordsList = new ArrayList<String>();
        
        try 
        {   
            in = new BufferedReader(new FileReader("/Users/Barney/Desktop/words.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                wordsList.add(str);
            }
        } 
        catch (FileNotFoundException e) 
        {
            this.dispose();
        }
        catch (IOException e) 
        {
            this.dispose();
        }

        String[] words = new String[wordsList.size()];
        
        words = wordsList.toArray(words);
        
        Random randomizer = new Random();
        int random = randomizer.nextInt(99);
        
        FindWord = words[random];
        
        int wordLength = FindWord.length();
       
        if (wordLength < 10) char9.setVisible(false);
        if (wordLength < 9 ) char8.setVisible(false);
        if (wordLength < 8 ) char7.setVisible(false);
        if (wordLength < 7 ) char6.setVisible(false);
        if (wordLength < 6 ) char5.setVisible(false);
        if (wordLength < 5 ) char4.setVisible(false);
        if (wordLength < 4 ) char3.setVisible(false);
        
        myMessage2.setVisible(false);
        myMessage3.setVisible(false);
        winOrLose.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        char2 = new javax.swing.JLabel();
        char0 = new javax.swing.JLabel();
        char1 = new javax.swing.JLabel();
        char3 = new javax.swing.JLabel();
        char4 = new javax.swing.JLabel();
        char5 = new javax.swing.JLabel();
        char6 = new javax.swing.JLabel();
        char7 = new javax.swing.JLabel();
        char8 = new javax.swing.JLabel();
        char9 = new javax.swing.JLabel();
        aLetter = new javax.swing.JTextField();
        tryLetter = new javax.swing.JButton();
        incorrectlabel = new javax.swing.JLabel();
        incorrect = new javax.swing.JLabel();
        picture = new javax.swing.JButton();
        myMessage = new javax.swing.JLabel();
        myMessage2 = new javax.swing.JLabel();
        myMessage3 = new javax.swing.JLabel();
        winOrLose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(840, 450));
        setMinimumSize(new java.awt.Dimension(840, 450));
        setPreferredSize(new java.awt.Dimension(840, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(840, 450));
        getContentPane().setLayout(null);

        char2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        char2.setText("_");
        getContentPane().add(char2);
        char2.setBounds(118, 32, 40, 56);

        char0.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        char0.setText("_");
        getContentPane().add(char0);
        char0.setBounds(28, 32, 40, 56);

        char1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        char1.setText("_");
        getContentPane().add(char1);
        char1.setBounds(73, 32, 40, 56);

        char3.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        char3.setText("_");
        getContentPane().add(char3);
        char3.setBounds(163, 32, 40, 56);

        char4.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        char4.setText("_");
        getContentPane().add(char4);
        char4.setBounds(208, 32, 40, 56);

        char5.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        char5.setText("_");
        getContentPane().add(char5);
        char5.setBounds(253, 32, 40, 56);

        char6.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        char6.setText("_");
        getContentPane().add(char6);
        char6.setBounds(298, 32, 40, 56);

        char7.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        char7.setText("_");
        getContentPane().add(char7);
        char7.setBounds(343, 32, 40, 56);

        char8.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        char8.setText("_");
        getContentPane().add(char8);
        char8.setBounds(388, 32, 40, 56);

        char9.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        char9.setText("_");
        char9.setToolTipText("");
        getContentPane().add(char9);
        char9.setBounds(433, 32, 40, 56);

        aLetter.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        aLetter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(aLetter);
        aLetter.setBounds(30, 130, 50, 50);

        tryLetter.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tryLetter.setText("Try Letter");
        tryLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryLetterActionPerformed(evt);
            }
        });
        getContentPane().add(tryLetter);
        tryLetter.setBounds(90, 130, 160, 50);

        incorrectlabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        incorrectlabel.setText("Incorect Guesses:");
        getContentPane().add(incorrectlabel);
        incorrectlabel.setBounds(260, 140, 193, 28);

        incorrect.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        incorrect.setText("0");
        incorrect.setToolTipText("");
        getContentPane().add(incorrect);
        incorrect.setBounds(460, 140, 30, 28);
        getContentPane().add(picture);
        picture.setBounds(503, 20, 300, 389);

        myMessage.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        myMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myMessage.setText("look here");
        getContentPane().add(myMessage);
        myMessage.setBounds(20, 210, 450, 50);

        myMessage2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        myMessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myMessage2.setText("the word was");
        getContentPane().add(myMessage2);
        myMessage2.setBounds(20, 300, 450, 50);

        myMessage3.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        myMessage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myMessage3.setText("\"word if lost\"");
        getContentPane().add(myMessage3);
        myMessage3.setBounds(20, 360, 450, 50);

        winOrLose.setFont(new java.awt.Font("Arial", 0, 70)); // NOI18N
        winOrLose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        winOrLose.setText(" ");
        getContentPane().add(winOrLose);
        winOrLose.setBounds(0, 170, 490, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tryLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryLetterActionPerformed
        
        int tracker = 0;
        
        int charPos = FindWord.indexOf(aLetter.getText());
        myMessage.setText("position is " + charPos);
        
        if (charPos == -1) 
        {    
            incorrect.setText(Integer.toString(Integer.parseInt(incorrect.getText())+1));
            
            if (Integer.parseInt(incorrect.getText()) == 1) 
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png")));
            else if (Integer.parseInt(incorrect.getText()) == 2) 
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png")));
            else if (Integer.parseInt(incorrect.getText()) == 3) 
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.png")));
            else if (Integer.parseInt(incorrect.getText()) == 4) 
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.png")));
            else if (Integer.parseInt(incorrect.getText()) == 5) 
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.png")));
            else if (Integer.parseInt(incorrect.getText()) == 6) 
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6.png")));
            else if (Integer.parseInt(incorrect.getText()) == 7) 
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7.png")));
            else if (Integer.parseInt(incorrect.getText()) == 8) 
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8.png")));
            else if (Integer.parseInt(incorrect.getText()) == 9) 
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9.png")));
            else if (Integer.parseInt(incorrect.getText()) == 10) 
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10.png")));
        }    
        else
        {
            while (tracker < 10)
            {    
                if (charPos == 0 && !(aLetter.getText().equals((char0.getText())))) 
                    { char0.setText(aLetter.getText()); correct ++ ; }
                if (charPos == 1 && !(aLetter.getText().equals((char1.getText()))))
                    { char1.setText(aLetter.getText()); correct ++ ; }
                if (charPos == 2 && !(aLetter.getText().equals((char2.getText()))))
                    { char2.setText(aLetter.getText()); correct ++ ; }
                if (charPos == 3 && !(aLetter.getText().equals((char3.getText())))) 
                    { char3.setText(aLetter.getText()); correct ++ ; }
                if (charPos == 4 && !(aLetter.getText().equals((char4.getText())))) 
                    { char4.setText(aLetter.getText()); correct ++ ; }
                if (charPos == 5 && !(aLetter.getText().equals((char5.getText())))) 
                    { char5.setText(aLetter.getText()); correct ++ ; }
                if (charPos == 6 && !(aLetter.getText().equals((char6.getText())))) 
                    { char6.setText(aLetter.getText()); correct ++ ; }
                if (charPos == 7 && !(aLetter.getText().equals((char7.getText())))) 
                    { char7.setText(aLetter.getText()); correct ++ ; }
                if (charPos == 8 && !(aLetter.getText().equals((char8.getText())))) 
                    { char8.setText(aLetter.getText()); correct ++ ; }
                if (charPos == 9 && !(aLetter.getText().equals((char9.getText())))) 
                    { char9.setText(aLetter.getText()); correct ++ ; }

                charPos = FindWord.indexOf(aLetter.getText(),charPos+1);
                myMessage.setText("position is " + charPos);
                
                tracker ++ ;
            }
        }
        
        aLetter.setText("");
  
        if (correct == FindWord.length() || Integer.parseInt(incorrect.getText()) == 10)
        {
            aLetter.setEnabled(false);
            tryLetter.setEnabled(false);
            myMessage.setVisible(false);
            winOrLose.setVisible(true);
            incorrect.setVisible(false);
            incorrectlabel.setVisible(false);
            
            if (correct == FindWord.length()) winOrLose.setText("You Won!");
            else 
            {
                myMessage2.setVisible(true);
                myMessage3.setVisible(true);
                                
                winOrLose.setText("You Lost :(");
                myMessage3.setText("\"" + FindWord + "\"");
            }
            
        }             
    }//GEN-LAST:event_tryLetterActionPerformed
    
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
            java.util.logging.Logger.getLogger(GuessGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aLetter;
    private javax.swing.JLabel char0;
    private javax.swing.JLabel char1;
    private javax.swing.JLabel char2;
    private javax.swing.JLabel char3;
    private javax.swing.JLabel char4;
    private javax.swing.JLabel char5;
    private javax.swing.JLabel char6;
    private javax.swing.JLabel char7;
    private javax.swing.JLabel char8;
    private javax.swing.JLabel char9;
    private javax.swing.JLabel incorrect;
    private javax.swing.JLabel incorrectlabel;
    private javax.swing.JLabel myMessage;
    private javax.swing.JLabel myMessage2;
    private javax.swing.JLabel myMessage3;
    private javax.swing.JButton picture;
    private javax.swing.JButton tryLetter;
    private javax.swing.JLabel winOrLose;
    // End of variables declaration//GEN-END:variables
}
