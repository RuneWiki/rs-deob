package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("ah")
public class class20 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("ah.au")
    public final class11 field101;

    public class20(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field101 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field101.method75()) {
                class303.method2265(10L);
            }
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field101.method74();
    }
}
