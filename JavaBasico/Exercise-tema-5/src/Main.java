public class Main {

    public static void main(String[] args) {

    CocheCRUDImpl cocheCRUD = new CocheCRUDImpl();
    cocheCRUD.delete();
    cocheCRUD.save();
    cocheCRUD.findAll();
    }
}