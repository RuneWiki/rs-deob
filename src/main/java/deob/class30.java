package deob;

@ObfuscatedName("aq")
public final class class30 extends class33 {

    @ObfuscatedName("aq.e")
    public class35 field683;

    @ObfuscatedName("aq.p(B)Lcs;")
    public final class98 method12() {
        if (this.field683 == null) {
            return null;
        }
        class38 var1 = this.field742 != -1 && this.field745 == 0 ? class38.method81(this.field742) : null;
        class38 var2 = this.field739 == -1 || this.field739 == this.field717 && var1 != null ? null : class38.method81(this.field739);
        class98 var3 = this.field683.method634(var1, this.field713, var2, this.field761);
        if (var3 == null) {
            return null;
        }
        var3.method1988();
        this.field760 = var3.field1343;
        if (this.field751 != -1 && this.field748 != -1) {
            class98 var4 = class39.method467(this.field751).method771(this.field748);
            if (var4 != null) {
                var4.method1993(0, -this.field753, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field683.field791 == 1) {
            var3.field1710 = true;
        }
        return var3;
    }

    @ObfuscatedName("aq.a(I)Z")
    public final boolean method14() {
        return this.field683 != null;
    }
}
