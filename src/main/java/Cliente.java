import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String rut;
    private int edad;

    private List<CuentaAhorro> listaAhorro = new ArrayList<>();
    private List<CuentaCorriente> listaCorriente = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nombre, String rut, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getNombre() {
        return this.nombre;
    }

    public String getRut() {
        return this.rut;
    }

    public int getEdad() {
        return this.edad;
    }

    public void agregarCuentaAhorro(CuentaAhorro CuentaA) {
        listaAhorro.add(CuentaA);
    }

    public void agregarCuentaCorriente(CuentaCorriente CuentaC) {

        listaCorriente.add(CuentaC);
    }


    public void mostrarCuentasClienteA() {
        System.out.println("Cuentas  ahorro:");
        for (int i = 0; i < listaAhorro.size(); i++) {
            System.out.println(i + " " + listaAhorro.get(i));

        }
    }

    public void mostrarCuentasClienteC() {
        System.out.println("Cuentas corriente");
        for (int i = 0; i < listaCorriente.size() ; i++) {
            System.out.println(i + " " + listaCorriente.get(i));

        }
    }


    @Override
    public String toString() {
        return nombre + " " + rut + " " + edad + " " + listaAhorro + " \n" + listaCorriente;  // \n :salta una linea y tiene q estar dentro de comillas
    }


}

