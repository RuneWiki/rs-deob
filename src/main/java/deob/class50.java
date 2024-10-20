package deob;

@ObfuscatedName("aw")
public class class50 extends class90 {

    @ObfuscatedName("aw.x")
    public int field969;

    @ObfuscatedName("aw.j")
    public int field973;

    @ObfuscatedName("aw.c")
    public int field978;

    @ObfuscatedName("aw.d")
    public int field977;

    @ObfuscatedName("aw.w")
    public int field972;

    @ObfuscatedName("aw.h")
    public int field970;

    @ObfuscatedName("aw.u")
    public class202 field974;

    @ObfuscatedName("aw.k")
    public int field971;

    @ObfuscatedName("aw.g")
    public int field976;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field969 = arg0;
        this.field973 = arg1;
        this.field978 = arg2;
        this.field977 = arg3;
        this.field972 = arg4;
        this.field970 = arg5;
        if (arg6 != -1) {
            this.field974 = class202.method2997(arg6);
            this.field971 = 0;
            this.field976 = client.field320 - 1;
            if (this.field974.field3072 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field974 == var10.field974) {
                    this.field971 = var10.field971;
                    this.field976 = var10.field976;
                    return;
                }
            }
            if (arg7 && this.field974.field3063 != -1) {
                this.field971 = (int) (Math.random() * (double) this.field974.field3064.length);
                this.field976 -= (int) (Math.random() * (double) this.field974.field3061[this.field971]);
            }
        }
    }

    @ObfuscatedName("aw.c(S)Lcj;")
    public final class83 method247() {
        if (this.field974 != null) {
            int var1 = client.field320 - this.field976;
            if (var1 > 100 && this.field974.field3063 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field974.field3061[this.field971]) {
                            break label47;
                        }
                        var1 -= this.field974.field3061[this.field971];
                        this.field971++;
                    } while (this.field971 < this.field974.field3064.length);
                    this.field971 -= this.field974.field3063;
                } while (this.field971 >= 0 && this.field971 < this.field974.field3064.length);
                this.field974 = null;
            }
            this.field976 = client.field320 - var1;
        }
        class198 var2 = class198.method3366(this.field969);
        if (var2.field2935 != null) {
            var2 = var2.method3409();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field978 == 1 || this.field978 == 3) {
            var3 = var2.field2911;
            var4 = var2.field2910;
        } else {
            var3 = var2.field2910;
            var4 = var2.field2911;
        }
        int var5 = (var3 >> 1) + this.field972;
        int var6 = (var3 + 1 >> 1) + this.field972;
        int var7 = (var4 >> 1) + this.field970;
        int var8 = (var4 + 1 >> 1) + this.field970;
        int[][] var9 = class11.field131[this.field977];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field972 << 7) + (var3 << 6);
        int var12 = (this.field970 << 7) + (var4 << 6);
        return var2.method3402(this.field973, this.field978, var9, var11, var10, var12, this.field974, this.field971);
    }
}
