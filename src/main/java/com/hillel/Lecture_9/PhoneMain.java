package com.hillel.Lecture_9;

public class PhoneMain {

    public static void main(String[] args) {


        Phone phone = new Phone();

        // создаём объекты смартфона,проводного телефона и рации

        Phone CellPhone = new CellPhone(1,"KievStar","Xiaomi","Android","10.0",true);

        Phone LandlinePhone = new LandlinePhone(2,"АТС 12","ТС-100",1);

        Phone WalkieTalkie = new WalkieTalkie(3,"секретный","Р-200",433.200);

        Phone CellPhone2 = new CellPhone(4,"KievStar","Xiaomi","Android","11.0",false);


        // гарячая клавиша при нажатии на который автоматически набирается сохранённый в память номер

        int hotNumberKey=((LandlinePhone) LandlinePhone).hotNumberKey;


       String  result = phone.down();

                                                     // проверяем результат сброса в случае смартфона (должны получить длительность разговора)

        String  result2down = CellPhone.down();
        System.out.println(result2down);

                                       // проверяем результат вызова в случае смартфона (успешное соединение)

        String  result2call = CellPhone.call();
        System.out.println(result2call);


                                         // проверяем результат вызова в случае смартфона (неуспешное соединение)

          result2call = CellPhone2.call();


                                                      // проверяем результат сброса в случае проводного телефона

        String  result3 = LandlinePhone.down();

        System.out.println(result3);

                                                        // проверяем результат набора "Гарячего номера"

        String  result3call = ((LandlinePhone) LandlinePhone).call(hotNumberKey);


        System.out.println(result3call);

                                                  // проверяем результат отработки метода повышения и понижения частоты для рации

        double newFrequency = ((WalkieTalkie) WalkieTalkie).switchFrequencyUpward();

        System.out.println("Новая частота: "+newFrequency);

        newFrequency = ((WalkieTalkie) WalkieTalkie).switchFrequencyDownward();

        System.out.println("Новая частота: "+newFrequency);

                                                  // хеш код для объекта CellPhone

        int hCodeCellPhone;
        hCodeCellPhone = CellPhone.hashCode();
        System.out.println(hCodeCellPhone);

                                                   // сравнение объектов
           if (CellPhone.equals(LandlinePhone)){
               System.out.println("Объекты совпадают");
           }

           else
           {
               System.out.println ("Объекты не совпадают");


           }

                                                      // сравнение объектов

        if (CellPhone.equals(CellPhone)){
            System.out.println("Объекты совпадают");
        }

        else
        {
            System.out.println ("Объекты не совпадают");
        }

    }
}
