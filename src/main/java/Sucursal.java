import java.util.ArrayList;

public class Sucursal {
	private int codigoSucursal;
	private int codigoPostal;
	private String nombre;
	private ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
    private ArrayList<Cliente> clientesSucursal = new ArrayList<Cliente>();
	public int getCodigoSucursal() {

		return this.codigoSucursal;
	}

	public int getCodigoPostal() {

		return this.codigoPostal;
	}

	public Sucursal(int codigoSucursal, int codigoPostal,String nombre) {
		this.codigoSucursal = codigoSucursal;
		this.codigoPostal = codigoPostal;
		this.nombre = nombre;
	}
	public Sucursal(){

	}
	public void agregarSucursal(Sucursal sucursalAg){
		sucursales.add(sucursalAg);


	}
	public void mostrarSucursales(){
		System.out.println("Sucursales:");
		for (int i = 0; i <sucursales.size() ; i++) {
			System.out.println(i +" "+sucursales.get(i));

		}

	}
	public void borrarSucursal(int sucursalBorrada){
		sucursales.remove(sucursalBorrada);
	}

	public void agregarCliente(Cliente sucursalCliente){
		clientesSucursal.add(sucursalCliente);
	}
	public void mostrarSucursalesClientes(){
		System.out.println("ClientesSucursales:");
		for (int i = 0; i <clientesSucursal.size() ; i++) {
			System.out.println(i +" "+clientesSucursal.get(i));

		}}

	@Override
	public String toString() {
		return codigoSucursal+" "+codigoPostal+" "+nombre;
	}
}