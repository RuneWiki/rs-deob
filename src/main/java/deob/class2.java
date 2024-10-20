package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("an")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("an.at")
    public final class501 field4;

    @ObfuscatedName("an.an")
    public final class4 field6;

    public class2(class8 arg0, class501 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field4 = arg1;
        this.field6 = arg2;
    }

    public Object call() {
        return this.field6.method3(this.field4);
    }
}
