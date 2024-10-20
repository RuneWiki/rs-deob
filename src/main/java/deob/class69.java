package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bi")
public class class69 {

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.a(Lbn;Ljava/lang/Object;B)V")
    public static void method696(class74 arg0, Object arg1) {
        if (arg0.field1315 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1315.peekEvent() != null; var2++) {
            class127.method1598(1L);
        }
        if (arg1 != null) {
            arg0.field1315.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
