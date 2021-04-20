package com.example.demoHaylel;

   //amera, abere, alebel, abebe, GojamName, Daddy1, Daddy2, code
import java.util.HashMap;

public class Daddy {

     private String amera;
     private String abere;
     private String alebel;
     private  Object abebe;
//@NotBlank(messga = "Body is mandatory")
// main overloaded constructor

    public Daddy(String amera, String abere, String alebel) {
           this.amera = amera;
           this.abere = abere;
           this.alebel = alebel;

    }

    public Daddy() {

    }


    public String getAmera() {
        return amera;
    }

    public String getAbere() {
        return abere;
    }

    public String getAlebel() {
        return alebel;
    }

    public Object getAbebe() {
        return abebe;
    }

   public void setAbebe(Object abebe) {
    this.abebe = abebe;
}

  // overload constructor of under ser amera

    public void setAmera(String amera) {
        this.amera = amera;
        this.abebe = abebe;

      }

   // Daddy

public static void main(String []args){


}

    public void setAbere(String abere) {
        this.abere = abere;
    }

    public void setAlebel(String alebel) {
        this.alebel = alebel;
    }


   // ********main method*******//
/*
    public static void main(String []args) {

       // Calling those methods below
        Daddy2("tekola", "teshome", "awoke");

  //      getAmera("")


        new Daddy("amera", "abere", "alebel" );
        //Alemu("Niberet","abere", "gobeze" );
        new Daddy("keberie", "maregie", "susie");

        new Daddy("amine", "doctor", "belachew");


    }
   */
    public HashMap<String, Integer> GojamName(String amera){

        HashMap<String, Integer> father = new HashMap<String, Integer>() ;
        father.put("ayalew", 55);
        father.put("asnakew", 67);
        father.put("kemal", 88);


        return father;
    }


    //%%%%& Daddy1 Method$%//

     private static String Daddy1(String Niberet, String AkeLe, String ZemEne) {

         String Alemu = Daddy1(Niberet, AkeLe, ZemEne).toLowerCase();

         System.out.println(Alemu);

       // return Daddy1(niberet, akele, zemene);

         return Alemu;
    }


    //&&^Daddy2 with no return ^&&*&*//

    static void Daddy2(String nam1, String nam2, String nam3) {

     // return

    }


        // Array name code
    private static double code (double [] gonder){

   //double gonder=0.0;

      gonder = new double[10];

          gonder[0]=77.7;
          gonder[1]=88.8;
          gonder[3]= 77.7;
          gonder[10] = 102.9;

             double state = gonder.length;

               return gonder.length;
    }



}
