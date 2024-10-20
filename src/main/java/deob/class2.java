package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("ah")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("ah.at")
    public final class527 field2;

    @ObfuscatedName("ah.ah")
    public final class4 field4;

    public class2(class8 arg0, class527 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field2 = arg1;
        this.field4 = arg2;
    }

    public Object call() {
        return this.field4.method5(this.field2);
    }
}
