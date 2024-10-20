package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("ae")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("ae.ac")
    public final class551 field2;

    @ObfuscatedName("ae.ae")
    public final class4 field1;

    public class2(class8 arg0, class551 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field2 = arg1;
        this.field1 = arg2;
    }

    public Object call() {
        return this.field1.method2(this.field2);
    }
}
