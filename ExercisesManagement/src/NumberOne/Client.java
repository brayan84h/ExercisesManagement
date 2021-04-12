package NumberOne;

import java.util.ArrayList;
import java.util.List;

public class Client extends User{

    public int id_client;
    public String name_client;
    public String direction;
    public String date_of_birth;
    public List<Product> products;

    public Client(String name_database, String name_user, String password_user, String name_client, String direction, String date_of_birth) {
        super(name_database, name_user, password_user);
        this.id_client = (int)(Math.random()*(3000 - 1000 +1) + 1000);
        this.name_client = name_client;
        this.direction = direction;
        this.date_of_birth = date_of_birth;
        this.products = new ArrayList<Product>();
    }

    public void Create_client(){
        System.out.println("Crear Cliente: LLamando al mismo Constructor.");
    }

    public void AddProduct(){
        System.out.println("Obtener: En esta funcion se agregara a una lista de prductos , los pruductos.");
    }

    public void update_data(){
        System.out.println("Actualizar Datos: Se utilizara para actualizar o cambiar algun dato del cliente.");
    }

    public void delete_client(){
        System.out.println("Eliminar: Eliminara al cliente y sus respectivos datos y productos. ");
    }
}
