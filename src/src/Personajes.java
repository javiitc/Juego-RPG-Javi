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

        int seleccionPersonaje;
        int yenes;
        String [] inventario = new String[10];

    public void Stats_Satoru_Gojo () {
        seleccionPersonaje = seleccionPersonaje;
        descripcionPersonaje = "Satoru Gojo, hechicero de grado especial, poseedor de los seis ojos y el ritual del infinito. Se le conoce como el hechicero más fuerte de la actualidad";
        vidaPersonajes = 230;
        expansionesDominio = "Vacío Infinito";
        tecnicaEspecial = "Ritual del vacío: Purpura";
        energiaMaldita = 150;
        multiplicador = 1.5f;
        dmgAtaqueFisico = 50;
        dmgAtaqueEspecial = 120;
        dmgExpansionDominio = 180;
    }

    public void Stats_Yuta_Okkotsu () {

        descripcionPersonaje = "Yuta Okkotsu, hechicero de grado especial, capaz de invocar a la reina de las maldiciones, Rikka. Desprende una energia maldita mayor a la del hechicero mas fuerte de la actualidad.";
        vidaPersonajes = 130;
        expansionesDominio = "Amor Mutuo y Verdadero";
        tecnicaEspecial = "Mimetismo: Discurso maldito";
        energiaMaldita = 220;
        multiplicador = 1.2f;
        dmgAtaqueFisico = 25;
        dmgAtaqueEspecial = 100;
        dmgExpansionDominio = 140;
    }

    public void Stats_Yuji_Itadori () {

        descripcionPersonaje = "Yuji Itadori, discipulo de Gojo, tiene una resistencia y fuerza sobrehumanas. Debido a sus capcidades y su origen, fue el unico recipiente válido para contener a Sukuna, el Rey de las maldiciones. ";
        vidaPersonajes = 180;
        expansionesDominio = "Separador de almas";
        tecnicaEspecial = "Black Flash";
        energiaMaldita = 80;
        multiplicador = 1.8f;
        dmgAtaqueFisico = 40;
        dmgAtaqueEspecial = 150;
        dmgExpansionDominio = 80;
    }

    public void Stats_Toji_Fushiguro () {

        descripcionPersonaje = "Toji Fushiguro. Exiliado del clan zenin por no tener energia maldita, pero siendo el humano perfecto, el unico capaz de haber dejado al borde la muerte al hechicero más fuerte de la actualidad.";
        vidaPersonajes = 150;
        expansionesDominio = "Lanza del Cielo Invertida";
        tecnicaEspecial = "Playful Cloud";
        energiaMaldita = 70;
        multiplicador = 2.2f;
        dmgAtaqueFisico = 60;
        dmgAtaqueEspecial = 130;
        dmgExpansionDominio = 150;
    }

    public void Stats_Maldicion_Segundo_Grado (String nombre, int vidaPersonajes, int multiplicador, int dmgAtaqueFisico) {
        this.nombre = "Maldicion de Segundo Grado";
        this.vidaPersonajes = 300;
        this.multiplicador = 1.3f;
        this.dmgAtaqueFisico = 25;
    }

    public void Stats_Maldicion_Primer_Grado (String nombre, int vidaPersonajes, int multiplicador, int dmgAtaqueFisico) {
        this.nombre = "Maldicion de Primer Grado";
        this.vidaPersonajes = 550;
        this.multiplicador = 1.6f;
        this.dmgAtaqueFisico = 35;
    }

    public void Stats_Sukuna (String nombre, int vidaPersonajes, int multiplicador, int dmgAtaqueFisico) {
        this.nombre = "Sukuna, Rey de las maldiciones y el hechicero más fuerte de la historia";
        this.vidaPersonajes = 1000;
        this.multiplicador = 2.0f;
        this.dmgAtaqueFisico = 55;

    }

    public void check_PJ (int pnjElegido) {
        if (pnjElegido == 1) {
            Stats_Satoru_Gojo();
        } else if (pnjElegido == 2) {
            Stats_Yuta_Okkotsu();
        } else if (pnjElegido == 3){
            Stats_Yuji_Itadori();
        } else if (pnjElegido == 4){
            Stats_Toji_Fushiguro();
        }
    }

}

