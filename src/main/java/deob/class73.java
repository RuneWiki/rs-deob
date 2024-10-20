package deob;

@ObfuscatedName("bm")
public class class73 extends class206 {

    @ObfuscatedName("bm.o")
    public int field968;

    @ObfuscatedName("bm.q")
    public int field963;

    @ObfuscatedName("bm.l")
    public int field964;

    @ObfuscatedName("bm.k")
    public int field962;

    @ObfuscatedName("bm.a")
    public int field966;

    @ObfuscatedName("bm.m")
    public int field967;

    @ObfuscatedName("bm.p")
    public class191 field965;

    @ObfuscatedName("bm.s")
    public int field969;

    @ObfuscatedName("bm.r")
    public int field970;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class206 arg8) {
        this.field968 = arg0;
        this.field963 = arg1;
        this.field964 = arg2;
        this.field962 = arg3;
        this.field966 = arg4;
        this.field967 = arg5;
        if (arg6 != -1) {
            this.field965 = class191.method2497(arg6);
            this.field969 = 0;
            this.field970 = client.field631 - 1;
            if (this.field965.field2209 == 0 && arg8 != null && arg8 instanceof class73) {
                class73 var10 = (class73) arg8;
                if (this.field965 == var10.field965) {
                    this.field969 = var10.field969;
                    this.field970 = var10.field970;
                    return;
                }
            }
            if (arg7 && this.field965.field2217 != -1) {
                if (this.field965.method3417()) {
                    this.field969 = (int) (Math.random() * (double) this.field965.method3434());
                } else {
                    this.field969 = (int) (Math.random() * (double) this.field965.field2213.length);
                    this.field970 -= (int) (Math.random() * (double) this.field965.field2215[this.field969]);
                }
            }
        }
    }

    @ObfuscatedName("bm.q(I)Lhv;")
    public final class212 method1774() {
        if (this.field965 != null) {
            int var1 = client.field631 - this.field970;
            if (var1 > 100 && this.field965.field2217 > 0) {
                var1 = 100;
            }
            if (this.field965.method3417()) {
                int var2 = this.field965.method3434();
                this.field969 += var1;
                var1 = 0;
                if (this.field969 >= var2) {
                    this.field969 = var2 - this.field965.field2217;
                    if (this.field969 < 0 || this.field969 > var2) {
                        this.field965 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field965.field2215[this.field969]) {
                                break label69;
                            }
                            var1 -= this.field965.field2215[this.field969];
                            this.field969++;
                        } while (this.field969 < this.field965.field2213.length);
                        this.field969 -= this.field965.field2217;
                    } while (this.field969 >= 0 && this.field969 < this.field965.field2213.length);
                    this.field965 = null;
                }
            }
            this.field970 = client.field631 - var1;
        }
        class188 var3 = class188.method1989(this.field968);
        if (var3.field2092 != null) {
            var3 = var3.method3299();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field964 == 1 || this.field964 == 3) {
            var4 = var3.field2096;
            var5 = var3.field2095;
        } else {
            var4 = var3.field2095;
            var5 = var3.field2096;
        }
        int var6 = (var4 >> 1) + this.field966;
        int var7 = (var4 + 1 >> 1) + this.field966;
        int var8 = (var5 >> 1) + this.field967;
        int var9 = (var5 + 1 >> 1) + this.field967;
        int[][] var10 = class75.field985[this.field962];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field966 << 7) + (var4 << 6);
        int var13 = (this.field967 << 7) + (var5 << 6);
        return var3.method3267(this.field963, this.field964, var10, var12, var11, var13, this.field965, this.field969);
    }
}
