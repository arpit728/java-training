package com.acecademy.singleton;

class Database {

    private static Database DB = new Database();

    private Database(){
    }

    private Database getInstance() {
        return DB;
    }
}

/*Singleton with lazy loading, this singleton class is not threadsafe, only works well in single threaded environment*/
class Database1 {

    private static Database1 DB;
    private Database1(){

    }

    private Database1 getInstance() {
        if (DB == null) {
            DB = new Database1();
        }
        return DB;
    }
}


/*
Singleton with lazy loading, this singleton class is thread-safe but has huge performance overhead because of synchronized keyword.
Even after initializing the object threads will have to wait to acquire the object
*/
class Database2 {

    private static Database2 DB;
    private Database2(){

    }

    private synchronized Database2 getInstance() {
        if (DB == null) {
            DB = new Database2();
        }
        return DB;
    }
}

/*
Singleton with lazy loading, this singleton class is thread-safe and implements double locking and overcomes the performance overhead.
In this implementation, after the object is initialized threads, immediately get the object without waiting, since outer method is not synchronized anymore.
*/
class Database3 {

    private static Database3 DB;

    private Database3(){
    }

    private static Database3 getInstance() {

        if (DB == null) {
            synchronized (Database3.class) {
                if (DB == null) {
                    DB = new Database3();
                }
            }
        }
        return DB;
    }

}


public class SingletonDemo{

    public static void main(String[] args) {

    }

}



