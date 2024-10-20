package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("en")
public class class143 {

    public class143() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.a(Lek;Ljava/lang/Object;I)V")
    public static void method2709(class137 arg0, Object arg1) {
        if (arg0.field2099 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2099.peekEvent() != null; var2++) {
            class128.method56(1L);
        }
        if (arg1 != null) {
            arg0.field2099.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
