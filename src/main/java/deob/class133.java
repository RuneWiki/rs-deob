package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ek")
public class class133 {

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.v(Ldx;Ljava/lang/Object;I)V")
    public static void method1604(class127 arg0, Object arg1) {
        if (arg0.field1955 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1955.peekEvent() != null; var2++) {
            class118.method2729(1L);
        }
        if (arg1 != null) {
            arg0.field1955.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
