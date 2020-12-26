package pro2.command;

public class Mul implements Count {
    @Override
    public void execute(Number n, double x) {
        System.out.print(n.getTotal() + " * " + x + " = ");
        n.multiplication(x);
        System.out.println(n.getTotal());
    }
}
