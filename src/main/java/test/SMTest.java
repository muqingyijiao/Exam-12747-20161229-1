package test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.yijiao.sm.po.Film;
import cn.yijiao.sm.service.FilmServiceImpl;

public class SMTest {
	static ClassPathXmlApplicationContext applicationContext;
	static FilmServiceImpl filmServiceImpl;

	public static void main(String[] args) {

		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		applicationContext.start();
		filmServiceImpl = (FilmServiceImpl) applicationContext.getBean("filmServiceImpl");

		Film film = new Film();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("请输入电影名称(title): ");
			String title = sc.next();
			film.setTitle(title);
			
			System.out.println("请输入电影描述(description):  ");
			String description = sc.next();
			film.setDescription(description);
			
			System.out.println("请输入语言 ID(language_id): (1-6的整数)");
			Byte language_id = sc.nextByte();
			film.setLanguageId(language_id);
			filmServiceImpl.insertSelective(film);
		} catch (java.util.InputMismatchException e) {
			System.out.println("您输入的数据不是Byte型，请您输入一个Byte型，请重新运行");
		} catch (org.springframework.dao.DataIntegrityViolationException e) {
			System.out.println("你输入的id值过大，找不到对应的父元素，请重新运行");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("您输入的数据有误，请重新输入");
		}
		applicationContext.stop();
	}
}
