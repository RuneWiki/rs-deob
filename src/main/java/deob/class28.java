package deob;

@ObfuscatedName("av")
public final class class28 extends class30 {

    @ObfuscatedName("av.m")
    public class32 field674;

    @ObfuscatedName("av.k(I)Lcl;")
    public final class95 method22() {
        if (this.field674 == null) {
            return null;
        }
        class35 var1 = this.field721 != -1 && this.field749 == 0 ? class35.method162(this.field721) : null;
        class35 var2 = this.field718 == -1 || this.field731 == this.field718 && var1 != null ? null : class35.method162(this.field718);
        class95 var3 = this.field674.method583(var1, this.field716, var2, this.field719);
        if (var3 == null) {
            return null;
        }
        var3.method1975();
        this.field739 = var3.field1315;
        if (this.field697 != -1 && this.field722 != -1) {
            class95 var4 = class36.method2678(this.field697).method707(this.field722);
            if (var4 != null) {
                var4.method1980(0, -this.field730, 0);
                class95[] var5 = new class95[] { var3, var4 };
                var3 = new class95(var5, 2);
            }
        }
        if (this.field674.field789 == 1) {
            var3.field1667 = true;
        }
        return var3;
    }

    @ObfuscatedName("av.y(B)Z")
    public final boolean method18() {
        return this.field674 != null;
    }
}
