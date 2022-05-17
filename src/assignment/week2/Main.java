package assignment.week2;

public class Main {
    public static void main(String[] args) {
        RailReservSystem rs = new RailReservSystem();
        PassengerDetails pd = new PassengerDetails();
        SouAndDest sd = new SouAndDest();
        rs.travel();
        pd.passenger();
        sd.fare1();


    }
}
