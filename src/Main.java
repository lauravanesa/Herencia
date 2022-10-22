public class Main {
    public static void main(String[] args) {
        Bus miBucesito = new Bus("ABC123", Marca.KIA,150000.0);
        miBucesito.encender();
        miBucesito.setEmpresa(Empresa.EXPRESO_PALMIRA);
        System.out.println(miBucesito.getEmpresa().nombre);
        miBucesito.encender();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.frenar();

        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();

        System.out.println("----------------CAMIONETA--------------");
        Camioneta miCamionetica = new  Camioneta ("DEF456",Marca.TOYOTA,50000.);
        miCamionetica.encender();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();





    }
}
