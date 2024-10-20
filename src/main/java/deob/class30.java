package deob;

@ObfuscatedName("ac")
public final class class30 extends class33 {

    @ObfuscatedName("ac.e")
    public class35 field695;

    @ObfuscatedName("ac.v(I)Lcz;")
    public final class98 method17() {
        if (this.field695 == null) {
            return null;
        }
        class38 var1 = this.field749 != -1 && this.field752 == 0 ? class38.method730(this.field749) : null;
        class38 var2 = this.field746 == -1 || this.field750 == this.field746 && var1 != null ? null : class38.method730(this.field746);
        class98 var3 = this.field695.method598(var1, this.field756, var2, this.field747);
        if (var3 == null) {
            return null;
        }
        var3.method1969();
        this.field767 = var3.field1349;
        if (this.field754 != -1 && this.field762 != -1) {
            class98 var4 = Statics.method1958(this.field754).method736(this.field762);
            if (var4 != null) {
                var4.method1979(0, -this.field758, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field695.field794 == 1) {
            var3.field1717 = true;
        }
        return var3;
    }

    @ObfuscatedName("ac.i(I)Z")
    public final boolean method18() {
        return this.field695 != null;
    }
}
