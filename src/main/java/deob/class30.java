package deob;

@ObfuscatedName("aw")
public final class class30 extends class33 {

    @ObfuscatedName("aw.k")
    public class35 field689;

    @ObfuscatedName("aw.y(I)Lck;")
    public final class98 method19() {
        if (this.field689 == null) {
            return null;
        }
        class38 var1 = this.field745 != -1 && this.field748 == 0 ? class38.method29(this.field745) : null;
        class38 var2 = this.field742 == -1 || this.field742 == this.field720 && var1 != null ? null : class38.method29(this.field742);
        class98 var3 = this.field689.method578(var1, this.field746, var2, this.field749);
        if (var3 == null) {
            return null;
        }
        var3.method1991();
        this.field719 = var3.field1332;
        if (this.field750 != -1 && this.field743 != -1) {
            class98 var4 = class39.method2666(this.field750).method722(this.field743);
            if (var4 != null) {
                var4.method2001(0, -this.field751, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field689.field790 == 1) {
            var3.field1724 = true;
        }
        return var3;
    }

    @ObfuscatedName("aw.s(B)Z")
    public final boolean method20() {
        return this.field689 != null;
    }
}
