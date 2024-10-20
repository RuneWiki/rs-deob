package deob;

@ObfuscatedName("ar")
public final class class32 extends class35 {

    @ObfuscatedName("ar.n")
    public class37 field713;

    @ObfuscatedName("ar.d(B)Lcg;")
    public final class100 method25() {
        if (this.field713 == null) {
            return null;
        }
        class40 var1 = this.field779 != -1 && this.field785 == 0 ? class40.method3092(this.field779) : null;
        class40 var2 = this.field759 == -1 || this.field759 == this.field753 && var1 != null ? null : class40.method3092(this.field759);
        class100 var3 = this.field713.method682(var1, this.field780, var2, this.field777);
        if (var3 == null) {
            return null;
        }
        var3.method2072();
        this.field748 = var3.field1388;
        if (this.field784 != -1 && this.field772 != -1) {
            class100 var4 = class41.method116(this.field784).method808(this.field772);
            if (var4 != null) {
                var4.method2069(0, -this.field788, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (this.field713.field826 == 1) {
            var3.field1764 = true;
        }
        return var3;
    }

    @ObfuscatedName("ar.z(I)Z")
    public final boolean method19() {
        return this.field713 != null;
    }
}
