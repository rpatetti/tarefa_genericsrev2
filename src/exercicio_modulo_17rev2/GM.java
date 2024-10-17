package exercicio_modulo_17rev2;

class GM extends Carro {

	public GM(String modelo) {
        super(modelo, "GM");
    }

    @Override
    public void acelerar() {
        System.out.println("O GM " + getModelo() + " está acelerando!");
    }
	
}