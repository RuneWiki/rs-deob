package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("ah")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("ah.az")
    public final class535 field5;

    @ObfuscatedName("ah.ah")
    public final class4 field2;

    public class2(class8 arg0, class535 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field5 = arg1;
        this.field2 = arg2;
    }

    public Object call() {
        return this.field2.method1(this.field5);
    }
}
