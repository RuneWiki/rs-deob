package deob;

@ObfuscatedName("ag")
public final class class32 extends class35 {

    @ObfuscatedName("ag.t")
    public class37 field708;

    @ObfuscatedName("ag.b(B)Lcs;")
    public final class100 method14() {
        if (this.field708 == null) {
            return null;
        }
        class40 var1 = this.field748 != -1 && this.field772 == 0 ? class40.method168(this.field748) : null;
        class40 var2 = this.field766 == -1 || this.field796 == this.field766 && var1 != null ? null : class40.method168(this.field766);
        class100 var3 = this.field708.method689(var1, this.field782, var2, this.field767);
        if (var3 == null) {
            return null;
        }
        var3.method2020();
        this.field738 = var3.field1364;
        if (this.field743 != -1 && this.field775 != -1) {
            class100 var4 = class41.method113(this.field743).method827(this.field775);
            if (var4 != null) {
                var4.method2030(0, -this.field778, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (this.field708.field812 == 1) {
            var3.field1743 = true;
        }
        return var3;
    }

    @ObfuscatedName("ag.p(I)Z")
    public final boolean method15() {
        return this.field708 != null;
    }
}
