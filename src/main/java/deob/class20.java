package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("ai")
public class class20 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("ai.at")
    public final class11 field95;

    public class20(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field95 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field95.method88()) {
                class314.method3920(10L);
            }
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field95.method85();
    }
}
