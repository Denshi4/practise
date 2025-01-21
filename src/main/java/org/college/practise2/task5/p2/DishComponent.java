package org.college.practise2.task5.p2;

import java.util.HashMap;

public abstract class DishComponent {
    protected String name;
    protected HashMap<String, DishComponent> dishComponents = new HashMap<>();

    public void order(){
        for (DishComponent component:
             dishComponents.values()){
             component.order();
            
        }
    }
    public void addComponent(DishComponent component){
        dishComponents.put(component.name, component);
    }
    public void removeComponent(String name){
        dishComponents.remove(name);
    }
}
