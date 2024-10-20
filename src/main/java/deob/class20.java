package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("av")
public class class20 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("av.az")
    public final class11 field84;

    public class20(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field84 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field84.method85()) {
                class319.method7909(10L);
            }
        } catch (IOException var2) {
            return new class21("Error servicing REST query: " + var2.getMessage());
        }
        return this.field84.method86();
    }
}
