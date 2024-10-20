package deob;

@ObfuscatedName("aa")
public final class class30 extends class33 {

    @ObfuscatedName("aa.g")
    public class35 field689;

    @ObfuscatedName("aa.s(I)Lcl;")
    public final class98 method17() {
        if (this.field689 == null) {
            return null;
        }
        class38 var1 = this.field751 != -1 && this.field754 == 0 ? class38.method114(this.field751) : null;
        class38 var2 = this.field770 == -1 || this.field770 == this.field756 && var1 != null ? null : class38.method114(this.field770);
        class98 var3 = this.field689.method620(var1, this.field752, var2, this.field749);
        if (var3 == null) {
            return null;
        }
        var3.method1958();
        this.field769 = var3.field1354;
        if (this.field723 != -1 && this.field757 != -1) {
            class98 var4 = class39.method3306(this.field723).method743(this.field757);
            if (var4 != null) {
                var4.method1979(0, -this.field760, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field689.field799 == 1) {
            var3.field1717 = true;
        }
        return var3;
    }

    @ObfuscatedName("aa.h(I)Z")
    public final boolean method18() {
        return this.field689 != null;
    }
}
