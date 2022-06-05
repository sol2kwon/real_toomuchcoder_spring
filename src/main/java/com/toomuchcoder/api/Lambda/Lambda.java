package com.toomuchcoder.api.Lambda;

import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * packageName: com.toomuchcoder.api.Lambda
 * fileName        : Lambda.java
 * author          : solyikwon
 * date            : 2022-06-05
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-05         solyikwon      최초 생성
 **/
public class Lambda {

    public static int integer(String arg){
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(arg);
    }
    public static long longParse(String s){
        Function<String,Long> f = Long::parseLong;
        return f.apply(s);
    }
    public static float floatParse(String s){
        Function<String,Float> f = Float::parseFloat;
        return f.apply(s);
    }
    public static String string(Object o){
        //String s = String.valueOf(o)

        Function<Object,String> f = String::valueOf;
        return f.apply(o);

    }
    public static boolean equals(String s1, String s2){
        BiPredicate<String,String> f = String::equals;
        return f.test(s1,s2);
    }
    //int[] arr = new int [8] 클래식 자바
    // 이름은 array  int type size를 파라미터를 던지면 배열이나온다 열칸짜리..들어가는 값이 인트이고 나오는건 인트 집합
    // = int[]::new

    public static int[] array(int a){
        Function<Integer,int[]> f = int[]::new;
        return f.apply(a);

    }
    public static int random(int min, int max){
        //BiFunction<Integer,Integer,Integer>=(int)(Math.random()*max)+min;
        // BiFunction<Integer,Integer,Double> f = Math::random;
        //Supplier<Double> f = Math::random;
        //return f.get()
        //return (int)(f.get()*max)+min;
        BiFunction<Integer,Integer,Integer> f=(min1, max1)->(int)(Math.random()*min1)+max1;
        return f.apply(min,max);

    }
    public static File makeFile(String a){
        Function<String,File>f= File::new;
        return f.apply(a);
    }
    /**
     public static String date(){
     Supplier<Date> f= Date :: new;
     return String.valueOf(f.get()) ;
     }

     public static String a(){
     Supplier<String> f =()-> string(new Date());
     return f.get();
     }


     public static String c(){
     Supplier<String> f = () -> string(new SimpleDateFormat("YYY-MM-dd").format(new Date()));
     return f.get();
     }*/
    public static String date(){
        Supplier<String> f = () -> string(LocalDate.now());
        return f.get();
    }
}
