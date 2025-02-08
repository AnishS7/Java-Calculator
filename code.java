package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class calc implements ActionListener {
    double input, result;
    String cal;
    
    JFrame frame;
    JLabel label = new JLabel();
    JTextField textView = new JTextField();
    
    JButton clr = new JButton("CLR");
    JButton del = new JButton("DEL");
    JButton mul = new JButton("X");
    JButton div = new JButton("/");
    
    JButton sev = new JButton("7");
    JButton eig = new JButton("8");
    JButton nin = new JButton("9");
    JButton sub = new JButton("-");
    
    JButton fou = new JButton("4");
    JButton fiv = new JButton("5");
    JButton six = new JButton("6");
    JButton add = new JButton("+");
    
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton equ = new JButton("=");
    
    JButton zero = new JButton("0");
    JButton dot = new JButton(".");
            
   calc() {
        CreateInterface();
        InterfaceComponents();
        AddInterfaceActionListener();
    }
    
    public void CreateInterface() {
        frame = new JFrame();
        frame.setTitle("Calc");
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(305, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void InterfaceComponents() {
    label.setBounds(200,0,40,40);
    frame.add(label);
    textView.setBounds(10, 40, 270, 60 );
    textView.setEditable(false);
    textView.setHorizontalAlignment(SwingConstants.RIGHT);
    frame.add(textView);
    
    clr.setBounds(10,110,60,40);
    frame.add(clr);
    del.setBounds(80,110,60,40);
    frame.add(del);
    mul.setBounds(150,110,60,40);
    frame.add(mul);
    div.setBounds(220,110,60,40);
    frame.add(div);
    
    sev.setBounds(10,160,60,40);
    frame.add(sev);
    eig.setBounds(80,160,60,40);
    frame.add(eig);
   nin.setBounds(150,160,60,40);
    frame.add(nin);
    sub.setBounds(220,160,60,40);
    frame.add(sub);
    
    fou.setBounds(10,210,60,40);
    frame.add(fou);
    fiv.setBounds(80,210,60,40);
    frame.add(fiv);
   six.setBounds(150,210,60,40);
    frame.add(six);
    add.setBounds(220,210,60,40);
    frame.add(add);
    
    one.setBounds(10,260,60,40);
    frame.add(one);
    two.setBounds(80,260,60,40);
    frame.add(two);
   three.setBounds(150,260,60,40);
    frame.add(three);
    equ.setBounds(220,260,60,90);
    frame.add(equ);
    
    zero.setBounds(10, 310, 130, 40);
    frame.add(zero);
    dot.setBounds(150, 310, 60, 40);
    frame.add(dot);
    }
    
    public void AddInterfaceActionListener()
    {
    	clr.addActionListener(this);
    	del.addActionListener(this);
    	mul.addActionListener(this);
    	div.addActionListener(this);
    	
    	sev.addActionListener(this);
    	eig.addActionListener(this);
    	nin.addActionListener(this);
    	sub.addActionListener(this);
    	
    	fou.addActionListener(this);
    	fiv.addActionListener(this);
    	six.addActionListener(this);
    	add.addActionListener(this);
    	
    	one.addActionListener(this);
    	two.addActionListener(this);
    	three.addActionListener(this);
    	equ.addActionListener(this);
    	
    	zero.addActionListener(this);
    	dot.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	Object event= e.getSource();
    	System.out.println(event);
    	
    	if(event==one)
    		textView.setText(textView.getText()+"1");
    	else if(event==two)
    		textView.setText(textView.getText()+"2");
    	else if(event==three)
    		textView.setText(textView.getText()+"3");
    	else if(event==fou)
    		textView.setText(textView.getText()+"4");
    	else if(event==fiv)
    		textView.setText(textView.getText()+"5");
    	else if(event==six)
    		textView.setText(textView.getText()+"6");
    	else if(event==sev)
    		textView.setText(textView.getText()+"7");
    	else if(event==eig)
    		textView.setText(textView.getText()+"8");
    	else if(event==nin)
    		textView.setText(textView.getText()+"9");
    	else if(event==zero) {
    		if (textView.getText().equals("0"))
    		{
    			return;
    		}else {
    		textView.setText(textView.getText()+"0");}}
    	
    	else if(event==dot) {
    		if (textView.getText().contains("."))
    			return;
    		else
    			textView.setText(textView.getText()+".");}
    	else if(event==clr) {
    		textView.setText("");
    		label.setText("");
    	}
    	
    	else if(event==del)
    	{
    		int len=textView.getText().length();
    		int num=len-1;
    		if(len>0)
    		{
    			StringBuilder numString=new StringBuilder(textView.getText());
    			numString.deleteCharAt(num);
    			textView.setText(numString.toString());
    		}
    		if(textView.getText().endsWith(""))
    			label.setText("");
    	}
    	else if(event==mul) {
    		String presentNumber=textView.getText();
    		input=Double.parseDouble(textView.getText());
    		textView.setText("");
    		label.setText(presentNumber+"X");
    		cal="X";
    		
    	}
    	else if(event==div) {
    		String presentNumber=textView.getText();
    		input=Double.parseDouble(textView.getText());
    		textView.setText("");
    		label.setText(presentNumber+"/");
    		cal="/";
    		
    	}
    	else if(event==sub) {
    		String presentNumber=textView.getText();
    		input=Double.parseDouble(textView.getText());
    		textView.setText("");
    		label.setText(presentNumber+"-");
    		cal="-";
    		
    	}else if(event==add) {
    		String presentNumber=textView.getText();
    		input=Double.parseDouble(textView.getText());
    		textView.setText("");
    		label.setText(presentNumber+"+");
    		cal="+";
    		
    	}
    	
    	else if (event==equ)
    	{
    		switch (cal)
    		{
    		case "X":
    			result=input*(Double.parseDouble(textView.getText()));
    			if(Double.toString(result).endsWith(".0"))
    					textView.setText(Double.toString(result).replace(".0", ""));
    			else {
    				textView.setText(Double.toString(result));
    			label.setText("");}
    			break;
    		case "/":
    			result=input/(Double.parseDouble(textView.getText()));
    			if(Double.toString(result).endsWith(".0"))
    					textView.setText(Double.toString(result).replace(".0", ""));
    			else
    				textView.setText(Double.toString(result));
    			label.setText("");
    			break;
    		case "+":
    			result=input+(Double.parseDouble(textView.getText()));
    			if(Double.toString(result).endsWith(".0"))
    					textView.setText(Double.toString(result).replace(".0", ""));
    			else
    				textView.setText(Double.toString(result));
    			label.setText("");
    			break;
    		case "-":
    			result=input-(Double.parseDouble(textView.getText()));
    			if(Double.toString(result).endsWith(".0"))
    					textView.setText(Double.toString(result).replace(".0", ""));
    			else
    				textView.setText(Double.toString(result));
    			label.setText("");
    			break;
    		}
    	}
    		
    	
    	
    }
    public static void main(String[] args) {
        new calc();
    }
}
