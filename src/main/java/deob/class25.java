package deob;

@ObfuscatedName("i")
public final class class25 extends class27 {

    @ObfuscatedName("i.b")
    public class31 field389;

    @ObfuscatedName("i.e(I)Ldp;")
    public final class112 method15() {
        if (this.field389 == null) {
            return null;
        }
        class34 var1 = this.field437 != -1 && this.field440 == 0 ? class34.method215(this.field437) : null;
        class34 var2 = this.field448 == -1 || this.field448 == this.field444 && var1 != null ? null : class34.method215(this.field448);
        class112 var3 = this.field389.method597(var1, this.field438, var2, this.field435);
        if (var3 == null) {
            return null;
        }
        var3.method2226();
        this.field412 = var3.field1536;
        if (this.field414 != -1 && this.field416 != -1) {
            class112 var4 = class35.method2850(this.field414).method741(this.field416);
            if (var4 != null) {
                var4.method2288(0, -this.field427, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field389.field769 == 1) {
            var3.field1868 = true;
        }
        return var3;
    }

    @ObfuscatedName("i.g(B)Z")
    public final boolean method16() {
        return this.field389 != null;
    }
}
