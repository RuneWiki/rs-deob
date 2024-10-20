package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("h")
public class class21 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("h.l")
    public final class11 field105;

    public class21(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field105 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field105.method87()) {
                class399.method2395(10L);
            }
        } catch (IOException var2) {
            return new class22("Error servicing REST query: " + var2.getMessage());
        }
        return this.field105.method91();
    }
}
