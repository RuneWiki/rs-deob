package deob;

@ObfuscatedName("k")
public final class class25 extends class27 {

    @ObfuscatedName("k.p")
    public class31 field388;

    @ObfuscatedName("k.i(I)Ldj;")
    public final class112 method21() {
        if (this.field388 == null) {
            return null;
        }
        class34 var1 = this.field439 != -1 && this.field414 == 0 ? class34.method160(this.field439) : null;
        class34 var2 = this.field436 == -1 || this.field449 == this.field436 && var1 != null ? null : class34.method160(this.field436);
        class112 var3 = this.field388.method632(var1, this.field440, var2, this.field437);
        if (var3 == null) {
            return null;
        }
        var3.method2317();
        this.field457 = var3.field1550;
        if (this.field444 != -1 && this.field465 != -1) {
            class112 var4 = class35.method2756(this.field444).method780(this.field465);
            if (var4 != null) {
                var4.method2281(0, -this.field448, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field388.field779 == 1) {
            var3.field1886 = true;
        }
        return var3;
    }

    @ObfuscatedName("k.o(I)Z")
    public final boolean method36() {
        return this.field388 != null;
    }
}
