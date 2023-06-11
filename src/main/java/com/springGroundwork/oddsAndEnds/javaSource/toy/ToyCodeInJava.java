package com.springGroundwork.oddsAndEnds.javaSource.toy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class ToyCodeInJava {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("intArray1 = " + intArray);
        System.out.println("intArray2 = " + Arrays.toString(intArray)); // 배열 출력 방법
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("list = " + list);
        Stream<Integer> intStream = list.stream(); // list를 데이터 소스로 하는 새로운 스트림을 생성
        intStream.forEach(System.out::print); // 메서드 참조
    }

}
