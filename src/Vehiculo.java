public class Vehiculo {
    private String placa;
    private Marca marca;
    private Double valor;
    protected int velocidad = 0;
    protected boolean encendido = false;

    public Vehiculo(String placa, Marca marca, Double valor) {
        this.placa = placa;
        this.marca = marca;
        this.valor = valor;
    }

    public void acelerar() {
        if (encendido) {
            velocidad = velocidad + 10;
            System.out.println("esta acelerando, velocidad actual: " + velocidad + "KM/H");

        } else {
            System.out.println("el vehiculo se encuentra apagado");
        }
    }


    public void frenar() {
        if (velocidad > 0) {
            velocidad = velocidad - 10;
            System.out.println("esta frenando, velocidad actual: " + velocidad + "KM/h");
        } else {
            System.out.println("el vehiculo no se encuentra en movimimiento");
        }
    }

    public void encender() {
        encendido = true;
        System.out.println("se encendido el vehiculo datos: \n" +"placa: " +placa+"\n" +"marca: " +marca+"\n" +"valor:"
                +valor+"\n");

    }

    public void apagar() {
        encendido = false;
        System.out.println("se apago el vehiculo");

    }

}
