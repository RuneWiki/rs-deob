package deob;

@ObfuscatedName("dx")
public class class82 extends class247 {

    @ObfuscatedName("dx.ac")
    public int field1019;

    @ObfuscatedName("dx.al")
    public int field1015;

    @ObfuscatedName("dx.ak")
    public int field1016;

    @ObfuscatedName("dx.ax")
    public int field1018;

    @ObfuscatedName("dx.ao")
    public int field1017;

    @ObfuscatedName("dx.ah")
    public int field1020;

    @ObfuscatedName("dx.ar")
    public class223 field1021;

    @ObfuscatedName("dx.ab")
    public int field1022;

    @ObfuscatedName("dx.am")
    public int field1023;

    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class247 arg8) {
        this.field1019 = arg0;
        this.field1015 = arg1;
        this.field1016 = arg2;
        this.field1018 = arg3;
        this.field1017 = arg4;
        this.field1020 = arg5;
        if (arg6 != -1) {
            this.field1021 = class223.method687(arg6);
            this.field1022 = 0;
            this.field1023 = client.field533 - 1;
            if (this.field1021.field2341 == 0 && arg8 != null && arg8 instanceof class82) {
                class82 var10 = (class82) arg8;
                if (this.field1021 == var10.field1021) {
                    this.field1022 = var10.field1022;
                    this.field1023 = var10.field1023;
                    return;
                }
            }
            if (arg7 && this.field1021.field2330 != -1) {
                if (this.field1021.method3851()) {
                    this.field1022 = (int) (Math.random() * (double) this.field1021.method3860());
                } else {
                    this.field1022 = (int) (Math.random() * (double) this.field1021.field2326.length);
                    this.field1023 -= (int) (Math.random() * (double) this.field1021.field2313[this.field1022]);
                }
            }
        }
    }

    @ObfuscatedName("dx.al(B)Ljn;")
    public final class254 method2007() {
        if (this.field1021 != null) {
            int var1 = client.field533 - this.field1023;
            if (var1 > 100 && this.field1021.field2330 > 0) {
                var1 = 100;
            }
            if (this.field1021.method3851()) {
                int var2 = this.field1021.method3860();
                this.field1022 += var1;
                var1 = 0;
                if (this.field1022 >= var2) {
                    this.field1022 = var2 - this.field1021.field2330;
                    if (this.field1022 < 0 || this.field1022 > var2) {
                        this.field1021 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field1021.field2313[this.field1022]) {
                                break label69;
                            }
                            var1 -= this.field1021.field2313[this.field1022];
                            this.field1022++;
                        } while (this.field1022 < this.field1021.field2326.length);
                        this.field1022 -= this.field1021.field2330;
                    } while (this.field1022 >= 0 && this.field1022 < this.field1021.field2326.length);
                    this.field1021 = null;
                }
            }
            this.field1023 = client.field533 - var1;
        }
        class220 var3 = Statics.method2243(this.field1019);
        if (var3.field2232 != null) {
            var3 = var3.method3696();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field1016 == 1 || this.field1016 == 3) {
            var4 = var3.field2207;
            var5 = var3.field2206;
        } else {
            var4 = var3.field2206;
            var5 = var3.field2207;
        }
        int var6 = (var4 >> 1) + this.field1017;
        int var7 = (var4 + 1 >> 1) + this.field1017;
        int var8 = (var5 >> 1) + this.field1020;
        int var9 = (var5 + 1 >> 1) + this.field1020;
        int[][] var10 = class84.field1042[this.field1018];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field1017 << 7) + (var4 << 6);
        int var13 = (this.field1020 << 7) + (var5 << 6);
        return var3.method3694(this.field1015, this.field1016, var10, var12, var11, var13, this.field1021, this.field1022);
    }
}
