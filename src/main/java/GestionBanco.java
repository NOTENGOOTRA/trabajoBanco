import java.util.ArrayList;
import java.util.List;

public class GestionBanco {
    List<Cliente> clientes = new ArrayList<>();

    public GestionBanco() {

    }
    public void agregarClientes(Cliente clientes1){
        clientes.add(clientes1); // clientes1 es lo que le entrego

    }
    public void mostrarClientes(){
        for (int i = 0; i < clientes.size() ; i++) {
            System.out.println(i+" "+clientes.get(i));

        }

    }
    public void borrarClientes(int clienteBorrado){
        clientes.remove(clienteBorrado);

    }
}



