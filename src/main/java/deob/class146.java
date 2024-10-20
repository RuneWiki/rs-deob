package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("em")
public class class146 {

    public class146() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.k(Leh;Ljava/lang/Object;I)V")
    public static void method205(class140 arg0, Object arg1) {
        if (arg0.field2144 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2144.peekEvent() != null; var2++) {
            class131.method2702(1L);
        }
        if (arg1 != null) {
            arg0.field2144.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
