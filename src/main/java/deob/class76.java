package deob;

@ObfuscatedName("bh")
public class class76 extends class222 {

    @ObfuscatedName("bh.f")
    public int field1001;

    @ObfuscatedName("bh.w")
    public int field993;

    @ObfuscatedName("bh.v")
    public int field994;

    @ObfuscatedName("bh.s")
    public int field995;

    @ObfuscatedName("bh.z")
    public int field996;

    @ObfuscatedName("bh.j")
    public int field997;

    @ObfuscatedName("bh.i")
    public class203 field998;

    @ObfuscatedName("bh.n")
    public int field999;

    @ObfuscatedName("bh.l")
    public int field1000;

    public class76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class222 arg8) {
        this.field1001 = arg0;
        this.field993 = arg1;
        this.field994 = arg2;
        this.field995 = arg3;
        this.field996 = arg4;
        this.field997 = arg5;
        if (arg6 != -1) {
            this.field998 = class203.method2227(arg6);
            this.field999 = 0;
            this.field1000 = client.field511 - 1;
            if (this.field998.field2309 == 0 && arg8 != null && arg8 instanceof class76) {
                class76 var10 = (class76) arg8;
                if (this.field998 == var10.field998) {
                    this.field999 = var10.field999;
                    this.field1000 = var10.field1000;
                    return;
                }
            }
            if (arg7 && this.field998.field2282 != -1) {
                if (this.field998.method3769()) {
                    this.field999 = (int) (Math.random() * (double) this.field998.method3754());
                } else {
                    this.field999 = (int) (Math.random() * (double) this.field998.field2283.length);
                    this.field1000 -= (int) (Math.random() * (double) this.field998.field2296[this.field999]);
                }
            }
        }
    }

    @ObfuscatedName("bh.w(I)Lhs;")
    public final class228 method1977() {
        if (this.field998 != null) {
            int var1 = client.field511 - this.field1000;
            if (var1 > 100 && this.field998.field2282 > 0) {
                var1 = 100;
            }
            if (this.field998.method3769()) {
                int var2 = this.field998.method3754();
                this.field999 += var1;
                var1 = 0;
                if (this.field999 >= var2) {
                    this.field999 = var2 - this.field998.field2282;
                    if (this.field999 < 0 || this.field999 > var2) {
                        this.field998 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field998.field2296[this.field999]) {
                                break label69;
                            }
                            var1 -= this.field998.field2296[this.field999];
                            this.field999++;
                        } while (this.field999 < this.field998.field2283.length);
                        this.field999 -= this.field998.field2282;
                    } while (this.field999 >= 0 && this.field999 < this.field998.field2283.length);
                    this.field998 = null;
                }
            }
            this.field1000 = client.field511 - var1;
        }
        class200 var3 = class200.method7839(this.field1001);
        if (var3.field2180 != null) {
            var3 = var3.method3612();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field994 == 1 || this.field994 == 3) {
            var4 = var3.field2182;
            var5 = var3.field2181;
        } else {
            var4 = var3.field2181;
            var5 = var3.field2182;
        }
        int var6 = (var4 >> 1) + this.field996;
        int var7 = (var4 + 1 >> 1) + this.field996;
        int var8 = (var5 >> 1) + this.field997;
        int var9 = (var5 + 1 >> 1) + this.field997;
        int[][] var10 = class78.field1015[this.field995];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field996 << 7) + (var4 << 6);
        int var13 = (this.field997 << 7) + (var5 << 6);
        return var3.method3610(this.field993, this.field994, var10, var12, var11, var13, this.field998, this.field999);
    }
}
