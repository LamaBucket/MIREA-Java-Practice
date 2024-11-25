package Task15;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    
    private static JLabel label;

    private static Double _firstNumber;
    private static Double _secondNumber;
    private static String _action;
    private static Boolean _resultCalculated = true;

    public static String GetLabelText(){
        return  label.getText();
    }

    public static void SetLabelText(String text){
        label.setText(text);
    }

    public static JButton GetAppendButton(String value){
        JButton result = new JButton(value);

        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(_resultCalculated){
                    label.setText("");
                    _resultCalculated = false;
                }

                String newText = label.getText() + value;
                label.setText(newText);
            }
        });

        return result;
    }

    public static JButton GetActionButton(String value){
        JButton result = new JButton(value);

        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
                if(_firstNumber == null){
                    _firstNumber = Double.parseDouble(GetLabelText());
                }
                
                _action = value;

                SetLabelText("");
            }
        });

        return result;
    }

    public static JButton GetEquals(){
        JButton result = new JButton("=");

        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
                if(_firstNumber == null){
                    return;
                }

                _secondNumber = Double.valueOf(GetLabelText());

                Double result = ParseResult();

                String output = "";

                if(result == null){
                    output = "Can`t Divide By Zero";
                }
                else{
                    output = String.format("%.5f", result);
                }

                _firstNumber = null;
                _secondNumber = null;
                _action = null;
                _resultCalculated = true;

                SetLabelText(output);
            }
        });

        return result;
    }

    public static Double ParseResult(){
        switch(_action){
            case "+":
                return _firstNumber + _secondNumber;
            case "-":
                return _firstNumber - _secondNumber;
            case "*":
                return _firstNumber * _secondNumber;
            case "/":
                return _secondNumber == 0 ? null : _firstNumber / _secondNumber;
            default:
                return null;
        }
    }

    public static void Setup(Calculator app){
        app.setTitle("My Calculator");
        app.setMinimumSize(new Dimension(300, 450));

        JPanel gui = new JPanel();
        app.add(gui);

        gui.setLayout(new GridLayout(2, 1));

        JLabel label = new JLabel("", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 22));
        
        JPanel buttons = new JPanel();


        buttons.setLayout(new GridLayout(4, 4));


        JButton btn0 = GetAppendButton("0");
        JButton btn1 = GetAppendButton("1");
        JButton btn2 = GetAppendButton("2");
        JButton btn3 = GetAppendButton("3");
        JButton btn4 = GetAppendButton("4");
        JButton btn5 = GetAppendButton("5");
        JButton btn6 = GetAppendButton("6");
        JButton btn7 = GetAppendButton("7");
        JButton btn8 = GetAppendButton("8");
        JButton btn9 = GetAppendButton("9");

        JButton btnAdd = GetActionButton("+");
        JButton btnSubtract = GetActionButton("-");
        JButton btnMultiply = GetActionButton("*");
        JButton btnDivide = GetActionButton("/");
        JButton btnPoint = GetAppendButton(".");

        JButton btnEquals = GetEquals();

        buttons.add(btn7);
        buttons.add(btn8);
        buttons.add(btn9);
        buttons.add(btnDivide);
        buttons.add(btn4);
        buttons.add(btn5);
        buttons.add(btn6);
        buttons.add(btnMultiply);
        buttons.add(btn1);
        buttons.add(btn2);
        buttons.add(btn3);
        buttons.add(btnSubtract);
        buttons.add(btn0);
        buttons.add(btnPoint);
        buttons.add(btnEquals);
        buttons.add(btnAdd);

        
        gui.add(label);
        gui.add(buttons);

        app.label = label;
        
        app.pack();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    
    }


    public Calculator() {
        Setup(this);
    }   
}
