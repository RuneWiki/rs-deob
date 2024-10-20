package deob;

@ObfuscatedName("az")
public class class50 extends class90 {

    @ObfuscatedName("az.b")
    public int field944;

    @ObfuscatedName("az.l")
    public int field942;

    @ObfuscatedName("az.i")
    public int field943;

    @ObfuscatedName("az.t")
    public int field947;

    @ObfuscatedName("az.k")
    public int field946;

    @ObfuscatedName("az.h")
    public int field952;

    @ObfuscatedName("az.n")
    public class202 field948;

    @ObfuscatedName("az.f")
    public int field949;

    @ObfuscatedName("az.a")
    public int field950;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field944 = arg0;
        this.field942 = arg1;
        this.field943 = arg2;
        this.field947 = arg3;
        this.field946 = arg4;
        this.field952 = arg5;
        if (arg6 != -1) {
            this.field948 = class202.method262(arg6);
            this.field949 = 0;
            this.field950 = client.field293 - 1;
            if (this.field948.field3063 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field948 == var10.field948) {
                    this.field949 = var10.field949;
                    this.field950 = var10.field950;
                    return;
                }
            }
            if (arg7 && this.field948.field3069 != -1) {
                this.field949 = (int) (Math.random() * (double) this.field948.field3073.length);
                this.field950 -= (int) (Math.random() * (double) this.field948.field3067[this.field949]);
            }
        }
    }

    @ObfuscatedName("az.i(B)Lcs;")
    public final class83 method226() {
        if (this.field948 != null) {
            int var1 = client.field293 - this.field950;
            if (var1 > 100 && this.field948.field3069 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field948.field3067[this.field949]) {
                            break label47;
                        }
                        var1 -= this.field948.field3067[this.field949];
                        this.field949++;
                    } while (this.field949 < this.field948.field3073.length);
                    this.field949 -= this.field948.field3069;
                } while (this.field949 >= 0 && this.field949 < this.field948.field3073.length);
                this.field948 = null;
            }
            this.field950 = client.field293 - var1;
        }
        class198 var2 = class198.method3471(this.field944);
        if (var2.field2939 != null) {
            var2 = var2.method3484();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field943 == 1 || this.field943 == 3) {
            var3 = var2.field2914;
            var4 = var2.field2913;
        } else {
            var3 = var2.field2913;
            var4 = var2.field2914;
        }
        int var5 = (var3 >> 1) + this.field946;
        int var6 = (var3 + 1 >> 1) + this.field946;
        int var7 = (var4 >> 1) + this.field952;
        int var8 = (var4 + 1 >> 1) + this.field952;
        int[][] var9 = class11.field99[this.field947];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field946 << 7) + (var3 << 6);
        int var12 = (this.field952 << 7) + (var4 << 6);
        return var2.method3482(this.field942, this.field943, var9, var11, var10, var12, this.field948, this.field949);
    }
}
