import java.awt.*;

public class Calculator  {
    Frame frame ;
    Panel textPanel ;
    Panel enterPanel ;
    Panel touchPanel;
    Panel operationPanel;
    Button one,two,three,four,five,six,seven,eight,nine,zero;
    Button clear,plus,minus,multiply,divide,enter,plusMinus;
    TextField textField;
    public Calculator(){
        frame= new Frame("Calculatrice");
        frame.setBackground(new Color(216,192,160));
        textPanel= new Panel();
        textPanel.setLayout(new GridLayout(1,1));
        enterPanel= new Panel();
        enterPanel.setLayout(new GridLayout(1,1));
        touchPanel = new Panel();
        touchPanel.setLayout(new GridLayout(4,3));
        operationPanel = new Panel();
        operationPanel.setLayout(new GridLayout(4,1));
        //Create Buttons
        one =new Button("1");
        one.setForeground(Color.blue);
        two =new Button("2");
        two.setForeground(Color.blue);
        three =new Button("3");
        three.setForeground(Color.blue);
        four =new Button("4");
        four.setForeground(Color.blue);
        five =new Button("5");
        five.setForeground(Color.blue);
        six =new Button("6");
        six.setForeground(Color.blue);
        seven =new Button("7");
        seven.setForeground(Color.blue);
        eight =new Button("8");
        eight.setForeground(Color.blue);
        nine =new Button("9");
        nine.setForeground(Color.blue);
        zero =new Button("0");
        zero.setForeground(Color.blue);
        clear =new Button("ClearAll");
        clear.setForeground(new Color(213,24,210));
        plus =new Button("+");
        plus.setForeground(Color.red);
        minus =new Button("-");
        minus.setForeground(Color.red);
        multiply =new Button("*");
        multiply.setForeground(Color.red);
        divide =new Button("/");
        divide.setForeground(Color.red);
        enter =new Button("Enter");
        enter.setForeground(new Color(5,119,7));
        plusMinus =new Button("+/-");
        plusMinus.setForeground(Color.blue);
        // create text field
        textField=new TextField(28);
        frame.setLayout(new BorderLayout());
        frame.setSize(300,300);
        // add textfield to textPanel
        textPanel.add(textField);
        //add enter button to enterPanel
        enterPanel.add(enter);
        // add buttons to touchPanel
        touchPanel.add(seven);
        touchPanel.add(eight);
        touchPanel.add(nine);
        touchPanel.add(four);
        touchPanel.add(five);
        touchPanel.add(six);
        touchPanel.add(one);
        touchPanel.add(two);
        touchPanel.add(three);
        touchPanel.add(zero);
        touchPanel.add(plusMinus);
        touchPanel.add(clear);
        //add Buttons to operationPanel
        operationPanel.add(plus);
        operationPanel.add(minus);
        operationPanel.add(multiply);
        operationPanel.add(divide);
        //add panels to frame
        frame.add(textPanel,"North");
        frame.add(enterPanel,"South");
        frame.add(touchPanel,"Center");
        frame.add(operationPanel,"East");
        //make the frame visible
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // write your code here
        Calculator calculator = new Calculator();
    }
}

