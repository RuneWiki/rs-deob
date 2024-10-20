package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("g")
public class class9 implements Callable {

    // $FF: synthetic field
    public final class10 this$0;

    @ObfuscatedName("g.z")
    public final class310 field46;

    @ObfuscatedName("g.k")
    public final class13 field43;

    public class9(class10 arg0, class310 arg1, class13 arg2) {
        this.this$0 = arg0;
        this.field46 = arg1;
        this.field43 = arg2;
    }

    public Object call() {
        return this.field43.method49(this.field46);
    }
}
