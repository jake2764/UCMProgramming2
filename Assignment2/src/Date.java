//Jake Beahan
//Feb 12 2024
//Assignment 2.1 - Date Class

public class Date {

    int day,month,year;
    public Date(){
        day = 0;
        month = 0;
        year = 0;
    }

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return year + "-" + month + "-" + day;
    }


    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(1,2,2018);

        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);
    }
}