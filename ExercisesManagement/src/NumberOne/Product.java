package NumberOne;

public class Product extends User{

    public int id_product;
    public String name_product;
    public int cant;
    public String creation_date;
    public String expiration_date;

    public Product(String name_database, String name_user, String password_user, String name_product, int cant, String creation_date, String expiration_date) {
        super(name_database, name_user, password_user);
        this.id_product = (int)(Math.random()*(3000 - 1000 +1) + 1000);
        this.name_product = name_product;
        this.cant = cant;
        this.creation_date = creation_date;
        this.expiration_date = expiration_date;
    }

    public void Create_product(){
        System.out.println("Crear Producto: LLamando al mismo Constructor.");
    }

    public void showProduct(){
        System.out.println("Obtener: En esta funcion mostrara el producto.");
    }

    public void update_data(){
        System.out.println("Actualizar Datos: Se utilizara para actualizar o cambiar algun dato del producto.");
    }

    public void delete_product(){
        System.out.println("Eliminar: Eliminara el producto y sus respectivos datos. ");
    }
}
