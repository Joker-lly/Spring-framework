package com.lly.MyBeanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Configuration;


public class MyBeanfactory implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition  beanDefinition =
				(GenericBeanDefinition)beanFactory.getBeanDefinition("UserDaoImpl");
		int autowireMode = beanDefinition.getAutowireMode();
		System.out.println(autowireMode);
	}
}
