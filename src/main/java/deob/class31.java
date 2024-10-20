package deob;

@ObfuscatedName("aw")
public final class class31 extends class34 {

    @ObfuscatedName("aw.f")
    public class36 field712;

    @ObfuscatedName("aw.k(I)Lci;")
    public final class99 method16() {
        if (this.field712 == null) {
            return null;
        }
        class39 var1 = this.field792 != -1 && this.field774 == 0 ? class39.method547(this.field792) : null;
        class39 var2 = this.field778 == -1 || this.field778 == this.field745 && var1 != null ? null : class39.method547(this.field778);
        class99 var3 = this.field712.method668(var1, this.field759, var2, this.field769);
        if (var3 == null) {
            return null;
        }
        var3.method2024();
        this.field770 = var3.field1365;
        if (this.field776 != -1 && this.field777 != -1) {
            class99 var4 = class40.method99(this.field776).method783(this.field777);
            if (var4 != null) {
                var4.method2034(0, -this.field781, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (this.field712.field813 == 1) {
            var3.field1732 = true;
        }
        return var3;
    }

    @ObfuscatedName("aw.y(I)Z")
    public final boolean method17() {
        return this.field712 != null;
    }
}
