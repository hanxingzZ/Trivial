package com.hx.java8.in.action.stream.test82;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * 
 * @description: TODO
 * @author : 韩兴(13039997950@163.com)
 * @date 创建时间：2019年12月2日 下午6:35:37
 * @version 1.0
 */
public class ProcessingTest {

	public static void main(String[] args) {
		UnaryOperator<String> headerProcessing = (String text) -> "From Raoul, Mario and Alan: " + text;
		UnaryOperator<String> spellCheckerProcessing = (String text) -> text.replaceAll("labda", "lambda");
		Function<String, String> pipeline = headerProcessing.andThen(spellCheckerProcessing);
		String result = pipeline.apply("Aren't labdas really sexy?!!");
		System.out.println(result);
	}

}
