package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("at")
public class class30 implements Callable {

    // $FF: synthetic field
    public final class36 this$0;

    @ObfuscatedName("at.f")
    public final class384 field225;

    @ObfuscatedName("at.e")
    public final class32 field221;

    public class30(class36 arg0, class384 arg1, class32 arg2) {
        this.this$0 = arg0;
        this.field225 = arg1;
        this.field221 = arg2;
    }

    public Object call() {
        return this.field221.method209(this.field225);
    }
}
