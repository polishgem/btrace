import com.sun.btrace.AnyType;

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

@BTrace

public class Param{

    //监控某一个方法的执行时间

    @OnMethod(clazz = "com.zt3000.order.service.impl.OrderServiceImpl",method = "queryOrderByStatus",location=@Location(Kind.RETURN))

    public static void printMethodRunTime(@Self Object self,Object param,@Return AnyType result ){

        println( "param: " + param );

        println("result : " + result );

    }

}
