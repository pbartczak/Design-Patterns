package Structural.Composite;

public class Letter implements Glif {

    private Character sign;

    public Letter(Character sign) {
        this.sign = sign;
    }

    @Override
    public void print() {
        System.out.print(sign);
    }

}
