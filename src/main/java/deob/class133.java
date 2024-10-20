package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fy")
public class class133 implements Callable {

    // $FF: synthetic field
    public final class142 this$0;

    @ObfuscatedName("fy.ak")
    public final class134 field1578;

    @ObfuscatedName("fy.al")
    public final class135 field1575;

    @ObfuscatedName("fy.aj")
    public final class136 field1576;

    @ObfuscatedName("fy.az")
    public final int field1577;

    public class133(class142 arg0, class134 arg1, class135 arg2, class136 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1578 = arg1;
        this.field1575 = arg2;
        this.field1576 = arg3;
        this.field1577 = arg4;
    }

    public Object call() {
        this.field1578.method2950();
        class134[][] var1;
        if (class135.field1605 == this.field1575) {
            var1 = this.this$0.field1648;
        } else {
            var1 = this.this$0.field1654;
        }
        var1[this.field1577][this.field1576.method2973()] = this.field1578;
        return null;
    }
}
