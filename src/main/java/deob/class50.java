package deob;

@ObfuscatedName("ae")
public class class50 extends class90 {

    @ObfuscatedName("ae.u")
    public int field949;

    @ObfuscatedName("ae.x")
    public int field943;

    @ObfuscatedName("ae.i")
    public int field942;

    @ObfuscatedName("ae.a")
    public int field945;

    @ObfuscatedName("ae.f")
    public int field946;

    @ObfuscatedName("ae.c")
    public int field947;

    @ObfuscatedName("ae.d")
    public class202 field948;

    @ObfuscatedName("ae.l")
    public int field956;

    @ObfuscatedName("ae.g")
    public int field954;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field949 = arg0;
        this.field943 = arg1;
        this.field942 = arg2;
        this.field945 = arg3;
        this.field946 = arg4;
        this.field947 = arg5;
        if (arg6 != -1) {
            this.field948 = class202.method3327(arg6);
            this.field956 = 0;
            this.field954 = client.field291 - 1;
            if (this.field948.field3054 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field948 == var10.field948) {
                    this.field956 = var10.field956;
                    this.field954 = var10.field954;
                    return;
                }
            }
            if (arg7 && this.field948.field3046 != -1) {
                this.field956 = (int) (Math.random() * (double) this.field948.field3042.length);
                this.field954 -= (int) (Math.random() * (double) this.field948.field3049[this.field956]);
            }
        }
    }

    @ObfuscatedName("ae.i(B)Lcs;")
    public final class83 method217() {
        if (this.field948 != null) {
            int var1 = client.field291 - this.field954;
            if (var1 > 100 && this.field948.field3046 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field948.field3049[this.field956]) {
                            break label47;
                        }
                        var1 -= this.field948.field3049[this.field956];
                        this.field956++;
                    } while (this.field956 < this.field948.field3042.length);
                    this.field956 -= this.field948.field3046;
                } while (this.field956 >= 0 && this.field956 < this.field948.field3042.length);
                this.field948 = null;
            }
            this.field954 = client.field291 - var1;
        }
        class198 var2 = class198.method1443(this.field949);
        if (var2.field2912 != null) {
            var2 = var2.method3420();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field942 == 1 || this.field942 == 3) {
            var3 = var2.field2932;
            var4 = var2.field2896;
        } else {
            var3 = var2.field2896;
            var4 = var2.field2932;
        }
        int var5 = (var3 >> 1) + this.field946;
        int var6 = (var3 + 1 >> 1) + this.field946;
        int var7 = (var4 >> 1) + this.field947;
        int var8 = (var4 + 1 >> 1) + this.field947;
        int[][] var9 = class11.field104[this.field945];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field946 << 7) + (var3 << 6);
        int var12 = (this.field947 << 7) + (var4 << 6);
        return var2.method3407(this.field943, this.field942, var9, var11, var10, var12, this.field948, this.field956);
    }
}
