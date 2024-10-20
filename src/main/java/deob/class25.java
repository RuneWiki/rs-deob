package deob;

@ObfuscatedName("c")
public final class class25 extends class27 {

    @ObfuscatedName("c.g")
    public class31 field374;

    @ObfuscatedName("c.m(B)Ldf;")
    public final class112 method30() {
        if (this.field374 == null) {
            return null;
        }
        class34 var1 = this.field432 != -1 && this.field435 == 0 ? class34.method1536(this.field432) : null;
        class34 var2 = this.field429 == -1 || this.field429 == this.field408 && var1 != null ? null : class34.method1536(this.field429);
        class112 var3 = this.field374.method601(var1, this.field418, var2, this.field410);
        if (var3 == null) {
            return null;
        }
        var3.method2270();
        this.field452 = var3.field1549;
        if (this.field437 != -1 && this.field405 != -1) {
            class112 var4 = class35.method226(this.field437).method738(this.field405);
            if (var4 != null) {
                var4.method2209(0, -this.field441, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field374.field772 == 1) {
            var3.field1848 = true;
        }
        return var3;
    }

    @ObfuscatedName("c.v(B)Z")
    public final boolean method20() {
        return this.field374 != null;
    }
}
