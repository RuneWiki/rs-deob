package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ed")
public class class142 {

    public class142() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.m(Leh;Ljava/lang/Object;B)V")
    public static void method600(class136 arg0, Object arg1) {
        if (arg0.field2068 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2068.peekEvent() != null; var2++) {
            class127.method3199(1L);
        }
        if (arg1 != null) {
            arg0.field2068.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
