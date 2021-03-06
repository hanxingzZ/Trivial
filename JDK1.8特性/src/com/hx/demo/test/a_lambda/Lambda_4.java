package com.hx.demo.test.a_lambda;

import java.util.*;

/**
 * 作用域
 * Created by 林皓 on 2017/3/27 0027.
 */
public class Lambda_4 {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(Arrays.asList(
                "I ", "like ", "play ", "games !",
                "I ", "also ", "like ", "eat !"
        ));
        Set<String> strSet = new HashSet<>();

        strList.forEach(str-> strSet.add(str+"\n"));

        System.out.println(strList);
        System.out.println("----------------");
        System.out.println(strSet);
    }
}
