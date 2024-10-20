package deob;

@ObfuscatedName("dl")
public class class81 extends class249 {

    @ObfuscatedName("dl.az")
    public int field1016;

    @ObfuscatedName("dl.ah")
    public int field1011;

    @ObfuscatedName("dl.af")
    public int field1013;

    @ObfuscatedName("dl.at")
    public int field1015;

    @ObfuscatedName("dl.an")
    public int field1014;

    @ObfuscatedName("dl.ao")
    public int field1018;

    @ObfuscatedName("dl.ab")
    public class225 field1012;

    @ObfuscatedName("dl.aw")
    public int field1017;

    @ObfuscatedName("dl.ad")
    public int field1010;

    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class249 arg8) {
        this.field1016 = arg0;
        this.field1011 = arg1;
        this.field1013 = arg2;
        this.field1015 = arg3;
        this.field1014 = arg4;
        this.field1018 = arg5;
        if (arg6 != -1) {
            this.field1012 = class225.method288(arg6);
            this.field1017 = 0;
            this.field1010 = client.field523 - 1;
            if (this.field1012.field2397 == 0 && arg8 != null && arg8 instanceof class81) {
                class81 var10 = (class81) arg8;
                if (this.field1012 == var10.field1012) {
                    this.field1017 = var10.field1017;
                    this.field1010 = var10.field1010;
                    return;
                }
            }
            if (arg7 && this.field1012.field2390 != -1) {
                if (this.field1012.method3940()) {
                    this.field1017 = (int) (Math.random() * (double) this.field1012.method3904());
                } else {
                    this.field1017 = (int) (Math.random() * (double) this.field1012.field2386.length);
                    this.field1010 -= (int) (Math.random() * (double) this.field1012.field2393[this.field1017]);
                }
            }
        }
    }

    @ObfuscatedName("dl.ah(I)Ljn;")
    public final class256 method1979() {
        if (this.field1012 != null) {
            int var1 = client.field523 - this.field1010;
            if (var1 > 100 && this.field1012.field2390 > 0) {
                var1 = 100;
            }
            if (this.field1012.method3940()) {
                int var2 = this.field1012.method3904();
                this.field1017 += var1;
                var1 = 0;
                if (this.field1017 >= var2) {
                    this.field1017 = var2 - this.field1012.field2390;
                    if (this.field1017 < 0 || this.field1017 > var2) {
                        this.field1012 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field1012.field2393[this.field1017]) {
                                break label69;
                            }
                            var1 -= this.field1012.field2393[this.field1017];
                            this.field1017++;
                        } while (this.field1017 < this.field1012.field2386.length);
                        this.field1017 -= this.field1012.field2390;
                    } while (this.field1017 >= 0 && this.field1017 < this.field1012.field2386.length);
                    this.field1012 = null;
                }
            }
            this.field1010 = client.field523 - var1;
        }
        class222 var3 = class222.method2212(this.field1016);
        if (var3.field2290 != null) {
            var3 = var3.method3755();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field1013 == 1 || this.field1013 == 3) {
            var4 = var3.field2263;
            var5 = var3.field2262;
        } else {
            var4 = var3.field2262;
            var5 = var3.field2263;
        }
        int var6 = (var4 >> 1) + this.field1014;
        int var7 = (var4 + 1 >> 1) + this.field1014;
        int var8 = (var5 >> 1) + this.field1018;
        int var9 = (var5 + 1 >> 1) + this.field1018;
        int[][] var10 = class83.field1030[this.field1015];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field1014 << 7) + (var4 << 6);
        int var13 = (this.field1018 << 7) + (var5 << 6);
        return var3.method3790(this.field1011, this.field1013, var10, var12, var11, var13, this.field1012, this.field1017);
    }
}
