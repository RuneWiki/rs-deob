package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("al")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("al.ac")
    public final class530 field3;

    @ObfuscatedName("al.al")
    public final class4 field2;

    public class2(class8 arg0, class530 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field3 = arg1;
        this.field2 = arg2;
    }

    public Object call() {
        return this.field2.method3(this.field3);
    }
}
