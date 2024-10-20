package deob;

@ObfuscatedName("w")
public final class class24 extends class26 {

    @ObfuscatedName("w.z")
    public class30 field386;

    @ObfuscatedName("w.h(I)Ldh;")
    public final class111 method15() {
        if (this.field386 == null) {
            return null;
        }
        class33 var1 = this.field438 != -1 && this.field440 == 0 ? class33.method2674(this.field438) : null;
        class33 var2 = this.field435 == -1 || this.field435 == this.field430 && var1 != null ? null : class33.method2674(this.field435);
        class111 var3 = this.field386.method629(var1, this.field439, var2, this.field436);
        if (var3 == null) {
            return null;
        }
        var3.method2219();
        this.field456 = var3.field1537;
        if (this.field443 != -1 && this.field464 != -1) {
            class111 var4 = Statics.method813(this.field443).method748(this.field464);
            if (var4 != null) {
                var4.method2238(0, -this.field414, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (this.field386.field783 == 1) {
            var3.field1865 = true;
        }
        return var3;
    }

    @ObfuscatedName("w.c(B)Z")
    public final boolean method16() {
        return this.field386 != null;
    }
}
