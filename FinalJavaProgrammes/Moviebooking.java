class Theater
{
    int total_seats=10;
     public void seatbooking(int seats)
    {   
        System.out.println("I am Thread "+Thread.currentThread().getName()+" am starting my executing");
        synchronized (this)
        {
        if(total_seats>=seats)
        {
            System.out.println("Your Seats are booked Sucessfully");
            total_seats=total_seats-seats; 
        }
        else
        {
            System.out.println("Not enough Seats!!");
            System.out.println("We are Sorry!!");
            System.out.println("Remainning Seats:"+total_seats);
        }
    }
         System.out.println("I am Thread "+Thread.currentThread().getName()+" am ending my executing");
    }
}
public class Moviebooking extends Thread
{
    int seat;
    static Theater theater = new Theater();
    public void run()
    {
        theater.seatbooking(seat);
    }
    public static void main(String[] args)
    {
       Moviebooking Aditya = new Moviebooking();
       Aditya.seat=7;
       Aditya.start();
       Moviebooking Mayur = new Moviebooking();
       Mayur.seat=8;
       Mayur.start();    
    }
}