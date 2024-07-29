public class ChronometerThread implements Runnable{

    private Thread thread;
    private String _threadName;

    public ChronometerThread(String threadName)
    {
        _threadName = threadName;
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i<=10; i++)
            {
                System.out.println(_threadName + ": " + i);
                thread.sleep(1000);
            }
        }
        catch (InterruptedException exception){
            throw new RuntimeException("Kesildi.");
        }

        System.out.println("Thread bitti");
    }


    public void start()
    {
        if (thread == null)
        {
            thread = new Thread(this,_threadName);
            thread.start();
        }
        else {
            System.out.println("Threat mevcut");
        }
    }

}
