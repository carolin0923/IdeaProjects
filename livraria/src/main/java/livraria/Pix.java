package livraria;

public class Pix implements Payment{
    private String pixKey;

    public Pix(String pixKey) {
        this.pixKey = pixKey;
    }


    @Override
    public void Pay(double value) {

    }

    @Override
    public void refund(double value) {

    }
}