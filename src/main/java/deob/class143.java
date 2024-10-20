package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ek")
public class class143 {

    public class143() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.b(Led;Ljava/lang/Object;I)V")
    public static void method2681(class137 arg0, Object arg1) {
        if (arg0.field2076 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2076.peekEvent() != null; var2++) {
            class128.method2289(1L);
        }
        if (arg1 != null) {
            arg0.field2076.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
