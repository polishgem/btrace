import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;


@BTrace
public class ClassStack{


	@OnMethod(clazz = "com.zt3000.order.service.impl.OrderServiceImpl", method = "queryOrderByStatus")
	public static void onSystemGC(@ProbeClassName String probeClassName,@ProbeMethodName String probeMethod) {
    		println("call : + " + probeClassName + "." + probeMethod);
   		jstackAll();
	}
}
