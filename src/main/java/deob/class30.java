package deob;

@ObfuscatedName("ab")
public final class class30 extends class33 {

    @ObfuscatedName("ab.t")
    public class35 field680;

    @ObfuscatedName("ab.s(I)Lcc;")
    public final class98 method17() {
        if (this.field680 == null) {
            return null;
        }
        class38 var1 = this.field767 != -1 && this.field762 == 0 ? Statics.method448(this.field767) : null;
        class38 var2 = this.field742 == -1 || this.field742 == this.field719 && var1 != null ? null : Statics.method448(this.field742);
        class98 var3 = this.field680.method596(var1, this.field745, var2, this.field724);
        if (var3 == null) {
            return null;
        }
        var3.method1949();
        this.field721 = var3.field1341;
        if (this.field749 != -1 && this.field750 != -1) {
            class98 var4 = class39.method123(this.field749).method717(this.field750);
            if (var4 != null) {
                var4.method1956(0, -this.field737, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field680.field789 == 1) {
            var3.field1710 = true;
        }
        return var3;
    }

    @ObfuscatedName("ab.f(I)Z")
    public final boolean method18() {
        return this.field680 != null;
    }
}
