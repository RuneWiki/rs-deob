package deob;

@ObfuscatedName("ac")
public final class class32 extends class35 {

    @ObfuscatedName("ac.o")
    public class37 field725;

    @ObfuscatedName("ac.l(B)Lcq;")
    public final class100 method14() {
        if (this.field725 == null) {
            return null;
        }
        class40 var1 = this.field793 != -1 && this.field770 == 0 ? class40.method567(this.field793) : null;
        class40 var2 = this.field777 == -1 || this.field777 == this.field754 && var1 != null ? null : class40.method567(this.field777);
        class100 var3 = this.field725.method666(var1, this.field781, var2, this.field778);
        if (var3 == null) {
            return null;
        }
        var3.method2050();
        this.field789 = var3.field1376;
        if (this.field785 != -1 && this.field783 != -1) {
            class100 var4 = class41.method2537(this.field785).method819(this.field783);
            if (var4 != null) {
                var4.method2059(0, -this.field796, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (this.field725.field827 == 1) {
            var3.field1714 = true;
        }
        return var3;
    }

    @ObfuscatedName("ac.g(I)Z")
    public final boolean method15() {
        return this.field725 != null;
    }
}
