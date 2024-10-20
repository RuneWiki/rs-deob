package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("er")
public class class142 {

    public class142() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.c(Lex;Ljava/lang/Object;I)V")
    public static void method2569(class136 arg0, Object arg1) {
        if (arg0.field2065 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2065.peekEvent() != null; var2++) {
            class127.method2079(1L);
        }
        if (arg1 != null) {
            arg0.field2065.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
