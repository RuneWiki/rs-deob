package deob;

@ObfuscatedName("as")
public final class class30 extends class33 {

    @ObfuscatedName("as.g")
    public class35 field686;

    @ObfuscatedName("as.s(I)Lcg;")
    public final class98 method17() {
        if (this.field686 == null) {
            return null;
        }
        class38 var1 = this.field748 != -1 && this.field750 == 0 ? class38.method1935(this.field748) : null;
        class38 var2 = this.field745 == -1 || this.field756 == this.field745 && var1 != null ? null : class38.method1935(this.field745);
        class98 var3 = this.field686.method617(var1, this.field730, var2, this.field746);
        if (var3 == null) {
            return null;
        }
        var3.method1950();
        this.field751 = var3.field1353;
        if (this.field753 != -1 && this.field754 != -1) {
            class98 var4 = class39.method612(this.field753).method745(this.field754);
            if (var4 != null) {
                var4.method1989(0, -this.field725, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field686.field794 == 1) {
            var3.field1734 = true;
        }
        return var3;
    }

    @ObfuscatedName("as.v(I)Z")
    public final boolean method28() {
        return this.field686 != null;
    }
}
