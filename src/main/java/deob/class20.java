package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("aw")
public class class20 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("aw.ak")
    public final class11 field99;

    public class20(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field99 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field99.method94()) {
                class327.method8101(10L);
            }
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field99.method81();
    }
}
