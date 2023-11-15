package med.voll.api.medico;

public record DadoListagemMedico(String nome, String email, String crm, Especialidade especialidade ) {

    public DadoListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
