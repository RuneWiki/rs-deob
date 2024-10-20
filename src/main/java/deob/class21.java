package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("g")
public class class21 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("g.c")
    public final class11 field115;

    public class21(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field115 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field115.method89()) {
                class272.method406(10L);
            }
        } catch (IOException var2) {
            return new class22("Error servicing REST query: " + var2.getMessage());
        }
        return this.field115.method91();
    }
}
