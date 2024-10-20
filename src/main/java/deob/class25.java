package deob;

@ObfuscatedName("p")
public final class class25 extends class27 {

    @ObfuscatedName("p.f")
    public class31 field371;

    @ObfuscatedName("p.t(I)Ldp;")
    public final class112 method13() {
        if (this.field371 == null) {
            return null;
        }
        class34 var1 = this.field425 != -1 && this.field428 == 0 ? class34.method572(this.field425) : null;
        class34 var2 = this.field422 == -1 || this.field422 == this.field417 && var1 != null ? null : class34.method572(this.field422);
        class112 var3 = this.field371.method601(var1, this.field426, var2, this.field423);
        if (var3 == null) {
            return null;
        }
        var3.method2240();
        this.field451 = var3.field1542;
        if (this.field413 != -1 && this.field398 != -1) {
            class112 var4 = class35.method115(this.field413).method737(this.field398);
            if (var4 != null) {
                var4.method2249(0, -this.field434, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field371.field766 == 1) {
            var3.field1868 = true;
        }
        return var3;
    }

    @ObfuscatedName("p.n(I)Z")
    public final boolean method22() {
        return this.field371 != null;
    }
}
