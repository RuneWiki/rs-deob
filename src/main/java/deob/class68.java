package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bv")
public class class68 {

    public class68() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bv.v(Lbr;Ljava/lang/Object;I)V")
    public static void method1407(class73 arg0, Object arg1) {
        if (arg0.field1314 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1314.peekEvent() != null; var2++) {
            class125.method2683(1L);
        }
        if (arg1 != null) {
            arg0.field1314.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
