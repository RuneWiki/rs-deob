package deob;

@ObfuscatedName("gx")
public final class class184 extends class179 {

    @ObfuscatedName("gx.bt")
    public class153 field2805;

    @ObfuscatedName("gx.u(S)Lfb;")
    public final class181 method2641() {
        if (this.field2805 == null) {
            return null;
        }
        class156 var1 = this.field2644 != -1 && this.field2647 == 0 ? class156.method482(this.field2644) : null;
        class156 var2 = this.field2641 == -1 || this.field2641 == this.field2619 && var1 != null ? null : class156.method482(this.field2641);
        class181 var3 = this.field2805.method2349(var1, this.field2631, var2, this.field2639);
        if (var3 == null) {
            return null;
        }
        var3.method3001();
        this.field2662 = var3.field2489;
        if (this.field2623 != -1 && this.field2650 != -1) {
            class181 var4 = class157.method404(this.field2623).method2453(this.field2650);
            if (var4 != null) {
                var4.method3014(0, -this.field2614, 0);
                class181[] var5 = new class181[] { var3, var4 };
                var3 = new class181(var5, 2);
            }
        }
        if (this.field2805.field2272 == 1) {
            var3.field2777 = true;
        }
        return var3;
    }

    @ObfuscatedName("gx.z(B)Z")
    public final boolean method2909() {
        return this.field2805 != null;
    }
}
