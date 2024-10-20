package deob;

@ObfuscatedName("i")
public final class class25 extends class27 {

    @ObfuscatedName("i.g")
    public class31 field395;

    @ObfuscatedName("i.h(I)Ldn;")
    public final class112 method18() {
        if (this.field395 == null) {
            return null;
        }
        class34 var1 = this.field450 != -1 && this.field453 == 0 ? class34.method152(this.field450) : null;
        class34 var2 = this.field447 == -1 || this.field447 == this.field426 && var1 != null ? null : class34.method152(this.field447);
        class112 var3 = this.field395.method610(var1, this.field430, var2, this.field448);
        if (var3 == null) {
            return null;
        }
        var3.method2276();
        this.field468 = var3.field1535;
        if (this.field455 != -1 && this.field456 != -1) {
            class112 var4 = class35.method3034(this.field455).method750(this.field456);
            if (var4 != null) {
                var4.method2286(0, -this.field441, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field395.field794 == 1) {
            var3.field1868 = true;
        }
        return var3;
    }

    @ObfuscatedName("i.s(B)Z")
    public final boolean method21() {
        return this.field395 != null;
    }
}
