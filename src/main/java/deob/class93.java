package deob;

@ObfuscatedName("ci")
public class class93 extends class135 {

    @ObfuscatedName("ci.n")
    public int field1261;

    @ObfuscatedName("ci.h")
    public int field1254;

    @ObfuscatedName("ci.l")
    public int field1260;

    @ObfuscatedName("ci.g")
    public int field1256;

    @ObfuscatedName("ci.b")
    public int field1257;

    @ObfuscatedName("ci.a")
    public int field1253;

    @ObfuscatedName("ci.c")
    public class279 field1259;

    @ObfuscatedName("ci.z")
    public int field1258;

    @ObfuscatedName("ci.j")
    public int field1255;

    public class93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class135 arg8) {
        this.field1261 = arg0;
        this.field1254 = arg1;
        this.field1260 = arg2;
        this.field1256 = arg3;
        this.field1257 = arg4;
        this.field1253 = arg5;
        if (arg6 != -1) {
            this.field1259 = class279.method2783(arg6);
            this.field1258 = 0;
            this.field1255 = client.field899 - 1;
            if (this.field1259.field3616 == 0 && arg8 != null && arg8 instanceof class93) {
                class93 var10 = (class93) arg8;
                if (this.field1259 == var10.field1259) {
                    this.field1258 = var10.field1258;
                    this.field1255 = var10.field1255;
                    return;
                }
            }
            if (arg7 && this.field1259.field3607 != -1) {
                this.field1258 = (int) (Math.random() * (double) this.field1259.field3612.length);
                this.field1255 -= (int) (Math.random() * (double) this.field1259.field3603[this.field1258]);
            }
        }
    }

    @ObfuscatedName("ci.j(I)Ldq;")
    public final class127 method1101() {
        if (this.field1259 != null) {
            int var1 = client.field899 - this.field1255;
            if (var1 > 100 && this.field1259.field3607 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1259.field3603[this.field1258]) {
                            break label47;
                        }
                        var1 -= this.field1259.field3603[this.field1258];
                        this.field1258++;
                    } while (this.field1258 < this.field1259.field3612.length);
                    this.field1258 -= this.field1259.field3607;
                } while (this.field1258 >= 0 && this.field1258 < this.field1259.field3612.length);
                this.field1259 = null;
            }
            this.field1255 = client.field899 - var1;
        }
        class274 var2 = class274.method4676(this.field1261);
        if (var2.field3481 != null) {
            var2 = var2.method4892();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1260 == 1 || this.field1260 == 3) {
            var3 = var2.field3482;
            var4 = var2.field3455;
        } else {
            var3 = var2.field3455;
            var4 = var2.field3482;
        }
        int var5 = (var3 >> 1) + this.field1257;
        int var6 = (var3 + 1 >> 1) + this.field1257;
        int var7 = (var4 >> 1) + this.field1253;
        int var8 = (var4 + 1 >> 1) + this.field1253;
        int[][] var9 = class56.field511[this.field1256];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1257 << 7) + (var3 << 6);
        int var12 = (this.field1253 << 7) + (var4 << 6);
        return var2.method4870(this.field1254, this.field1260, var9, var11, var10, var12, this.field1259, this.field1258);
    }
}
