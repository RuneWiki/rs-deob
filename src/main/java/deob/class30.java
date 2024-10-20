package deob;

@ObfuscatedName("aw")
public final class class30 extends class33 {

    @ObfuscatedName("aw.k")
    public class35 field698;

    @ObfuscatedName("aw.r(I)Lcp;")
    public final class98 method24() {
        if (this.field698 == null) {
            return null;
        }
        class38 var1 = this.field760 != -1 && this.field763 == 0 ? class38.method102(this.field760) : null;
        class38 var2 = this.field757 == -1 || this.field757 == this.field745 && var1 != null ? null : class38.method102(this.field757);
        class98 var3 = this.field698.method599(var1, this.field761, var2, this.field769);
        if (var3 == null) {
            return null;
        }
        var3.method1998();
        this.field778 = var3.field1354;
        if (this.field765 != -1 && this.field766 != -1) {
            class98 var4 = class39.method1416(this.field765).method746(this.field766);
            if (var4 != null) {
                var4.method1990(0, -this.field774, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field698.field823 == 1) {
            var3.field1734 = true;
        }
        return var3;
    }

    @ObfuscatedName("aw.y(I)Z")
    public final boolean method12() {
        return this.field698 != null;
    }
}
