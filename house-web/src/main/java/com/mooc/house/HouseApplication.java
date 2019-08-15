package com.mooc.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.mooc1.house.autoconfig.EnableHttpClient;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableHttpClient
@EnableAsync
public class HouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseApplication.class, args);
//		int[] array = new int[]{1,2,3,4,5,6,7};
//		System.out.print("结果"+ reOrderArray(array));
//	}
//	public static List reOrderArray(int[] array) {
//		List odd = new ArrayList<>();
//		List even = new ArrayList<>();
//		int l = array.length;
//		for(int i=0; i<l;i++ ){
//			if(array[i] % 2 !=0){
//				even.add(array[i]);
//			}else{
//				odd.add(array[i]);
//			}
//		}
//		List total = new ArrayList();
//		total.addAll(even);
//		total.addAll(odd);
//		return total;
	}
}
