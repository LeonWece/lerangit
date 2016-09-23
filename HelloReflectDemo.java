package com.ssyt.yt1.day31;

import java.lang.reflect.Field;

class Person {

	private String name;

	public String getName() {
		return name;
	}
}

public class HelloReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException,
			NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException {
		// 1、获取Class对象
		Class<?> clazz = Class.forName("com.ssyt.yt1.day31.Person");
		// 2、从Class获得要访问的对象信息（构造方法、方法、成员变量等）
		// Field[] fields = clazz.getDeclaredFields();
		// for (Field field : fields) {
		// System.out.println(field);
		// }
		Field field = clazz.getDeclaredField("name");
		field.setAccessible(true);
		Person person = new Person();
		// 3、对访问对象的具体操作（java.lang.reflect.*）
		field.set(person, "张三");
		System.out.println(person.getName());
	}
}
