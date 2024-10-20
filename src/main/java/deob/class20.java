package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("aa")
public class class20 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("aa.aq")
    public final class11 field88;

    public class20(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field88 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field88.method80()) {
                class328.method3390(10L);
            }
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field88.method81();
    }
}
