import java.awt.*;
import java.awt.event.*;


public class Calculatrice implements ActionListener {
    int result , operation , numberOfOperator ;
    String firstItem="",secondItem="",text="";
    Frame frame ;
    Panel textPanel ;
    Panel enterPanel ;
    Panel touchPanel;
    Panel operationPanel;
    Button one,two,three,four,five,six,seven,eight,nine,zero;
    Button clear,plus,minus,multiply,divide,enter,plusMinus;
    TextField textField;
    Font font = new Font("Courier New",1,17);
    public Calculatrice(){

        frame= new Frame("Calculator");
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
        one.addActionListener(this );
        two =new Button("2");
        two.setForeground(Color.blue);
        two.addActionListener(this );
        three =new Button("3");
        three.setForeground(Color.blue);
        three.addActionListener(this );
        four =new Button("4");
        four.setForeground(Color.blue);
        four.addActionListener(this );
        five =new Button("5");
        five.setForeground(Color.blue);
        five.addActionListener(this );
        six =new Button("6");
        six.setForeground(Color.blue);
        six.addActionListener(this );
        seven =new Button("7");
        seven.setForeground(Color.blue);
        seven.addActionListener(this );
        eight =new Button("8");
        eight.setForeground(Color.blue);
        eight.addActionListener(this );
        nine =new Button("9");
        nine.setForeground(Color.blue);
        nine.addActionListener(this );
        zero =new Button("0");
        zero.setForeground(Color.blue);
        zero.addActionListener(this );
        clear =new Button("ClearAll");
        clear.setForeground(new Color(213,24,210));
        clear.addActionListener(this );
        clear.setFont(font);
        plus =new Button("+");
        plus.setForeground(Color.red);
        plus.addActionListener(this );
        plus.setFont(font);
        minus =new Button("-");
        minus.setForeground(Color.red);
        minus.addActionListener(this );
        minus.setFont(font);
        multiply =new Button("*");
        multiply.setForeground(Color.red);
        multiply.addActionListener(this );
        multiply.setFont(font);
        divide =new Button("/");
        divide.setForeground(Color.red);
        divide.addActionListener(this );
        divide.setFont(font);
        enter =new Button("Enter");
        enter.setForeground(new Color(5,119,7));
        enter.addActionListener(this );
        enter.setFont(font);
        plusMinus =new Button("+/-");
        plusMinus.setForeground(Color.blue);
        plusMinus.addActionListener(this );
        // create text field
        textField=new TextField(28);
        textField.setFont(font);
        frame.setLayout(new BorderLayout());
        frame.setSize(500,400);
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
        // add close button functionality
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                //System.exit(0);
                frame.dispose();
            }
        });
        //make the frame visible
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
       if (numberOfOperator<2){
           if(event.getSource()==clear){
               textField.setText("");
               firstItem="";
               secondItem="";
               numberOfOperator=0;
               operation=0;
               text="";
           }
           if(event.getSource()==plusMinus && firstItem=="" ){
               firstItem+="-";
               text+="-";
               textField.setText(text);
           }
           if(event.getSource()==plusMinus && operation>2 && secondItem==""){
               secondItem+="-";
               text+="-";
               textField.setText(text);
           }
           if (numberOfOperator==0){
               if(event.getSource()==one){
                   firstItem+="1";
                   text+="1";
                   textField.setText(text);
               }
               if(event.getSource()==two){
                   firstItem+="2";
                   text+="2";
                   textField.setText(text);
               }
               if(event.getSource()==three){
                   firstItem+="3";
                   text+="3";
                   textField.setText(text);
               }
               if(event.getSource()==four){
                   firstItem+="4";
                   text+="4";
                   textField.setText(text);
               }
               if(event.getSource()==five){
                   firstItem+="5";
                   text+="5";
                   textField.setText(text);
               }
               if(event.getSource()==six){
                   firstItem+="6";
                   text+="6";
                   textField.setText(text);
               }
               if(event.getSource()==seven){
                   firstItem+="7";
                   text+="7";
                   textField.setText(text);
               }
               if(event.getSource()==eight){
                   firstItem+="8";
                   text+="8";
                   textField.setText(text);
               }
               if(event.getSource()==nine){
                   firstItem+="9";
                   text+="9";
                   textField.setText(text);
               }
               if(event.getSource()==zero){
                   firstItem+="0";
                   text+="0";
                   textField.setText(text);
               }
               if(event.getSource()==plus && firstItem!=""){
                   text+="+";
                   textField.setText(text);
                   operation=1;
                   numberOfOperator++;
               }
               if(event.getSource()==minus && firstItem!=""){
                   text+="-";
                   textField.setText(text);
                   operation=2;
                   numberOfOperator++;
               }
               if(event.getSource()==multiply && firstItem!=""){
                   text+="*";
                   textField.setText(text);
                   operation=3;
                   numberOfOperator++;
               }
               if(event.getSource()==divide && firstItem!=""){
                   text+="/";
                   textField.setText(text);
                   operation=4;
                   numberOfOperator++;
               }

           }
           if (numberOfOperator==1){
               if(event.getSource()==enter && secondItem!=""){
                   if(operation==1){
                       result=Integer.parseInt(firstItem)+Integer.parseInt(secondItem);
                       text=text+"="+String.valueOf(result);
                       textField.setText(text);
                   }
                   if(operation==2){
                       result=Integer.parseInt(firstItem)-Integer.parseInt(secondItem);
                       text=text+"="+String.valueOf(result);
                       textField.setText(text);
                   }
                   if(operation==3){
                       result=Integer.parseInt(firstItem)*Integer.parseInt(secondItem);
                       text=text+"="+String.valueOf(result);
                       textField.setText(text);
                   }
                   if(operation==4){
                       if(Integer.parseInt(secondItem)==0){
                           text="You can't devide by zero !";
                       }
                       else {
                           result=Integer.parseInt(firstItem)/Integer.parseInt(secondItem);
                           text=text+"="+String.valueOf(result);
                       }

                       textField.setText(text);
                   }
                   firstItem="";
                   secondItem="";
                   numberOfOperator=0;
                   operation=0;
                   text="";
               }
               if(event.getSource()==one){
                   secondItem+="1";
                   text+="1";
                   textField.setText(text);
               }
               if(event.getSource()==two){
                   secondItem+="2";
                   text+="2";
                   textField.setText(text);
               }
               if(event.getSource()==three){
                   secondItem+="3";
                   text+="3";
                   textField.setText(text);
               }
               if(event.getSource()==four){
                   secondItem+="4";
                   text+="4";
                   textField.setText(text);
               }
               if(event.getSource()==five){
                   secondItem+="5";
                   text+="5";
                   textField.setText(text);
               }
               if(event.getSource()==six){
                   secondItem+="6";
                   text+="6";
                   textField.setText(text);
               }
               if(event.getSource()==seven){
                   secondItem+="7";
                   text+="7";
                   textField.setText(text);
               }
               if(event.getSource()==eight){
                   secondItem+="8";
                   text+="8";
                   textField.setText(text);
               }
               if(event.getSource()==nine){
                   secondItem+="9";
                   text+="9";
                   textField.setText(text);
               }
               if(event.getSource()==zero){
                   secondItem+="0";
                   text+="0";
                   textField.setText(text);
               }
           }
       }
    }
    public static void main(String[] args) {
        // write your code here
        Calculatrice calculator = new Calculatrice();
    }
}

