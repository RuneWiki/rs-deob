package deob;

@ObfuscatedName("ad")
public final class class28 extends class30 {

    @ObfuscatedName("ad.z")
    public class32 field684;

    @ObfuscatedName("ad.n(I)Lcp;")
    public final class95 method19() {
        if (this.field684 == null) {
            return null;
        }
        class35 var1 = this.field733 != -1 && this.field736 == 0 ? class35.method2065(this.field733) : null;
        class35 var2 = this.field730 == -1 || this.field730 == this.field711 && var1 != null ? null : class35.method2065(this.field730);
        class95 var3 = this.field684.method614(var1, this.field703, var2, this.field731);
        if (var3 == null) {
            return null;
        }
        var3.method2051();
        this.field751 = var3.field1315;
        if (this.field738 != -1 && this.field739 != -1) {
            class95 var4 = class36.method2724(this.field738).method752(this.field739);
            if (var4 != null) {
                var4.method2016(0, -this.field742, 0);
                class95[] var5 = new class95[] { var3, var4 };
                var3 = new class95(var5, 2);
            }
        }
        if (this.field684.field778 == 1) {
            var3.field1692 = true;
        }
        return var3;
    }

    @ObfuscatedName("ad.u(I)Z")
    public final boolean method28() {
        return this.field684 != null;
    }
}
