package deob;

@ObfuscatedName("o")
public final class class25 extends class27 {

    @ObfuscatedName("o.d")
    public class31 field382;

    @ObfuscatedName("o.g(I)Ldd;")
    public final class112 method18() {
        if (this.field382 == null) {
            return null;
        }
        class34 var1 = this.field428 != -1 && this.field431 == 0 ? class34.method136(this.field428) : null;
        class34 var2 = this.field408 == -1 || this.field412 == this.field408 && var1 != null ? null : class34.method136(this.field408);
        class112 var3 = this.field382.method583(var1, this.field445, var2, this.field440);
        if (var3 == null) {
            return null;
        }
        var3.method2190();
        this.field446 = var3.field1545;
        if (this.field455 != -1 && this.field429 != -1) {
            class112 var4 = class35.method102(this.field455).method715(this.field429);
            if (var4 != null) {
                var4.method2200(0, -this.field437, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field382.field769 == 1) {
            var3.field1913 = true;
        }
        return var3;
    }

    @ObfuscatedName("o.a(I)Z")
    public final boolean method19() {
        return this.field382 != null;
    }
}
