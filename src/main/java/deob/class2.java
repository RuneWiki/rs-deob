package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("q")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("q.l")
    public final class401 field2;

    @ObfuscatedName("q.q")
    public final class4 field5;

    public class2(class8 arg0, class401 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field2 = arg1;
        this.field5 = arg2;
    }

    public Object call() {
        return this.field5.method1(this.field2);
    }
}
