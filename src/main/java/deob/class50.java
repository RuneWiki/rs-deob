package deob;

@ObfuscatedName("ae")
public class class50 extends class90 {

    @ObfuscatedName("ae.i")
    public int field959;

    @ObfuscatedName("ae.e")
    public int field963;

    @ObfuscatedName("ae.f")
    public int field961;

    @ObfuscatedName("ae.k")
    public int field962;

    @ObfuscatedName("ae.g")
    public int field966;

    @ObfuscatedName("ae.n")
    public int field964;

    @ObfuscatedName("ae.a")
    public class202 field960;

    @ObfuscatedName("ae.q")
    public int field965;

    @ObfuscatedName("ae.w")
    public int field967;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field959 = arg0;
        this.field963 = arg1;
        this.field961 = arg2;
        this.field962 = arg3;
        this.field966 = arg4;
        this.field964 = arg5;
        if (arg6 != -1) {
            this.field960 = class202.method2010(arg6);
            this.field965 = 0;
            this.field967 = client.field294 - 1;
            if (this.field960.field3060 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field960 == var10.field960) {
                    this.field965 = var10.field965;
                    this.field967 = var10.field967;
                    return;
                }
            }
            if (arg7 && this.field960.field3068 != -1) {
                this.field965 = (int) (Math.random() * (double) this.field960.field3053.length);
                this.field967 -= (int) (Math.random() * (double) this.field960.field3054[this.field965]);
            }
        }
    }

    @ObfuscatedName("ae.f(B)Lch;")
    public final class83 method227() {
        if (this.field960 != null) {
            int var1 = client.field294 - this.field967;
            if (var1 > 100 && this.field960.field3068 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field960.field3054[this.field965]) {
                            break label47;
                        }
                        var1 -= this.field960.field3054[this.field965];
                        this.field965++;
                    } while (this.field965 < this.field960.field3053.length);
                    this.field965 -= this.field960.field3068;
                } while (this.field965 >= 0 && this.field965 < this.field960.field3053.length);
                this.field960 = null;
            }
            this.field967 = client.field294 - var1;
        }
        class198 var2 = class198.method1371(this.field959);
        if (var2.field2934 != null) {
            var2 = var2.method3342();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field961 == 1 || this.field961 == 3) {
            var3 = var2.field2909;
            var4 = var2.field2908;
        } else {
            var3 = var2.field2908;
            var4 = var2.field2909;
        }
        int var5 = (var3 >> 1) + this.field966;
        int var6 = (var3 + 1 >> 1) + this.field966;
        int var7 = (var4 >> 1) + this.field964;
        int var8 = (var4 + 1 >> 1) + this.field964;
        int[][] var9 = class11.field100[this.field962];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field966 << 7) + (var3 << 6);
        int var12 = (this.field964 << 7) + (var4 << 6);
        return var2.method3340(this.field963, this.field961, var9, var11, var10, var12, this.field960, this.field965);
    }
}
