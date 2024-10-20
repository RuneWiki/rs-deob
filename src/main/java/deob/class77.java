package deob;

@ObfuscatedName("bk")
public class class77 extends class218 {

    @ObfuscatedName("bk.h")
    public int field1010;

    @ObfuscatedName("bk.e")
    public int field1005;

    @ObfuscatedName("bk.v")
    public int field1006;

    @ObfuscatedName("bk.x")
    public int field1007;

    @ObfuscatedName("bk.m")
    public int field1004;

    @ObfuscatedName("bk.q")
    public int field1009;

    @ObfuscatedName("bk.f")
    public class199 field1011;

    @ObfuscatedName("bk.r")
    public int field1013;

    @ObfuscatedName("bk.u")
    public int field1012;

    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class218 arg8) {
        this.field1010 = arg0;
        this.field1005 = arg1;
        this.field1006 = arg2;
        this.field1007 = arg3;
        this.field1004 = arg4;
        this.field1009 = arg5;
        if (arg6 != -1) {
            this.field1011 = class199.method4223(arg6);
            this.field1013 = 0;
            this.field1012 = client.field519 - 1;
            if (this.field1011.field2277 == 0 && arg8 != null && arg8 instanceof class77) {
                class77 var10 = (class77) arg8;
                if (this.field1011 == var10.field1011) {
                    this.field1013 = var10.field1013;
                    this.field1012 = var10.field1012;
                    return;
                }
            }
            if (arg7 && this.field1011.field2298 != -1) {
                if (this.field1011.method3671()) {
                    this.field1013 = (int) (Math.random() * (double) this.field1011.method3675());
                } else {
                    this.field1013 = (int) (Math.random() * (double) this.field1011.field2295.length);
                    this.field1012 -= (int) (Math.random() * (double) this.field1011.field2289[this.field1013]);
                }
            }
        }
    }

    @ObfuscatedName("bk.e(I)Lhh;")
    public final class224 method1915() {
        if (this.field1011 != null) {
            int var1 = client.field519 - this.field1012;
            if (var1 > 100 && this.field1011.field2298 > 0) {
                var1 = 100;
            }
            if (this.field1011.method3671()) {
                int var2 = this.field1011.method3675();
                this.field1013 += var1;
                var1 = 0;
                if (this.field1013 >= var2) {
                    this.field1013 = var2 - this.field1011.field2298;
                    if (this.field1013 < 0 || this.field1013 > var2) {
                        this.field1011 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field1011.field2289[this.field1013]) {
                                break label69;
                            }
                            var1 -= this.field1011.field2289[this.field1013];
                            this.field1013++;
                        } while (this.field1013 < this.field1011.field2295.length);
                        this.field1013 -= this.field1011.field2298;
                    } while (this.field1013 >= 0 && this.field1013 < this.field1011.field2295.length);
                    this.field1011 = null;
                }
            }
            this.field1012 = client.field519 - var1;
        }
        class196 var3 = class196.method3208(this.field1010);
        if (var3.field2194 != null) {
            var3 = var3.method3560();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field1006 == 1 || this.field1006 == 3) {
            var4 = var3.field2169;
            var5 = var3.field2168;
        } else {
            var4 = var3.field2168;
            var5 = var3.field2169;
        }
        int var6 = (var4 >> 1) + this.field1004;
        int var7 = (var4 + 1 >> 1) + this.field1004;
        int var8 = (var5 >> 1) + this.field1009;
        int var9 = (var5 + 1 >> 1) + this.field1009;
        int[][] var10 = class79.field1027[this.field1007];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field1004 << 7) + (var4 << 6);
        int var13 = (this.field1009 << 7) + (var5 << 6);
        return var3.method3515(this.field1005, this.field1006, var10, var12, var11, var13, this.field1011, this.field1013);
    }
}
