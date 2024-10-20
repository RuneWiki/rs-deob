package deob;

@ObfuscatedName("ar")
public final class class32 extends class35 {

    @ObfuscatedName("ar.y")
    public class37 field729;

    @ObfuscatedName("ar.k(I)Lch;")
    public final class100 method16() {
        if (this.field729 == null) {
            return null;
        }
        class40 var1 = this.field777 != -1 && this.field795 == 0 ? class40.method547(this.field777) : null;
        class40 var2 = this.field789 == -1 || this.field789 == this.field766 && var1 != null ? null : class40.method547(this.field789);
        class100 var3 = this.field729.method676(var1, this.field793, var2, this.field790);
        if (var3 == null) {
            return null;
        }
        var3.method2000();
        this.field810 = var3.field1383;
        if (this.field797 != -1 && this.field798 != -1) {
            class100 var4 = class41.method2077(this.field797).method799(this.field798);
            if (var4 != null) {
                var4.method2067(0, -this.field801, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (this.field729.field849 == 1) {
            var3.field1733 = true;
        }
        return var3;
    }

    @ObfuscatedName("ar.g(I)Z")
    public final boolean method19() {
        return this.field729 != null;
    }
}
