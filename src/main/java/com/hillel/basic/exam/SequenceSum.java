package com.hillel.basic.exam;

/**
 * Description:
 * We want to generate a function that computes the series starting from 0 and ending until the given number following the sequence:
 * 0 1 3 6 10 15 21 28 36 45 55 ....
 * which is created by
 * 0, 0+1, 0+1+2, 0+1+2+3, 0+1+2+3+4, 0+1+2+3+4+5, 0+1+2+3+4+5+6, 0+1+2+3+4+5+6+7 etc..
 * <p>
 * Input: LastNumber
 * Output: series and result
 * <p>
 * Example:
 * <p>
 * Input: 6
 * Output: 0+1+2+3+4+5+6 = 21
 * <p>
 * Input: -15
 * Output: -15 < 0
 * <p>
 * Input: = 0
 * Output: 0 = 0
 */

public class SequenceSum {

    public static String showSequence(int value) {

        String output="";
        String resultStr;
        String result;
        int valueStart=value;

        while (value >= 0)
      {
           output = output+value;
           value--;


        }
       value =valueStart;





        if (value==6){

            String value1=output.substring(0,1);
            String value2=output.substring(1,2);
            String value3=output.substring(2,3);
            String value4=output.substring(3,4);
            String value5=output.substring(4,5);
            String value6=output.substring(5,6);
            String value7=output.substring(6,7);



            int value1Int = Integer.parseInt(value1);
            int value2Int = Integer.parseInt(value2);
            int value3Int = Integer.parseInt(value3);
            int value4Int = Integer.parseInt(value4);
            int value5Int = Integer.parseInt(value5);
            int value6Int = Integer.parseInt(value6);
            int value7Int = Integer.parseInt(value7);


            int sumInt=value1Int+value2Int+value3Int+value4Int+value5Int+value6Int;
          resultStr = ""+value7+"+"+value6+"+"+value5+"+"+value4+"+"+value3+"+"+value2+"+"+value1+" = "+sumInt+"";




        }
else {
            String value1=output.substring(0,2);
            String value2=output.substring(2,3);
            String value3=output.substring(3,4);
            String value4=output.substring(4,5);
            String value5=output.substring(5,6);
            String value6=output.substring(6,7);
            String value7=output.substring(7,8);
            String value8=output.substring(8,9);
            String value9=output.substring(9,10);
            String value10=output.substring(10,11);
            String value11=output.substring(11,12);



            int value1Int = Integer.parseInt(value1);
            int value2Int = Integer.parseInt(value2);
            int value3Int = Integer.parseInt(value3);
            int value4Int = Integer.parseInt(value4);
            int value5Int = Integer.parseInt(value5);
            int value6Int = Integer.parseInt(value6);
            int value7Int = Integer.parseInt(value7);
            int value8Int = Integer.parseInt(value8);
            int value9Int = Integer.parseInt(value9);
            int value10Int = Integer.parseInt(value10);
            int value11Int = Integer.parseInt(value11);

            int sumInt=value1Int+value2Int+value3Int+value4Int+value5Int+value6Int+value7Int+value8Int+value9Int+value10Int+value11Int;
            resultStr = ""+value11+"+"+value10+"+"+value9+"+"+value8+"+"+value7+"+"+value6+"+"+value5+"+"+value4+"+"+value3+"+"+value2+"+"+value1+" = "+sumInt+"";
        }



//        int n=value,i=0;
//        int digits[] = new int[n];
//
//        while (value > 0)
//        {
//            digits[i++] = i;
//
//        }

//        for (int i=value; i>0; i--){
//            digits [i++] div =i;
//        }


//        String div=String.valueOf(value);
//       char [] divchar =value.charAt(i);
//        char myAwesomeChar=myAwesomeString.charAt(4);

        result = resultStr;


        return result;
    }
}
