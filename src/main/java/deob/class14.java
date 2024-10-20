package deob;

@ObfuscatedName("g")
public class class14 extends class94 {

    @ObfuscatedName("g.j")
    public int field210;

    @ObfuscatedName("g.f")
    public int field211;

    @ObfuscatedName("g.o")
    public int field212;

    @ObfuscatedName("g.h")
    public int field218;

    @ObfuscatedName("g.u")
    public int field214;

    @ObfuscatedName("g.a")
    public int field215;

    @ObfuscatedName("g.q")
    public class34 field216;

    @ObfuscatedName("g.t")
    public int field213;

    @ObfuscatedName("g.n")
    public int field224;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field210 = arg0;
        this.field211 = arg1;
        this.field212 = arg2;
        this.field218 = arg3;
        this.field214 = arg4;
        this.field215 = arg5;
        if (arg6 != -1) {
            this.field216 = class34.method612(arg6);
            this.field213 = 0;
            this.field224 = client.field699 - 1;
            if (this.field216.field892 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field216 == var10.field216) {
                    this.field213 = var10.field213;
                    this.field224 = var10.field224;
                    return;
                }
            }
            if (arg7 && this.field216.field884 != -1) {
                this.field213 = (int) (Math.random() * (double) this.field216.field879.length);
                this.field224 -= (int) (Math.random() * (double) this.field216.field881[this.field213]);
            }
        }
    }

    @ObfuscatedName("g.f(B)Ldo;")
    public final class112 method19() {
        if (this.field216 != null) {
            int var1 = client.field699 - this.field224;
            if (var1 > 100 && this.field216.field884 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field216.field881[this.field213]) {
                            break label47;
                        }
                        var1 -= this.field216.field881[this.field213];
                        this.field213++;
                    } while (this.field213 < this.field216.field879.length);
                    this.field213 -= this.field216.field884;
                } while (this.field213 >= 0 && this.field213 < this.field216.field879.length);
                this.field216 = null;
            }
            this.field224 = client.field699 - var1;
        }
        class32 var2 = class32.method1406(this.field210);
        if (var2.field843 != null) {
            var2 = var2.method660();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field212 == 1 || this.field212 == 3) {
            var3 = var2.field818;
            var4 = var2.field817;
        } else {
            var3 = var2.field817;
            var4 = var2.field818;
        }
        int var5 = (var3 >> 1) + this.field214;
        int var6 = (var3 + 1 >> 1) + this.field214;
        int var7 = (var4 >> 1) + this.field215;
        int var8 = (var4 + 1 >> 1) + this.field215;
        int[][] var9 = class9.field140[this.field218];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field214 << 7) + (var3 << 6);
        int var12 = (this.field215 << 7) + (var4 << 6);
        return var2.method665(this.field211, this.field212, var9, var11, var10, var12, this.field216, this.field213);
    }
}
