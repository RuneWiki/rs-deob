package deob;

@ObfuscatedName("b")
public final class class24 extends class26 {

    @ObfuscatedName("b.v")
    public class30 field379;

    @ObfuscatedName("b.f(I)Ldf;")
    public final class111 method13() {
        if (this.field379 == null) {
            return null;
        }
        class33 var1 = this.field425 != -1 && this.field451 == 0 ? class33.method1401(this.field425) : null;
        class33 var2 = this.field422 == -1 || this.field437 == this.field422 && var1 != null ? null : class33.method1401(this.field422);
        class111 var3 = this.field379.method601(var1, this.field426, var2, this.field423);
        if (var3 == null) {
            return null;
        }
        var3.method2253();
        this.field443 = var3.field1531;
        if (this.field401 != -1 && this.field431 != -1) {
            class111 var4 = class34.method239(this.field401).method743(this.field431);
            if (var4 != null) {
                var4.method2263(0, -this.field434, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (this.field379.field763 == 1) {
            var3.field1868 = true;
        }
        return var3;
    }

    @ObfuscatedName("b.n(I)Z")
    public final boolean method24() {
        return this.field379 != null;
    }
}
