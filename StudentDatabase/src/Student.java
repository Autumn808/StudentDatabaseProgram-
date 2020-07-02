//Autumn Capasso
//UMUC
//OCT 9,2018
//Project 4 Student Database GUI


import java.text.DecimalFormat;

public class Student {


    //Variables
    private String studentName;
    private String studentMajor;
    private int creditsCompleted;
    private int qualityPoints;
    private int numberGrade;
    private double credits;
    private double gpa = 4.0;
    private double creditHours;

   //Decimal Format
   static DecimalFormat df = new DecimalFormat("00.00");


    //Constructor for new student record
    public Student(String name, String major){
        this.studentName = name;
        this.studentMajor = major;
        creditsCompleted = 0;
        qualityPoints = 0;
    }


    //Course Completed method
    void CourseCompleted(String grade, int creditsHours){

        //switch case for grade

        switch (grade){
            case "A":
            numberGrade = 4;
            break;

            case "B":
                numberGrade = 3;
                break;


            case "C":
                numberGrade = 2;
                break;


            case "D":
                numberGrade = 1;
                break;


            case "F":
                numberGrade = 0;
                break;

        }


        //Will calculate the Number Grade
        numberGrade = numberGrade * creditsHours;

        //Will calculate Quality Points and credits
        qualityPoints += numberGrade;
        credits += creditsHours;

        gpa = numberGrade/credits;

        }


    //Method to Override toString and return a lable string for student name, major and GPA
    public String toString(){
        return " Name: \n" + studentName +
                " Major: \n" + studentMajor +
                " GPA \n" + df.format(gpa);
    }
}

