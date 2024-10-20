package deob;

@ObfuscatedName("u")
public final class class25 extends class27 {

    @ObfuscatedName("u.a")
    public class31 field397;

    @ObfuscatedName("u.x(B)Ldd;")
    public final class112 method15() {
        if (this.field397 == null) {
            return null;
        }
        class34 var1 = this.field447 != -1 && this.field418 == 0 ? class34.method57(this.field447) : null;
        class34 var2 = this.field444 == -1 || this.field444 == this.field422 && var1 != null ? null : class34.method57(this.field444);
        class112 var3 = this.field397.method609(var1, this.field448, var2, this.field425);
        if (var3 == null) {
            return null;
        }
        var3.method2184();
        this.field465 = var3.field1549;
        if (this.field433 != -1 && this.field453 != -1) {
            class112 var4 = class35.method2175(this.field433).method751(this.field453);
            if (var4 != null) {
                var4.method2246(0, -this.field450, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field397.field793 == 1) {
            var3.field1879 = true;
        }
        return var3;
    }

    @ObfuscatedName("u.e(B)Z")
    public final boolean method24() {
        return this.field397 != null;
    }
}
