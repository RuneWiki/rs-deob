package deob;

@ObfuscatedName("ak")
public final class class30 extends class33 {

    @ObfuscatedName("ak.n")
    public class35 field698;

    @ObfuscatedName("ak.x(S)Lcy;")
    public final class98 method18() {
        if (this.field698 == null) {
            return null;
        }
        class38 var1 = this.field762 != -1 && this.field747 == 0 ? class38.method658(this.field762) : null;
        class38 var2 = this.field759 == -1 || this.field759 == this.field736 && var1 != null ? null : class38.method658(this.field759);
        class98 var3 = this.field698.method648(var1, this.field763, var2, this.field752);
        if (var3 == null) {
            return null;
        }
        var3.method1989();
        this.field739 = var3.field1339;
        if (this.field765 != -1 && this.field756 != -1) {
            class98 var4 = class39.method138(this.field765).method751(this.field756);
            if (var4 != null) {
                var4.method2000(0, -this.field771, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field698.field803 == 1) {
            var3.field1705 = true;
        }
        return var3;
    }

    @ObfuscatedName("ak.k(S)Z")
    public final boolean method14() {
        return this.field698 != null;
    }
}
