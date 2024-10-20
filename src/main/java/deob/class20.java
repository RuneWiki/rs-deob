package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("ae")
public class class20 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("ae.ac")
    public final class11 field102;

    public class20(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field102 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field102.method79()) {
                class317.method2610(10L);
            }
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field102.method80();
    }
}
