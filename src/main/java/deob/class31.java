package deob;

@ObfuscatedName("ah")
public final class class31 extends class34 {

    @ObfuscatedName("ah.e")
    public class36 field706;

    @ObfuscatedName("ah.v(B)Lcu;")
    public final class99 method14() {
        if (this.field706 == null) {
            return null;
        }
        class39 var1 = this.field736 != -1 && this.field768 == 0 ? class39.method2315(this.field736) : null;
        class39 var2 = this.field782 == -1 || this.field793 == this.field782 && var1 != null ? null : class39.method2315(this.field782);
        class99 var3 = this.field706.method599(var1, this.field766, var2, this.field750);
        if (var3 == null) {
            return null;
        }
        var3.method1967();
        this.field756 = var3.field1369;
        if (this.field770 != -1 && this.field771 != -1) {
            class99 var4 = class40.method2885(this.field770).method740(this.field771);
            if (var4 != null) {
                var4.method1982(0, -this.field767, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (this.field706.field808 == 1) {
            var3.field1731 = true;
        }
        return var3;
    }

    @ObfuscatedName("ah.k(I)Z")
    public final boolean method25() {
        return this.field706 != null;
    }
}
