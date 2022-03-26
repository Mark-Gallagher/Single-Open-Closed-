package ie.gmit.single;

public class Persistence extends Store {

  
    private Store store = new Store();

    public void saveUser(User user) {
        //Store used by controller
        store.store(user);

    }
}




