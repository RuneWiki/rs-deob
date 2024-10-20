package deob;

@ObfuscatedName("dj")
public class class82 extends class189 {

    @ObfuscatedName("dj.ab")
    public final class102 field1007;

    @ObfuscatedName("dj.ay")
    public final int field998;

    @ObfuscatedName("dj.an")
    public final int field999;

    @ObfuscatedName("dj.au")
    public final int field1000;

    @ObfuscatedName("dj.ax")
    public final int field1001;

    @ObfuscatedName("dj.ao")
    public final int field1002;

    @ObfuscatedName("dj.am")
    public final int field1003;

    @ObfuscatedName("dj.ac")
    public class264 field1009;

    @ObfuscatedName("dj.ae")
    public int field1005;

    @ObfuscatedName("dj.ad")
    public int field1008;

    public class82(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class189 arg9) {
        this.field1007 = arg0;
        this.field998 = arg1;
        this.field999 = arg2;
        this.field1000 = arg3;
        this.field1001 = arg4;
        this.field1002 = arg5;
        this.field1003 = arg6;
        if (arg7 != -1) {
            this.field1009 = class264.method3551(arg7);
            this.field1005 = 0;
            this.field1008 = client.field519 - 1;
            if (this.field1009.field2887 == 0 && arg9 instanceof class82) {
                class82 var11 = (class82) arg9;
                if (this.field1009 == var11.field1009) {
                    this.field1005 = var11.field1005;
                    this.field1008 = var11.field1008;
                    return;
                }
            }
            if (arg8 && this.field1009.field2876 != -1) {
                if (this.field1009.method4915()) {
                    this.field1005 = (int) (Math.random() * (double) this.field1009.method4907());
                } else {
                    this.field1005 = (int) (Math.random() * (double) this.field1009.field2872.length);
                    this.field1008 -= (int) (Math.random() * (double) this.field1009.field2874[this.field1005]);
                }
            }
        }
    }

    @ObfuscatedName("dj.ae(I)Lhr;")
    public final class197 method2088() {
        class261 var1 = class261.method4328(this.field998);
        if (var1.field2783 != null) {
            var1 = var1.method4719();
        }
        if (var1 == null) {
            return null;
        }
        int var2;
        int var3;
        if (this.field1000 == 1 || this.field1000 == 3) {
            var2 = var1.field2759;
            var3 = var1.field2746;
        } else {
            var2 = var1.field2746;
            var3 = var1.field2759;
        }
        int var4 = (var2 >> 1) + this.field1002;
        int var5 = (var2 + 1 >> 1) + this.field1002;
        int var6 = (var3 >> 1) + this.field1003;
        int var7 = (var3 + 1 >> 1) + this.field1003;
        int[][] var8 = this.field1007.field1314[this.field1001];
        int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
        int var10 = (this.field1002 << 7) + (var2 << 6);
        int var11 = (this.field1003 << 7) + (var3 << 6);
        if (this.field1009 != null) {
            int var12 = client.field519 - this.field1008;
            if (var12 > 100 && this.field1009.field2876 > 0) {
                var12 = 100;
            }
            if (this.field1009.method4915()) {
                int var13 = this.field1009.method4907();
                this.field1005 += var12;
                var12 = 0;
                if (this.field1005 >= var13) {
                    this.field1005 = var13 - this.field1009.field2876;
                    if (this.field1005 < 0 || this.field1005 > var13) {
                        this.field1009 = null;
                    }
                }
                if (this.field1009 != null) {
                    client.method3109(this.field1009, this.field1005, var10, var11, false);
                }
            } else {
                label49: {
                    do {
                        while (true) {
                            if (var12 <= this.field1009.field2874[this.field1005]) {
                                break label49;
                            }
                            var12 -= this.field1009.field2874[this.field1005];
                            this.field1005++;
                            if (this.field1005 >= this.field1009.field2872.length) {
                                this.field1005 -= this.field1009.field2876;
                                break;
                            }
                            client.method3149(this.field1009, this.field1005, var10, var11, false);
                        }
                    } while (this.field1005 >= 0 && this.field1005 < this.field1009.field2872.length);
                    this.field1009 = null;
                }
            }
            this.field1008 = client.field519 - var12;
        }
        return var1.method4747(this.field999, this.field1000, var8, var10, var9, var11, this.field1009, this.field1005);
    }
}
