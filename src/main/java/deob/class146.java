package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("eu")
public class class146 {

    public class146() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.s(Led;Ljava/lang/Object;I)V")
    public static void method220(class140 arg0, Object arg1) {
        if (arg0.field2142 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && arg0.field2142.peekEvent() != null; var2++) {
            class131.method182(1L);
        }
        if (arg1 != null) {
            arg0.field2142.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
