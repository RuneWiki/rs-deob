package deob;

@ObfuscatedName("aw")
public final class class30 extends class33 {

    @ObfuscatedName("aw.k")
    public class35 field699;

    @ObfuscatedName("aw.b(I)Lck;")
    public final class98 method19() {
        if (this.field699 == null) {
            return null;
        }
        class38 var1 = this.field757 != -1 && this.field760 == 0 ? class38.method595(this.field757) : null;
        class38 var2 = this.field778 == -1 || this.field778 == this.field775 && var1 != null ? null : class38.method595(this.field778);
        class98 var3 = this.field699.method603(var1, this.field758, var2, this.field755);
        if (var3 == null) {
            return null;
        }
        var3.method1979();
        this.field737 = var3.field1353;
        if (this.field762 != -1 && this.field763 != -1) {
            class98 var4 = class39.method788(this.field762).method738(this.field763);
            if (var4 != null) {
                var4.method1987(0, -this.field766, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field699.field796 == 1) {
            var3.field1712 = true;
        }
        return var3;
    }

    @ObfuscatedName("aw.e(B)Z")
    public final boolean method11() {
        return this.field699 != null;
    }
}
