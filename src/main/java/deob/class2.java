package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("q")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("q.o")
    public final class440 field2;

    @ObfuscatedName("q.q")
    public final class4 field4;

    public class2(class8 arg0, class440 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field2 = arg1;
        this.field4 = arg2;
    }

    public Object call() {
        return this.field4.method2(this.field2);
    }
}
