package com.hillel.Lecture_9;

public class LandlinePhone extends Phone {

    public int id;
    public String provider;
    public String type;

    public int hotNumberKey;
    public String hotNumber;

    public String resultDown="Слышна тишина";

public LandlinePhone(int id, String provider, String type, int hotNumberKey) {
        this.id = id;
        this.provider = provider;
        this.type = type;
        this.hotNumberKey=1;
    }

    @Override
    public String call(){                       // переопределение метода call для того чтобы поведение проводного тедефона отличалось от смартфона
        if (isConnectionSuccess==true){
            resultOfConnection="Слышны гудки";
        }
        else
        {
            resultOfConnection="Слышны помехи";
        }
        return resultOfConnection;
    }


    @Override                                  // переопределение метода call для того чтобы поведение проводного тедефона отличалось от смартфона
    public String down(){
        return resultDown;
    }

   public String call(int hotNumberKey){     // перегрузка метода call для набора "Гарячего номера"

    switch (hotNumberKey) {

        case 1:
            hotNumber="Набирается номер: +380679001010";

                                       // не расписывал все гарячие клавиши, теоретически здесь должно быть 10 вариантов
    }


    return hotNumber;
   }


}
