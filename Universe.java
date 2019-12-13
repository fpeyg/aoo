class Universe {

    private double length = 0.0;
    private double width  = 0.0;


    public Universe () {
    }

    public Universe (double length, double width) {
        this.length = length;
        this.width  = width;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public String toString() {
        return "[longueur]: " + this.length +
        " [largeur]: " + this.width;
    }

}
