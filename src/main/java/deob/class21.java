package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("b")
public class class21 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("b.n")
    public final class11 field99;

    public class21(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field99 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field99.method92()) {
                class398.method4655(10L);
            }
        } catch (IOException var2) {
            return new class22("Error servicing REST query: " + var2.getMessage());
        }
        return this.field99.method106();
    }
}
