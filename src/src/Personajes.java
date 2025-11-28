public class Personajes {

        int vidaPersonajes;
        String expansionesDominio;

        int energiaMaldita;
        double multiplicador;
        int dmgAtaqueFisico;
        int dmgAtaqueEspecial;
        int dmgExpansionDominio;

        int yenes;
        String [] inventario = new String[10];

    public Personajes(int vidaPersonajes, String expansionesDominio, int energiaMaldita, double multiplicador, int dmgAtaqueFisico, int dmgAtaqueEspecial, int dmgExpansionDominio) {
        this.vidaPersonajes = vidaPersonajes;
        this.expansionesDominio = expansionesDominio;
        this.energiaMaldita = energiaMaldita;
        this.multiplicador = multiplicador;
        this.dmgAtaqueFisico = dmgAtaqueFisico;
        this.dmgAtaqueEspecial = dmgAtaqueEspecial;
        this.dmgExpansionDominio = dmgExpansionDominio;
    }
}

