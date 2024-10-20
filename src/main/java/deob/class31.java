package deob;

@ObfuscatedName("aa")
public final class class31 extends class34 {

    @ObfuscatedName("aa.b")
    public class36 field696;

    @ObfuscatedName("aa.e(B)Lcr;")
    public final class99 method15() {
        if (this.field696 == null) {
            return null;
        }
        class39 var1 = this.field747 != -1 && this.field756 == 0 ? class39.method1863(this.field747) : null;
        class39 var2 = this.field754 == -1 || this.field783 == this.field754 && var1 != null ? null : class39.method1863(this.field754);
        class99 var3 = this.field696.method640(var1, this.field758, var2, this.field766);
        if (var3 == null) {
            return null;
        }
        var3.method1976();
        this.field775 = var3.field1354;
        if (this.field762 != -1 && this.field763 != -1) {
            class99 var4 = class40.method1763(this.field762).method763(this.field763);
            if (var4 != null) {
                var4.method2019(0, -this.field736, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (this.field696.field804 == 1) {
            var3.field1724 = true;
        }
        return var3;
    }

    @ObfuscatedName("aa.i(B)Z")
    public final boolean method16() {
        return this.field696 != null;
    }
}
