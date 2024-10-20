package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ej")
public class class133 {

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.a(Ldb;Ljava/lang/Object;I)V")
    public static void method2063(class127 arg0, Object arg1) {
        if (arg0.field1966 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1966.peekEvent() != null; var2++) {
            class118.method2072(1L);
        }
        if (arg1 != null) {
            arg0.field1966.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
