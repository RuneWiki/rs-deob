package deob;

@ObfuscatedName("al")
public final class class30 extends class33 {

    @ObfuscatedName("al.p")
    public class35 field701;

    @ObfuscatedName("al.g(I)Lcn;")
    public final class98 method20() {
        if (this.field701 == null) {
            return null;
        }
        class38 var1 = this.field759 != -1 && this.field762 == 0 ? class38.method507(this.field759) : null;
        class38 var2 = this.field756 == -1 || this.field756 == this.field734 && var1 != null ? null : class38.method507(this.field756);
        class98 var3 = this.field701.method631(var1, this.field760, var2, this.field731);
        if (var3 == null) {
            return null;
        }
        var3.method2034();
        this.field777 = var3.field1357;
        if (this.field764 != -1 && this.field765 != -1) {
            class98 var4 = class39.method3391(this.field764).method776(this.field765);
            if (var4 != null) {
                var4.method2044(0, -this.field767, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field701.field827 == 1) {
            var3.field1719 = true;
        }
        return var3;
    }

    @ObfuscatedName("al.x(B)Z")
    public final boolean method21() {
        return this.field701 != null;
    }
}
