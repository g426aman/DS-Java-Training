import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //pass the database,url,username,password in string
        String url = "jdbc:mysql://localhost:3306/expensedb";
        String user = "root";
        String password = "";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully");

            //Design the java UI for expense Calculator
            JFrame frame=new JFrame("Aman Expenses");
            JLabel titleLabel=new JLabel("Expense ");
            titleLabel.setBounds(210, 20, 80, 50);
            titleLabel.setForeground(Color.BLUE);
            frame.add(titleLabel);


            JLabel expensetypeLabel=new JLabel("Enter Expense Type ");
            expensetypeLabel.setBounds(20, 50, 150, 50);
            expensetypeLabel.setForeground(Color.RED);
            frame.add(expensetypeLabel);

            JTextField expensetype=new JTextField();
            expensetype.setBounds(170, 60, 100, 30);
            frame.add(expensetype);

            JLabel expenseamountLabel=new JLabel("Enter Expense Amount ");
            expenseamountLabel.setBounds(20, 80, 170, 50);
            expenseamountLabel.setForeground(Color.RED);
            frame.add(expenseamountLabel);

            JTextField expenseamount=new JTextField();
            expenseamount.setBounds(170, 90, 100, 30);
            frame.add(expenseamount);

            JLabel incomeamountLabel=new JLabel("Enter Income Amount ");
            incomeamountLabel.setBounds(20, 110, 170, 50);
            incomeamountLabel.setForeground(Color.RED);
            frame.add(incomeamountLabel);

            JTextField incomeamount=new JTextField();
            incomeamount.setBounds(170, 120, 100, 30);
            frame.add(incomeamount);

            JButton saveButton=new JButton("Save");
            saveButton.setBounds(210, 250, 80, 30);
            frame.add(saveButton);
            //to click the save button
            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //to insert the data into the table
                    String insert = "insert into expensetb(incomeamount,expensetype,expenseamount) values(?, ?, ?)";
                    PreparedStatement ps = null;
                    try {
                        ps = conn.prepareStatement(insert);
                        ps.setInt(1,Integer.parseInt(incomeamount.getText()));
                        ps.setString(2,expensetype.getText());
                        ps.setInt(3, Integer.parseInt(expenseamount.getText()));
                        ps.execute();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            });

            frame.setSize(500,400);
            frame.setLayout(null);
            frame.setVisible(true);
            //to insert the data into table


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}