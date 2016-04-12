package fr.univtln.master.jenny.clientandr.bean;

import java.io.Serializable;
/**
 * Created by RedQueen on 31/03/2016.
 */
public class Dog implements Serializable {
    private int id;
    private String name;
    private Organization org;

    public Dog() {
    }

    public Dog(int id, String nom, Organization org) {
        this.id = id;
        this.name = nom;
        this.org = org;
    }

    public Dog(String nom, Organization org) {
        this.name = nom;
        this.org = org;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }
}
