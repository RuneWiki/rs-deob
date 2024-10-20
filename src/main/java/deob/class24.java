package deob;

@ObfuscatedName("o")
public final class class24 extends class26 {

    @ObfuscatedName("o.c")
    public class30 field384;

    @ObfuscatedName("o.j(B)Ldf;")
    public final class111 method18() {
        if (this.field384 == null) {
            return null;
        }
        class33 var1 = this.field434 != -1 && this.field437 == 0 ? class33.method2589(this.field434) : null;
        class33 var2 = this.field463 == -1 || this.field463 == this.field430 && var1 != null ? null : class33.method2589(this.field463);
        class111 var3 = this.field384.method565(var1, this.field436, var2, this.field410);
        if (var3 == null) {
            return null;
        }
        var3.method2121();
        this.field405 = var3.field1521;
        if (this.field447 != -1 && this.field440 != -1) {
            class111 var4 = class34.method135(this.field447).method708(this.field440);
            if (var4 != null) {
                var4.method2164(0, -this.field443, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (this.field384.field766 == 1) {
            var3.field1860 = true;
        }
        return var3;
    }

    @ObfuscatedName("o.f(I)Z")
    public final boolean method20() {
        return this.field384 != null;
    }
}
