package cn.yijiao.sm.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class AfterInsertFilmEvent extends ApplicationContextEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AfterInsertFilmEvent(ApplicationContext source) {
		super(source);
		System.out.println("After Insert Film Data.");
	}

}
