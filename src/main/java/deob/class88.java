package deob;

@ObfuscatedName("cg")
public class class88 extends class130 {

    @ObfuscatedName("cg.c")
    public int field1263;

    @ObfuscatedName("cg.q")
    public int field1260;

    @ObfuscatedName("cg.m")
    public int field1261;

    @ObfuscatedName("cg.j")
    public int field1267;

    @ObfuscatedName("cg.g")
    public int field1259;

    @ObfuscatedName("cg.i")
    public int field1264;

    @ObfuscatedName("cg.h")
    public class276 field1265;

    @ObfuscatedName("cg.l")
    public int field1266;

    @ObfuscatedName("cg.d")
    public int field1262;

    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class130 arg8) {
        this.field1263 = arg0;
        this.field1260 = arg1;
        this.field1261 = arg2;
        this.field1267 = arg3;
        this.field1259 = arg4;
        this.field1264 = arg5;
        if (arg6 != -1) {
            this.field1265 = class276.method2826(arg6);
            this.field1266 = 0;
            this.field1262 = client.field654 - 1;
            if (this.field1265.field3581 == 0 && arg8 != null && arg8 instanceof class88) {
                class88 var10 = (class88) arg8;
                if (this.field1265 == var10.field1265) {
                    this.field1266 = var10.field1266;
                    this.field1262 = var10.field1262;
                    return;
                }
            }
            if (arg7 && this.field1265.field3594 != -1) {
                this.field1266 = (int) (Math.random() * (double) this.field1265.field3585.length);
                this.field1262 -= (int) (Math.random() * (double) this.field1265.field3587[this.field1266]);
            }
        }
    }

    @ObfuscatedName("cg.o(B)Ldx;")
    public final class122 method1063() {
        if (this.field1265 != null) {
            int var1 = client.field654 - this.field1262;
            if (var1 > 100 && this.field1265.field3594 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1265.field3587[this.field1266]) {
                            break label47;
                        }
                        var1 -= this.field1265.field3587[this.field1266];
                        this.field1266++;
                    } while (this.field1266 < this.field1265.field3585.length);
                    this.field1266 -= this.field1265.field3594;
                } while (this.field1266 >= 0 && this.field1266 < this.field1265.field3585.length);
                this.field1265 = null;
            }
            this.field1262 = client.field654 - var1;
        }
        class271 var2 = class271.method2839(this.field1263);
        if (var2.field3457 != null) {
            var2 = var2.method4668();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1261 == 1 || this.field1261 == 3) {
            var3 = var2.field3433;
            var4 = var2.field3431;
        } else {
            var3 = var2.field3431;
            var4 = var2.field3433;
        }
        int var5 = (var3 >> 1) + this.field1259;
        int var6 = (var3 + 1 >> 1) + this.field1259;
        int var7 = (var4 >> 1) + this.field1264;
        int var8 = (var4 + 1 >> 1) + this.field1264;
        int[][] var9 = class51.field495[this.field1267];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1259 << 7) + (var3 << 6);
        int var12 = (this.field1264 << 7) + (var4 << 6);
        return var2.method4675(this.field1260, this.field1261, var9, var11, var10, var12, this.field1265, this.field1266);
    }
}
