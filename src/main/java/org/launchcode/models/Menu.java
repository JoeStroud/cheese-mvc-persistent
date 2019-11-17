package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @ManyToMany
    private List<Cheese> cheeses = new ArrayList<>();

<<<<<<< HEAD
    //add add method
=======
//add add method
>>>>>>> 823740f1614c7c229110c6d1ce4873d84fbec13b
    public void addItem(Cheese item){
        cheeses.add(item) ;
    }

// add 2 constructor

    public Menu() { }

    public Menu(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    // add getters and setters
=======
// add getters and setters
>>>>>>> 823740f1614c7c229110c6d1ce4873d84fbec13b
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public void setCheeses(List<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> 823740f1614c7c229110c6d1ce4873d84fbec13b
