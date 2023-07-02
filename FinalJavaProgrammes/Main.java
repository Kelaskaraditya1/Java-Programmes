class Company
{
    int n;
    boolean status=false;
    synchronized public void produced_item(int n) throws Exception
    {
        if(status)
        wait();
        this.n=n;
        System.out.println("Produced item: "+n);
        status=true;
        notify();
    }
    synchronized public int consumed_item() throws Exception
    {
        if(!status)
        wait();
        System.out.println("Consumed item: "+this.n);
        status=false;
        notify();
        return this.n;
    }
}
class Producer  extends Thread
{
    Company c=new Company();
    public Producer(Company c)
    {
        this.c=c;
    }

    public void run()
    {
        int i=1;
        while(i<=10)
        {
            try{
            c.produced_item(i);
            Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            i++;
        }
    }
}
class Consumer extends Thread
{
    Company c = new Company();
    public Consumer(Company c)
    {
        this.c=c;
    }
    public void run()
    {
        int i=1;
        while(i<=10)
        {
            try
            {
                c.consumed_item();
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            i++;
        }
        
    }

}
public class Main 
{
    public static void main(String[] args)
    {
        Company c = new Company();
        Producer producer = new Producer(c);
        Consumer consumer = new Consumer(c);
        producer.start();
        consumer.start();
    }

}