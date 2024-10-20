package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ek")
public class class146 {

    public class146() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.a(Len;Ljava/lang/Object;B)V")
    public static void method2717(class140 arg0, Object arg1) {
        if (arg0.field2167 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2167.peekEvent() != null; var2++) {
            class131.method674(1L);
        }
        if (arg1 != null) {
            arg0.field2167.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
