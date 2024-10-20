package deob;

@ObfuscatedName("n")
public final class class25 extends class27 {

    @ObfuscatedName("n.i")
    public class31 field402;

    @ObfuscatedName("n.p(I)Ldc;")
    public final class112 method26() {
        if (this.field402 == null) {
            return null;
        }
        class34 var1 = this.field452 != -1 && this.field451 == 0 ? class34.method763(this.field452) : null;
        class34 var2 = this.field445 == -1 || this.field445 == this.field424 && var1 != null ? null : class34.method763(this.field445);
        class112 var3 = this.field402.method600(var1, this.field449, var2, this.field433);
        if (var3 == null) {
            return null;
        }
        var3.method2174();
        this.field473 = var3.field1556;
        if (this.field453 != -1 && this.field454 != -1) {
            class112 var4 = class35.method37(this.field453).method728(this.field454);
            if (var4 != null) {
                var4.method2184(0, -this.field457, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field402.field790 == 1) {
            var3.field1892 = true;
        }
        return var3;
    }

    @ObfuscatedName("n.a(I)Z")
    public final boolean method18() {
        return this.field402 != null;
    }
}
