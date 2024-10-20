package deob;

@ObfuscatedName("cb")
public class class88 extends class130 {

    @ObfuscatedName("cb.v")
    public int field1251;

    @ObfuscatedName("cb.s")
    public int field1246;

    @ObfuscatedName("cb.o")
    public int field1247;

    @ObfuscatedName("cb.k")
    public int field1248;

    @ObfuscatedName("cb.u")
    public int field1249;

    @ObfuscatedName("cb.i")
    public int field1250;

    @ObfuscatedName("cb.t")
    public class276 field1252;

    @ObfuscatedName("cb.p")
    public int field1254;

    @ObfuscatedName("cb.l")
    public int field1253;

    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class130 arg8) {
        this.field1251 = arg0;
        this.field1246 = arg1;
        this.field1247 = arg2;
        this.field1248 = arg3;
        this.field1249 = arg4;
        this.field1250 = arg5;
        if (arg6 != -1) {
            this.field1252 = class276.method115(arg6);
            this.field1254 = 0;
            this.field1253 = client.field631 - 1;
            if (this.field1252.field3569 == 0 && arg8 != null && arg8 instanceof class88) {
                class88 var10 = (class88) arg8;
                if (this.field1252 == var10.field1252) {
                    this.field1254 = var10.field1254;
                    this.field1253 = var10.field1253;
                    return;
                }
            }
            if (arg7 && this.field1252.field3570 != -1) {
                this.field1254 = (int) (Math.random() * (double) this.field1252.field3566.length);
                this.field1253 -= (int) (Math.random() * (double) this.field1252.field3568[this.field1254]);
            }
        }
    }

    @ObfuscatedName("cb.w(I)Lda;")
    public final class122 method1056() {
        if (this.field1252 != null) {
            int var1 = client.field631 - this.field1253;
            if (var1 > 100 && this.field1252.field3570 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1252.field3568[this.field1254]) {
                            break label47;
                        }
                        var1 -= this.field1252.field3568[this.field1254];
                        this.field1254++;
                    } while (this.field1254 < this.field1252.field3566.length);
                    this.field1254 -= this.field1252.field3570;
                } while (this.field1254 >= 0 && this.field1254 < this.field1252.field3566.length);
                this.field1252 = null;
            }
            this.field1253 = client.field631 - var1;
        }
        class271 var2 = class271.method4255(this.field1251);
        if (var2.field3412 != null) {
            var2 = var2.method4707();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1247 == 1 || this.field1247 == 3) {
            var3 = var2.field3418;
            var4 = var2.field3417;
        } else {
            var3 = var2.field3417;
            var4 = var2.field3418;
        }
        int var5 = (var3 >> 1) + this.field1249;
        int var6 = (var3 + 1 >> 1) + this.field1249;
        int var7 = (var4 >> 1) + this.field1250;
        int var8 = (var4 + 1 >> 1) + this.field1250;
        int[][] var9 = class51.field487[this.field1248];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1249 << 7) + (var3 << 6);
        int var12 = (this.field1250 << 7) + (var4 << 6);
        return var2.method4706(this.field1246, this.field1247, var9, var11, var10, var12, this.field1252, this.field1254);
    }
}
