package deob;

@ObfuscatedName("ag")
public final class class32 extends class35 {

    @ObfuscatedName("ag.n")
    public class37 field749;

    @ObfuscatedName("ag.g(S)Lcs;")
    public final class100 method17() {
        if (this.field749 == null) {
            return null;
        }
        class40 var1 = this.field810 != -1 && this.field813 == 0 ? class40.method2146(this.field810) : null;
        class40 var2 = this.field807 == -1 || this.field807 == this.field784 && var1 != null ? null : class40.method2146(this.field807);
        class100 var3 = this.field749.method679(var1, this.field811, var2, this.field808);
        if (var3 == null) {
            return null;
        }
        var3.method2061();
        this.field781 = var3.field1409;
        if (this.field815 != -1 && this.field834 != -1) {
            class100 var4 = class41.method24(this.field815).method782(this.field834);
            if (var4 != null) {
                var4.method2112(0, -this.field806, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (this.field749.field853 == 1) {
            var3.field1765 = true;
        }
        return var3;
    }

    @ObfuscatedName("ag.a(I)Z")
    public final boolean method18() {
        return this.field749 != null;
    }
}
