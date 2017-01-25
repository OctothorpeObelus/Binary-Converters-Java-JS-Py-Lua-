import java.io.*;
import static java.lang.System.*;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;

class Main{
    
     JPanel pnFrame;
     JTextField tfDecimalBox;
     JToolBar tlbToolBar0;
     JButton btToolBar0_File;
     JButton btToolBar0_About;
     JLabel lbDecimal_Binary_Out;
     JTextField tfBinaryDecimal;
     JLabel lbBinary_Decimal_Out;
     JButton btDecimalBinary_Submit;
     JButton btBinaryDecimal_Submit;
     JButton btTextBinary_Submit;
     JButton btBinaryText_Submit;
     
     Jpanel pnFrame = new JPanel();
     pnFrame.setBorder( BorderFactory.createTitledBorder( "Binary Converter" ) );
     GridBagLayout gbFrame = new GridBagLayout();
     GridBagConstraints gbcFrame = new GridBagConstraints();
     pnFrame.setLayout( gbFrame );
     
//---------------------------------------------------------------------------------------------------
     
     JTextField tfDecimalBox = new JTextField( );
     gbcFrame.gridx = 1;
     gbcFrame.gridy = 4;
     gbcFrame.gridwidth = 6;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 0;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( tfDecimalBox, gbcFrame );
     pnFrame.add( tfDecimalBox );
     
     JToolBar tlbToolBar0 = new JToolBar( ""  );
     btToolBar0_File = new JButton( "File" );
     btToolBar0_About = new JButton( "About" );
     tlbToolBar0.add( btToolBar0_File );
     tlbToolBar0.add( btToolBar0_About );
     gbcFrame.gridx = 0;
     gbcFrame.gridy = 0;
     gbcFrame.gridwidth = 20;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 0;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( tlbToolBar0, gbcFrame );
     pnFrame.add( tlbToolBar0 );
     
     JLabel lbDecimal_Binary_Out = new JLabel( ""  );
     gbcFrame.gridx = 13;
     gbcFrame.gridy = 4;
     gbcFrame.gridwidth = 6;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 1;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( lbDecimal_Binary_Out, gbcFrame );
     pnFrame.add( lbDecimal_Binary_Out );
     
     JTextField tfBinaryDecimal = new JTextField( );
     gbcFrame.gridx = 1;
     gbcFrame.gridy = 8;
     gbcFrame.gridwidth = 6;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 0;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( tfBinaryDecimal, gbcFrame );
     pnFrame.add( tfBinaryDecimal );

     JTextField tfTextBinary = new JTextField( );
     gbcFrame.gridx = 1;
     gbcFrame.gridy = 12;
     gbcFrame.gridwidth = 6;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 0;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( tfTextBinary, gbcFrame );
     pnFrame.add( tfTextBinary );

     JTextField tfBinaryText = new JTextField( );
     gbcFrame.gridx = 1;
     gbcFrame.gridy = 16;
     gbcFrame.gridwidth = 6;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 0;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( tfBinaryText, gbcFrame );
     pnFrame.add( tfBinaryText );
     
//---------------------------------------------------------------------------------------------------
     
     lbBinary_Decimal_Out = new JLabel( ""  );
     gbcFrame.gridx = 13;
     gbcFrame.gridy = 8;
     gbcFrame.gridwidth = 6;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 1;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( lbBinary_Decimal_Out, gbcFrame );
     pnFrame.add( lbBinary_Decimal_Out );
     
     lbText_Binary_Out = new JLabel( ""  );
     gbcFrame.gridx = 13;
     gbcFrame.gridy = 12;
     gbcFrame.gridwidth = 6;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 1;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( lbText_Binary_Out, gbcFrame );
     pnFrame.add( lbText_Binary_Out );
     
     lbBinary_Text_Out = new JLabel( ""  );
     gbcFrame.gridx = 13;
     gbcFrame.gridy = 16;
     gbcFrame.gridwidth = 6;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 1;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( lbBinary_Text_Out, gbcFrame );
     pnFrame.add( lbBinary_Text_Out );
     
//---------------------------------------------------------------------------------------------------
     
     btDecimalBinary_Submit = new JButton( "Decimal - Binary"  );
     gbcFrame.gridx = 8;
     gbcFrame.gridy = 4;
     gbcFrame.gridwidth = 4;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 0;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( btDecimalBinary_Submit, gbcFrame );
     pnFrame.add( btDecimalBinary_Submit );
     
     btBinaryDecimal_Submit = new JButton( "Binary - Decimal"  );
     gbcFrame.gridx = 8;
     gbcFrame.gridy = 8;
     gbcFrame.gridwidth = 4;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 0;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( btBinaryDecimal_Submit, gbcFrame );
     pnFrame.add( btBinaryDecimal_Submit );
     
     btTextBinary_Submit = new JButton( "Text - Binary"  );
     gbcFrame.gridx = 8;
     gbcFrame.gridy = 12;
     gbcFrame.gridwidth = 4;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 0;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( btTextBinary_Submit, gbcFrame );
     pnFrame.add( btTextBinary_Submit );
     
     btBinaryText_Submit = new JButton( "Binary - Text"  );
     gbcFrame.gridx = 8;
     gbcFrame.gridy = 16;
     gbcFrame.gridwidth = 4;
     gbcFrame.gridheight = 2;
     gbcFrame.fill = GridBagConstraints.BOTH;
     gbcFrame.weightx = 1;
     gbcFrame.weighty = 0;
     gbcFrame.anchor = GridBagConstraints.NORTHWEST;
     gbFrame.setConstraints( btBinaryText_Submit, gbcFrame );
     pnFrame.add( btBinaryText_Submit );

}
