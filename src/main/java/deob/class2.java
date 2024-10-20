package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("aw")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("aw.aq")
    public final class534 field2;

    @ObfuscatedName("aw.aw")
    public final class4 field3;

    public class2(class8 arg0, class534 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field2 = arg1;
        this.field3 = arg2;
    }

    public Object call() {
        return this.field3.method1(this.field2);
    }
}
