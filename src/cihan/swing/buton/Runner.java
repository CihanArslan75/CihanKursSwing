package cihan.swing.buton;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
class Runner

{
    public static void main(String[] args)

    {

        butMaddFrame myFrame = new butMaddFrame();

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class butMaddFrame extends JFrame implements ActionListener

{

    JButton[][] buttons = new JButton[4][10];
    JPanel mPanel = new JPanel();
    JPanel bPanel = new JPanel();
    JPanel cPanel = new JPanel();
    JTextArea scoreKeeper = new JTextArea();
    Container c = getContentPane();
    int[][] intArray = new int[4][10];
    public butMaddFrame()

    {

        butGen();
        score2();
        //cPanel.add(scoreKeeper);
        bPanel.setLayout(new GridLayout(4,10));
        mPanel.setLayout(new BorderLayout());
        mPanel.add(bPanel, BorderLayout.CENTER);
        mPanel.add(cPanel, BorderLayout.SOUTH);
        c.add(mPanel);
        setTitle("ButtonMaddness");
        setSize(1000,400);
        setLocation(200,200);
        setVisible(true);
    }
    private void butGen()

    {
        for(int i=0;i<4;i++)
            for(int j=0;j<10;j++)
            {
                buttons[i][j] = new JButton(String.valueOf(i)+"x"+String.valueOf(j));
                buttons[i][j].setActionCommand("button" +i +"_" +j);
                buttons[i][j].addActionListener(this);
                bPanel.add(buttons[i][j]);
            }
    }

    private void score()

    {
      String string = "";
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<10;j++)
                string += i+"x"+j+" => " +String.valueOf(intArray[i][j]) +"\t";
            string+= "\n";

        }
        scoreKeeper.setText(string);
    }
 

    private void score2()
    {
        for(int i=0;i<4;i++)
            for(int j=0;j<10;j++)
                buttons[i][j].setText(String.valueOf(intArray[i][j]));
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().contains("button"))
        {
            int i = Integer.parseInt(Character.toString(e.getActionCommand().replaceAll("button","").replaceAll("_", "").charAt(0)));
            int j = Integer.parseInt(Character.toString(e.getActionCommand().replaceAll("button","").replaceAll("_", "").charAt(1)));
            intArray[i][j]++;
            System.out.println(e.getActionCommand() +"  " +i +"  " +j);
        }
        score2();
    }
}
