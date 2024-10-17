package exercicio_modulo_17rev2;

abstract class Carro {

	 private String modelo;
	    private String marca;

	    public Carro(String modelo, String marca) {
	        this.modelo = modelo;
	        this.marca = marca;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public abstract void acelerar();
}
	

