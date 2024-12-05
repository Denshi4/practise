package org.college.practise2.task1.p2;

import java.util.ArrayList;
import java.util.HashMap;

public class RestaurantMenu {
    private ArrayList<Dishes> _dishes = new ArrayList<>();
    private String _menuName;
    private String _cuisineType;
    private static HashMap<String, RestaurantMenu> _instance = new HashMap<>();

    private RestaurantMenu(String menuName){
        this._menuName = menuName;
    }

    public static RestaurantMenu getInstance(String menuName){
        if (!_instance.containsKey(menuName)) {
            RestaurantMenu menu = new RestaurantMenu(menuName);
            _instance.put(menuName, menu);
            return menu;
        } else {
            return _instance.get(menuName);
        }
    }

    public boolean addDishes(Dishes dishes){
        return _dishes.add(dishes);
    }
    public boolean removeDishes(Dishes dishes){
        return _dishes.remove(dishes);
    }
    public String describeDishes(Dishes dishes){
        System.out.println("A new bomb dishes has recently appeared in our restaurant menu!! \n" +
                "I'm sure you'll get a kick out of it");
        System.out.println("New dishes: ");
        return dishes.toString();
    }

    public Dishes getDishes(String name){
        for (Dishes dish:
                _dishes) {
            if (dish.get_name().equals(name)){
                return dish;
            }
        }
        return null;
    }
    public ArrayList<Dishes> getAllDishes(){
        return _dishes;
    }

    public long getDishesCount(){
        return _dishes.size();
    }

    public String get_menuName() {
        return _menuName;
    }

    public String get_cuisineType() {
        return _cuisineType;
    }

    public void set_cuisineType(String _cuisineType) {
        this._cuisineType = _cuisineType;
    }
}
