import java.util.*;
public class DOKMatrix {
    Map<String, Double> values;

    public void DOKMatrix() {
        values = new HashMap<String, Double>(); 
    }

    public double get(int row, int col) {
        double got = 0;
        String key =  row + "," + col; 

        if(values.containsKey(key)) {
            got = values.get(key); 
        }
        
        return got; 
    }

    public void set(int row, int col, double value) {
        String key =  row + "," + col; 
        values.put(key, value); 
    }    
}