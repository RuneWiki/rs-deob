package deob;

@ObfuscatedName("h")
public class class14 extends class94 {

    @ObfuscatedName("h.a")
    public int field205;

    @ObfuscatedName("h.x")
    public int field201;

    @ObfuscatedName("h.e")
    public int field213;

    @ObfuscatedName("h.r")
    public int field203;

    @ObfuscatedName("h.p")
    public int field204;

    @ObfuscatedName("h.n")
    public int field200;

    @ObfuscatedName("h.o")
    public class34 field206;

    @ObfuscatedName("h.l")
    public int field211;

    @ObfuscatedName("h.t")
    public int field208;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field205 = arg0;
        this.field201 = arg1;
        this.field213 = arg2;
        this.field203 = arg3;
        this.field204 = arg4;
        this.field200 = arg5;
        if (arg6 != -1) {
            this.field206 = class34.method57(arg6);
            this.field211 = 0;
            this.field208 = client.field658 - 1;
            if (this.field206.field895 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field206 == var10.field206) {
                    this.field211 = var10.field211;
                    this.field208 = var10.field208;
                    return;
                }
            }
            if (arg7 && this.field206.field897 != -1) {
                this.field211 = (int) (Math.random() * (double) this.field206.field898.length);
                this.field208 -= (int) (Math.random() * (double) this.field206.field900[this.field211]);
            }
        }
    }

    @ObfuscatedName("h.x(B)Ldd;")
    public final class112 method15() {
        if (this.field206 != null) {
            int var1 = client.field658 - this.field208;
            if (var1 > 100 && this.field206.field897 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field206.field900[this.field211]) {
                            break label47;
                        }
                        var1 -= this.field206.field900[this.field211];
                        this.field211++;
                    } while (this.field211 < this.field206.field898.length);
                    this.field211 -= this.field206.field897;
                } while (this.field211 >= 0 && this.field211 < this.field206.field898.length);
                this.field206 = null;
            }
            this.field208 = client.field658 - var1;
        }
        class32 var2 = class32.method1806(this.field205);
        if (var2.field821 != null) {
            var2 = var2.method652();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field213 == 1 || this.field213 == 3) {
            var3 = var2.field836;
            var4 = var2.field835;
        } else {
            var3 = var2.field835;
            var4 = var2.field836;
        }
        int var5 = (var3 >> 1) + this.field204;
        int var6 = (var3 + 1 >> 1) + this.field204;
        int var7 = (var4 >> 1) + this.field200;
        int var8 = (var4 + 1 >> 1) + this.field200;
        int[][] var9 = class9.field135[this.field203];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field204 << 7) + (var3 << 6);
        int var12 = (this.field200 << 7) + (var4 << 6);
        return var2.method650(this.field201, this.field213, var9, var11, var10, var12, this.field206, this.field211);
    }
}
