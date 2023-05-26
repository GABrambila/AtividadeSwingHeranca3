import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtPRIMEIRO;
    private JTextField txtSEGUNDO;
    private JButton btnSOMA;
    private JButton btnLIMPAR;
    private JButton btnDIVIDE;
    private JButton btnSUBTRAI;
    private JButton btnMULTIPLICA;
    private JTextField txtRESULTADO;
public Calculadora() {
    btnSOMA.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtRESULTADO.setText(txtPRIMEIRO+txtSEGUNDO);
        }
    });
    btnSUBTRAI.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtRESULTADO.setText(txtPRIMEIRO-txtSEGUNDO);

        }
    });
    btnDIVIDE.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtRESULTADO.setText(txtPRIMEIRO/txtSEGUNDO);
        }
    });
    btnMULTIPLICA.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtRESULTADO.setText(txtPRIMEIRO*txtSEGUNDO);
        }
    });
    btnLIMPAR.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtPRIMEIRO.setText("");
            txtSEGUNDO.setText("");
            txtRESULTADO.setText("");
        }
    });
}
}
