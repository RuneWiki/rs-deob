package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("v")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("v.c")
    public final class443 field2;

    @ObfuscatedName("v.v")
    public final class4 field4;

    public class2(class8 arg0, class443 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field2 = arg1;
        this.field4 = arg2;
    }

    public Object call() {
        return this.field4.method1(this.field2);
    }
}
