package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("ac")
public class class20 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("ac.ap")
    public final class11 field76;

    public class20(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field76 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field76.method85()) {
                class331.method1920(10L);
            }
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field76.method86();
    }
}
