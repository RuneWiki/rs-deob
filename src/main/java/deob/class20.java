package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("at")
public class class20 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("at.aj")
    public final class11 field103;

    public class20(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field103 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field103.method75()) {
                class291.method1994(10L);
            }
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field103.method83();
    }
}
