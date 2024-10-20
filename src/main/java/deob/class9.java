package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("t")
public class class9 implements Callable {

    // $FF: synthetic field
    public final class10 this$0;

    @ObfuscatedName("t.x")
    public final class310 field43;

    @ObfuscatedName("t.m")
    public final class13 field44;

    public class9(class10 arg0, class310 arg1, class13 arg2) {
        this.this$0 = arg0;
        this.field43 = arg1;
        this.field44 = arg2;
    }

    public Object call() {
        return this.field44.method53(this.field43);
    }
}
