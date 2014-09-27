
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author amjad
 */
public class CalculatorVisual extends JFrame implements ActionListener {
    
    //Methods will be used from this class
    CalculatorProps cp = new CalculatorProps();
    
    JTextField val1, val2;
    JButton btnPlus, btnMinus, btnMultiply, btnDiv, btnSine, btnCosine, btnTan, 
            btnPow, btnSqrt, btnModulo, btnLog;
    
    public CalculatorVisual(){
        
        super("Calculator - Visual");
        
        Container c = getContentPane();
        val1 = new JTextField(20);
        val2 = new JTextField(20);
        
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnMultiply = new JButton("X");
        btnDiv = new JButton("/");
        btnSine = new JButton("Sin");
        btnCosine = new JButton("Cos");
        btnTan = new JButton("Tan");
        btnPow = new JButton("x^2");
        btnSqrt = new JButton("√");
        btnModulo = new JButton("%");
        btnLog = new JButton("Log");
        
        
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDiv.addActionListener(this);
        btnSine.addActionListener(this);
        btnCosine.addActionListener(this);
        btnTan.addActionListener(this);
        btnPow.addActionListener(this);
        btnSqrt.addActionListener(this);
        btnModulo.addActionListener(this);
        btnLog.addActionListener(this);
        
        JPanel p = new JPanel();
        
        p.add(val1); 
        p.add(val2);
        p.add(btnPlus);
        p.add(btnMinus);
        p.add(btnMultiply);
        p.add(btnDiv);
        p.add(btnSine);
        p.add(btnCosine);
        p.add(btnTan);
        p.add(btnPow);
        p.add(btnSqrt);
        p.add(btnModulo);
        p.add(btnLog);
        
        c.add(p);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int a, b;
        
        if(e.getSource()== btnPlus){
            
            a = Integer.parseInt(val1.getText());
            b = Integer.parseInt(val2.getText());
            val1.setText("" + cp.sum(a, b));
            val2.setText("");
            
       }
       
       else if(e.getSource()== btnMinus){
           a = Integer.parseInt(val1.getText());
           b = Integer.parseInt(val2.getText());
           val1.setText("" + cp.sub(a, b));
           val2.setText("");
       }
       
       else if(e.getSource() == btnMultiply){
           a = Integer.parseInt(val1.getText());
            b = Integer.parseInt(val2.getText());
           val1.setText("" + cp.multiply(a, b));
           val2.setText("");
       }
       
       else if(e.getSource() == btnDiv){
           a = Integer.parseInt(val1.getText());
            b = Integer.parseInt(val2.getText());
           val1.setText("" + cp.divide(a, b));
           val2.setText("");
       }
       else if(e.getSource() == btnCosine){
           double txtDouble = Double.parseDouble(val1.getText());
           double d_result = cp.calcCos(txtDouble);
           val1.setText(Double.toString(d_result));
           val2.setText("");
       }
        else if(e.getSource() == btnTan){
           double txtDouble = Double.parseDouble(val1.getText());
           double d_result = cp.calcTan(txtDouble);
           val1.setText(Double.toString(d_result));
           val2.setText("");
       }
        else if(e.getSource() == btnSine){
           double txtDouble = Double.parseDouble(val1.getText());
           double d_result = cp.calcSine(txtDouble);
           val1.setText(Double.toString(d_result));
           val2.setText("");
        }
    }
    
    public static void main(String[] args) {
       CalculatorVisual calc = new CalculatorVisual();
       calc.setSize(300,300);
       calc.setVisible(true);
       calc.setDefaultCloseOperation(3);
    }
}