package deob;

@ObfuscatedName("bo")
public class class73 extends class205 {

    @ObfuscatedName("bo.s")
    public int field963;

    @ObfuscatedName("bo.h")
    public int field958;

    @ObfuscatedName("bo.w")
    public int field959;

    @ObfuscatedName("bo.v")
    public int field960;

    @ObfuscatedName("bo.c")
    public int field961;

    @ObfuscatedName("bo.q")
    public int field957;

    @ObfuscatedName("bo.i")
    public class190 field966;

    @ObfuscatedName("bo.k")
    public int field964;

    @ObfuscatedName("bo.o")
    public int field965;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class205 arg8) {
        this.field963 = arg0;
        this.field958 = arg1;
        this.field959 = arg2;
        this.field960 = arg3;
        this.field961 = arg4;
        this.field957 = arg5;
        if (arg6 != -1) {
            this.field966 = class190.method5853(arg6);
            this.field964 = 0;
            this.field965 = client.field487 - 1;
            if (this.field966.field2182 == 0 && arg8 != null && arg8 instanceof class73) {
                class73 var10 = (class73) arg8;
                if (this.field966 == var10.field966) {
                    this.field964 = var10.field964;
                    this.field965 = var10.field965;
                    return;
                }
            }
            if (arg7 && this.field966.field2171 != -1) {
                if (this.field966.method3388()) {
                    this.field964 = (int) (Math.random() * (double) this.field966.method3392());
                } else {
                    this.field964 = (int) (Math.random() * (double) this.field966.field2167.length);
                    this.field965 -= (int) (Math.random() * (double) this.field966.field2164[this.field964]);
                }
            }
        }
    }

    @ObfuscatedName("bo.h(B)Lhp;")
    public final class211 method1748() {
        if (this.field966 != null) {
            int var1 = client.field487 - this.field965;
            if (var1 > 100 && this.field966.field2171 > 0) {
                var1 = 100;
            }
            if (this.field966.method3388()) {
                int var2 = this.field966.method3392();
                this.field964 += var1;
                var1 = 0;
                if (this.field964 >= var2) {
                    this.field964 = var2 - this.field966.field2171;
                    if (this.field964 < 0 || this.field964 > var2) {
                        this.field966 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field966.field2164[this.field964]) {
                                break label69;
                            }
                            var1 -= this.field966.field2164[this.field964];
                            this.field964++;
                        } while (this.field964 < this.field966.field2167.length);
                        this.field964 -= this.field966.field2171;
                    } while (this.field964 >= 0 && this.field964 < this.field966.field2167.length);
                    this.field966 = null;
                }
            }
            this.field965 = client.field487 - var1;
        }
        class187 var3 = class187.method2907(this.field963);
        if (var3.field2077 != null) {
            var3 = var3.method3247();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field959 == 1 || this.field959 == 3) {
            var4 = var3.field2052;
            var5 = var3.field2051;
        } else {
            var4 = var3.field2051;
            var5 = var3.field2052;
        }
        int var6 = (var4 >> 1) + this.field961;
        int var7 = (var4 + 1 >> 1) + this.field961;
        int var8 = (var5 >> 1) + this.field957;
        int var9 = (var5 + 1 >> 1) + this.field957;
        int[][] var10 = class75.field985[this.field960];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field961 << 7) + (var4 << 6);
        int var13 = (this.field957 << 7) + (var5 << 6);
        return var3.method3252(this.field958, this.field959, var10, var12, var11, var13, this.field966, this.field964);
    }
}
