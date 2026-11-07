public class Main {
    public static void main(String[] args) {

        SensorTemperatura[] sensores = new SensorTemperatura[2];
        
        sensores[0] = new SensorTemperatura("SENS-TEMP-01", 24.5, "Celsius");
        sensores[1] = new SensorTemperatura("SENS-TEMP-02", 76.1, "Fahrenheit");

        System.out.println("--- LECTURAS DE SENSORES DE TEMPERATURA ---");

        for (int i = 0; i < sensores.length; i++) {
            sensores[i].mostrarLectura();
        }
    }
}