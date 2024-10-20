package deob;

@ObfuscatedName("as")
public final class class30 extends class33 {

    @ObfuscatedName("as.g")
    public class35 field696;

    @ObfuscatedName("as.v(B)Lce;")
    public final class98 method25() {
        if (this.field696 == null) {
            return null;
        }
        class38 var1 = this.field751 != -1 && this.field754 == 0 ? class38.method1996(this.field751) : null;
        class38 var2 = this.field748 == -1 || this.field748 == this.field726 && var1 != null ? null : class38.method1996(this.field748);
        class98 var3 = this.field696.method616(var1, this.field724, var2, this.field749);
        if (var3 == null) {
            return null;
        }
        var3.method2003();
        this.field769 = var3.field1351;
        if (this.field756 != -1 && this.field757 != -1) {
            class98 var4 = class39.method563(this.field756).method751(this.field757);
            if (var4 != null) {
                var4.method2013(0, -this.field771, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field696.field800 == 1) {
            var3.field1716 = true;
        }
        return var3;
    }

    @ObfuscatedName("as.z(I)Z")
    public final boolean method15() {
        return this.field696 != null;
    }
}
