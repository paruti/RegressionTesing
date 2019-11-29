package com.org;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestRunner implements IRetryAnalyzer {

	private int retryCount =1;
	private final int MAX_RETRY_COUNT =3;
	
	@Override
	public boolean retry(ITestResult result) {
		retryCount++;
		if (MAX_RETRY_COUNT==retryCount) {
		
		return false;
		}
		else {
			return true;
		}
	}

	

	}

