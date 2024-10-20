package deob;

@ObfuscatedName("bc")
public class class73 extends class198 {

    @ObfuscatedName("bc.c")
    public int field985;

    @ObfuscatedName("bc.l")
    public int field978;

    @ObfuscatedName("bc.s")
    public int field979;

    @ObfuscatedName("bc.e")
    public int field980;

    @ObfuscatedName("bc.r")
    public int field981;

    @ObfuscatedName("bc.o")
    public int field982;

    @ObfuscatedName("bc.i")
    public class183 field983;

    @ObfuscatedName("bc.w")
    public int field984;

    @ObfuscatedName("bc.v")
    public int field977;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class198 arg8) {
        this.field985 = arg0;
        this.field978 = arg1;
        this.field979 = arg2;
        this.field980 = arg3;
        this.field981 = arg4;
        this.field982 = arg5;
        if (arg6 != -1) {
            this.field983 = class183.method1980(arg6);
            this.field984 = 0;
            this.field977 = client.field682 - 1;
            if (this.field983.field2110 == 0 && arg8 != null && arg8 instanceof class73) {
                class73 var10 = (class73) arg8;
                if (this.field983 == var10.field983) {
                    this.field984 = var10.field984;
                    this.field977 = var10.field977;
                    return;
                }
            }
            if (arg7 && this.field983.field2111 != -1) {
                if (this.field983.method3284()) {
                    this.field984 = (int) (Math.random() * (double) this.field983.method3321());
                } else {
                    this.field984 = (int) (Math.random() * (double) this.field983.field2107.length);
                    this.field977 -= (int) (Math.random() * (double) this.field983.field2094[this.field984]);
                }
            }
        }
    }

    @ObfuscatedName("bc.l(B)Lgf;")
    public final class204 method1790() {
        if (this.field983 != null) {
            int var1 = client.field682 - this.field977;
            if (var1 > 100 && this.field983.field2111 > 0) {
                var1 = 100;
            }
            if (this.field983.method3284()) {
                int var2 = this.field983.method3321();
                this.field984 += var1;
                var1 = 0;
                if (this.field984 >= var2) {
                    this.field984 = var2 - this.field983.field2111;
                    if (this.field984 < 0 || this.field984 > var2) {
                        this.field983 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field983.field2094[this.field984]) {
                                break label69;
                            }
                            var1 -= this.field983.field2094[this.field984];
                            this.field984++;
                        } while (this.field984 < this.field983.field2107.length);
                        this.field984 -= this.field983.field2111;
                    } while (this.field984 >= 0 && this.field984 < this.field983.field2107.length);
                    this.field983 = null;
                }
            }
            this.field977 = client.field682 - var1;
        }
        class180 var3 = class180.method3056(this.field985);
        if (var3.field2010 != null) {
            var3 = var3.method3151();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field979 == 1 || this.field979 == 3) {
            var4 = var3.field1985;
            var5 = var3.field1995;
        } else {
            var4 = var3.field1995;
            var5 = var3.field1985;
        }
        int var6 = (var4 >> 1) + this.field981;
        int var7 = (var4 + 1 >> 1) + this.field981;
        int var8 = (var5 >> 1) + this.field982;
        int var9 = (var5 + 1 >> 1) + this.field982;
        int[][] var10 = class75.field1005[this.field980];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field981 << 7) + (var4 << 6);
        int var13 = (this.field982 << 7) + (var5 << 6);
        return var3.method3181(this.field978, this.field979, var10, var12, var11, var13, this.field983, this.field984);
    }
}
