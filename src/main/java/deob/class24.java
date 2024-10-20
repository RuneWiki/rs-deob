package deob;

@ObfuscatedName("r")
public final class class24 extends class26 {

    @ObfuscatedName("r.u")
    public class30 field384;

    @ObfuscatedName("r.k(B)Ldd;")
    public final class111 method30() {
        if (this.field384 == null) {
            return null;
        }
        class33 var1 = this.field456 != -1 && this.field438 == 0 ? Statics.method147(this.field456) : null;
        class33 var2 = this.field432 == -1 || this.field445 == this.field432 && var1 != null ? null : Statics.method147(this.field432);
        class111 var3 = this.field384.method585(var1, this.field436, var2, this.field444);
        if (var3 == null) {
            return null;
        }
        var3.method2281();
        this.field408 = var3.field1525;
        if (this.field415 != -1 && this.field441 != -1) {
            class111 var4 = class34.method203(this.field415).method711(this.field441);
            if (var4 != null) {
                var4.method2247(0, -this.field450, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (this.field384.field772 == 1) {
            var3.field1863 = true;
        }
        return var3;
    }

    @ObfuscatedName("r.x(I)Z")
    public final boolean method26() {
        return this.field384 != null;
    }
}
