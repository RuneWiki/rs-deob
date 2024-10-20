package deob;

@ObfuscatedName("aa")
public final class class30 extends class33 {

    @ObfuscatedName("aa.y")
    public class35 field678;

    @ObfuscatedName("aa.u(I)Lcz;")
    public final class98 method14() {
        if (this.field678 == null) {
            return null;
        }
        class38 var1 = this.field742 != -1 && this.field745 == 0 ? class38.method1866(this.field742) : null;
        class38 var2 = this.field739 == -1 || this.field751 == this.field739 && var1 != null ? null : class38.method1866(this.field739);
        class98 var3 = this.field678.method595(var1, this.field743, var2, this.field737);
        if (var3 == null) {
            return null;
        }
        var3.method1966();
        this.field744 = var3.field1344;
        if (this.field747 != -1 && this.field748 != -1) {
            class98 var4 = class39.method2683(this.field747).method739(this.field748);
            if (var4 != null) {
                var4.method2035(0, -this.field760, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field678.field801 == 1) {
            var3.field1728 = true;
        }
        return var3;
    }

    @ObfuscatedName("aa.k(B)Z")
    public final boolean method20() {
        return this.field678 != null;
    }
}
