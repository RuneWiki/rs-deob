package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("l")
public class class21 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("l.c")
    public final class11 field111;

    public class21(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field111 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field111.method97()) {
                class417.method5965(10L);
            }
        } catch (IOException var2) {
            return new class22("Error servicing REST query: " + var2.getMessage());
        }
        return this.field111.method98();
    }
}
