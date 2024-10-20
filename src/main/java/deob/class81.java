package deob;

@ObfuscatedName("do")
public class class81 extends class278 {

    @ObfuscatedName("do.aq")
    public int field1041;

    @ObfuscatedName("do.aw")
    public int field1033;

    @ObfuscatedName("do.al")
    public int field1034;

    @ObfuscatedName("do.ai")
    public int field1038;

    @ObfuscatedName("do.ar")
    public int field1036;

    @ObfuscatedName("do.as")
    public int field1037;

    @ObfuscatedName("do.aa")
    public class207 field1040;

    @ObfuscatedName("do.az")
    public int field1039;

    @ObfuscatedName("do.ao")
    public int field1032;

    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class278 arg8) {
        this.field1041 = arg0;
        this.field1033 = arg1;
        this.field1034 = arg2;
        this.field1038 = arg3;
        this.field1036 = arg4;
        this.field1037 = arg5;
        if (arg6 != -1) {
            this.field1040 = class207.method3902(arg6);
            this.field1039 = 0;
            this.field1032 = client.field536 - 1;
            if (this.field1040.field2273 == 0 && arg8 != null && arg8 instanceof class81) {
                class81 var10 = (class81) arg8;
                if (this.field1040 == var10.field1040) {
                    this.field1039 = var10.field1039;
                    this.field1032 = var10.field1032;
                    return;
                }
            }
            if (arg7 && this.field1040.field2247 != -1) {
                if (this.field1040.method3731()) {
                    this.field1039 = (int) (Math.random() * (double) this.field1040.method3732());
                } else {
                    this.field1039 = (int) (Math.random() * (double) this.field1040.field2259.length);
                    this.field1032 -= (int) (Math.random() * (double) this.field1040.field2257[this.field1039]);
                }
            }
        }
    }

    @ObfuscatedName("do.aw(I)Lkz;")
    public final class285 method2016() {
        if (this.field1040 != null) {
            int var1 = client.field536 - this.field1032;
            if (var1 > 100 && this.field1040.field2247 > 0) {
                var1 = 100;
            }
            if (this.field1040.method3731()) {
                int var2 = this.field1040.method3732();
                this.field1039 += var1;
                var1 = 0;
                if (this.field1039 >= var2) {
                    this.field1039 = var2 - this.field1040.field2247;
                    if (this.field1039 < 0 || this.field1039 > var2) {
                        this.field1040 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field1040.field2257[this.field1039]) {
                                break label69;
                            }
                            var1 -= this.field1040.field2257[this.field1039];
                            this.field1039++;
                        } while (this.field1039 < this.field1040.field2259.length);
                        this.field1039 -= this.field1040.field2247;
                    } while (this.field1039 >= 0 && this.field1039 < this.field1040.field2259.length);
                    this.field1040 = null;
                }
            }
            this.field1032 = client.field536 - var1;
        }
        class204 var3 = class204.method2849(this.field1041);
        if (var3.field2159 != null) {
            var3 = var3.method3597();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field1034 == 1 || this.field1034 == 3) {
            var4 = var3.field2134;
            var5 = var3.field2133;
        } else {
            var4 = var3.field2133;
            var5 = var3.field2134;
        }
        int var6 = (var4 >> 1) + this.field1036;
        int var7 = (var4 + 1 >> 1) + this.field1036;
        int var8 = (var5 >> 1) + this.field1037;
        int var9 = (var5 + 1 >> 1) + this.field1037;
        int[][] var10 = class83.field1049[this.field1038];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field1036 << 7) + (var4 << 6);
        int var13 = (this.field1037 << 7) + (var5 << 6);
        return var3.method3596(this.field1033, this.field1034, var10, var12, var11, var13, this.field1040, this.field1039);
    }
}
