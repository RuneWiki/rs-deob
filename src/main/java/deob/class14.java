package deob;

@ObfuscatedName("x")
public class class14 extends class94 {

    @ObfuscatedName("x.d")
    public int field208;

    @ObfuscatedName("x.g")
    public int field209;

    @ObfuscatedName("x.a")
    public int field210;

    @ObfuscatedName("x.t")
    public int field211;

    @ObfuscatedName("x.f")
    public int field222;

    @ObfuscatedName("x.c")
    public int field213;

    @ObfuscatedName("x.p")
    public class34 field214;

    @ObfuscatedName("x.s")
    public int field215;

    @ObfuscatedName("x.k")
    public int field216;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field208 = arg0;
        this.field209 = arg1;
        this.field210 = arg2;
        this.field211 = arg3;
        this.field222 = arg4;
        this.field213 = arg5;
        if (arg6 != -1) {
            this.field214 = class34.method136(arg6);
            this.field215 = 0;
            this.field216 = client.field472 - 1;
            if (this.field214.field884 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field214 == var10.field214) {
                    this.field215 = var10.field215;
                    this.field216 = var10.field216;
                    return;
                }
            }
            if (arg7 && this.field214.field873 != -1) {
                this.field215 = (int) (Math.random() * (double) this.field214.field871.length);
                this.field216 -= (int) (Math.random() * (double) this.field214.field877[this.field215]);
            }
        }
    }

    @ObfuscatedName("x.g(I)Ldd;")
    public final class112 method18() {
        if (this.field214 != null) {
            int var1 = client.field472 - this.field216;
            if (var1 > 100 && this.field214.field873 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field214.field877[this.field215]) {
                            break label47;
                        }
                        var1 -= this.field214.field877[this.field215];
                        this.field215++;
                    } while (this.field215 < this.field214.field871.length);
                    this.field215 -= this.field214.field873;
                } while (this.field215 >= 0 && this.field215 < this.field214.field871.length);
                this.field214 = null;
            }
            this.field216 = client.field472 - var1;
        }
        class32 var2 = class32.method204(this.field208);
        if (var2.field801 != null) {
            var2 = var2.method618();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field210 == 1 || this.field210 == 3) {
            var3 = var2.field816;
            var4 = var2.field818;
        } else {
            var3 = var2.field818;
            var4 = var2.field816;
        }
        int var5 = (var3 >> 1) + this.field222;
        int var6 = (var3 + 1 >> 1) + this.field222;
        int var7 = (var4 >> 1) + this.field213;
        int var8 = (var4 + 1 >> 1) + this.field213;
        int[][] var9 = class9.field130[this.field211];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field222 << 7) + (var3 << 6);
        int var12 = (this.field213 << 7) + (var4 << 6);
        return var2.method648(this.field209, this.field210, var9, var11, var10, var12, this.field214, this.field215);
    }
}
