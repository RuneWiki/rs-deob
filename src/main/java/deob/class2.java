package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("l")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("l.c")
    public final class421 field4;

    @ObfuscatedName("l.l")
    public final class4 field12;

    public class2(class8 arg0, class421 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field4 = arg1;
        this.field12 = arg2;
    }

    public Object call() {
        return this.field12.method1(this.field4);
    }
}
