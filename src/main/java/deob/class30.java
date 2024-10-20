package deob;

@ObfuscatedName("ag")
public final class class30 extends class33 {

    @ObfuscatedName("ag.z")
    public class35 field664;

    @ObfuscatedName("ag.j(B)Lcu;")
    public final class98 method16() {
        if (this.field664 == null) {
            return null;
        }
        class38 var1 = this.field697 != -1 && this.field730 == 0 ? class38.method84(this.field697) : null;
        class38 var2 = this.field724 == -1 || this.field733 == this.field724 && var1 != null ? null : class38.method84(this.field724);
        class98 var3 = this.field664.method603(var1, this.field702, var2, this.field725);
        if (var3 == null) {
            return null;
        }
        var3.method1981();
        this.field744 = var3.field1328;
        if (this.field732 != -1 && this.field727 != -1) {
            class98 var4 = class39.method1360(this.field732).method728(this.field727);
            if (var4 != null) {
                var4.method2000(0, -this.field736, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field664.field790 == 1) {
            var3.field1700 = true;
        }
        return var3;
    }

    @ObfuscatedName("ag.a(I)Z")
    public final boolean method17() {
        return this.field664 != null;
    }
}
