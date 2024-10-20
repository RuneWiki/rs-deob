package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("w")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("w.i")
    public final class401 field4;

    @ObfuscatedName("w.w")
    public final class4 field2;

    public class2(class8 arg0, class401 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field4 = arg1;
        this.field2 = arg2;
    }

    public Object call() {
        return this.field2.method1(this.field4);
    }
}
