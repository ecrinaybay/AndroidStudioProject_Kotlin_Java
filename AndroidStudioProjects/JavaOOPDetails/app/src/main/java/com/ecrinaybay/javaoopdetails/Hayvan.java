package com.ecrinaybay.javaoopdetails;

public class Hayvan {

    String isim;
    String gozRengi;
    String tuyRengi;

    public Hayvan(){
        super(); //Hayvan sınıfının extend ettiği bir şey olmasa bile javadaki Object sınıfına referans veriyor.
                //Burada super yazsak da olur yazmasak da olur.
    }

    public Hayvan(String isim, String gozRengi, String tuyRengi) {
        this.isim = isim;
        this.gozRengi = gozRengi;
        this.tuyRengi = tuyRengi;
    }

    public static int sum_array(int array_size){
        return 0;
    }


}
