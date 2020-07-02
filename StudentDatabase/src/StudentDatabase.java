//Autumn Capasso
//UMUC
//OCT 9,2018
//Project 4 Student Database GUI


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;



public class StudentDatabase extends JFrame implements ActionListener {

    //Class Variables
    private String selection;
    private String name;
    private String id;
    private String major;
    String UpgradeCredits;



    //GUI Variables
    private javax.swing.JLabel ChooseselectionLabel;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JLabel MajorLabel;
    private javax.swing.JTextField MajorTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton ProcessRequestButton;
    private javax.swing.JLabel ProjectLabel;
    private javax.swing.JComboBox<String> jComboBox1;

    //Create HashMap
    HashMap<Integer, Student> studentData = new HashMap<Integer, Student>();

    //new Student object
    Student student = new Student("", "");

    //Constructor
    public StudentDatabase() {
        initComponents();
    }


    //GUI Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        ProjectLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField(null);
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField(null);
        MajorLabel = new javax.swing.JLabel();
        MajorTextField = new javax.swing.JTextField(null);
        ChooseselectionLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        ProcessRequestButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //Create HashMap
        HashMap<String, Student> studentData = new HashMap<>();

        ProjectLabel.setText("Project4");

        IDLabel.setText("Id:");

        IdTextField.setToolTipText("");

        NameLabel.setText("Name:");

        MajorLabel.setText("Major ");

        ChooseselectionLabel.setText("Choose Selection:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Insert", "Delete", "Find", "Update"}));
        jComboBox1.setToolTipText("");

        ProcessRequestButton.setText("Process request");
        ProcessRequestButton.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(166, 166, 166)
                                                .addComponent(ProjectLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(86, 86, 86)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(NameLabel)
                                                        .addComponent(IDLabel))
                                                .addGap(42, 42, 42)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(ProcessRequestButton)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(MajorLabel)
                                                                        .addComponent(ChooseselectionLabel))
                                                                .addGap(42, 42, 42)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(MajorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(13, 13, 13)
                                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ProjectLabel)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(IDLabel)
                                        .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NameLabel)
                                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MajorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MajorLabel))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ChooseselectionLabel))
                                .addGap(18, 18, 18)
                                .addComponent(ProcessRequestButton)
                                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>


    //Listener for Process Button
    public void actionPerformed(ActionEvent evt) {
        System.out.println("In Action Performed");
        id = (IdTextField.getText());
        name = NameTextField.getText();  //you are not using these within this method.  You could if you wanted to use them with the Student constructor which would make sense.
        major = MajorTextField.getText();

        System.out.println("ID is "+id);

        if (id.isEmpty()) {
            //throw new NullPointerException();
            System.out.println("No ID");
            JOptionPane.showMessageDialog(null, " No ID Insert could not be completed");

        } else
        {

            selection = String.valueOf(jComboBox1.getSelectedIndex());
            switch (selection) {

                case "0": //insert
                    System.out.println("Case 0");
                    if (!studentData.containsKey(id)) {  //logic didn't make sense.  Need to make sure it's not there.
                        newStudent(); //ok, need to populate the student object and add to the arraylist.  I would pass the id from here rather than using another getID method.
                        break;
                    } else JOptionPane.showMessageDialog(null, "Insert could not be completed");


                case "1": //delete
                    if (studentData.containsKey(Integer.parseInt(id))) {
                        deleteStudent(id);
                        break;
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "Delete could not be completed");
                        break;
                    }


                case "2": //find
                    System.out.println("Case 2");
                    if (studentData.containsKey(Integer.parseInt(id))) {
                        System.out.println("Student in hashmap");
                        findStudent(Integer.parseInt(id));
                        break;
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "Find could not be completed. No Record");
                        break;
                    }



                case "3": //update
                    if (studentData.containsKey(Integer.parseInt(id))) {
                        updateStudent(id);
                        break;

                    } else {
                        JOptionPane.showMessageDialog(null, "Update could not be completed", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
            }// end switch
        } // end else


    } //end method

    //Student ID Method
    private int getStudentId() {
        String stringID = IdTextField.getText();
        int id = Integer.parseInt(stringID);
        return id;
    }

    //New student method
    private void newStudent() {
        int id = getStudentId();
        System.out.println("Adding Student "+id);

        String studentName = NameTextField.getText();
        String studentMajor = MajorTextField.getText();

        Student newStudent = new Student(studentName, studentMajor);

        if (studentData.containsKey(id)) {
            JOptionPane.showMessageDialog(this, "Student ID" + id +  "\n Student name:" + studentName + "Major:" + studentMajor + "is already in database",
                    " Add student",
                    JOptionPane.PLAIN_MESSAGE);


        } else {
            System.out.println("Adding Student to hashmap "+id);
            studentData.put(id, newStudent);
            JOptionPane.showMessageDialog(this, "Student ID" + id + "\n Student name:" + name + "\n Major:" + major +  "\n You have sucessfully entered student Id",
                    "Add Student",
                    JOptionPane.PLAIN_MESSAGE);

        }
    }


    ///Delete student method
    private void deleteStudent(String id) {



        if (studentData.containsKey(Integer.parseInt(id))) {
            studentData.remove(Integer.parseInt(id)); //you were missing this
            JOptionPane.showMessageDialog(this, "Student ID"
                            + id +  "\n Student name:" + name + "Major:" + major + " has now been removed from the database. ",
                    "Delete Student",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this, "Student ID" + id + "This id is not in database",
                    "Delete Student",
                    JOptionPane.WARNING_MESSAGE);
        }

    }



    //Update student method
    private void updateStudent(String id){

        System.out.println("in update method");

        Student StudentRecord = studentData.get(Integer.parseInt(id));
        String updateCredits = null;
        String updateGrades = null;
        //int studentCredit = Integer.parseInt(updateCredits);
        int studentCredit = 0;
        String gradeList [] = {"A", "B", "C", "D","F"};
        String creditList [] = {"3", "6"};

        Student newStudent = new Student(name,major );

        if(studentData.containsKey(Integer.parseInt(id))) {
            String[] grades = { "A", "B", "C", "D", "E", "F" };
            System.out.println("Getting grade");
            String grade = (String) JOptionPane.showInputDialog(null, "Choose Grade", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null, grades, grades[0]);
            System.out.println("Got grade");
            String[] credits = { "3", "6" };
            String credit = (String) JOptionPane.showInputDialog(null, "Choose Grade", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null, credits, credits[0]);
            System.out.println("Got credit");
            student.CourseCompleted(grade, Integer.parseInt(credit));
/*
            String gradesString = (String) JOptionPane.showInputDialog(null, "Choose Grades: ", "", JOptionPane.QUESTION_MESSAGE, null, gradeList, "check");
            String credits = (String) JOptionPane.showInputDialog(null, "Choose Credit: ", "", JOptionPane.QUESTION_MESSAGE, null, creditList, "check");
            student.CourseCompleted(String.valueOf(gradesString.charAt(0)), Integer.parseInt(credits));
            studentData.put(Integer.parseInt(id), student);
*/
        }else { System.out.println("No ID in DB");
        }
    }

    //Find student method
    private void findStudent(int id){
        id = getStudentId();

        if(studentData.containsKey(id)){
            Student studentInfo = studentData.get(id);
            JOptionPane.showMessageDialog(this, studentInfo.toString(), "Find a Student",
                    JOptionPane.PLAIN_MESSAGE );
        }else {
            JOptionPane.showMessageDialog(this, + id + "This Student ID is not in the database",
                    "Find a Student",
                    JOptionPane.WARNING_MESSAGE);

        }
    }

    //Main Method
    public static void main (String [] args){
        StudentDatabase sd = new StudentDatabase();
        sd.setVisible(true);
    }


}

