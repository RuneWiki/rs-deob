package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ey")
public class class143 {

    public class143() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fq.f(Lei;Ljava/lang/Object;B)V")
    public static void method3032(class137 arg0, Object arg1) {
        if (arg0.field2097 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2097.peekEvent() != null; var2++) {
            class128.method2102(1L);
        }
        if (arg1 != null) {
            arg0.field2097.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
