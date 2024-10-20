package deob;

@ObfuscatedName("ax")
public class class50 extends class90 {

    @ObfuscatedName("ax.b")
    public int field963;

    @ObfuscatedName("ax.e")
    public int field961;

    @ObfuscatedName("ax.c")
    public int field962;

    @ObfuscatedName("ax.l")
    public int field971;

    @ObfuscatedName("ax.y")
    public int field964;

    @ObfuscatedName("ax.j")
    public int field965;

    @ObfuscatedName("ax.g")
    public class202 field968;

    @ObfuscatedName("ax.s")
    public int field966;

    @ObfuscatedName("ax.r")
    public int field972;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field963 = arg0;
        this.field961 = arg1;
        this.field962 = arg2;
        this.field971 = arg3;
        this.field964 = arg4;
        this.field965 = arg5;
        if (arg6 != -1) {
            this.field968 = class202.method17(arg6);
            this.field966 = 0;
            this.field972 = client.field489 - 1;
            if (this.field968.field3069 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field968 == var10.field968) {
                    this.field966 = var10.field966;
                    this.field972 = var10.field972;
                    return;
                }
            }
            if (arg7 && this.field968.field3065 != -1) {
                this.field966 = (int) (Math.random() * (double) this.field968.field3062.length);
                this.field972 -= (int) (Math.random() * (double) this.field968.field3067[this.field966]);
            }
        }
    }

    @ObfuscatedName("ax.c(B)Lco;")
    public final class83 method241() {
        if (this.field968 != null) {
            int var1 = client.field489 - this.field972;
            if (var1 > 100 && this.field968.field3065 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field968.field3067[this.field966]) {
                            break label47;
                        }
                        var1 -= this.field968.field3067[this.field966];
                        this.field966++;
                    } while (this.field966 < this.field968.field3062.length);
                    this.field966 -= this.field968.field3065;
                } while (this.field966 >= 0 && this.field966 < this.field968.field3062.length);
                this.field968 = null;
            }
            this.field972 = client.field489 - var1;
        }
        class198 var2 = class198.method1865(this.field963);
        if (var2.field2943 != null) {
            var2 = var2.method3445();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field962 == 1 || this.field962 == 3) {
            var3 = var2.field2918;
            var4 = var2.field2903;
        } else {
            var3 = var2.field2903;
            var4 = var2.field2918;
        }
        int var5 = (var3 >> 1) + this.field964;
        int var6 = (var3 + 1 >> 1) + this.field964;
        int var7 = (var4 >> 1) + this.field965;
        int var8 = (var4 + 1 >> 1) + this.field965;
        int[][] var9 = class11.field121[this.field971];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field964 << 7) + (var3 << 6);
        int var12 = (this.field965 << 7) + (var4 << 6);
        return var2.method3468(this.field961, this.field962, var9, var11, var10, var12, this.field968, this.field966);
    }
}
