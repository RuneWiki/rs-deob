package deob;

@ObfuscatedName("ai")
public final class class30 extends class33 {

    @ObfuscatedName("ai.j")
    public class35 field703;

    @ObfuscatedName("ai.z(I)Lcl;")
    public final class98 method15() {
        if (this.field703 == null) {
            return null;
        }
        class38 var1 = this.field785 != -1 && this.field791 == 0 ? class38.method38(this.field785) : null;
        class38 var2 = this.field741 == -1 || this.field741 == this.field739 && var1 != null ? null : class38.method38(this.field741);
        class98 var3 = this.field703.method594(var1, this.field753, var2, this.field762);
        if (var3 == null) {
            return null;
        }
        var3.method1988();
        this.field767 = var3.field1354;
        if (this.field774 != -1 && this.field770 != -1) {
            class98 var4 = class39.method3319(this.field774).method714(this.field770);
            if (var4 != null) {
                var4.method2020(0, -this.field764, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field703.field808 == 1) {
            var3.field1711 = true;
        }
        return var3;
    }

    @ObfuscatedName("ai.y(I)Z")
    public final boolean method16() {
        return this.field703 != null;
    }
}
