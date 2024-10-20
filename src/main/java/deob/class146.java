package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ex")
public class class146 {

    public class146() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.x(Leu;Ljava/lang/Object;I)V")
    public static void method2706(class140 arg0, Object arg1) {
        if (arg0.field2138 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2138.peekEvent() != null; var2++) {
            class131.method2672(1L);
        }
        if (arg1 != null) {
            arg0.field2138.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
