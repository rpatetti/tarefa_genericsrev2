package exercicio_modulo_17rev2;

class Honda extends Carro {
    public Honda(String modelo) {
        super(modelo, "Honda");
    }

    @Override
    public void acelerar() {
        System.out.println("O Honda " + getModelo() + " está acelerando!");
    }
}