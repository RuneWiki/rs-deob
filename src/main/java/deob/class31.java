package deob;

@ObfuscatedName("ax")
public final class class31 extends class34 {

    @ObfuscatedName("ax.p")
    public class36 field675;

    @ObfuscatedName("ax.y(I)Lcy;")
    public final class99 method13() {
        if (this.field675 == null) {
            return null;
        }
        class39 var1 = this.field732 != -1 && this.field760 == 0 ? class39.method2920(this.field732) : null;
        class39 var2 = this.field729 == -1 || this.field729 == this.field706 && var1 != null ? null : class39.method2920(this.field729);
        class99 var3 = this.field675.method644(var1, this.field702, var2, this.field730);
        if (var3 == null) {
            return null;
        }
        var3.method1996();
        this.field750 = var3.field1344;
        if (this.field738 != -1 && this.field762 != -1) {
            class99 var4 = class40.method761(this.field738).method774(this.field762);
            if (var4 != null) {
                var4.method2024(0, -this.field741, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (this.field675.field779 == 1) {
            var3.field1714 = true;
        }
        return var3;
    }

    @ObfuscatedName("ax.d(I)Z")
    public final boolean method14() {
        return this.field675 != null;
    }
}
