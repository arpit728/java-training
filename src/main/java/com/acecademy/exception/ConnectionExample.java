package com.acecademy.exception;

class Connection implements AutoCloseable{

    public static final String driverName = "mysql-driver";
    private static Connection CONNECTION = null;
    boolean open;

    private Connection() {
        System.out.println("Created");
        this.open = true;
    }

    /*Lazy Loading*/
    static synchronized Connection getConnection() {
        if (CONNECTION == null) {
            return CONNECTION = new Connection();
        }
        return CONNECTION;
    }

    void read() {
//        throw new RuntimeException();
        System.out.println("read");
    }

    public boolean isOpen() {
        return open;
    }

    public void close() {
        System.out.println("Closing Connection");
        open = false;
    }
}

class UserRepo {

    public void getUser(int id) {

        //try with resource
        try(Connection con = Connection.getConnection()) {
            con.read();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }


        System.out.println("Exection ends");
    }

}

public class ConnectionExample {


    public static void main(String[] args) {
        UserRepo userRepo = new UserRepo();
        userRepo.getUser(1);

    }

}

class A {

    A() {
        /*
        asdas
        asda
        asdas
        asda
        asdqs
        a
        asd
        as
        asds

         */
    }
}
