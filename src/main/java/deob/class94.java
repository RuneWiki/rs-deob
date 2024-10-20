package deob;

@ObfuscatedName("cw")
public class class94 extends class136 {

    @ObfuscatedName("cw.c")
    public int field1278;

    @ObfuscatedName("cw.t")
    public int field1277;

    @ObfuscatedName("cw.o")
    public int field1275;

    @ObfuscatedName("cw.e")
    public int field1280;

    @ObfuscatedName("cw.i")
    public int field1279;

    @ObfuscatedName("cw.g")
    public int field1276;

    @ObfuscatedName("cw.d")
    public class260 field1281;

    @ObfuscatedName("cw.l")
    public int field1282;

    @ObfuscatedName("cw.j")
    public int field1283;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class136 arg8) {
        this.field1278 = arg0;
        this.field1277 = arg1;
        this.field1275 = arg2;
        this.field1280 = arg3;
        this.field1279 = arg4;
        this.field1276 = arg5;
        if (arg6 != -1) {
            this.field1281 = class260.method5476(arg6);
            this.field1282 = 0;
            this.field1283 = client.field656 - 1;
            if (this.field1281.field3517 == 0 && arg8 != null && arg8 instanceof class94) {
                class94 var10 = (class94) arg8;
                if (this.field1281 == var10.field1281) {
                    this.field1282 = var10.field1282;
                    this.field1283 = var10.field1283;
                    return;
                }
            }
            if (arg7 && this.field1281.field3520 != -1) {
                this.field1282 = (int) (Math.random() * (double) this.field1281.field3526.length);
                this.field1283 -= (int) (Math.random() * (double) this.field1281.field3515[this.field1282]);
            }
        }
    }

    @ObfuscatedName("cw.j(I)Ldx;")
    public final class128 method1118() {
        if (this.field1281 != null) {
            int var1 = client.field656 - this.field1283;
            if (var1 > 100 && this.field1281.field3520 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1281.field3515[this.field1282]) {
                            break label47;
                        }
                        var1 -= this.field1281.field3515[this.field1282];
                        this.field1282++;
                    } while (this.field1282 < this.field1281.field3526.length);
                    this.field1282 -= this.field1281.field3520;
                } while (this.field1282 >= 0 && this.field1282 < this.field1281.field3526.length);
                this.field1281 = null;
            }
            this.field1283 = client.field656 - var1;
        }
        class255 var2 = class255.method3070(this.field1278);
        if (var2.field3386 != null) {
            var2 = var2.method4304();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1275 == 1 || this.field1275 == 3) {
            var3 = var2.field3361;
            var4 = var2.field3360;
        } else {
            var3 = var2.field3360;
            var4 = var2.field3361;
        }
        int var5 = (var3 >> 1) + this.field1279;
        int var6 = (var3 + 1 >> 1) + this.field1279;
        int var7 = (var4 >> 1) + this.field1276;
        int var8 = (var4 + 1 >> 1) + this.field1276;
        int[][] var9 = class56.field516[this.field1280];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1279 << 7) + (var3 << 6);
        int var12 = (this.field1276 << 7) + (var4 << 6);
        return var2.method4280(this.field1277, this.field1275, var9, var11, var10, var12, this.field1281, this.field1282);
    }
}
