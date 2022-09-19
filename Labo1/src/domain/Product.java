package domain;

import java.util.ArrayList;

public class Product {
    private String title, type, id;

    public Product(String title, String type, String id){
        setTitle(title);
        setType(type);
        setId(id);
    }
    private void setTitle(String title){
        if(title.isEmpty()){
            throw new IllegalArgumentException("titel mag niet leeg zijn.");
        }
        else{
            this.title = title;
        }
    }
    private void setType(String type){
        if(type.isEmpty()){
            throw new IllegalArgumentException("type mag niet leeg zijn.");
        }
        else{
            this.type = type;
        }
    }
    private void setId(String id){
        if(id.isEmpty()){
            throw new IllegalArgumentException("id mag niet leeg zijn.");
        }
        else{
            this.id = id;
        }
    }
}
