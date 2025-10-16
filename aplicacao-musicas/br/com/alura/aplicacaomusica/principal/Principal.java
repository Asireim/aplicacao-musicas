package br.com.alura.aplicacaomusica.principal;

import br.com.alura.aplicacaomusica.modelos.Album;
import br.com.alura.aplicacaomusica.modelos.Musica;
import br.com.alura.aplicacaomusica.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Album centuryBreakdown = new Album();
        centuryBreakdown.criarAlbum("21st Century Breakdown","Green Day",2009);
        Album americanIdiot = new Album();
        americanIdiot.criarAlbum("American Idiot", "Green Day", 2004);

        Musica lastOfAmericanGirls = new Musica();
        lastOfAmericanGirls.criarMusica("Last of the american girls", 4,"Alternativa/indie", centuryBreakdown);
        lastOfAmericanGirls.reproduzir(6000);

        Musica vivaLaGloria = new Musica();
        vivaLaGloria.criarMusica("¡Viva La Gloria!",3,"Alternativa/indie", centuryBreakdown);
        vivaLaGloria.reproduzir(9000);

        Musica lastNightOnEarth = new Musica();
        lastNightOnEarth.criarMusica("Last Night On Earth", 4,"Pop rock",centuryBreakdown);
        lastNightOnEarth.reproduzir(8599);

        Musica knowYourEnemy = new Musica();
        knowYourEnemy.criarMusica("Know Your Enemy",3,"Punk rock", centuryBreakdown);
        knowYourEnemy.reproduzir(7834);

        Musica twentyOneGuns = new Musica();
        twentyOneGuns.criarMusica("21 Guns",5,"Alternativa/indie",centuryBreakdown);
        twentyOneGuns.reproduzir(6453);

        Musica eastJesusNowhere = new Musica();
        eastJesusNowhere.criarMusica("East Jesus Nowhere",4,"Punk Rock",centuryBreakdown);
        eastJesusNowhere.reproduzir(4567);

        Musica musicaAmericanIdiot = new Musica();
        musicaAmericanIdiot.criarMusica("America Idiot", 3,"Punk Rock", americanIdiot);
        musicaAmericanIdiot.reproduzir(5657);

        Musica holiday = new Musica();
        holiday.criarMusica("Holiday", 4,"Punk Rock", americanIdiot);
        holiday.reproduzir(4567);

        Musica jesusOfSuburbia = new Musica();
        jesusOfSuburbia.criarMusica("Jesus Of Suburbia", 9, "Punk Rock", americanIdiot);
        jesusOfSuburbia.reproduzir(6789);

        Musica whatsername = new Musica();
        whatsername.criarMusica("Whatsername", 4,"Pop punk", americanIdiot);
        whatsername.reproduzir(6789);

        Musica boulevardBrokenDreams = new Musica();
        boulevardBrokenDreams.criarMusica("Boulevard of Broken Dreams", 4, "Hard Rock", americanIdiot);
        boulevardBrokenDreams.reproduzir(4546);

        Musica wakeMeUpSeptemberEnds = new Musica();
        wakeMeUpSeptemberEnds.criarMusica("Wake Me Up When September Ends", 5, "Alternativa/indie", americanIdiot);
        wakeMeUpSeptemberEnds.reproduzir(3456);

        centuryBreakdown.imprimeFichaTecnica();
        centuryBreakdown.mostrarMusicas();
        americanIdiot.imprimeFichaTecnica();
        americanIdiot.mostrarMusicas();

        Podcast entrevista = new Podcast();
        entrevista.criarPodcast("Titulo do ep", 35, "Apresentador", 4, "Tema do ep", "Convidado", "Descrição do episodio");
        entrevista.exibeFichaTecnica();

        eastJesusNowhere.avaliar(5.0);
        eastJesusNowhere.avaliar(4.0);
        eastJesusNowhere.avaliar(4.5);
        eastJesusNowhere.avaliar(4.6);
        eastJesusNowhere.avaliar(4.7);
        System.out.println(eastJesusNowhere.getTitulo());
        eastJesusNowhere.verificarAvaliacao();
    }
}
