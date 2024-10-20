package deob;

@ObfuscatedName("p")
public final class class25 extends class27 {

    @ObfuscatedName("p.c")
    public class31 field406;

    @ObfuscatedName("p.q(B)Ldl;")
    public final class112 method13() {
        if (this.field406 == null) {
            return null;
        }
        class34 var1 = this.field461 != -1 && this.field464 == 0 ? Statics.method1425(this.field461) : null;
        class34 var2 = this.field458 == -1 || this.field458 == this.field437 && var1 != null ? null : Statics.method1425(this.field458);
        class112 var3 = this.field406.method578(var1, this.field462, var2, this.field459);
        if (var3 == null) {
            return null;
        }
        var3.method2192();
        this.field440 = var3.field1569;
        if (this.field484 != -1 && this.field467 != -1) {
            class112 var4 = class35.method743(this.field484).method720(this.field467);
            if (var4 != null) {
                var4.method2148(0, -this.field460, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field406.field796 == 1) {
            var3.field1919 = true;
        }
        return var3;
    }

    @ObfuscatedName("p.y(I)Z")
    public final boolean method14() {
        return this.field406 != null;
    }
}
