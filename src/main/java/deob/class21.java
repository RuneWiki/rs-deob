package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("c")
public class class21 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("c.h")
    public final class11 field118;

    public class21(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field118 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field118.method79()) {
                class284.method148(10L);
            }
        } catch (IOException var2) {
            return new class22("Error servicing REST query: " + var2.getMessage());
        }
        return this.field118.method80();
    }
}
