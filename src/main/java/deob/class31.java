package deob;

@ObfuscatedName("az")
public final class class31 extends class34 {

    @ObfuscatedName("az.g")
    public class36 field702;

    @ObfuscatedName("az.j(I)Lcx;")
    public final class99 method15() {
        if (this.field702 == null) {
            return null;
        }
        class39 var1 = this.field766 != -1 && this.field769 == 0 ? class39.method2627(this.field766) : null;
        class39 var2 = this.field775 == -1 || this.field775 == this.field740 && var1 != null ? null : class39.method2627(this.field775);
        class99 var3 = this.field702.method584(var1, this.field767, var2, this.field763);
        if (var3 == null) {
            return null;
        }
        var3.method1940();
        this.field784 = var3.field1352;
        if (this.field771 != -1 && this.field772 != -1) {
            class99 var4 = class40.method2523(this.field771).method720(this.field772);
            if (var4 != null) {
                var4.method1949(0, -this.field739, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (this.field702.field809 == 1) {
            var3.field1704 = true;
        }
        return var3;
    }

    @ObfuscatedName("az.z(I)Z")
    public final boolean method14() {
        return this.field702 != null;
    }
}
