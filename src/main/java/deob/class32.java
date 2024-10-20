package deob;

@ObfuscatedName("ak")
public final class class32 extends class35 {

    @ObfuscatedName("ak.p")
    public class37 field733;

    @ObfuscatedName("ak.k(I)Lcm;")
    public final class100 method23() {
        if (this.field733 == null) {
            return null;
        }
        class40 var1 = this.field795 != -1 && this.field798 == 0 ? class40.method678(this.field795) : null;
        class40 var2 = this.field792 == -1 || this.field792 == this.field769 && var1 != null ? null : class40.method678(this.field792);
        class100 var3 = this.field733.method660(var1, this.field765, var2, this.field793);
        if (var3 == null) {
            return null;
        }
        var3.method2053();
        this.field770 = var3.field1390;
        if (this.field800 != -1 && this.field796 != -1) {
            class100 var4 = class41.method2637(this.field800).method780(this.field796);
            if (var4 != null) {
                var4.method2037(0, -this.field804, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (this.field733.field840 == 1) {
            var3.field1755 = true;
        }
        return var3;
    }

    @ObfuscatedName("ak.e(S)Z")
    public final boolean method18() {
        return this.field733 != null;
    }
}
