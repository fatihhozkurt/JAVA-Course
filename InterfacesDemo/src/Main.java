//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IWorkable workable = new OutsourceWorker();
        IEatable eatable = new Worker();
        IPayable payable;
        IMaintainable maintainable;

        workable.work();
        eatable.eat();
    }
}