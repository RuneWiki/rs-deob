package deob;

@ObfuscatedName("dr")
public class class82 extends class256 {

    @ObfuscatedName("dr.ak")
    public class102 field1037;

    @ObfuscatedName("dr.al")
    public int field1030;

    @ObfuscatedName("dr.aj")
    public int field1031;

    @ObfuscatedName("dr.az")
    public int field1038;

    @ObfuscatedName("dr.af")
    public int field1033;

    @ObfuscatedName("dr.aa")
    public int field1032;

    @ObfuscatedName("dr.at")
    public int field1035;

    @ObfuscatedName("dr.ab")
    public class227 field1036;

    @ObfuscatedName("dr.ac")
    public int field1029;

    @ObfuscatedName("dr.ao")
    public int field1034;

    public class82(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class256 arg9) {
        this.field1037 = arg0;
        this.field1030 = arg1;
        this.field1031 = arg2;
        this.field1038 = arg3;
        this.field1033 = arg4;
        this.field1032 = arg5;
        this.field1035 = arg6;
        if (arg7 != -1) {
            this.field1036 = class227.method4744(arg7);
            this.field1029 = 0;
            this.field1034 = client.field821 - 1;
            if (this.field1036.field2434 == 0 && arg9 != null && arg9 instanceof class82) {
                class82 var11 = (class82) arg9;
                if (this.field1036 == var11.field1036) {
                    this.field1029 = var11.field1029;
                    this.field1034 = var11.field1034;
                    return;
                }
            }
            if (arg8 && this.field1036.field2425 != -1) {
                if (this.field1036.method4051()) {
                    this.field1029 = (int) (Math.random() * (double) this.field1036.method4018());
                } else {
                    this.field1029 = (int) (Math.random() * (double) this.field1036.field2424.length);
                    this.field1034 -= (int) (Math.random() * (double) this.field1036.field2421[this.field1029]);
                }
            }
        }
    }

    @ObfuscatedName("dr.ah(I)Lkb;")
    public final class264 method2007() {
        if (this.field1036 != null) {
            int var1 = client.field821 - this.field1034;
            if (var1 > 100 && this.field1036.field2425 > 0) {
                var1 = 100;
            }
            if (this.field1036.method4051()) {
                int var2 = this.field1036.method4018();
                this.field1029 += var1;
                var1 = 0;
                if (this.field1029 >= var2) {
                    this.field1029 = var2 - this.field1036.field2425;
                    if (this.field1029 < 0 || this.field1029 > var2) {
                        this.field1036 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field1036.field2421[this.field1029]) {
                                break label69;
                            }
                            var1 -= this.field1036.field2421[this.field1029];
                            this.field1029++;
                        } while (this.field1029 < this.field1036.field2424.length);
                        this.field1029 -= this.field1036.field2425;
                    } while (this.field1029 >= 0 && this.field1029 < this.field1036.field2424.length);
                    this.field1036 = null;
                }
            }
            this.field1034 = client.field821 - var1;
        }
        class224 var3 = class224.method3868(this.field1030);
        if (var3.field2317 != null) {
            var3 = var3.method3882();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field1038 == 1 || this.field1038 == 3) {
            var4 = var3.field2292;
            var5 = var3.field2291;
        } else {
            var4 = var3.field2291;
            var5 = var3.field2292;
        }
        int var6 = (var4 >> 1) + this.field1032;
        int var7 = (var4 + 1 >> 1) + this.field1032;
        int var8 = (var5 >> 1) + this.field1035;
        int var9 = (var5 + 1 >> 1) + this.field1035;
        int[][] var10 = this.field1037.field1340[this.field1033];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field1032 << 7) + (var4 << 6);
        int var13 = (this.field1035 << 7) + (var5 << 6);
        return var3.method3906(this.field1031, this.field1038, var10, var12, var11, var13, this.field1036, this.field1029);
    }
}
