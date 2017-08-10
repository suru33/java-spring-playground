package com.suru.springtest.aopex2.model;

public interface DummyInterface {

	void snap();

	String snapReturn();

	void throwSnap() throws Exception;

	void aroundSnap();

}