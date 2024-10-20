package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("q")
public class class9 implements Callable {

    // $FF: synthetic field
    public final class10 this$0;

    @ObfuscatedName("q.n")
    public final class311 field49;

    @ObfuscatedName("q.v")
    public final class13 field45;

    public class9(class10 arg0, class311 arg1, class13 arg2) {
        this.this$0 = arg0;
        this.field49 = arg1;
        this.field45 = arg2;
    }

    public Object call() {
        return this.field45.method44(this.field49);
    }
}
