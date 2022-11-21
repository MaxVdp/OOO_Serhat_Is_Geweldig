package factory;

import domain.EncodeBehaviour;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class EncodeBehaviourFactory {
    public static EncodeBehaviour createEncodeBehaviour(String type, Object... args){
        EncodeBehaviour instance = null;

        //opzoeken klassenaam in enum EncodeBehaviourType
        EncodeBehaviourType encodeBehaviourType = EncodeBehaviourType.valueOf(type);
        String className = encodeBehaviourType.getClassPath();

        //een array maken opgevuld met de types van de meegegeven parameters uit args
        Class <?> [] dataTypes = new Class[args.length];
        int index = 0;
        for (Object object:args){
            dataTypes[index] = object.getClass();
            index++;
        }

        //een object aanmaken met behulp van een constructor met paramaters gelijk aan deze uit de dataTypes array
        try{
            Class<?> clazz = Class.forName(className);
            Constructor<?> constructor = clazz.getConstructor(dataTypes);
            instance = (EncodeBehaviour) constructor.newInstance(args);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        if (instance == null) System.out.println("instance is null");
        return instance;
    }
}
