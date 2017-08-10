package com.suru.springtest.aopex2.model;

public interface DummyInterface {

	public void snap();

	public String snapReturn();

	public void throwSnap() throws Exception;

	public void aroundSnap();

}