package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("al")
public class class30 implements Callable {

    // $FF: synthetic field
    public final class36 this$0;

    @ObfuscatedName("al.v")
    public final class383 field239;

    @ObfuscatedName("al.n")
    public final class32 field236;

    public class30(class36 arg0, class383 arg1, class32 arg2) {
        this.this$0 = arg0;
        this.field239 = arg1;
        this.field236 = arg2;
    }

    public Object call() {
        return this.field236.method192(this.field239);
    }
}
