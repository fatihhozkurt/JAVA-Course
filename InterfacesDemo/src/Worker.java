public class Worker implements IWorkable, IEatable, IPayable{


    @Override
    public void eat() {
        System.out.println("Eated: Worker");
    }

    @Override
    public void pay() {
        System.out.println("Paid: Worker");
    }

    @Override
    public void work() {
        System.out.println("Worked: Worker");
    }
}
