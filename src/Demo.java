


import java.util.Scanner;



import java.util.ArrayList;

public class Demo {
    
    public static void main(String[]args){
        ArrayList <Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking>bookings=new ArrayList<Booking>();
        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, true, 2));
        buses.add(new Bus(3, true, 5));
    
        int usrOpt = 1;
        try (Scanner scanner = new Scanner(System.in)) {
            for (Bus b : buses) {
                b.displayBusinfo();
            }

            while (usrOpt == 1) {
                System.out.println("Enter 1 to book, Enter 2 to exit");
                usrOpt = scanner.nextInt();
                if (usrOpt == 1) {
                    Booking booking=new Booking();
                    if(booking.isAvailable(bookings,buses)){
                        bookings.add(booking);
                        System.out.println("Booked");
                    }else{
                        System.out.println("not enoughplease try another bus");

                    }
                }
            }
        }
    }
}
