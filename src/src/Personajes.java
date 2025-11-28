public class Personajes {

        String descripcionPersonaje;
        int vidaPersonajes;
        String expansionesDominio;
        String tecnicaEspecial;
        String nombre;

        int energiaMaldita;
        float multiplicador;
        int dmgAtaqueFisico;
        int dmgAtaqueEspecial;
        int dmgExpansionDominio;

        int yenes;
        String [] inventario = new String[10];

    public void Stats_Satoru_Gojo(String descripcionPersonaje, int vidaPersonajes, String expansionesDominio, String tecnicaEspecial, int energiaMaldita, double multiplicador, int dmgAtaqueFisico, int dmgAtaqueEspecial, int dmgExpansionDominio) {
        this.descripcionPersonaje = "Satoru Gojo, hechicero de grado especial, poseedor de los seis ojos y el ritual del infinito. Se le conoce como el hechicero más fuerte de la actualidad";
        this.vidaPersonajes = 150;
        this.expansionesDominio = "Vacío Infinito";
        this.tecnicaEspecial = "Ritual del vacío: Purpura";
        this.energiaMaldita = 130;
        this.multiplicador = 1.5f;
        this.dmgAtaqueFisico = 50;
        this.dmgAtaqueEspecial = 120;
        this.dmgExpansionDominio = 150;
    }

    public void Stats_Yuta_Okkotsu(String descripcionPersonaje, int vidaPersonajes, String expansionesDominio, String tecnicaEspecial, int energiaMaldita, double multiplicador, int dmgAtaqueFisico, int dmgAtaqueEspecial, int dmgExpansionDominio) {
        this.descripcionPersonaje = "Yuta Okkotsu, hechicero de grado especial, capaz de invocar a la reina de las maldiciones, Rikka. Desprende una energia maldita mayor a la del hechicero mas fuerte de la actualidad.";
        this.vidaPersonajes = 80;
        this.expansionesDominio = "Amor Mutuo y Verdadero";
        this.tecnicaEspecial = "Mimetismo: Discurso maldito";
        this.energiaMaldita = 180;
        this.multiplicador = 1.2f;
        this.dmgAtaqueFisico = 25;
        this.dmgAtaqueEspecial = 100;
        this.dmgExpansionDominio = 120;
    }

    public void Stats_Yuji_Itadori(String descripcionPersonaje, int vidaPersonajes, String expansionesDominio, String tecnicaEspecial, int energiaMaldita, double multiplicador, int dmgAtaqueFisico, int dmgAtaqueEspecial, int dmgExpansionDominio) {
        this.descripcionPersonaje = "Yuji Itadori, discipulo de Gojo, tiene una resistencia y fuerza sobrehumanas. Debido a sus capcidades y su origen, fue el unico recipiente válido para contener a Sukuna, el Rey de las maldiciones. ";
        this.vidaPersonajes = 130;
        this.expansionesDominio = "Separador de almas";
        this.tecnicaEspecial = "Black Flash";
        this.energiaMaldita = 80;
        this.multiplicador = 1.8f;
        this.dmgAtaqueFisico = 40;
        this.dmgAtaqueEspecial = 100;
        this.dmgExpansionDominio = 80;
    }

    public void Stats_Toji_Fushiguro (String descripcionPersonaje, int vidaPersonajes, String expansionesDominio, String tecnicaEspecial, int energiaMaldita, double multiplicador, int dmgAtaqueFisico, int dmgAtaqueEspecial, int dmgExpansionDominio) {
        this.descripcionPersonaje = "Toji Fushiguro. Exiliado del clan zenin por no tener energia maldita, pero siendo el humano perfecto, el unico capaz de haber dejado al borde la muerte al hechicero más fuerte de la actualidad.";
        this.vidaPersonajes = 100;
        this.expansionesDominio = "Lanza del Cielo Invertida";
        this.tecnicaEspecial = "Playful Cloud";
        this.energiaMaldita = 50;
        this.multiplicador = 2.2f;
        this.dmgAtaqueFisico = 60;
        this.dmgAtaqueEspecial = 120;
        this.dmgExpansionDominio = 150;
    }

    public void Stats_Maldicion_Segundo_Grado (String nombre, int vidaPersonajes, int multiplicador, int dmgAtaqueFisico) {
        this.nombre = "Maldicion de Segundo Grado";
        
    }
}

