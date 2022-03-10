public class Cuadrado  extends Figura{
    private Float altura;

    public Cuadrado(String color, Float altura) {
        super(color);
        this.altura = altura;
    }

    
    public Cuadrado(String color) {
        super(color);
        //TODO Auto-generated constructor stub
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    @Override
    public double areaFigura( float altura) {
        // TODO Auto-generated method stub
        return  Math.pow(altura, 2);
    }
    
}
