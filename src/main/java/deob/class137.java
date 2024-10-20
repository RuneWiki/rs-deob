package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fh")
public class class137 implements Callable {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("fh.ap")
    public final class138 field1588;

    @ObfuscatedName("fh.aw")
    public final class139 field1592;

    @ObfuscatedName("fh.ak")
    public final class140 field1590;

    @ObfuscatedName("fh.aj")
    public final int field1591;

    public class137(class146 arg0, class138 arg1, class139 arg2, class140 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1588 = arg1;
        this.field1592 = arg2;
        this.field1590 = arg3;
        this.field1591 = arg4;
    }

    public Object call() {
        this.field1588.method3303();
        class138[][] var1;
        if (class139.field1617 == this.field1592) {
            var1 = this.this$0.field1662;
        } else {
            var1 = this.this$0.field1661;
        }
        var1[this.field1591][this.field1590.method3341()] = this.field1588;
        return null;
    }
}
