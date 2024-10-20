package deob;

@ObfuscatedName("e")
public final class class25 extends class27 {

    @ObfuscatedName("e.j")
    public class31 field383;

    @ObfuscatedName("e.f(B)Ldo;")
    public final class112 method19() {
        if (this.field383 == null) {
            return null;
        }
        class34 var1 = this.field440 != -1 && this.field443 == 0 ? class34.method612(this.field440) : null;
        class34 var2 = this.field419 == -1 || this.field419 == this.field416 && var1 != null ? null : class34.method612(this.field419);
        class112 var3 = this.field383.method625(var1, this.field441, var2, this.field438);
        if (var3 == null) {
            return null;
        }
        var3.method2240();
        this.field455 = var3.field1560;
        if (this.field445 != -1 && this.field446 != -1) {
            class112 var4 = class35.method113(this.field445).method755(this.field446);
            if (var4 != null) {
                var4.method2289(0, -this.field449, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field383.field781 == 1) {
            var3.field1864 = true;
        }
        return var3;
    }

    @ObfuscatedName("e.o(I)Z")
    public final boolean method18() {
        return this.field383 != null;
    }
}
