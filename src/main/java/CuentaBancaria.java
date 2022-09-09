public abstract class CuentaBancaria {
	private int numeroCuenta;
	private String fechaApertura;
	private int saldo;
	private Cliente cliente;

	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getFechaApertura() {

		return this.fechaApertura;
	}

	public int getSaldo() {

		return this.saldo;
	}

	public abstract String getTipo();

	public CuentaBancaria(int numeroCuenta, String fechaApertura , int saldo){
		this.numeroCuenta=numeroCuenta;
		this.fechaApertura=fechaApertura;
		this.saldo=saldo;


	}
	public CuentaBancaria(){

	}

	@Override
	public String toString() {
		return numeroCuenta+" "+fechaApertura+" "+saldo;
	}
}