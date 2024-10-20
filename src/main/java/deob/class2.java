package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("f")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("f.a")
    public final class464 field7;

    @ObfuscatedName("f.f")
    public final class4 field2;

    public class2(class8 arg0, class464 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field7 = arg1;
        this.field2 = arg2;
    }

    public Object call() {
        return this.field2.method2(this.field7);
    }
}
