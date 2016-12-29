package cn.yijiao.sm.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class BeforeInsertFilmEvent extends ApplicationContextEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BeforeInsertFilmEvent(ApplicationContext source) {
		super(source);
		System.out.println("Before Insert Film Data.");
	}

}
