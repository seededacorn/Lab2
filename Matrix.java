public class Matrix {
    int rows, columns;
    double[][] matrix; 

    public Matrix(int rows, int columns) {
        rows = rows; 
        columns = columns; 
        matrix = new double [rows][columns];
    }

    public Matrix(double data[][]) {
        matrix = data;
    }

    public double get(int row, int col) {
        double got = matrix[row][col];
        return got;
    }

    public void set(int row, int col, double value) {
        matrix[row][col] = value; 
    }
}