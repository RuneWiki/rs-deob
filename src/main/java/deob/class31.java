package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("at")
public class class31 {

    public class31() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.q(Lan;Ljava/lang/Object;B)V")
    public static void method1177(class35 arg0, Object arg1) {
        if (arg0.field385 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field385.peekEvent() != null; var2++) {
            class68.method86(1L);
        }
        if (arg1 != null) {
            arg0.field385.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
