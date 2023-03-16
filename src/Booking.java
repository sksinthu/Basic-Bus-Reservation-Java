import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.*;
public class Booking{
    String passengerName;
    Date Date;
    int BusNo;
    Booking(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter name :");
        passengerName=scan.next();
        System.out.println("enter bus no :");
        BusNo=scan.nextInt();
        System.out.println("enter date:");
        String dateinput=scan.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");

       try {
        Date=dateFormat.parse(dateinput);
    } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    
}
public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses) {
           int capacity=0;
           for(Bus bus:buses){
            if (bus.getBusno()==BusNo){
                capacity=bus.getCapacity();
            }
            int booked=0;
            for(Booking b:bookings){
                if(b.BusNo==BusNo){
                    booked++;
                }
            }
            return booked<capacity?true:false;
           }
        return false;

    }
}