package br.com.alura.aplicacaomusica.principal;

import br.com.alura.aplicacaomusica.modelos.Album;
import br.com.alura.aplicacaomusica.modelos.Musica;
import br.com.alura.aplicacaomusica.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Album centuryBreakdown = new Album("21st Century Breakdown","Green Day",2009);
        Album americanIdiot = new Album("American Idiot", "Green Day", 2004);

        Musica lastOfAmericanGirls = new Musica("Last of the american girls", 4,"Alternativa/indie", centuryBreakdown);
        lastOfAmericanGirls.reproduzir(6000);
        lastOfAmericanGirls.verTotalReproducoes();

        Musica vivaLaGloria = new Musica("¡Viva La Gloria!",3,"Alternativa/indie", centuryBreakdown);
        vivaLaGloria.reproduzir(9000);
        vivaLaGloria.verTotalReproducoes();

        Musica lastNightOnEarth = new Musica("Last Night On Earth", 4,"Pop rock",centuryBreakdown);
        lastNightOnEarth.reproduzir(8599);
        lastNightOnEarth.verTotalReproducoes();

        Musica knowYourEnemy = new Musica("Know Your Enemy",3,"Punk rock", centuryBreakdown);
        knowYourEnemy.reproduzir(7834);
        knowYourEnemy.verTotalReproducoes();

        Musica twentyOneGuns = new Musica("21 Guns",5,"Alternativa/indie",centuryBreakdown);
        twentyOneGuns.reproduzir(6453);
        twentyOneGuns.verTotalReproducoes();

        Musica eastJesusNowhere = new Musica("East Jesus Nowhere",4,"Punk Rock",centuryBreakdown);
        eastJesusNowhere.reproduzir(4567);
        eastJesusNowhere.verTotalReproducoes();

        Musica musicaAmericanIdiot = new Musica("America Idiot", 3,"Punk Rock", americanIdiot);
        musicaAmericanIdiot.reproduzir(5657);
        musicaAmericanIdiot.verTotalReproducoes();

        Musica holiday = new Musica("Holiday", 4,"Punk Rock", americanIdiot);
        holiday.reproduzir(4567);
        holiday.verTotalReproducoes();

        Musica jesusOfSuburbia = new Musica("Jesus Of Suburbia", 9, "Punk Rock", americanIdiot);
        jesusOfSuburbia.reproduzir(6789);
        jesusOfSuburbia.verTotalReproducoes();

        Musica whatsername = new Musica("Whatsername", 4,"Pop punk", americanIdiot);
        whatsername.reproduzir(6789);
        whatsername.verTotalReproducoes();

        Musica boulevardBrokenDreams = new Musica("Boulevard of Broken Dreams", 4, "Hard Rock", americanIdiot);
        boulevardBrokenDreams.reproduzir(4546);
        boulevardBrokenDreams.verTotalReproducoes();

        Musica wakeMeUpSeptemberEnds = new Musica("Wake Me Up When September Ends", 5, "Alternativa/indie", americanIdiot);
        wakeMeUpSeptemberEnds.reproduzir(3456);
        wakeMeUpSeptemberEnds.verTotalReproducoes();

        centuryBreakdown.imprimeFichaTecnica();
        centuryBreakdown.mostrarMusicas();
        americanIdiot.imprimeFichaTecnica();
        americanIdiot.mostrarMusicas();

        Podcast entrevista = new Podcast("Titulo do ep", 35, "Apresentador", 4, "Tema do ep", "Convidado", "Descrição do episodio");
        entrevista.exibeFichaTecnica();

        eastJesusNowhere.avaliar(5.0);
        eastJesusNowhere.avaliar(4.0);
        eastJesusNowhere.avaliar(4.5);
        eastJesusNowhere.avaliar(4.6);
        eastJesusNowhere.avaliar(4.7);
        eastJesusNowhere.verificarAvaliacao();
    }
}
