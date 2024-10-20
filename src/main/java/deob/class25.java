package deob;

@ObfuscatedName("d")
public final class class25 extends class27 {

    @ObfuscatedName("d.a")
    public class31 field374;

    @ObfuscatedName("d.r(I)Ldw;")
    public final class112 method18() {
        if (this.field374 == null) {
            return null;
        }
        class34 var1 = this.field424 != -1 && this.field427 == 0 ? class34.method30(this.field424) : null;
        class34 var2 = this.field421 == -1 || this.field453 == this.field421 && var1 != null ? null : class34.method30(this.field421);
        class112 var3 = this.field374.method581(var1, this.field425, var2, this.field436);
        if (var3 == null) {
            return null;
        }
        var3.method2179();
        this.field452 = var3.field1518;
        if (this.field398 != -1 && this.field430 != -1) {
            class112 var4 = class35.method651(this.field398).method686(this.field430);
            if (var4 != null) {
                var4.method2189(0, -this.field433, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field374.field792 == 1) {
            var3.field1853 = true;
        }
        return var3;
    }

    @ObfuscatedName("d.u(B)Z")
    public final boolean method19() {
        return this.field374 != null;
    }
}
