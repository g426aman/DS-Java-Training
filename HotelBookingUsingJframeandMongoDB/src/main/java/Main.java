import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Hotel_Booking {
    public static void main(String[] args) {
        Hotel_Booking();
    }
    static void Hotel_Booking(){
        JFrame frame=new JFrame();
        ImageIcon imageIcon=new ImageIcon("C:\\Users\\nikhi\\Downloads\\Photography Portfolio Website in Grey  Black  Light Experimental Style (14).png");
        frame.setContentPane(new JLabel(imageIcon));


//        JPanel panel=new JPanel();
//        panel.setBackground(new Color(0, 0, 0,135));
//        panel.setBounds(650,0,800,1000);
//        panel.setPreferredSize(new Dimension(600,600));

        JLabel l1 = new JLabel("Full Name");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l1.setForeground(Color.WHITE);
        l1.setBounds(120, 200, 167, 25);
        frame.getContentPane().add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(220, 200, 198, 25);
        t1.setBorder(new LineBorder(Color.white,2));
        frame.getContentPane().add(t1);


        JLabel l2 = new JLabel("Phone_No");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setForeground(Color.white);
        l2.setBounds(120, 270, 134, 20);
        frame.getContentPane().add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(220, 270, 199, 25);
        t2.setBorder(new LineBorder(Color.white,2));
        frame.getContentPane().add(t2);

        JLabel l3 = new JLabel("Email id");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setBounds(120, 340, 167, 25);
        l3.setForeground(Color.white);
        frame.getContentPane().add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(220, 340, 198, 25);
        t3.setBorder(new LineBorder(Color.white,2));
        frame.getContentPane().add(t3);


        JLabel l4 = new JLabel("Date-of-Birth");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l4.setForeground(Color.WHITE);
        l4.setBounds(120, 410, 167, 25);
        frame.getContentPane().add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(220, 410, 198, 25);
        t4.setBorder(new LineBorder(Color.white,2));
        frame.getContentPane().add(t4);


        JLabel l5= new JLabel("Gender");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setForeground(Color.WHITE);
        l5.setBounds(120, 480, 114, 14);
        frame.getContentPane().add(l5);

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBackground(new Color(255, 255, 255, 255));
        r1.setForeground(Color.BLACK);
        r1.setBorder(new LineBorder(Color.WHITE,2));
//        rdbtnNewRadioButton.setSelected(true);
        r1.setFont(new Font("White", Font.PLAIN, 13));
        r1.setBounds(220, 480, 70, 23);




        JRadioButton r2 = new JRadioButton("Female");
        r2.setBackground(new Color(255, 255, 255, 255));
        r2.setForeground(Color.BLACK);
        r2.setBorder(new LineBorder(Color.WHITE,2));
        r2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        r2.setBounds(220, 510, 70, 23);
        frame.getContentPane().add(r2);

        JRadioButton r3 = new JRadioButton("Other");
        r3.setBackground(new Color(255, 255, 255, 255));
        r3.setBorder(new LineBorder(Color.WHITE,2));
        r3.setForeground(Color.black);
        r3.setFont(new Font("Tahoma", Font.PLAIN, 13));
        r3.setBounds(220, 540, 70, 23);
        frame.getContentPane().add(r3);


        JLabel l6 = new JLabel("Room Prefrence");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l6.setForeground(Color.WHITE);
        l6.setBounds(480, 200, 167, 25);
        frame.getContentPane().add(l6);

        String s1[] = { "Standard", "Deluxe", "Suite"};
        JComboBox comboBox1 = new JComboBox(s1);
        comboBox1.setBounds(630, 200, 167, 25);
        frame.getContentPane().add(comboBox1);

        JLabel l7 = new JLabel("No of Adults");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setForeground(Color.WHITE);
        l7.setBounds(480, 270, 167, 25);
        frame.getContentPane().add(l7);

        String s2[] = { "1","2","3","4","5","6","7","8","9" };
        JComboBox comboBox2 = new JComboBox(s2);
        comboBox2.setBounds(630, 270, 167, 25);
        frame.getContentPane().add(comboBox2);


        JLabel l8 = new JLabel("No of Children");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l8.setForeground(Color.WHITE);
        l8.setBounds(480, 340, 167, 25);
        frame.getContentPane().add(l8);

        String s3[] = { "1","2","3","4","5","6","7","8","9" };
        JComboBox comboBox3 = new JComboBox(s3);
        comboBox3.setBounds(630, 340, 167, 25);
        frame.getContentPane().add(comboBox3);

        JLabel l9= new JLabel("State");
        l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l9.setForeground(Color.WHITE);
        l9.setBounds(480, 410, 167, 25);
        frame.getContentPane().add(l9);

        String State[] = {"Choose State","Andhra Pradesh",
                "Arunachal Pradesh",
                "Assam",
                "Bihar",
                "Chhattisgarh",
                "Goa",
                "Gujarat",
                "Haryana",
                "Himachal Pradesh",
                "Jharkhand",
                "Karnataka",
                "Kerala",
                "Madhya Pradesh",
                "Maharashtra",
                "Manipur",
                "Meghalaya",
                "Mizoram",
                "Nagaland",
                "Odisha",
                "Punjab",
                "Rajasthan",
                "Sikkim",
                "Tamil Nadu",
                "Telangana",
                "Tripura",
                "Uttar Pradesh",
                "Uttarakhand",
                "West Bengal",
                "Andaman and Nicobar Islands",
                "Chandigarh",
                "Dadra and Nagar Haveli and Daman and Diu",
                "Delhi",
                "Jammu and Kashmir",
                "Ladakh",
                "Lakshadweep",
                "Puducherry" };
        JComboBox comboBox4 = new JComboBox(State);
        comboBox4.setBounds(630, 410, 167, 25);
        frame.getContentPane().add(comboBox4);



        JLabel l10 = new JLabel("City Name");
        l10.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l10.setForeground(Color.WHITE);
        l10.setBounds(480, 480, 167, 25);
        frame.getContentPane().add(l10);

        JTextField t5 = new JTextField();
        t5.setBounds(600, 480, 198, 25);
        t5.setBorder(new LineBorder(Color.white,2));
        frame.getContentPane().add(t5);


        JLabel l11 = new JLabel("Pin Code");
        l11.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l11.setForeground(Color.WHITE);
        l11.setBounds(480, 530, 167, 25);
        frame.getContentPane().add(l11);

        JTextField t6 = new JTextField();
        t6.setBounds(600, 530, 198, 25);
        t6.setBorder(new LineBorder(Color.white,2));
        frame.getContentPane().add(t6);


        JLabel l12 = new JLabel("Check-in-Date");
        l12.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l12.setForeground(Color.WHITE);
        l12.setBounds(850, 200, 167, 25);
        frame.getContentPane().add(l12);

        JTextField t7 = new JTextField();
        t7.setBounds(980, 200, 198, 25);
        t7.setBorder(new LineBorder(Color.white,2));
        frame.getContentPane().add(t7);

        JLabel l13 = new JLabel("Check-in-Time");
        l13.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l13.setForeground(Color.WHITE);
        l13.setBounds(850, 270, 167, 25);
        frame.getContentPane().add(l13);

        JTextField t8 = new JTextField();
        t8.setBounds(980, 270, 198, 25);
        t8.setBorder(new LineBorder(Color.white,2));
        frame.getContentPane().add(t8);


        JLabel l14 = new JLabel("Check-out-Date");
        l14.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l14.setForeground(Color.WHITE);
        l14.setBounds(850, 340, 167, 25);
        frame.getContentPane().add(l14);

        JTextField t9= new JTextField();
        t9.setBounds(980, 340, 198, 25);
        t9.setBorder(new LineBorder(Color.white,2));
        frame.getContentPane().add(t9);

        JLabel l15 = new JLabel("Check-out-Time");
        l15.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l15.setForeground(Color.WHITE);
        l15.setBounds(850, 410, 167, 25);
        frame.getContentPane().add(l15);

        JTextField t10 = new JTextField();
        t10.setBounds(980, 410, 198, 25);
        t10.setBorder(new LineBorder(Color.white,2));
        frame.getContentPane().add(t10);


        JLabel l16 = new JLabel("Adhar No.");
        l16.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l16.setForeground(Color.WHITE);
        l16.setBounds(850, 480, 167, 25);
        frame.getContentPane().add(l16);

        JTextField t11 = new JTextField();
        t11.setBounds(980, 480, 198, 25);
        t11.setBorder(new LineBorder(Color.white,2));
        frame.getContentPane().add(t11);

        JLabel l17= new JLabel("Room Book");
        l17.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l17.setForeground(Color.WHITE);
        l17.setBounds(850, 530, 167, 25);
        frame.getContentPane().add(l17);


        String s5[] = { "1","2","3","4","5","6","7","8","9" };
        JComboBox comboBox5 = new JComboBox(s5);
        comboBox5.setBounds(980, 530, 167, 25);
        frame.getContentPane().add(comboBox5);


        JButton button=new JButton("Submit");
        button.setForeground(new Color(0));
        button.setBackground(new Color(122, 243, 204, 255));
        button.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button.setBorder(null);
        button.setBounds(700,600,200,35);
        frame.getContentPane().add(button);


        JButton button1=new JButton("New Reservation");
        button1.setForeground(new Color(0));
        button1.setBackground(new Color(121, 178, 250, 255));
        button1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button1.setBorder(null);
        button1.setBounds(400,600,200,35);
        frame.getContentPane().add(button1);

        frame.pack();
        frame.getContentPane().add(r1);
        frame.setLayout(null);
        frame.setSize(1300,768); // 1080
        frame.setVisible(true);
//
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String str="";

                if (r1.isSelected()) {
                    str="Male";
                } else if (r2.isSelected()) {
                    str="Female";
                } else if (r3.isSelected()) {
                    str="other";
                }

                var client = MongoClients.create("mongodb://localhost:27017/");
                var database = client.getDatabase("HotelBookingDB");

//                database.createCollection("Booking");

                var collection = database.getCollection("Booking");

                var document = new Document();

                Random random = new Random();
                document.append("reservationId",random.nextInt(999999));
                document.append("fullName",t1.getText());
                document.append("phoneNo",t2.getText());
                document.append("emailId",t3.getText());
                document.append("DOB",t4.getText());
                document.append("gender",str);
                document.append("roomPrefernce",comboBox1.getSelectedItem().toString());
                document.append("noOfAdults",comboBox2.getSelectedItem().toString());
                document.append("noOfChildren",comboBox3.getSelectedItem().toString());
                document.append("state",comboBox4.getSelectedItem().toString());
                document.append("city",t5.getText());
                document.append("pinCode",t6.getText());
                document.append("checkinDate",t7.getText());
                document.append("checkinTime",t8.getText());
                document.append("checkoutDate",t9.getText());
                document.append("checkoutTime",t10.getText());
                document.append("adharNo",t11.getText());
                document.append("roomBook",comboBox5.getSelectedItem().toString());

                collection.insertOne(document);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
                t10.setText("");
                t11.setText("");
//
            }
        });

    }
}