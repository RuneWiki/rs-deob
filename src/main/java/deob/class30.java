package deob;

@ObfuscatedName("aa")
public final class class30 extends class33 {

    @ObfuscatedName("aa.t")
    public class35 field686;

    @ObfuscatedName("aa.o(I)Lcx;")
    public final class98 method21() {
        if (this.field686 == null) {
            return null;
        }
        class38 var1 = this.field740 != -1 && this.field749 == 0 ? class38.method1579(this.field740) : null;
        class38 var2 = this.field762 == -1 || this.field762 == this.field754 && var1 != null ? null : class38.method1579(this.field762);
        class98 var3 = this.field686.method609(var1, this.field747, var2, this.field737);
        if (var3 == null) {
            return null;
        }
        var3.method1974();
        this.field764 = var3.field1351;
        if (this.field751 != -1 && this.field773 != -1) {
            class98 var4 = class39.method2654(this.field751).method744(this.field773);
            if (var4 != null) {
                var4.method2036(0, -this.field755, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field686.field791 == 1) {
            var3.field1688 = true;
        }
        return var3;
    }

    @ObfuscatedName("aa.i(I)Z")
    public final boolean method16() {
        return this.field686 != null;
    }
}
