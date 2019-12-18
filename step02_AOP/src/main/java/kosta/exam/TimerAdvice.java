package kosta.exam;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

/**
 * 공통의 기능을 담당하게 될 Aspect 
 * around 방식 
 * - 사전 : 현재 시간 구하기 
 * - 사후 : 현재 시간 구하기. 사후 시간 - 사전 시간
 * 
 * JoinPoint을 상속한 ProceedingJoinPoint
 * - JoinPoint interface는 타겟 대상에 대한 기본정보를 제공하는 메소드가 있다.
 * @params : ProceedignJoinPoint - 실제 타겟 대상을 호출할 수 있는 메소드 제공
 * 
 */
public class TimerAdvice {
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		// 사전 처리
		// 타겟 대상 메소드 이름을 구하기
		String methodName = joinPoint.getSignature().getName();
		System.out.println(String.format("[LOG] before call %s", methodName));
		
		StopWatch sw = new StopWatch();
		sw.start();
		
		// 실제 타겟 대상 joinPoint 호출
		Object obj = joinPoint.proceed();
		
		// 사후 처리
		sw.stop();
		System.out.println(String.format("[LOG] %s resutlt = %s", methodName, obj));
		System.out.println(String.format("[LOG] %s runTime : %f", methodName, sw.getTotalTimeSeconds()));
		System.out.println(String.format("[LOG] %s end", methodName));
		
		return obj;
	}
}
