package cn.yijiao.sm.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import cn.yijiao.sm.event.AfterInsertFilmEvent;
import cn.yijiao.sm.event.BeforeInsertFilmEvent;

@Aspect
public class FilmAop implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = context;

	}

	@Before("execution(* cn.yijiao.sm.service.*.*(..))")
	public void before() {

		BeforeInsertFilmEvent beforeInsertFilmEvent = new BeforeInsertFilmEvent(applicationContext);
		applicationContext.publishEvent(beforeInsertFilmEvent);
	}

	@After("execution(* cn.yijiao.sm.service.*.*(..))")
	public void after() {

		AfterInsertFilmEvent afterInsertFilmEvent = new AfterInsertFilmEvent(applicationContext);
		applicationContext.publishEvent(afterInsertFilmEvent);
	}

}
