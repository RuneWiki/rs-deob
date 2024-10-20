package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("l")
public class class9 implements Callable {

    // $FF: synthetic field
    public final class10 this$0;

    @ObfuscatedName("l.h")
    public final class311 field36;

    @ObfuscatedName("l.v")
    public final class13 field33;

    public class9(class10 arg0, class311 arg1, class13 arg2) {
        this.this$0 = arg0;
        this.field36 = arg1;
        this.field33 = arg2;
    }

    public Object call() {
        return this.field33.method44(this.field36);
    }
}
