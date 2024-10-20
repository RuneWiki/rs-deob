package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ee")
public class class134 {

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.p(Ldd;Ljava/lang/Object;I)V")
    public static void method1909(class128 arg0, Object arg1) {
        if (arg0.field1993 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1993.peekEvent() != null; var2++) {
            class119.method1371(1L);
        }
        if (arg1 != null) {
            arg0.field1993.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
