package deob;

@ObfuscatedName("a")
public final class class24 extends class26 {

    @ObfuscatedName("a.j")
    public class30 field379;

    @ObfuscatedName("a.y(B)Ldh;")
    public final class111 method13() {
        if (this.field379 == null) {
            return null;
        }
        class33 var1 = this.field422 != -1 && this.field437 == 0 ? class33.method2614(this.field422) : null;
        class33 var2 = this.field443 == -1 || this.field443 == this.field398 && var1 != null ? null : class33.method2614(this.field443);
        class111 var3 = this.field379.method598(var1, this.field423, var2, this.field420);
        if (var3 == null) {
            return null;
        }
        var3.method2170();
        this.field440 = var3.field1534;
        if (this.field425 != -1 && this.field428 != -1) {
            class111 var4 = class34.method564(this.field425).method719(this.field428);
            if (var4 != null) {
                var4.method2174(0, -this.field431, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (this.field379.field760 == 1) {
            var3.field1866 = true;
        }
        return var3;
    }

    @ObfuscatedName("a.x(B)Z")
    public final boolean method11() {
        return this.field379 != null;
    }
}
