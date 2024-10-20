package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("au")
public class class20 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("au.at")
    public final class11 field97;

    public class20(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field97 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field97.method94()) {
                class302.method3997(10L);
            }
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field97.method88();
    }
}
