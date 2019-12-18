package sample01;

import java.io.FileWriter;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	FileWriter fw;

	public Object around(ProceedingJoinPoint joinPoint) {
		return null;
	}
}
