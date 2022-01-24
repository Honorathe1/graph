/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umukecuru_kamonyi;

/**
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.LinkedList;

/**
 * Name Honorathe Bizumuremyi 
 * program Umukecuru wi Kamonyi uhinga ibijumba akabigemura kwisoko rimwe ubundi amasoko akabisangira ubwayo
 * System ni DataStructure izabika byabijumba kumasoko
 * @author Honorathe
 */
// graph which tell us about how Mukecuru_Kamonyi From kamonyi District distribute ibijumba kw'isoko

class Mukecuru_Kamonyi {

  // inner class
  // to keep track of ibijumba
  class Ibijumba{
    int kuva, kujya;
  }


  int isoko, umucuruzi;


  Ibijumba[] curuza;
//constructor
  Mukecuru_Kamonyi(int Isoko, int umucuruzi) {
    this.isoko = Isoko;
    this.umucuruzi = umucuruzi;

   
    curuza = new Ibijumba[umucuruzi];
    for(int isoko = 0; isoko < umucuruzi; isoko++) {

    
      curuza[isoko] = new Ibijumba();
    }
  }

  public static void main(String[] args) {

    // create an object of Mukecuru_Kamonyi class
    int Ntasoko = 5; // type int
    int Ntamucuruzi = 8;  //type int
    Mukecuru_Kamonyi gurisha = new Mukecuru_Kamonyi(Ntasoko, Ntamucuruzi);

    // create graph
    gurisha.curuza[0].kuva = 1;   // from Mukecuru_Kamonyi market to Gashyushya markert
   gurisha.curuza[0].kujya = 2;

    gurisha.curuza[1].kuva= 1;   // From Mukecuru_Kamonyi market to Nyarubaka market
    gurisha.curuza[1].kujya = 3;

    gurisha.curuza[2].kuva= 1;   // From Mukecuru_Kamonyi market to Musambira market
    gurisha.curuza[2].kujya = 4;

    gurisha.curuza[3].kuva = 2;   //  From Gashyushya market to Musambira
    gurisha.curuza[3].kujya = 4;

    gurisha.curuza[4].kuva= 2;   // from Gashyushya market to Nyamirambo market
    gurisha.curuza[4].kujya = 5;

    gurisha.curuza[5].kuva= 3;   // from Nyarubaka Market to Musambira Market
    gurisha.curuza[5].kujya = 4;

    gurisha.curuza[6].kuva= 3;   // from Nyarubaka market to Nyamirambo makert 
    gurisha.curuza[6].kujya = 5;

    gurisha.curuza[7].kuva= 4;   // from musambira market to Nyamirambo market
    gurisha.curuza[7].kujya = 5;

    // print graph
    for(int i = 0; i < Ntamucuruzi; i++) {
        System.out.println("ibijumba kw' Isoko guturuka kwa Mukecuru");
      System.out.println(gurisha.curuza[i].kuva + " - " + gurisha.curuza[i].kuva);
    }

  }
}

// Ntago byakunda gukoresha Stack dataStructer kuberako stack ikora nka stock nago yi ikora distrubtion kubantu cg kumasoko ntiyo mpamvu ntayikoresha
