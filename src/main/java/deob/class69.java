package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bd")
public class class69 {

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.j(Lbn;Ljava/lang/Object;B)V")
    public static void method653(class74 arg0, Object arg1) {
        if (arg0.field1351 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1351.peekEvent() != null; var2++) {
            class126.method768(1L);
        }
        if (arg1 != null) {
            arg0.field1351.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
