package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("t")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("t.s")
    public final class385 field2;

    @ObfuscatedName("t.t")
    public final class4 field1;

    public class2(class8 arg0, class385 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field2 = arg1;
        this.field1 = arg2;
    }

    public Object call() {
        return this.field1.method2(this.field2);
    }
}
