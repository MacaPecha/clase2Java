package Practica;

public class Contador {
    private int valor;

    //region Constructores
    public Contador(int valor) {
        this.valor = valor;
    }

    public Contador() {
        this.valor = 0;
    }

    public Contador(Contador c) {
        this.valor = c.valor;
    }

    //endregion
    // region getter & setter
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    // endregion

    //region public functions
    public void incremento(int v) {
        this.valor = this.valor + v;
    }

    public void incremento() {
        this.valor++ ;
    }

    public static int incrementar(int v) {
        return ++v;
    }

    public void decremento(int v) {
        this.valor = this.valor - v;
    }

    public void decremento() {
        this.valor-- ;
    }

    public static int decrementar(int v) {
        return --v;
    }

    //endregion

    public static void main(String[] args) {
        Contador c = new Contador();
        c.decremento();
        System.out.println(c.getValor());
        c.decremento(7);
        System.out.println(c.getValor());
        c.incremento();
        System.out.println(c.getValor());
        c.incremento(7);
        System.out.println(c.getValor());

        System.out.println(Contador.decrementar(8789));
        System.out.println(Contador.incrementar(8789));
    }

}
