package dev.vinisantosn.geradordesenhas.gerador;

public record GeradorReponseDTO(Long id, String senha) {
    public GeradorReponseDTO(Gerador gerador) {
        this(gerador.getId(), gerador.getSenha());
    }
}
