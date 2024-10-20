package deob;

@ObfuscatedName("cm")
public class class88 extends class130 {

    @ObfuscatedName("cm.y")
    public int field1251;

    @ObfuscatedName("cm.c")
    public int field1250;

    @ObfuscatedName("cm.n")
    public int field1256;

    @ObfuscatedName("cm.u")
    public int field1254;

    @ObfuscatedName("cm.i")
    public int field1255;

    @ObfuscatedName("cm.r")
    public int field1253;

    @ObfuscatedName("cm.j")
    public class276 field1249;

    @ObfuscatedName("cm.p")
    public int field1252;

    @ObfuscatedName("cm.e")
    public int field1257;

    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class130 arg8) {
        this.field1251 = arg0;
        this.field1250 = arg1;
        this.field1256 = arg2;
        this.field1254 = arg3;
        this.field1255 = arg4;
        this.field1253 = arg5;
        if (arg6 != -1) {
            this.field1249 = class276.method3241(arg6);
            this.field1252 = 0;
            this.field1257 = client.field637 - 1;
            if (this.field1249.field3601 == 0 && arg8 != null && arg8 instanceof class88) {
                class88 var10 = (class88) arg8;
                if (this.field1249 == var10.field1249) {
                    this.field1252 = var10.field1252;
                    this.field1257 = var10.field1257;
                    return;
                }
            }
            if (arg7 && this.field1249.field3592 != -1) {
                this.field1252 = (int) (Math.random() * (double) this.field1249.field3594.length);
                this.field1257 -= (int) (Math.random() * (double) this.field1249.field3586[this.field1252]);
            }
        }
    }

    @ObfuscatedName("cm.v(I)Lde;")
    public final class122 method1059() {
        if (this.field1249 != null) {
            int var1 = client.field637 - this.field1257;
            if (var1 > 100 && this.field1249.field3592 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1249.field3586[this.field1252]) {
                            break label47;
                        }
                        var1 -= this.field1249.field3586[this.field1252];
                        this.field1252++;
                    } while (this.field1252 < this.field1249.field3594.length);
                    this.field1252 -= this.field1249.field3592;
                } while (this.field1252 >= 0 && this.field1252 < this.field1249.field3594.length);
                this.field1249 = null;
            }
            this.field1257 = client.field637 - var1;
        }
        class271 var2 = class271.method3187(this.field1251);
        if (var2.field3439 != null) {
            var2 = var2.method4677();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1256 == 1 || this.field1256 == 3) {
            var3 = var2.field3438;
            var4 = var2.field3437;
        } else {
            var3 = var2.field3437;
            var4 = var2.field3438;
        }
        int var5 = (var3 >> 1) + this.field1255;
        int var6 = (var3 + 1 >> 1) + this.field1255;
        int var7 = (var4 >> 1) + this.field1253;
        int var8 = (var4 + 1 >> 1) + this.field1253;
        int[][] var9 = class51.field501[this.field1254];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1255 << 7) + (var3 << 6);
        int var12 = (this.field1253 << 7) + (var4 << 6);
        return var2.method4680(this.field1250, this.field1256, var9, var11, var10, var12, this.field1249, this.field1252);
    }
}
