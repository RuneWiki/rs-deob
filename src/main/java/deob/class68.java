package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bp")
public class class68 {

    public class68() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.j(Lbo;Ljava/lang/Object;I)V")
    public static void method1486(class73 arg0, Object arg1) {
        if (arg0.field1321 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1321.peekEvent() != null; var2++) {
            class125.method112(1L);
        }
        if (arg1 != null) {
            arg0.field1321.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
