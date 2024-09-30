public class MatrixMain {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(10,10);
        
        DOKMatrix mat = new DOKMatrix();
        mat.set(1,2,4);
        System.out.println(mat.get(1,2));
    }    
}