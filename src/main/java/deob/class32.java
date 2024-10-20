package deob;

@ObfuscatedName("ad")
public final class class32 extends class35 {

    @ObfuscatedName("ad.n")
    public class37 field725;

    @ObfuscatedName("ad.w(B)Lcw;")
    public final class100 method12() {
        if (this.field725 == null) {
            return null;
        }
        class40 var1 = this.field787 != -1 && this.field792 == 0 ? class40.method122(this.field787) : null;
        class40 var2 = this.field799 == -1 || this.field799 == this.field761 && var1 != null ? null : class40.method122(this.field799);
        class100 var3 = this.field725.method664(var1, this.field788, var2, this.field784);
        if (var3 == null) {
            return null;
        }
        var3.method2001();
        this.field772 = var3.field1383;
        if (this.field767 != -1 && this.field759 != -1) {
            class100 var4 = class41.method667(this.field767).method780(this.field759);
            if (var4 != null) {
                var4.method2011(0, -this.field756, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (this.field725.field830 == 1) {
            var3.field1730 = true;
        }
        return var3;
    }

    @ObfuscatedName("ad.i(I)Z")
    public final boolean method13() {
        return this.field725 != null;
    }
}
