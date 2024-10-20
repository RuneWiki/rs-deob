package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("av")
public class class20 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("av.ab")
    public final class11 field77;

    public class20(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field77 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field77.method95()) {
                class330.method3326(10L);
            }
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field77.method80();
    }
}
