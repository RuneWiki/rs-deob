package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bh")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.e(Lbf;Ljava/lang/Object;I)V")
    public static void method793(class75 arg0, Object arg1) {
        if (arg0.field1355 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1355.peekEvent() != null; var2++) {
            class127.method2200(1L);
        }
        if (arg1 != null) {
            arg0.field1355.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
