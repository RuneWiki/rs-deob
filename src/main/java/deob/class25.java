package deob;

@ObfuscatedName("t")
public final class class25 extends class27 {

    @ObfuscatedName("t.i")
    public class31 field401;

    @ObfuscatedName("t.v(I)Ldl;")
    public final class112 method15() {
        if (this.field401 == null) {
            return null;
        }
        class34 var1 = this.field448 != -1 && this.field451 == 0 ? class34.method1443(this.field448) : null;
        class34 var2 = this.field445 == -1 || this.field445 == this.field443 && var1 != null ? null : class34.method1443(this.field445);
        class112 var3 = this.field401.method623(var1, this.field449, var2, this.field446);
        if (var3 == null) {
            return null;
        }
        var3.method2273();
        this.field421 = var3.field1556;
        if (this.field455 != -1 && this.field468 != -1) {
            class112 var4 = class35.method713(this.field455).method766(this.field468);
            if (var4 != null) {
                var4.method2283(0, -this.field457, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field401.field789 == 1) {
            var3.field1889 = true;
        }
        return var3;
    }

    @ObfuscatedName("t.m(B)Z")
    public final boolean method16() {
        return this.field401 != null;
    }
}
