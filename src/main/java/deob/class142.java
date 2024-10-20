package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ez")
public class class142 {

    public class142() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.i(Lee;Ljava/lang/Object;I)V")
    public static void method603(class136 arg0, Object arg1) {
        if (arg0.field2095 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2095.peekEvent() != null; var2++) {
            class127.method731(1L);
        }
        if (arg1 != null) {
            arg0.field2095.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
