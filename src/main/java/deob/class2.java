package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("ad")
public class class2 implements Callable {

    // $FF: synthetic field
    public final class8 this$0;

    @ObfuscatedName("ad.aq")
    public final class547 field1;

    @ObfuscatedName("ad.ad")
    public final class4 field3;

    public class2(class8 arg0, class547 arg1, class4 arg2) {
        this.this$0 = arg0;
        this.field1 = arg1;
        this.field3 = arg2;
    }

    public Object call() {
        return this.field3.method2(this.field1);
    }
}
