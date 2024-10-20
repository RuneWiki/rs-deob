package deob;

@ObfuscatedName("o")
public class class14 extends class94 {

    @ObfuscatedName("o.i")
    public int field233;

    @ObfuscatedName("o.p")
    public int field223;

    @ObfuscatedName("o.a")
    public int field224;

    @ObfuscatedName("o.l")
    public int field228;

    @ObfuscatedName("o.q")
    public int field226;

    @ObfuscatedName("o.b")
    public int field227;

    @ObfuscatedName("o.u")
    public class34 field222;

    @ObfuscatedName("o.d")
    public int field229;

    @ObfuscatedName("o.m")
    public int field235;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field233 = arg0;
        this.field223 = arg1;
        this.field224 = arg2;
        this.field228 = arg3;
        this.field226 = arg4;
        this.field227 = arg5;
        if (arg6 != -1) {
            this.field222 = class34.method763(arg6);
            this.field229 = 0;
            this.field235 = client.field491 - 1;
            if (this.field222.field903 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field222 == var10.field222) {
                    this.field229 = var10.field229;
                    this.field235 = var10.field235;
                    return;
                }
            }
            if (arg7 && this.field222.field894 != -1) {
                this.field229 = (int) (Math.random() * (double) this.field222.field890.length);
                this.field235 -= (int) (Math.random() * (double) this.field222.field892[this.field229]);
            }
        }
    }

    @ObfuscatedName("o.p(I)Ldc;")
    public final class112 method26() {
        if (this.field222 != null) {
            int var1 = client.field491 - this.field235;
            if (var1 > 100 && this.field222.field894 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field222.field892[this.field229]) {
                            break label47;
                        }
                        var1 -= this.field222.field892[this.field229];
                        this.field229++;
                    } while (this.field229 < this.field222.field890.length);
                    this.field229 -= this.field222.field894;
                } while (this.field229 >= 0 && this.field229 < this.field222.field890.length);
                this.field222 = null;
            }
            this.field235 = client.field491 - var1;
        }
        class32 var2 = class32.method1460(this.field233);
        if (var2.field856 != null) {
            var2 = var2.method639();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field224 == 1 || this.field224 == 3) {
            var3 = var2.field837;
            var4 = var2.field836;
        } else {
            var3 = var2.field836;
            var4 = var2.field837;
        }
        int var5 = (var3 >> 1) + this.field226;
        int var6 = (var3 + 1 >> 1) + this.field226;
        int var7 = (var4 >> 1) + this.field227;
        int var8 = (var4 + 1 >> 1) + this.field227;
        int[][] var9 = class9.field141[this.field228];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field226 << 7) + (var3 << 6);
        int var12 = (this.field227 << 7) + (var4 << 6);
        return var2.method669(this.field223, this.field224, var9, var11, var10, var12, this.field222, this.field229);
    }
}
