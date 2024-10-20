package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ec")
public class class143 {

    public class143() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.j(Lei;Ljava/lang/Object;B)V")
    public static void method635(class137 arg0, Object arg1) {
        if (arg0.field2078 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2078.peekEvent() != null; var2++) {
            class128.method167(1L);
        }
        if (arg1 != null) {
            arg0.field2078.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
