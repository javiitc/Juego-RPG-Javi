public class Personajes {

        String descripcionPersonaje;
        int vidaPersonajes;
        int vidaMaxima;
        int vidaMaxEnemigo;
        String expansionesDominio;
        String tecnicaEspecial;
        String nombre;
        String nombreBatalla;

        int energiaMaldita;
        int energiaMalditaMax;
        float multiplicadorCritico;
        int dmgAtaqueFisico;
        int dmgAtaqueEspecial;
        int dmgExpansionDominio;

        int seleccionPersonaje;
        int yenes;
        String [] inventario = new String[10];


    public void Stats_Satoru_Gojo () {

        nombre = "Satoru Gojo";
        descripcionPersonaje = "Satoru Gojo, hechicero de grado especial, poseedor de los seis ojos y el ritual del infinito. Se le conoce como el hechicero más fuerte de la actualidad";
        expansionesDominio = "Vacío Infinito";
        tecnicaEspecial = "Ritual del vacío: Purpura";
        vidaPersonajes = 230;
        vidaMaxima = 230;
        energiaMaldita = 150;
        energiaMalditaMax = 150;
        dmgAtaqueFisico = 70;
        multiplicadorCritico = dmgAtaqueFisico * 1.5f;
        dmgAtaqueEspecial = 120;
        dmgExpansionDominio = 250;
        inventario = new String [10];
        yenes = 5;
    }

    public void Stats_Yuta_Okkotsu () {

        nombre = "Yuta Okkotsu";
        descripcionPersonaje = "Yuta Okkotsu, hechicero de grado especial, capaz de invocar a la reina de las maldiciones, Rikka. Desprende una energia maldita mayor a la del hechicero mas fuerte de la actualidad.";
        vidaPersonajes = 150;
        vidaMaxima = 150;
        expansionesDominio = "Amor Mutuo y Verdadero";
        tecnicaEspecial = "Mimetismo: Discurso maldito";
        energiaMaldita = 250;
        energiaMalditaMax = 250;
        dmgAtaqueFisico = 55;
        multiplicadorCritico = dmgAtaqueFisico * 1.2f;
        dmgAtaqueEspecial = 100;
        dmgExpansionDominio = 180;
        inventario = new String [10];
        yenes = 5;

    }

    public void Stats_Yuji_Itadori () {

        nombre = "Yuji Itadori";
        descripcionPersonaje = "Yuji Itadori, discipulo de Gojo, tiene una resistencia y fuerza sobrehumanas. Debido a sus capcidades y su origen, fue el unico recipiente válido para contener a Sukuna, el Rey de las maldiciones. ";
        vidaPersonajes = 180;
        vidaMaxima = 180;
        expansionesDominio = "Separador de almas";
        tecnicaEspecial = "Black Flash";
        energiaMaldita = 100;
        energiaMalditaMax = 100;
        dmgAtaqueFisico = 40;
        multiplicadorCritico = dmgAtaqueFisico * 1.8f;
        dmgAtaqueEspecial = 150;
        dmgExpansionDominio = 120;
        inventario = new String [10];
        yenes = 5;
    }

    public void Stats_Toji_Fushiguro () {

        nombre = "Toji Fushiguro";
        descripcionPersonaje = "Toji Fushiguro. Exiliado del clan zenin por no tener energia maldita, pero siendo el humano perfecto, el unico capaz de haber dejado al borde la muerte al hechicero más fuerte de la actualidad.";
        vidaPersonajes = 170;
        vidaMaxima = 170;
        expansionesDominio = "Lanza del Cielo Invertida";
        tecnicaEspecial = "Nube Intinerante";
        energiaMaldita = 50;
        energiaMalditaMax = 50;
        dmgAtaqueFisico = 75;
        multiplicadorCritico = dmgAtaqueFisico * 2.2f;
        dmgAtaqueEspecial = 130;
        dmgExpansionDominio = 150;
        inventario = new String [10];
        yenes = 5;
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

    public Personajes (String tipoEnemigo) {
        if (tipoEnemigo.equals("Segundo Grado")){
            this.nombre = " una Maldición de segundo grado";
            this.nombreBatalla = " Maldición de Segundo grado ";
            this.vidaPersonajes = 300;
            this.vidaMaxEnemigo = 300;
            this.dmgAtaqueFisico = 30;
            this.multiplicadorCritico = dmgAtaqueFisico * 1.3f;
        } else if (tipoEnemigo.equals("Primer Grado")) {
            this.nombre = " una Maldición de primer grado";
            this.nombreBatalla = " Maldición de Primer Grado ";
            this.vidaPersonajes = 550;
            this.vidaMaxEnemigo = 550;
            this.dmgAtaqueFisico = 40;
            this.multiplicadorCritico = dmgAtaqueFisico * 1.6f;
        } else if (tipoEnemigo.equals("Sukuna")) {
            this.nombre = " Sukuna, Rey de las maldiciones y el hechicero más fuerte de la historia";
            this.nombreBatalla = " Sukuna ";
            this.vidaPersonajes = 1000;
            this.vidaMaxEnemigo = 1000;
            this.dmgAtaqueFisico = 55;
            this.multiplicadorCritico = 2.0f;
        }
    }

    public Personajes () {
        //Está vacío porque se necesita este constructor para luego la elección de personaje en el Main
    }
}

