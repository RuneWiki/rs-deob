package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ef")
public class class142 {

    public class142() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.k(Ler;Ljava/lang/Object;I)V")
    public static void method2214(class136 arg0, Object arg1) {
        if (arg0.field2056 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2056.peekEvent() != null; var2++) {
            class127.method890(1L);
        }
        if (arg1 != null) {
            arg0.field2056.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
