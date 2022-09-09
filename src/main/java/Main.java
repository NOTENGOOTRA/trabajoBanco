public class Main {

    public static void main(String[] args) {
        GestionBanco banco = new GestionBanco();

        //CREACION CLIENTES
        Cliente clientes = new Cliente("nombre","rut" ,21); // creando objeto con todos los atributos de clase Cliente
        Cliente clientesNuevo = new Cliente("Sunack", "13442413" ,180); // si, 180 años, juega Zilean
        Cliente clienteNuevo1 = new Cliente();

        //CREACION CUENTAS
        CuentaCorriente cuentaCorriente = new CuentaCorriente(23412412,"22/01/1999", 0, 10);
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(32412424,"10/05/2019",10000,0.2);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(23414312,"1999",100000, 15);


        //SECCIÓN SUCURSALES
        Sucursal sucursalPrincipal = new Sucursal();
        Sucursal sucursalTemuco = new Sucursal(02543,1669000,"Temuco");
        Sucursal sucursalSantiago = new Sucursal(02341,234141,"Santiago");
        Sucursal sucursalTocopilla = new Sucursal(02313,123411,"Tocopilla");
        sucursalPrincipal.agregarSucursal(sucursalTemuco);
        sucursalPrincipal.agregarSucursal(sucursalSantiago);
        sucursalPrincipal.agregarSucursal(sucursalTocopilla);

        sucursalPrincipal.agregarCliente(clientesNuevo);
        sucursalPrincipal.agregarCliente(clienteNuevo1);
        //ASOCIANDO CLIENTE - CUENTA
        clientesNuevo.agregarCuentaAhorro(cuentaAhorro1);
        clientesNuevo.agregarCuentaCorriente(cuentaCorriente1);

        banco.agregarClientes(clientes);
        banco.agregarClientes(clientesNuevo);
        banco.agregarClientes(clienteNuevo1);


        // añadiendo despues un cliente ///////
        clienteNuevo1.setEdad(18);
        clienteNuevo1.setNombre("Julian");
        clienteNuevo1.setRut("203293291");
        //////////////////////////////////////


        clientesNuevo.mostrarCuentasClienteA(); // MUESTRA LOS CLIENTES CON CUENTAS DE AHORRO
        sucursalPrincipal.mostrarSucursalesClientes();
        banco.borrarClientes(0);

        banco.mostrarClientes();




        sucursalPrincipal.mostrarSucursales();



    }
}
