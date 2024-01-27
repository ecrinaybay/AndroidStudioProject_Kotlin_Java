package com.ecrinaybay.javaoopdetails;

public class Kopek extends Hayvan implements Egitim{

    public Kopek(){

    }

    public Kopek(String isim, String gozRengi, String tuyRengi) {
        super(isim, gozRengi, tuyRengi); //super kalıtım aldığı sınıfa referans verir
    }

    @Override
    public boolean egitimAl() {
        System.out.println("Köpekler eğitim alır");
        return true;
    }

    @Override
    public void test() {

    }

    @Override
    public boolean egitimAlBody() {
        //return Egitim.super.egitimAlBody(); // Ne döndürüyorsak döndürmek zorunda değiliz, yani bunu döndürmesek de olur.
        System.out.println("Köpekler eğitim alır");
        return true;
    }
}
