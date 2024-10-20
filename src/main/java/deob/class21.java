package deob;

import java.io.IOException;
import java.util.concurrent.Callable;

@ObfuscatedName("f")
public class class21 implements Callable {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("f.o")
    public final class11 field107;

    public class21(class15 arg0, class11 arg1) {
        this.this$0 = arg0;
        this.field107 = arg1;
    }

    public Object call() throws Exception {
        try {
            while (this.field107.method72()) {
                class271.method4446(10L);
            }
        } catch (IOException var2) {
            return new class22("Error servicing REST query: " + var2.getMessage());
        }
        return this.field107.method75();
    }
}
