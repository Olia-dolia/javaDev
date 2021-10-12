package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MySerialization {

    public static void mySerialize(Person person, String path) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path)))
        {
            out.writeObject(person);

        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }


    public static Object myDeserialize(String path){
        Object obj = null;
        try(ObjectInputStream getFile = new ObjectInputStream(new FileInputStream(path)))
        {
            obj = getFile.readObject();
            System.out.println("Serialization successful!");
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return obj;
    }
}
