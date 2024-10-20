package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("ag")
public class class30 implements Callable {

    // $FF: synthetic field
    public final class36 this$0;

    @ObfuscatedName("ag.f")
    public final class382 field217;

    @ObfuscatedName("ag.o")
    public final class32 field216;

    public class30(class36 arg0, class382 arg1, class32 arg2) {
        this.this$0 = arg0;
        this.field217 = arg1;
        this.field216 = arg2;
    }

    public Object call() {
        return this.field216.method209(this.field217);
    }
}
