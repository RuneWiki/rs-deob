package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ei")
public class class134 {

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.y(Ldf;Ljava/lang/Object;B)V")
    public static void method1387(class128 arg0, Object arg1) {
        if (arg0.field2009 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2009.peekEvent() != null; var2++) {
            class119.method488(1L);
        }
        if (arg1 != null) {
            arg0.field2009.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
