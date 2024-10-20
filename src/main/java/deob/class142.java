package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ey")
public class class142 {

    public class142() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.j(Lep;Ljava/lang/Object;S)V")
    public static void method683(class136 arg0, Object arg1) {
        if (arg0.field2079 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2079.peekEvent() != null; var2++) {
            class127.method692(1L);
        }
        if (arg1 != null) {
            arg0.field2079.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
