package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bf")
public class class69 {

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.y(Lba;Ljava/lang/Object;I)V")
    public static void method1875(class74 arg0, Object arg1) {
        if (arg0.field1333 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1333.peekEvent() != null; var2++) {
            class126.method1326(1L);
        }
        if (arg1 != null) {
            arg0.field1333.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
