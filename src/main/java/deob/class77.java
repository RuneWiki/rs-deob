package deob;

@ObfuscatedName("bi")
public class class77 extends class215 {

    @ObfuscatedName("bi.a")
    public int field984;

    @ObfuscatedName("bi.f")
    public int field978;

    @ObfuscatedName("bi.c")
    public int field977;

    @ObfuscatedName("bi.x")
    public int field981;

    @ObfuscatedName("bi.h")
    public int field979;

    @ObfuscatedName("bi.j")
    public int field980;

    @ObfuscatedName("bi.y")
    public class197 field976;

    @ObfuscatedName("bi.d")
    public int field982;

    @ObfuscatedName("bi.n")
    public int field983;

    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class215 arg8) {
        this.field984 = arg0;
        this.field978 = arg1;
        this.field977 = arg2;
        this.field981 = arg3;
        this.field979 = arg4;
        this.field980 = arg5;
        if (arg6 != -1) {
            this.field976 = class197.method3143(arg6);
            this.field982 = 0;
            this.field983 = client.field503 - 1;
            if (this.field976.field2233 == 0 && arg8 != null && arg8 instanceof class77) {
                class77 var10 = (class77) arg8;
                if (this.field976 == var10.field976) {
                    this.field982 = var10.field982;
                    this.field983 = var10.field983;
                    return;
                }
            }
            if (arg7 && this.field976.field2232 != -1) {
                if (this.field976.method3576()) {
                    this.field982 = (int) (Math.random() * (double) this.field976.method3566());
                } else {
                    this.field982 = (int) (Math.random() * (double) this.field976.field2218.length);
                    this.field983 -= (int) (Math.random() * (double) this.field976.field2220[this.field982]);
                }
            }
        }
    }

    @ObfuscatedName("bi.f(I)Lha;")
    public final class221 method1929() {
        if (this.field976 != null) {
            int var1 = client.field503 - this.field983;
            if (var1 > 100 && this.field976.field2232 > 0) {
                var1 = 100;
            }
            if (this.field976.method3576()) {
                int var2 = this.field976.method3566();
                this.field982 += var1;
                var1 = 0;
                if (this.field982 >= var2) {
                    this.field982 = var2 - this.field976.field2232;
                    if (this.field982 < 0 || this.field982 > var2) {
                        this.field976 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field976.field2220[this.field982]) {
                                break label69;
                            }
                            var1 -= this.field976.field2220[this.field982];
                            this.field982++;
                        } while (this.field982 < this.field976.field2218.length);
                        this.field982 -= this.field976.field2232;
                    } while (this.field982 >= 0 && this.field982 < this.field976.field2218.length);
                    this.field976 = null;
                }
            }
            this.field983 = client.field503 - var1;
        }
        class194 var3 = class194.method2141(this.field984);
        if (var3.field2123 != null) {
            var3 = var3.method3418();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field977 == 1 || this.field977 == 3) {
            var4 = var3.field2098;
            var5 = var3.field2129;
        } else {
            var4 = var3.field2129;
            var5 = var3.field2098;
        }
        int var6 = (var4 >> 1) + this.field979;
        int var7 = (var4 + 1 >> 1) + this.field979;
        int var8 = (var5 >> 1) + this.field980;
        int var9 = (var5 + 1 >> 1) + this.field980;
        int[][] var10 = class79.field998[this.field981];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field979 << 7) + (var4 << 6);
        int var13 = (this.field980 << 7) + (var5 << 6);
        return var3.method3416(this.field978, this.field977, var10, var12, var11, var13, this.field976, this.field982);
    }
}
