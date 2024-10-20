package deob;

@ObfuscatedName("ap")
public final class class30 extends class33 {

    @ObfuscatedName("ap.g")
    public class35 field705;

    @ObfuscatedName("ap.i(I)Lce;")
    public final class98 method14() {
        if (this.field705 == null) {
            return null;
        }
        class38 var1 = this.field762 != -1 && this.field772 == 0 ? class38.method552(this.field762) : null;
        class38 var2 = this.field766 == -1 || this.field766 == this.field739 && var1 != null ? null : class38.method552(this.field766);
        class98 var3 = this.field705.method622(var1, this.field770, var2, this.field767);
        if (var3 == null) {
            return null;
        }
        var3.method1955();
        this.field787 = var3.field1360;
        if (this.field774 != -1 && this.field775 != -1) {
            class98 var4 = class39.method685(this.field774).method718(this.field775);
            if (var4 != null) {
                var4.method1966(0, -this.field741, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field705.field831 == 1) {
            var3.field1721 = true;
        }
        return var3;
    }

    @ObfuscatedName("ap.k(B)Z")
    public final boolean method25() {
        return this.field705 != null;
    }
}
