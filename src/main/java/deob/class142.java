package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ew")
public class class142 {

    public class142() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.v(Led;Ljava/lang/Object;B)V")
    public static void method1232(class136 arg0, Object arg1) {
        if (arg0.field2099 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2099.peekEvent() != null; var2++) {
            class127.method2134(1L);
        }
        if (arg1 != null) {
            arg0.field2099.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
