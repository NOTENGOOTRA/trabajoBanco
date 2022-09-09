import org.w3c.dom.ls.LSOutput;

public class CuentaCorriente extends CuentaBancaria {
	private int lineaSobregiro;

	public int getLineaSobregiro() {
		return this.lineaSobregiro;
	}

	public String getTipo() {
		return "CuentaBancaria";}

	public CuentaCorriente(int numeroCuenta, String fechaApertura, int saldo, int lineaSobregiro) {
		super(numeroCuenta, fechaApertura, saldo);
		this.lineaSobregiro=lineaSobregiro;
	}

	@Override
	public String toString() {
		return "Cuenta Corriente:" +super.toString()+" "+lineaSobregiro;
	}
}

