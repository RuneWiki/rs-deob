package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("c")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("c.n")
    public final class400 field1;

    @ObfuscatedName("c.c")
    public final class4 field2;

    public class2(class8 arg0, class400 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field1 = arg1;
        this.field2 = arg2;
    }

    public Object call() {
        return this.field2.method1(this.field1);
    }
}
