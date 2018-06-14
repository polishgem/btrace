import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

@BTrace

public class ClassMethodTime{

    //监控某一个方法的执行时间

    @OnMethod(clazz = "/com\\.zt3000\\..*/",method =
    "/.*/",location=@Location(Kind.RETURN))

    public static void printMethodRunTime(@ProbeClassName String
    probeClassName, @ProbeMethodName String method, @Duration long duration){
    	if (duration > 10000000) {
        	println(probeClassName + "."+method+",duration:" + duration / 1000000 + " ms");

    	}
    }

}
