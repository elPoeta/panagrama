package io.leo.panagrama;

public class Panagram {

    public static boolean isValidPanagram(String text) {
       String letras ="abcdefghijklmnopqrstuvwxyz";

       for(int i=0; i<letras.length(); i++){
           if(!text.toLowerCase().contains(letras.toLowerCase().substring(i,i+1))){
               return false;
           }
       }
       return true;
    }

}
