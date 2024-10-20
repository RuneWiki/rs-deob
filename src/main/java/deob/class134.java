package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ej")
public class class134 {

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.e(Ldz;Ljava/lang/Object;I)V")
    public static void method2006(class128 arg0, Object arg1) {
        if (arg0.field1943 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1943.peekEvent() != null; var2++) {
            class119.method837(1L);
        }
        if (arg1 != null) {
            arg0.field1943.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
