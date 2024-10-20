package deob;

@ObfuscatedName("m")
public class class14 extends class94 {

    @ObfuscatedName("m.i")
    public int field225;

    @ObfuscatedName("m.w")
    public int field215;

    @ObfuscatedName("m.f")
    public int field229;

    @ObfuscatedName("m.e")
    public int field217;

    @ObfuscatedName("m.t")
    public int field218;

    @ObfuscatedName("m.d")
    public int field219;

    @ObfuscatedName("m.p")
    public class34 field220;

    @ObfuscatedName("m.k")
    public int field221;

    @ObfuscatedName("m.r")
    public int field222;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field225 = arg0;
        this.field215 = arg1;
        this.field229 = arg2;
        this.field217 = arg3;
        this.field218 = arg4;
        this.field219 = arg5;
        if (arg6 != -1) {
            this.field220 = class34.method235(arg6);
            this.field221 = 0;
            this.field222 = client.field491 - 1;
            if (this.field220.field902 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field220 == var10.field220) {
                    this.field221 = var10.field221;
                    this.field222 = var10.field222;
                    return;
                }
            }
            if (arg7 && this.field220.field898 != -1) {
                this.field221 = (int) (Math.random() * (double) this.field220.field889.length);
                this.field222 -= (int) (Math.random() * (double) this.field220.field891[this.field221]);
            }
        }
    }

    @ObfuscatedName("m.w(I)Ldb;")
    public final class112 method17() {
        if (this.field220 != null) {
            int var1 = client.field491 - this.field222;
            if (var1 > 100 && this.field220.field898 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field220.field891[this.field221]) {
                            break label47;
                        }
                        var1 -= this.field220.field891[this.field221];
                        this.field221++;
                    } while (this.field221 < this.field220.field889.length);
                    this.field221 -= this.field220.field898;
                } while (this.field221 >= 0 && this.field221 < this.field220.field889.length);
                this.field220 = null;
            }
            this.field222 = client.field491 - var1;
        }
        class32 var2 = class32.method2660(this.field225);
        if (var2.field829 != null) {
            var2 = var2.method650();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field229 == 1 || this.field229 == 3) {
            var3 = var2.field837;
            var4 = var2.field836;
        } else {
            var3 = var2.field836;
            var4 = var2.field837;
        }
        int var5 = (var3 >> 1) + this.field218;
        int var6 = (var3 + 1 >> 1) + this.field218;
        int var7 = (var4 >> 1) + this.field219;
        int var8 = (var4 + 1 >> 1) + this.field219;
        int[][] var9 = class9.field115[this.field217];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field218 << 7) + (var3 << 6);
        int var12 = (this.field219 << 7) + (var4 << 6);
        return var2.method644(this.field215, this.field229, var9, var11, var10, var12, this.field220, this.field221);
    }
}
