package com.spring.ref;

public class A {
	private int w;
	private B obj;
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}

	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "A [w=" + w + ", obj=" + obj + "]";
	}

}
