package MyMap;

import java.util.ArrayList;

public class MyMap <T,U>{
    ArrayList<T> keys;
    ArrayList<U> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }


    public void put(T key, U value){
        int idx = -1;
        for(int i=0;i<keys.size();i++){
            if(keys.get(i).equals(key)){
                idx = i;
                break;
            }
        }
        if(idx != -1){
            values.set(idx,value);
        } else{
            keys.add(key);
            values.add(value);
        }
    }

    public U get(T key){
        for(int i=0;i<keys.size();i++){
            if(keys.get(i).equals(key)){
                return values.get(i);
            }
        }
        return null;
    }
    public U remove(T key){
        U value = null;
        for(int i=0;i<keys.size();i++){
            if(keys.get(i).equals(key)){
                value = values.get(i);
                keys.remove(i);
                values.remove(i);
                break;
            }
        }
        return value;
    }
}
