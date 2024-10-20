package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ee")
public class class142 {

    public class142() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cd.o(Led;Ljava/lang/Object;I)V")
    public static void method2037(class136 arg0, Object arg1) {
        if (arg0.field2082 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2082.peekEvent() != null; var2++) {
            class127.method2614(1L);
        }
        if (arg1 != null) {
            arg0.field2082.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
