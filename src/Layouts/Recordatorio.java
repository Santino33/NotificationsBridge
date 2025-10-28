package Layouts;

import Items.Canal;

public class Recordatorio extends Notificacion{

    public Recordatorio(Canal canal) {
        super(canal);
    }

    @Override
    public void enviar(String destinatario) {
        canal.enviar(destinatario, "Recordatorio: reunión a las 10");
    }
}
