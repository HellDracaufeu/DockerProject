package fr.univtln.master.jenny.clientandr.mdl;


import fr.univtln.master.jenny.clientandr.bean.Dog;
import fr.univtln.master.jenny.clientandr.bean.Organization;

/**
 * Created by RedQueen on 07/04/2016.
 */
public class CDogModel {
    private static CDogModel instance = new CDogModel();

    public static CDogModel getInstance(){ return instance;}

    private CDogModel(){}

    public void register(String name, Organization org){
        Class[] types = {Dog.class};
        Dog[] objects = {new Dog(name, org)};
        


    }
}
