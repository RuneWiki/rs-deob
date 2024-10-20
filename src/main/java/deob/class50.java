package deob;

@ObfuscatedName("ar")
public class class50 extends class90 {

    @ObfuscatedName("ar.n")
    public int field951;

    @ObfuscatedName("ar.d")
    public int field945;

    @ObfuscatedName("ar.m")
    public int field944;

    @ObfuscatedName("ar.h")
    public int field946;

    @ObfuscatedName("ar.w")
    public int field948;

    @ObfuscatedName("ar.r")
    public int field947;

    @ObfuscatedName("ar.c")
    public class202 field950;

    @ObfuscatedName("ar.p")
    public int field953;

    @ObfuscatedName("ar.g")
    public int field952;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field951 = arg0;
        this.field945 = arg1;
        this.field944 = arg2;
        this.field946 = arg3;
        this.field948 = arg4;
        this.field947 = arg5;
        if (arg6 != -1) {
            this.field950 = class202.method119(arg6);
            this.field953 = 0;
            this.field952 = client.field295 - 1;
            if (this.field950.field3061 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field950 == var10.field950) {
                    this.field953 = var10.field953;
                    this.field952 = var10.field952;
                    return;
                }
            }
            if (arg7 && this.field950.field3062 != -1) {
                this.field953 = (int) (Math.random() * (double) this.field950.field3048.length);
                this.field952 -= (int) (Math.random() * (double) this.field950.field3051[this.field953]);
            }
        }
    }

    @ObfuscatedName("ar.m(I)Lca;")
    public final class83 method233() {
        if (this.field950 != null) {
            int var1 = client.field295 - this.field952;
            if (var1 > 100 && this.field950.field3062 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field950.field3051[this.field953]) {
                            break label47;
                        }
                        var1 -= this.field950.field3051[this.field953];
                        this.field953++;
                    } while (this.field953 < this.field950.field3048.length);
                    this.field953 -= this.field950.field3062;
                } while (this.field953 >= 0 && this.field953 < this.field950.field3048.length);
                this.field950 = null;
            }
            this.field952 = client.field295 - var1;
        }
        class198 var2 = class198.method197(this.field951);
        if (var2.field2918 != null) {
            var2 = var2.method3415();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field944 == 1 || this.field944 == 3) {
            var3 = var2.field2908;
            var4 = var2.field2904;
        } else {
            var3 = var2.field2904;
            var4 = var2.field2908;
        }
        int var5 = (var3 >> 1) + this.field948;
        int var6 = (var3 + 1 >> 1) + this.field948;
        int var7 = (var4 >> 1) + this.field947;
        int var8 = (var4 + 1 >> 1) + this.field947;
        int[][] var9 = class12.field111[this.field946];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field948 << 7) + (var3 << 6);
        int var12 = (this.field947 << 7) + (var4 << 6);
        return var2.method3413(this.field945, this.field944, var9, var11, var10, var12, this.field950, this.field953);
    }
}
