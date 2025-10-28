package Items;

public class Email implements Canal{

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando Email a " + destinatario + ": " + mensaje);
    }
}
