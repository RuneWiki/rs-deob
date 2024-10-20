package deob;

@ObfuscatedName("t")
public class class14 extends class94 {

    @ObfuscatedName("t.q")
    public int field217;

    @ObfuscatedName("t.c")
    public int field207;

    @ObfuscatedName("t.p")
    public int field208;

    @ObfuscatedName("t.z")
    public int field209;

    @ObfuscatedName("t.m")
    public int field210;

    @ObfuscatedName("t.k")
    public int field211;

    @ObfuscatedName("t.v")
    public class34 field212;

    @ObfuscatedName("t.y")
    public int field213;

    @ObfuscatedName("t.d")
    public int field218;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field217 = arg0;
        this.field207 = arg1;
        this.field208 = arg2;
        this.field209 = arg3;
        this.field210 = arg4;
        this.field211 = arg5;
        if (arg6 != -1) {
            this.field212 = class34.method2178(arg6);
            this.field213 = 0;
            this.field218 = client.field479 - 1;
            if (this.field212.field894 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field212 == var10.field212) {
                    this.field213 = var10.field213;
                    this.field218 = var10.field218;
                    return;
                }
            }
            if (arg7 && this.field212.field885 != -1) {
                this.field213 = (int) (Math.random() * (double) this.field212.field881.length);
                this.field218 -= (int) (Math.random() * (double) this.field212.field889[this.field213]);
            }
        }
    }

    @ObfuscatedName("t.c(I)Ldn;")
    public final class112 method17() {
        if (this.field212 != null) {
            int var1 = client.field479 - this.field218;
            if (var1 > 100 && this.field212.field885 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field212.field889[this.field213]) {
                            break label47;
                        }
                        var1 -= this.field212.field889[this.field213];
                        this.field213++;
                    } while (this.field213 < this.field212.field881.length);
                    this.field213 -= this.field212.field885;
                } while (this.field213 >= 0 && this.field213 < this.field212.field881.length);
                this.field212 = null;
            }
            this.field218 = client.field479 - var1;
        }
        class32 var2 = class32.method14(this.field217);
        if (var2.field851 != null) {
            var2 = var2.method648();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field208 == 1 || this.field208 == 3) {
            var3 = var2.field830;
            var4 = var2.field855;
        } else {
            var3 = var2.field855;
            var4 = var2.field830;
        }
        int var5 = (var3 >> 1) + this.field210;
        int var6 = (var3 + 1 >> 1) + this.field210;
        int var7 = (var4 >> 1) + this.field211;
        int var8 = (var4 + 1 >> 1) + this.field211;
        int[][] var9 = class9.field134[this.field209];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field210 << 7) + (var3 << 6);
        int var12 = (this.field211 << 7) + (var4 << 6);
        return var2.method646(this.field207, this.field208, var9, var11, var10, var12, this.field212, this.field213);
    }
}
