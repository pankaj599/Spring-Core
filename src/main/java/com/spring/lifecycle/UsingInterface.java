package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterface implements InitializingBean, DisposableBean {
	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "UsingInterface [s=" + s + "]";
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is to destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is to initiate");
	}

}
