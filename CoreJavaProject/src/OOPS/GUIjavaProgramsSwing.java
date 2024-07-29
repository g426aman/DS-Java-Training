package OOPS;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIjavaProgramsSwing {
    public static void main(String[] args) {
        //to create a frame using swing in java
        JFrame frame = new JFrame(   "BMI Calculator");
        //create UI components for bmi
        JLabel heightLabel = new JLabel("Enter your height");
        JLabel weightLabel = new JLabel("Enter your weight");
        JLabel bmiLable = new JLabel();

        JTextField weightField=new JTextField();
        JTextField heightField=new JTextField();

        JButton bmiButton=new JButton("Calculate BMI");
        //to set the size and position of UI components
        heightLabel.setBounds(30, 30, 120, 40);
        heightField.setBounds(170, 30, 50, 40);
        weightLabel.setBounds(30, 80, 150, 40);
        weightField.setBounds(170, 80, 50, 40);
        bmiButton.setBounds(20, 130, 120, 40);
        bmiLable.setBounds(170, 130, 100, 40);
        // to attach the label to the frame
        frame.add(heightLabel);
        frame.add(heightField);
        frame.add(weightLabel);
        frame.add(weightField);
        frame.add(bmiButton);
        frame.add(bmiLable);
        //to build the default layout
        frame.setLayout(null);
        //to set the size of the frame
        frame.setSize(  300,     250);
        //to visible the frame on screen
        frame.setVisible(true);
        //to click on the bmi calculate button
        bmiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to apply the bmi formula
                float weight = Float.parseFloat(weightField.getText().toString());
                float height = Float.parseFloat(heightField.getText().toString());

                float output=weight/(height*height);
                //18.5<under weight,18.5 to 24.9=normal , 24.9 to 29.9 overweight

                if(output<18.5)
                {
                    bmiLable.setText("Im under weight");
                } else if (output>=18.5 && output<24.9) {
                    bmiLable.setText("Im normal");

                } else if (output>24.9 && output<29.9) {
                    bmiLable.setText("Im overweight");

                } else{
                    bmiLable.setText("Im underweight");
                }
            }
        });
    }
}
