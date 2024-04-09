//Jake Beahan
//Feb 12 2024
//Assignment 2.3 - Time Class

public class Time {
    long hour, minute, second;

    public Time(){
         long milliseconds = System.currentTimeMillis();
         hour = ((milliseconds / (1000*60*60)) % 24);
         minute = (milliseconds / (1000*60)) % 60;
         second = (milliseconds / 1000) % 60;
    }

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        return hour + ":" + minute + ":" + second;
    }


    public static void main(String[] args) {

        Time time1 = new Time();
        Time time2 = new Time(11,11,11);

        System.out.println("time1: " + time1);
        System.out.println("time2: " + time2);
    }
}