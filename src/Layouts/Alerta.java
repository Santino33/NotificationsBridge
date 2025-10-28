package Layouts;

import Items.Canal;

public class Alerta extends Notificacion {

    public Alerta(Canal canal) {
        super(canal);
    }

    @Override
    public void enviar(String destinatario) {
        canal.enviar(destinatario, "Alerta: servidor caído");
    }
}
