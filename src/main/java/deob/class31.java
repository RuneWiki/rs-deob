package deob;

@ObfuscatedName("am")
public final class class31 extends class34 {

    @ObfuscatedName("am.x")
    public class36 field703;

    @ObfuscatedName("am.v(B)Lck;")
    public final class99 method18() {
        if (this.field703 == null) {
            return null;
        }
        class39 var1 = this.field764 != -1 && this.field767 == 0 ? class39.method633(this.field764) : null;
        class39 var2 = this.field761 == -1 || this.field766 == this.field761 && var1 != null ? null : class39.method633(this.field761);
        class99 var3 = this.field703.method642(var1, this.field765, var2, this.field762);
        if (var3 == null) {
            return null;
        }
        var3.method1982();
        this.field734 = var3.field1354;
        if (this.field786 != -1 && this.field770 != -1) {
            class99 var4 = class40.method517(this.field786).method771(this.field770);
            if (var4 != null) {
                var4.method1986(0, -this.field773, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (this.field703.field844 == 1) {
            var3.field1724 = true;
        }
        return var3;
    }

    @ObfuscatedName("am.m(I)Z")
    public final boolean method9() {
        return this.field703 != null;
    }
}
