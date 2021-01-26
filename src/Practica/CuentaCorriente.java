package Practica;

public class CuentaCorriente {
    private int numeroCuenta;
    private double saldo;

    //region constructores
    public CuentaCorriente() {
    }

    public CuentaCorriente(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cc) {
        this.numeroCuenta = cc.getNumeroCuenta();
        this.saldo = cc.getSaldo();
    }
    //endregion

    //region getters & setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //endregion

    //region public functions
    public void ingreso(double ingreso){
        this.saldo = this.saldo + ingreso;
    }

    public void egreso(double egreso){
        this.saldo = this.saldo - egreso;
    }

    public void reintegro(double reintegro) {
        this.ingreso(reintegro);
    }

    public void transferencia (CuentaCorriente cc, double monto){
        cc.ingreso(monto);
        this.saldo = this.saldo - monto;
    }

    //endregion
}
