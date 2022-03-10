public abstract class Figura {
    protected String color;

    public Figura(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    } 

    public void setNumeroCuenta(String color) {
        this.color = color;
    }

    public abstract double areaFigura(float altura);
}
