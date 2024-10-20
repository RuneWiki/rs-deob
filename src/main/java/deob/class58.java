package deob;

@ObfuscatedName("d")
public final class class58 extends class181 {

    @ObfuscatedName("d.j")
    public class183 field501;

    @ObfuscatedName("d.p(B)Ldi;")
    public final class41 method784() {
        if (this.field501 == null) {
            return null;
        }
        class166 var1 = this.field2711 != -1 && this.field2714 == 0 ? class166.method274(this.field2711) : null;
        class166 var2 = this.field2682 == -1 || this.field2687 == this.field2682 && var1 != null ? null : class166.method274(this.field2682);
        class41 var3 = this.field501.method3476(var1, this.field2726, var2, this.field2733);
        if (var3 == null) {
            return null;
        }
        var3.method704();
        this.field2729 = var3.field2174;
        if (this.field2716 != -1 && this.field2717 != -1) {
            class41 var4 = class173.method2209(this.field2716).method3335(this.field2717);
            if (var4 != null) {
                var4.method674(0, -this.field2720, 0);
                class41[] var5 = new class41[] { var3, var4 };
                var3 = new class41(var5, 2);
            }
        }
        if (this.field501.field2756 == 1) {
            var3.field305 = true;
        }
        return var3;
    }

    @ObfuscatedName("d.o(B)Z")
    public final boolean method821() {
        return this.field501 != null;
    }
}
