public class Bus extends Vehiculo {

    private Empresa empresa;

    public Bus(String placa, Marca marca, Double valor) {
        super(placa, marca, valor);

    }

    public Empresa getEmpresa() {
        return empresa;

    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    @Override
    public void acelerar() {
        if (encendido) {
            if (velocidad < 80){
            velocidad = velocidad + 10;
            System.out.println("esta acelerando, velocidad actual: " + velocidad + "KM/H");

        } else {
            System.out.println("nos va a matar o que?");
        }
    }else {
            System.out.println("el vehiculo no se encuentra en movimimiento");
        }

}
 }