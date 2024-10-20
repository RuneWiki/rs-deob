package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("aw")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("aw.ap")
    public final class558 field5;

    @ObfuscatedName("aw.aw")
    public final class4 field2;

    public class2(class8 arg0, class558 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field5 = arg1;
        this.field2 = arg2;
    }

    public Object call() {
        return this.field2.method2(this.field5);
    }
}
