package deob;

@ObfuscatedName("ag")
public final class class30 extends class33 {

    @ObfuscatedName("ag.i")
    public class35 field705;

    @ObfuscatedName("ag.c(B)Lcc;")
    public final class98 method16() {
        if (this.field705 == null) {
            return null;
        }
        class38 var1 = this.field742 != -1 && this.field767 == 0 ? class38.method3551(this.field742) : null;
        class38 var2 = this.field764 == -1 || this.field764 == this.field762 && var1 != null ? null : class38.method3551(this.field764);
        class98 var3 = this.field705.method617(var1, this.field768, var2, this.field765);
        if (var3 == null) {
            return null;
        }
        var3.method2006();
        this.field785 = var3.field1358;
        if (this.field772 != -1 && this.field740 != -1) {
            class98 var4 = class39.method3346(this.field772).method752(this.field740);
            if (var4 != null) {
                var4.method2016(0, -this.field776, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field705.field812 == 1) {
            var3.field1701 = true;
        }
        return var3;
    }

    @ObfuscatedName("ag.h(S)Z")
    public final boolean method23() {
        return this.field705 != null;
    }
}
