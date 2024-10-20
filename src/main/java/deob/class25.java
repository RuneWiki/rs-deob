package deob;

@ObfuscatedName("d")
public final class class25 extends class27 {

    @ObfuscatedName("d.x")
    public class31 field354;

    @ObfuscatedName("d.p(I)Ldi;")
    public final class112 method10() {
        if (this.field354 == null) {
            return null;
        }
        class34 var1 = this.field411 != -1 && this.field414 == 0 ? class34.method516(this.field411) : null;
        class34 var2 = this.field408 == -1 || this.field408 == this.field387 && var1 != null ? null : class34.method516(this.field408);
        class112 var3 = this.field354.method590(var1, this.field398, var2, this.field429);
        if (var3 == null) {
            return null;
        }
        var3.method2242();
        this.field391 = var3.field1524;
        if (this.field416 != -1 && this.field417 != -1) {
            class112 var4 = class35.method1621(this.field416).method717(this.field417);
            if (var4 != null) {
                var4.method2230(0, -this.field392, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field354.field749 == 1) {
            var3.field1854 = true;
        }
        return var3;
    }

    @ObfuscatedName("d.k(I)Z")
    public final boolean method11() {
        return this.field354 != null;
    }
}
