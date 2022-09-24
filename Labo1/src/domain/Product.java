package domain;

import java.util.ArrayList;
import java.util.Locale;

public class Product {
    private String title, type, id;

    public Product(String title, String type, String id){
        setTitle(title);
        setType(type);
        setId(id);
    }

    public double getPrice(int days) {
        double price = 0;
        if(this.getType().equals("M")){
            price = 5;
            int daysLeft = days - 3;
            if (daysLeft > 0) {
                price += (daysLeft * 2);
            }
        } else if(this.getType().equals("G")){
            price = days * 3;
        }
        return price;
    }

    private void setTitle(String title){
        if (title == null || title.trim().isEmpty()) throw new IllegalArgumentException("invalid title");
        this.title = title;
    }
    private void setType(String type){
        if(type == null ||type.trim().isEmpty())throw new IllegalArgumentException("invalid type");
        this.type = type;
    }
    private void setId(String id){
        try {
            int idx = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("invalid id");
        }
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}
