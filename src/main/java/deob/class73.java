package deob;

@ObfuscatedName("bb")
public class class73 extends class206 {

    @ObfuscatedName("bb.c")
    public int field980;

    @ObfuscatedName("bb.p")
    public int field987;

    @ObfuscatedName("bb.f")
    public int field981;

    @ObfuscatedName("bb.n")
    public int field982;

    @ObfuscatedName("bb.k")
    public int field983;

    @ObfuscatedName("bb.w")
    public int field984;

    @ObfuscatedName("bb.s")
    public class191 field985;

    @ObfuscatedName("bb.q")
    public int field979;

    @ObfuscatedName("bb.m")
    public int field986;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class206 arg8) {
        this.field980 = arg0;
        this.field987 = arg1;
        this.field981 = arg2;
        this.field982 = arg3;
        this.field983 = arg4;
        this.field984 = arg5;
        if (arg6 != -1) {
            this.field985 = class191.method22(arg6);
            this.field979 = 0;
            this.field986 = client.field504 - 1;
            if (this.field985.field2220 == 0 && arg8 != null && arg8 instanceof class73) {
                class73 var10 = (class73) arg8;
                if (this.field985 == var10.field985) {
                    this.field979 = var10.field979;
                    this.field986 = var10.field986;
                    return;
                }
            }
            if (arg7 && this.field985.field2209 != -1) {
                if (this.field985.method3578()) {
                    this.field979 = (int) (Math.random() * (double) this.field985.method3583());
                } else {
                    this.field979 = (int) (Math.random() * (double) this.field985.field2205.length);
                    this.field986 -= (int) (Math.random() * (double) this.field985.field2221[this.field979]);
                }
            }
        }
    }

    @ObfuscatedName("bb.p(B)Lha;")
    public final class212 method1926() {
        if (this.field985 != null) {
            int var1 = client.field504 - this.field986;
            if (var1 > 100 && this.field985.field2209 > 0) {
                var1 = 100;
            }
            if (this.field985.method3578()) {
                int var2 = this.field985.method3583();
                this.field979 += var1;
                var1 = 0;
                if (this.field979 >= var2) {
                    this.field979 = var2 - this.field985.field2209;
                    if (this.field979 < 0 || this.field979 > var2) {
                        this.field985 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field985.field2221[this.field979]) {
                                break label69;
                            }
                            var1 -= this.field985.field2221[this.field979];
                            this.field979++;
                        } while (this.field979 < this.field985.field2205.length);
                        this.field979 -= this.field985.field2209;
                    } while (this.field979 >= 0 && this.field979 < this.field985.field2205.length);
                    this.field985 = null;
                }
            }
            this.field986 = client.field504 - var1;
        }
        class188 var3 = Statics.method5147(this.field980);
        if (var3.field2111 != null) {
            var3 = var3.method3424();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field981 == 1 || this.field981 == 3) {
            var4 = var3.field2086;
            var5 = var3.field2073;
        } else {
            var4 = var3.field2073;
            var5 = var3.field2086;
        }
        int var6 = (var4 >> 1) + this.field983;
        int var7 = (var4 + 1 >> 1) + this.field983;
        int var8 = (var5 >> 1) + this.field984;
        int var9 = (var5 + 1 >> 1) + this.field984;
        int[][] var10 = class75.field998[this.field982];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field983 << 7) + (var4 << 6);
        int var13 = (this.field984 << 7) + (var5 << 6);
        return var3.method3423(this.field987, this.field981, var10, var12, var11, var13, this.field985, this.field979);
    }
}
