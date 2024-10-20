package deob;

@ObfuscatedName("ap")
public final class class33 extends class36 {

    @ObfuscatedName("ap.j")
    public class38 field764;

    @ObfuscatedName("ap.y(I)Lcw;")
    public final class103 method14() {
        if (this.field764 == null) {
            return null;
        }
        class41 var1 = this.field824 != -1 && this.field796 == 0 ? class41.method1016(this.field824) : null;
        class41 var2 = this.field798 == -1 || this.field844 == this.field798 && var1 != null ? null : class41.method1016(this.field798);
        class103 var3 = this.field764.method748(var1, this.field825, var2, this.field819);
        if (var3 == null) {
            return null;
        }
        var3.method2170();
        this.field842 = var3.field1419;
        if (this.field835 != -1 && this.field830 != -1) {
            class103 var4 = class42.method122(this.field835).method888(this.field830);
            if (var4 != null) {
                var4.method2180(0, -this.field801, 0);
                class103[] var5 = new class103[] { var3, var4 };
                var3 = new class103(var5, 2);
            }
        }
        if (this.field764.field868 == 1) {
            var3.field1751 = true;
        }
        return var3;
    }

    @ObfuscatedName("ap.z(I)Z")
    public final boolean method17() {
        return this.field764 != null;
    }
}
