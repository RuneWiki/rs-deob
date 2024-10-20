package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("u")
public class class9 implements Callable {

    // $FF: synthetic field
    public final class10 this$0;

    @ObfuscatedName("u.f")
    public final class311 field36;

    @ObfuscatedName("u.b")
    public final class13 field32;

    public class9(class10 arg0, class311 arg1, class13 arg2) {
        this.this$0 = arg0;
        this.field36 = arg1;
        this.field32 = arg2;
    }

    public Object call() {
        return this.field32.method59(this.field36);
    }
}
