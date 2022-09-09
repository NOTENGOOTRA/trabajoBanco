public class CuentaAhorro extends CuentaBancaria {
	private double reajusteAnual;

	public double getReajusteAnual() {
		return this.reajusteAnual;
	}

	public String getTipo() {
		return "CuentaBancaria";}

	public CuentaAhorro(int numeroCuenta, String fechaApertura, int saldo, double reajusteAnual) {
		super(numeroCuenta, fechaApertura, saldo);
        this.reajusteAnual=reajusteAnual;

	}
	public CuentaAhorro(){

	}

	@Override
	public String toString() {
		return "Cuenta ahorro: "+super.toString()+" " + reajusteAnual ;
	}
}
