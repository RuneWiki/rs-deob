package deob;

@ObfuscatedName("bc")
public class class73 extends class235 {

    @ObfuscatedName("bc.v")
    public int field969;

    @ObfuscatedName("bc.c")
    public int field975;

    @ObfuscatedName("bc.i")
    public int field970;

    @ObfuscatedName("bc.f")
    public int field973;

    @ObfuscatedName("bc.b")
    public int field971;

    @ObfuscatedName("bc.n")
    public int field974;

    @ObfuscatedName("bc.s")
    public class191 field972;

    @ObfuscatedName("bc.l")
    public int field976;

    @ObfuscatedName("bc.q")
    public int field977;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class235 arg8) {
        this.field969 = arg0;
        this.field975 = arg1;
        this.field970 = arg2;
        this.field973 = arg3;
        this.field971 = arg4;
        this.field974 = arg5;
        if (arg6 != -1) {
            this.field972 = class191.method3011(arg6);
            this.field976 = 0;
            this.field977 = client.field507 - 1;
            if (this.field972.field2162 == 0 && arg8 != null && arg8 instanceof class73) {
                class73 var10 = (class73) arg8;
                if (this.field972 == var10.field972) {
                    this.field976 = var10.field976;
                    this.field977 = var10.field977;
                    return;
                }
            }
            if (arg7 && this.field972.field2154 != -1) {
                if (this.field972.method3462()) {
                    this.field976 = (int) (Math.random() * (double) this.field972.method3507());
                } else {
                    this.field976 = (int) (Math.random() * (double) this.field972.field2148.length);
                    this.field977 -= (int) (Math.random() * (double) this.field972.field2150[this.field976]);
                }
            }
        }
    }

    @ObfuscatedName("bc.c(B)Liq;")
    public final class241 method1809() {
        if (this.field972 != null) {
            int var1 = client.field507 - this.field977;
            if (var1 > 100 && this.field972.field2154 > 0) {
                var1 = 100;
            }
            if (this.field972.method3462()) {
                int var2 = this.field972.method3507();
                this.field976 += var1;
                var1 = 0;
                if (this.field976 >= var2) {
                    this.field976 = var2 - this.field972.field2154;
                    if (this.field976 < 0 || this.field976 > var2) {
                        this.field972 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field972.field2150[this.field976]) {
                                break label69;
                            }
                            var1 -= this.field972.field2150[this.field976];
                            this.field976++;
                        } while (this.field976 < this.field972.field2148.length);
                        this.field976 -= this.field972.field2154;
                    } while (this.field976 >= 0 && this.field976 < this.field972.field2148.length);
                    this.field972 = null;
                }
            }
            this.field977 = client.field507 - var1;
        }
        class188 var3 = class188.method2828(this.field969);
        if (var3.field2062 != null) {
            var3 = var3.method3333();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field970 == 1 || this.field970 == 3) {
            var4 = var3.field2057;
            var5 = var3.field2031;
        } else {
            var4 = var3.field2031;
            var5 = var3.field2057;
        }
        int var6 = (var4 >> 1) + this.field971;
        int var7 = (var4 + 1 >> 1) + this.field971;
        int var8 = (var5 >> 1) + this.field974;
        int var9 = (var5 + 1 >> 1) + this.field974;
        int[][] var10 = class75.field988[this.field973];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field971 << 7) + (var4 << 6);
        int var13 = (this.field974 << 7) + (var5 << 6);
        return var3.method3331(this.field975, this.field970, var10, var12, var11, var13, this.field972, this.field976);
    }
}
