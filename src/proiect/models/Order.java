package proiect.models;

import proiect.main;
import proiect.models.Client;
import proiect.models.Drink;
import proiect.models.Food;

import java.lang.reflect.Array;

public class Order {
    private int id;

    private Client client;

    private proiect.models.Restaurant restaurant;

    private Driver driver;

    private Food food;

    private Drink drink;

    public Order(Client client, proiect.models.Restaurant restaurant, Driver driver, Food food, Drink drink) {
        this.client = client;
        this.restaurant = restaurant;
        this.driver = driver;
        this.food = food;
        this.drink = drink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public proiect.models.Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(proiect.models.Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public String toString() {
        return "Order: " + this.client + " " + this.restaurant + " " + this.driver + " " + this.food + " " + this.drink;
    }



}