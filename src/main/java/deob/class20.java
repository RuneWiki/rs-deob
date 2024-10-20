package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("at")
public class class20 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("at.aq")
    public final class11 field92;

    public class20(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field92 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field92.method87()) {
                class319.method3040(10L);
            }
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field92.method84();
    }
}
