package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("x")
public class class20 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("x.f")
    public final class11 field111;

    public class20(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field111 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field111.method96()) {
                class288.method3270(10L);
            }
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field111.method92();
    }
}
