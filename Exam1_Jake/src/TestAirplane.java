public class TestAirplane
{
    public static void main(String[] args)
    {
        System.out.println("Make an Airplane object with default constructor:");
        Airplane a1 = new Airplane();
        System.out.println(a1);

        System.out.println();

        System.out.println("Use the setters:");
        a1.setAltitude(9999.9);
        a1.setPassengerCount(770);
        System.out.println(a1);

        System.out.println();

        System.out.println("Use the getters:");
        System.out.println("Altitude: " + a1.getAltitude());
        System.out.println("Passenger Count: " + a1.getPassengerCount());

        System.out.println();

        System.out.println("Make a Airplane object with the other constructor:");
        Airplane a2 = new Airplane(200.0, 33);
        System.out.println(a2);

        System.out.println();

        System.out.println("Ascend 10 times:");
        for (int i = 0; i < 10; i++)
        {
            a2.ascend();
        }
        System.out.println(a2);

        System.out.println();

        System.out.println("Board:");
        a2.board(27);
        System.out.println(a2);

        System.out.println();

        System.out.println("Check validation:");
        a2.setAltitude(0.0);
        a2.setPassengerCount(0);
        System.out.println("Altitude: " + a2.getAltitude());
        System.out.println("Passenger Count: " + a2.getPassengerCount());
        a2.setAltitude(-999.99);
        a2.setPassengerCount(-999);
        System.out.println("Altitude: " + a2.getAltitude());
        System.out.println("Passenger Count: " + a2.getPassengerCount());
    }
}
