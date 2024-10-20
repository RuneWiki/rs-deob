package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("r")
public class class21 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("r.i")
    public final class11 field95;

    public class21(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field95 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field95.method81()) {
                class399.method2872(10L);
            }
        } catch (IOException var2) {
            return new class22("Error servicing REST query: " + var2.getMessage());
        }
        return this.field95.method92();
    }
}
