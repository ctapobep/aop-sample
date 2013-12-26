package temp;


import org.aopalliance.aop.Advice;
import org.aspectj.lang.ProceedingJoinPoint;

public class WorkDoneCounter implements Advice {
    private int invocationCounter;

    public void invoke(ProceedingJoinPoint call) throws Throwable {
        System.out.println("Method was invoked: " + ++invocationCounter + " times ");
        call.proceed();
    }
}
