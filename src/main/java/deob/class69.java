package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bg")
public class class69 {

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.i(Lby;Ljava/lang/Object;I)V")
    public static void method589(class74 arg0, Object arg1) {
        if (arg0.field1332 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1332.peekEvent() != null; var2++) {
            class126.method1440(1L);
        }
        if (arg1 != null) {
            arg0.field1332.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
