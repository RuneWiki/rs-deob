package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bz")
public class class69 {

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.q(Lba;Ljava/lang/Object;B)V")
    public static void method150(class74 arg0, Object arg1) {
        if (arg0.field1344 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1344.peekEvent() != null; var2++) {
            class126.method210(1L);
        }
        if (arg1 != null) {
            arg0.field1344.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
