package Aplication;

import NumberOne.Client;
import NumberOne.DataBase;
import NumberOne.Product;
import NumberOne.User;
import NumberThree.ValidationMethod;
import NumberTwo.Rule;
import NumberTwo.StringManagement;

public class App {
    public static void main(String[] args) {

        //Exercise #1
        System.out.println("IMPLEMENTACION DEL EJERCICIO 1: \n");
        DataBase dataBase1 = new DataBase("Base de datos 1");
        User user1 = new User("Base de datos 1", "Brayan", "07112001");
        Client client1 = new Client("Base de datos 1", "Brayan", "07112001", "Cristin", "Direccion", "07/11/2001");
        Product product1 = new Product("Base de datos 1", "Brayan", "07112001", "Chuleta ahumada", 5, "11/08/2021", "01/10/2021");

        System.out.println("METODOS DE LA CLASE DE BASE DE DATOS: ");
        dataBase1.create_database();
        dataBase1.AddUser();

        System.out.println("\nMETODOS DE LA CLASE USUARIO: ");
        user1.AddClient();

        System.out.println("\nMETODOS DE LA CLASE CLIENTE: ");
        client1.Create_client();
        client1.AddProduct();
        client1.update_data();
        client1.delete_client();

        System.out.println("\nMETODOS DE LA CLASE PRODCUTO: ");
        product1.Create_product();
        product1.showProduct();
        product1.update_data();
        product1.delete_product();


        //Exercise #2
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.println("\n\n IMPLEMENTACION DEL EJERCICIO 2: \n");
        StringManagement trama1 = new StringManagement("Juanito Perez 0801199901234 Ingenieria Química");
        StringManagement trama_null = new StringManagement("Juanito 0 Química");//Le puse NULL ya que no se asiganara la trama debido a que no cumple los parametros definidos de tamaño
        System.out.println(trama1);
        System.out.println(trama_null);

        System.out.println("\n\tMOSTRANDO RULE\n");
        Rule rule1= new Rule("00048461", 0, 14, "Brayan Josue Hernandez Garcia");
        Rule rule2= new Rule("00045796", 15, 20, "Alejandro Garcia");
        Rule rule3= new Rule("00048461", 0, 14, "Brayan Josue Hernandez Garcia");
        Rule rule4= new Rule("00048465", 10, 15, "Eduardo Jose Filemon");
        rule1.showRule();

        //ASIGNACION DE LAS REGLAS A LA TRAMA
        trama1.AddRules(rule1);
        trama1.AddRules(rule2);
        trama1.AddRules(rule3);
        System.out.println();
        trama1.ShowListRules();
        trama1.Get_value(rule4);
        System.out.println("\n----------------------------------------------------------------------------------------------");


        //Exercise #3
        System.out.println("\n\n IMPLEMENTACION DEL EJERCICIO 3: \n");
        ValidationMethod number_card1 = new ValidationMethod("455567******6787");
        ValidationMethod number_card2 = new ValidationMethod("455567****789677");
        ValidationMethod number_card3 = new ValidationMethod("455567****");
        System.out.println("\n----------------------------------------------------------------------------------------------");
    }
}
