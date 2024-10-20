package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("b")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("b.c")
    public final class419 field3;

    @ObfuscatedName("b.b")
    public final class4 field2;

    public class2(class8 arg0, class419 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field3 = arg1;
        this.field2 = arg2;
    }

    public Object call() {
        return this.field2.method2(this.field3);
    }
}
