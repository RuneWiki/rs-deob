package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("a")
public class class9 implements Callable {

    // $FF: synthetic field
    public final class10 this$0;

    @ObfuscatedName("a.m")
    public final class310 field34;

    @ObfuscatedName("a.o")
    public final class13 field32;

    public class9(class10 arg0, class310 arg1, class13 arg2) {
        this.this$0 = arg0;
        this.field34 = arg1;
        this.field32 = arg2;
    }

    public Object call() {
        return this.field32.method44(this.field34);
    }
}
