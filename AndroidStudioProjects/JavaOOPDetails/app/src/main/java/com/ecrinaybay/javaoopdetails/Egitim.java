package com.ecrinaybay.javaoopdetails;

public interface Egitim {

    public boolean egitimAl();

    //Normalde arayüzlerde body çok koymayız ama burada egitimAlBody'de default olarak bir body atayabiliyoruz.
    //Bu özellik java8'den sonra geldi.
    //Ayrıca implement ettiğimiz sınıf Kopek sınıfına bunu eklemek zorunlu değiliz. İsteğe bağlı ekleyebiliriz.
    public default boolean egitimAlBody(){
        System.out.println("Eğitim almıyoruz");
        return false;
    }
    //Bunu kopek sınıfına eklemek zorundayız.
    public void test();
}
