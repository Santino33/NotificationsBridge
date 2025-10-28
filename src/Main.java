import Items.Email;
import Items.SMS;
import Layouts.Alerta;
import Layouts.Notificacion;
import Layouts.Recordatorio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Notificacion alertaSMS = new Alerta(new SMS());
        Notificacion recordatorioEmail = new Recordatorio(new Email());

        alertaSMS.enviar("+5200123456");
        recordatorioEmail.enviar("usuario@correo.com");
    }
}