package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ev")
public class class134 {

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.o(Ldy;Ljava/lang/Object;I)V")
    public static void method911(class128 arg0, Object arg1) {
        if (arg0.field1982 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field1982.peekEvent() != null; var2++) {
            Statics.method832(1L);
        }
        if (arg1 != null) {
            arg0.field1982.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
