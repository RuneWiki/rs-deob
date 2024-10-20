package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ed")
public class class134 {

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.n(Ldy;Ljava/lang/Object;I)V")
    public static void method681(class128 arg0, Object arg1) {
        if (arg0.field2005 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2005.peekEvent() != null; var2++) {
            class119.method2154(1L);
        }
        if (arg1 != null) {
            arg0.field2005.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
