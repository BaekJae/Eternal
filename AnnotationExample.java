package com.annotation;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
public class AnnotationExample {
	public static void main(String[] args) {
	}
	@Override
	@TODO(user="ȫ�浿",id=1,comments="1��")
	public String toString() {
		return "User Info";
	}
	@Deprecated
	@TODO(user="ȫ���",id=2,comments="2��")
	public static void toClassInfo() {
		System.out.println("Class Info");
	}
	@SuppressWarnings({"unchecked","deprecation"})
	@TODO(comments="Dummy!")
	public static void genericsTest() throws Exception{
		throw new Exception();
	}
}