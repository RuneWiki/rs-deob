package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bj")
public class class69 {

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.t(Lbg;Ljava/lang/Object;I)V")
    public static void method564(class74 arg0, Object arg1) {
        if (arg0.field1367 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1367.peekEvent() != null; var2++) {
            class126.method3086(1L);
        }
        if (arg1 != null) {
            arg0.field1367.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
