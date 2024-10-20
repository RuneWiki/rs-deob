package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("p")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("p.c")
    public final class445 field4;

    @ObfuscatedName("p.p")
    public final class4 field2;

    public class2(class8 arg0, class445 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field4 = arg1;
        this.field2 = arg2;
    }

    public Object call() {
        return this.field2.method1(this.field4);
    }
}
