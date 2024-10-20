package deob;

@ObfuscatedName("t")
public final class class25 extends class27 {

    @ObfuscatedName("t.l")
    public class31 field395;

    @ObfuscatedName("t.b(I)Ldt;")
    public final class112 method11() {
        if (this.field395 == null) {
            return null;
        }
        class34 var1 = this.field414 != -1 && this.field443 == 0 ? class34.method2198(this.field414) : null;
        class34 var2 = this.field456 == -1 || this.field456 == this.field416 && var1 != null ? null : class34.method2198(this.field456);
        class112 var3 = this.field395.method609(var1, this.field441, var2, this.field438);
        if (var3 == null) {
            return null;
        }
        var3.method2230();
        this.field431 = var3.field1537;
        if (this.field445 != -1 && this.field446 != -1) {
            class112 var4 = class35.method2114(this.field445).method742(this.field446);
            if (var4 != null) {
                var4.method2239(0, -this.field451, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field395.field774 == 1) {
            var3.field1879 = true;
        }
        return var3;
    }

    @ObfuscatedName("t.o(I)Z")
    public final boolean method20() {
        return this.field395 != null;
    }
}
