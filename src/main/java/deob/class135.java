package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fg")
public class class135 implements Callable {

    // $FF: synthetic field
    public final class143 this$0;

    @ObfuscatedName("fg.aq")
    public final class136 field1572;

    @ObfuscatedName("fg.ad")
    public final class137 field1575;

    @ObfuscatedName("fg.ag")
    public final class138 field1571;

    @ObfuscatedName("fg.ak")
    public final int field1570;

    public class135(class143 arg0, class136 arg1, class137 arg2, class138 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1572 = arg1;
        this.field1575 = arg2;
        this.field1571 = arg3;
        this.field1570 = arg4;
    }

    public Object call() {
        this.field1572.method2982();
        class136[][] var1;
        if (class137.field1602 == this.field1575) {
            var1 = this.this$0.field1651;
        } else {
            var1 = this.this$0.field1655;
        }
        var1[this.field1570][this.field1571.method3019()] = this.field1572;
        return null;
    }
}
