package deob;

@ObfuscatedName("aq")
public class class50 extends class90 {

    @ObfuscatedName("aq.o")
    public int field959;

    @ObfuscatedName("aq.m")
    public int field956;

    @ObfuscatedName("aq.b")
    public int field958;

    @ObfuscatedName("aq.g")
    public int field964;

    @ObfuscatedName("aq.h")
    public int field960;

    @ObfuscatedName("aq.v")
    public int field957;

    @ObfuscatedName("aq.l")
    public class202 field962;

    @ObfuscatedName("aq.c")
    public int field961;

    @ObfuscatedName("aq.u")
    public int field963;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field959 = arg0;
        this.field956 = arg1;
        this.field958 = arg2;
        this.field964 = arg3;
        this.field960 = arg4;
        this.field957 = arg5;
        if (arg6 != -1) {
            this.field962 = class202.method658(arg6);
            this.field961 = 0;
            this.field963 = client.field299 - 1;
            if (this.field962.field3060 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field962 == var10.field962) {
                    this.field961 = var10.field961;
                    this.field963 = var10.field963;
                    return;
                }
            }
            if (arg7 && this.field962.field3055 != -1) {
                this.field961 = (int) (Math.random() * (double) this.field962.field3051.length);
                this.field963 -= (int) (Math.random() * (double) this.field962.field3048[this.field961]);
            }
        }
    }

    @ObfuscatedName("aq.b(B)Lcy;")
    public final class83 method212() {
        if (this.field962 != null) {
            int var1 = client.field299 - this.field963;
            if (var1 > 100 && this.field962.field3055 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field962.field3048[this.field961]) {
                            break label47;
                        }
                        var1 -= this.field962.field3048[this.field961];
                        this.field961++;
                    } while (this.field961 < this.field962.field3051.length);
                    this.field961 -= this.field962.field3055;
                } while (this.field961 >= 0 && this.field961 < this.field962.field3051.length);
                this.field962 = null;
            }
            this.field963 = client.field299 - var1;
        }
        class198 var2 = class198.method2463(this.field959);
        if (var2.field2932 != null) {
            var2 = var2.method3323();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field958 == 1 || this.field958 == 3) {
            var3 = var2.field2939;
            var4 = var2.field2906;
        } else {
            var3 = var2.field2906;
            var4 = var2.field2939;
        }
        int var5 = (var3 >> 1) + this.field960;
        int var6 = (var3 + 1 >> 1) + this.field960;
        int var7 = (var4 >> 1) + this.field957;
        int var8 = (var4 + 1 >> 1) + this.field957;
        int[][] var9 = class11.field94[this.field964];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field960 << 7) + (var3 << 6);
        int var12 = (this.field957 << 7) + (var4 << 6);
        return var2.method3316(this.field956, this.field958, var9, var11, var10, var12, this.field962, this.field961);
    }
}
