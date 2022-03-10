public class Circulo extends Figura {
    private Float altura;
    public Circulo(String color, Float altura) {
        super(color);
        this.altura = altura;
        //TODO Auto-generated constructor stub
    }

    public float getRadio() {
        return altura;
    }

    public void setRadio(float altura) {
        this.altura = altura;
    }

    @Override
    public double areaFigura(float altura) {
        // TODO Auto-generated method stub
        
        return Math.PI *Math.pow(altura, 2) ;
    }
    
}
