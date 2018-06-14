import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

@BTrace
public class ClassOutClassMethodTime{

    //监控某一个方法的执行时间

    @OnMethod(clazz = "com.zt3000.order.service.impl.OrderServiceImpl",method = "queryOrderByStatus",
    location=@Location(value=Kind.CALL,clazz="/.*/",method="/.*/",where = Where.AFTER))
    public static void printMethodRunTime(@Self Object self,@TargetInstance Object instance,@TargetMethodOrField String methon,@Duration long duration){

        if( duration > 5000000 ){
            println(instance+"."+methon + ",cost:" + duration / 1000000 + " ms");

        }
    }
}
