package deob;

@ObfuscatedName("s")
public final class class25 extends class27 {

    @ObfuscatedName("s.j")
    public class31 field383;

    @ObfuscatedName("s.r(B)Ldt;")
    public final class112 method18() {
        if (this.field383 == null) {
            return null;
        }
        class34 var1 = this.field435 != -1 && this.field438 == 0 ? class34.method2349(this.field435) : null;
        class34 var2 = this.field432 == -1 || this.field452 == this.field432 && var1 != null ? null : class34.method2349(this.field432);
        class112 var3 = this.field383.method614(var1, this.field421, var2, this.field433);
        if (var3 == null) {
            return null;
        }
        var3.method2307();
        this.field453 = var3.field1533;
        if (this.field455 != -1 && this.field441 != -1) {
            class112 var4 = class35.method233(this.field455).method736(this.field441);
            if (var4 != null) {
                var4.method2243(0, -this.field444, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field383.field773 == 1) {
            var3.field1864 = true;
        }
        return var3;
    }

    @ObfuscatedName("s.v(I)Z")
    public final boolean method17() {
        return this.field383 != null;
    }
}
