package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bu")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.i(Lbm;Ljava/lang/Object;B)V")
    public static void method53(class75 arg0, Object arg1) {
        if (arg0.field1353 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1353.peekEvent() != null; var2++) {
            class127.method1642(1L);
        }
        if (arg1 != null) {
            arg0.field1353.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
