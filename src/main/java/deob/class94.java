package deob;

@ObfuscatedName("cf")
public class class94 extends class136 {

    @ObfuscatedName("cf.m")
    public int field1270;

    @ObfuscatedName("cf.f")
    public int field1268;

    @ObfuscatedName("cf.q")
    public int field1275;

    @ObfuscatedName("cf.w")
    public int field1271;

    @ObfuscatedName("cf.o")
    public int field1272;

    @ObfuscatedName("cf.u")
    public int field1273;

    @ObfuscatedName("cf.g")
    public class270 field1274;

    @ObfuscatedName("cf.l")
    public int field1269;

    @ObfuscatedName("cf.e")
    public int field1276;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class136 arg8) {
        this.field1270 = arg0;
        this.field1268 = arg1;
        this.field1275 = arg2;
        this.field1271 = arg3;
        this.field1272 = arg4;
        this.field1273 = arg5;
        if (arg6 != -1) {
            this.field1274 = class270.method596(arg6);
            this.field1269 = 0;
            this.field1276 = client.field633 - 1;
            if (this.field1274.field3600 == 0 && arg8 != null && arg8 instanceof class94) {
                class94 var10 = (class94) arg8;
                if (this.field1274 == var10.field1274) {
                    this.field1269 = var10.field1269;
                    this.field1276 = var10.field1276;
                    return;
                }
            }
            if (arg7 && this.field1274.field3591 != -1) {
                this.field1269 = (int) (Math.random() * (double) this.field1274.field3587.length);
                this.field1276 -= (int) (Math.random() * (double) this.field1274.field3589[this.field1269]);
            }
        }
    }

    @ObfuscatedName("cf.e(I)Ldu;")
    public final class128 method1105() {
        if (this.field1274 != null) {
            int var1 = client.field633 - this.field1276;
            if (var1 > 100 && this.field1274.field3591 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1274.field3589[this.field1269]) {
                            break label47;
                        }
                        var1 -= this.field1274.field3589[this.field1269];
                        this.field1269++;
                    } while (this.field1269 < this.field1274.field3587.length);
                    this.field1269 -= this.field1274.field3591;
                } while (this.field1269 >= 0 && this.field1269 < this.field1274.field3587.length);
                this.field1274 = null;
            }
            this.field1276 = client.field633 - var1;
        }
        class265 var2 = class265.method763(this.field1270);
        if (var2.field3463 != null) {
            var2 = var2.method4601();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1275 == 1 || this.field1275 == 3) {
            var3 = var2.field3465;
            var4 = var2.field3437;
        } else {
            var3 = var2.field3437;
            var4 = var2.field3465;
        }
        int var5 = (var3 >> 1) + this.field1272;
        int var6 = (var3 + 1 >> 1) + this.field1272;
        int var7 = (var4 >> 1) + this.field1273;
        int var8 = (var4 + 1 >> 1) + this.field1273;
        int[][] var9 = class56.field494[this.field1271];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1272 << 7) + (var3 << 6);
        int var12 = (this.field1273 << 7) + (var4 << 6);
        return var2.method4599(this.field1268, this.field1275, var9, var11, var10, var12, this.field1274, this.field1269);
    }
}
