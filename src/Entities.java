import java.text.SimpleDateFormat;
import java.util.Date;

public class Entities {
    private String nomeCliente;
    private Date horario;

    public Entities(String nomeCliente, Date horario) {
        this.nomeCliente = nomeCliente;
        this.horario = horario;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss - dd/MMMM/yyyy");

        return  ((nomeCliente != null) ? " Cliente: " + nomeCliente : " Cliente não encontrado! ")
                + ((horario != null) ? " Horario: " + sdf.format(horario) : " Horario não agendado! ");
    }
}
