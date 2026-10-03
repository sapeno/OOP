public class Main {
    public static void main(String[] args) throws Exception {
        
        vector L = new vector(4, 5, 6);

        vector R = new vector(7, 8, 9);

        L.vectorOnNum(2);
        L.vectorpPlusVector(R);
        L.norma();
        
    }
}
