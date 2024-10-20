package deob;

@ObfuscatedName("v")
public final class class25 extends class27 {

    @ObfuscatedName("v.t")
    public class31 field410;

    @ObfuscatedName("v.l(I)Ldk;")
    public final class112 method18() {
        if (this.field410 == null) {
            return null;
        }
        class34 var1 = this.field459 != -1 && this.field462 == 0 ? Statics.method31(this.field459) : null;
        class34 var2 = this.field434 == -1 || this.field443 == this.field434 && var1 != null ? null : Statics.method31(this.field434);
        class112 var3 = this.field410.method652(var1, this.field452, var2, this.field464);
        if (var3 == null) {
            return null;
        }
        var3.method2238();
        this.field477 = var3.field1588;
        if (this.field435 != -1 && this.field486 != -1) {
            class112 var4 = class35.method711(this.field435).method773(this.field486);
            if (var4 != null) {
                var4.method2243(0, -this.field468, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field410.field798 == 1) {
            var3.field1878 = true;
        }
        return var3;
    }

    @ObfuscatedName("v.c(B)Z")
    public final boolean method21() {
        return this.field410 != null;
    }
}
