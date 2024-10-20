package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fp")
public class class137 implements Callable {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("fp.ac")
    public final class138 field1601;

    @ObfuscatedName("fp.ae")
    public final class139 field1597;

    @ObfuscatedName("fp.ag")
    public final class140 field1598;

    @ObfuscatedName("fp.am")
    public final int field1599;

    public class137(class146 arg0, class138 arg1, class139 arg2, class140 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1601 = arg1;
        this.field1597 = arg2;
        this.field1598 = arg3;
        this.field1599 = arg4;
    }

    public Object call() {
        this.field1601.method3156();
        class138[][] var1;
        if (class139.field1632 == this.field1597) {
            var1 = this.this$0.field1675;
        } else {
            var1 = this.this$0.field1673;
        }
        var1[this.field1599][this.field1598.method3186()] = this.field1601;
        return null;
    }
}
