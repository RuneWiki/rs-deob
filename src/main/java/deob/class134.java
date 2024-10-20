package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fg")
public class class134 implements Callable {

    // $FF: synthetic field
    public final class143 this$0;

    @ObfuscatedName("fg.ab")
    public final class135 field1550;

    @ObfuscatedName("fg.ay")
    public final class136 field1551;

    @ObfuscatedName("fg.an")
    public final class137 field1552;

    @ObfuscatedName("fg.au")
    public final int field1553;

    public class134(class143 arg0, class135 arg1, class136 arg2, class137 arg3, int arg4) {
        this.this$0 = arg0;
        this.field1550 = arg1;
        this.field1551 = arg2;
        this.field1552 = arg3;
        this.field1553 = arg4;
    }

    public Object call() {
        this.field1550.method3049();
        class135[][] var1;
        if (class136.field1587 == this.field1551) {
            var1 = this.this$0.field1638;
        } else {
            var1 = this.this$0.field1631;
        }
        var1[this.field1553][this.field1552.method3099()] = this.field1550;
        return null;
    }
}
