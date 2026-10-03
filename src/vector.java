public class vector {
    private int x;
    private int y;
    private int z;

    public vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void vectorOnNum(int alf) {
        this.x *= alf;
        this.y *= alf;
        this.z *= alf;

        System.out.println("New coordinats of Vector x: " + x + ", y: " + y + ", z: " + z);
    }

    public double norma() {
        double h = Math.sqrt(x*x + y*y + z*z);
        System.out.print(h);
        return  h;
    } 

    public vector vectorpPlusVector( vector R) {
        int new_x = this.x + R.getx();

        int new_y = this.y + R.gety();

        int new_z = this.z + R.getz();

        vector s = new vector(new_x, new_y, new_z);

        System.out.println("Coordinats of Vector s: " + new_x + ", y: " + new_y + ", z: " + new_z);
        
        return s;
    }

    int getx() {
        return this.x;
    }

    int gety() {
        return this.y;
    }

    int getz() {
        return this.z;
    }
}
