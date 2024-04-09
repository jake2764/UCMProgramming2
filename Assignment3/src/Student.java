//Jake Beahan
//Assignment 2.4- Student Class
//Feb 16 2024


import java.util.Random;

public class Student {

    private String firstName, lastName, id = "";
    private char[] grades;
    private double gpa;
    private Email email;

    public Student(String firstName, String lastName, char[] grades){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;

        generateId();
        getGpa();
    }

    private void generateId(){
        Random random = new Random();
        this.id = this.id.concat("700");
        this.id = this.id.concat(String.valueOf(random.nextInt(100000, 999999)));

        String initials = "";
        initials = initials.concat(this.firstName.toLowerCase().charAt(0) + "x" + this.lastName.toLowerCase().charAt(0));
        email = new Email(initials + id.substring(5,9) + "0", "ucmo.edu");
    }

    private void getGpa(){

        for(int i = 0; i < this.grades.length; i++){
            switch(grades[i]){
                case 'A':
                case 'a':
                    gpa += 4.0;
                    break;
                case 'B':
                case 'b':
                    gpa += 3.0;
                    break;
                case 'C':
                case 'c':
                    gpa += 2.0;
                    break;
                case 'D':
                case 'd':
                    gpa += 1.0;
                    break;
            }
        }
        gpa /= grades.length;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public char[] getGrades() {
        return grades;
    }

    public Email getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrades(char[] grades) {
        this.grades = grades;
    }

    public String toString(){
        return lastName + ", " + firstName + " (" + id + ")\nEmail: " + email + "\nGPA: "+ gpa;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Jake", "Beahan", new char[]{'A', 'A', 'b','B'});
        System.out.println("student1:\n\n" + student1);
    }
}