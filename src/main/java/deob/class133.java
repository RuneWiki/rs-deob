package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ey")
public class class133 {

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.b(Ldp;Ljava/lang/Object;I)V")
    public static void method28(class127 arg0, Object arg1) {
        if (arg0.field1971 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1971.peekEvent() != null; var2++) {
            class118.method2490(1L);
        }
        if (arg1 != null) {
            arg0.field1971.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
