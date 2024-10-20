package deob;

@ObfuscatedName("u")
public final class class24 extends class26 {

    @ObfuscatedName("u.g")
    public class30 field378;

    @ObfuscatedName("u.e(I)Ldk;")
    public final class111 method19() {
        if (this.field378 == null) {
            return null;
        }
        class33 var1 = this.field432 != -1 && this.field418 == 0 ? class33.method224(this.field432) : null;
        class33 var2 = this.field409 == -1 || this.field429 == this.field409 && var1 != null ? null : class33.method224(this.field409);
        class111 var3 = this.field378.method624(var1, this.field435, var2, this.field430);
        if (var3 == null) {
            return null;
        }
        var3.method2267();
        this.field427 = var3.field1534;
        if (this.field437 != -1 && this.field459 != -1) {
            class111 var4 = class34.method895(this.field437).method749(this.field459);
            if (var4 != null) {
                var4.method2277(0, -this.field444, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (this.field378.field765 == 1) {
            var3.field1852 = true;
        }
        return var3;
    }

    @ObfuscatedName("u.n(I)Z")
    public final boolean method18() {
        return this.field378 != null;
    }
}
