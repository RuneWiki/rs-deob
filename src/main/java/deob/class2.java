package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("ay")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("ay.ab")
    public final class549 field4;

    @ObfuscatedName("ay.ay")
    public final class4 field2;

    public class2(class8 arg0, class549 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field4 = arg1;
        this.field2 = arg2;
    }

    public Object call() {
        return this.field2.method2(this.field4);
    }
}
