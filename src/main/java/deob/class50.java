package deob;

@ObfuscatedName("at")
public class class50 extends class90 {

    @ObfuscatedName("at.p")
    public int field966;

    @ObfuscatedName("at.g")
    public int field955;

    @ObfuscatedName("at.x")
    public int field956;

    @ObfuscatedName("at.q")
    public int field957;

    @ObfuscatedName("at.d")
    public int field958;

    @ObfuscatedName("at.k")
    public int field954;

    @ObfuscatedName("at.j")
    public class202 field959;

    @ObfuscatedName("at.s")
    public int field961;

    @ObfuscatedName("at.o")
    public int field968;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field966 = arg0;
        this.field955 = arg1;
        this.field956 = arg2;
        this.field957 = arg3;
        this.field958 = arg4;
        this.field954 = arg5;
        if (arg6 != -1) {
            this.field959 = class202.method2533(arg6);
            this.field961 = 0;
            this.field968 = client.field289 - 1;
            if (this.field959.field3063 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field959 == var10.field959) {
                    this.field961 = var10.field961;
                    this.field968 = var10.field968;
                    return;
                }
            }
            if (arg7 && this.field959.field3054 != -1) {
                this.field961 = (int) (Math.random() * (double) this.field959.field3050.length);
                this.field968 -= (int) (Math.random() * (double) this.field959.field3061[this.field961]);
            }
        }
    }

    @ObfuscatedName("at.x(I)Lcw;")
    public final class83 method223() {
        if (this.field959 != null) {
            int var1 = client.field289 - this.field968;
            if (var1 > 100 && this.field959.field3054 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field959.field3061[this.field961]) {
                            break label47;
                        }
                        var1 -= this.field959.field3061[this.field961];
                        this.field961++;
                    } while (this.field961 < this.field959.field3050.length);
                    this.field961 -= this.field959.field3054;
                } while (this.field961 >= 0 && this.field961 < this.field959.field3050.length);
                this.field959 = null;
            }
            this.field968 = client.field289 - var1;
        }
        class198 var2 = class198.method3716(this.field966);
        if (var2.field2896 != null) {
            var2 = var2.method3357();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field956 == 1 || this.field956 == 3) {
            var3 = var2.field2906;
            var4 = var2.field2917;
        } else {
            var3 = var2.field2917;
            var4 = var2.field2906;
        }
        int var5 = (var3 >> 1) + this.field958;
        int var6 = (var3 + 1 >> 1) + this.field958;
        int var7 = (var4 >> 1) + this.field954;
        int var8 = (var4 + 1 >> 1) + this.field954;
        int[][] var9 = class11.field94[this.field957];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field958 << 7) + (var3 << 6);
        int var12 = (this.field954 << 7) + (var4 << 6);
        return var2.method3355(this.field955, this.field956, var9, var11, var10, var12, this.field959, this.field961);
    }
}
