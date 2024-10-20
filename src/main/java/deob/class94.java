package deob;

@ObfuscatedName("ce")
public class class94 extends class136 {

    @ObfuscatedName("ce.z")
    public int field1281;

    @ObfuscatedName("ce.n")
    public int field1284;

    @ObfuscatedName("ce.v")
    public int field1278;

    @ObfuscatedName("ce.u")
    public int field1277;

    @ObfuscatedName("ce.r")
    public int field1280;

    @ObfuscatedName("ce.p")
    public int field1276;

    @ObfuscatedName("ce.q")
    public class259 field1282;

    @ObfuscatedName("ce.m")
    public int field1283;

    @ObfuscatedName("ce.y")
    public int field1279;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class136 arg8) {
        this.field1281 = arg0;
        this.field1284 = arg1;
        this.field1278 = arg2;
        this.field1277 = arg3;
        this.field1280 = arg4;
        this.field1276 = arg5;
        if (arg6 != -1) {
            this.field1282 = class259.method122(arg6);
            this.field1283 = 0;
            this.field1279 = client.field645 - 1;
            if (this.field1282.field3518 == 0 && arg8 != null && arg8 instanceof class94) {
                class94 var10 = (class94) arg8;
                if (this.field1282 == var10.field1282) {
                    this.field1283 = var10.field1283;
                    this.field1279 = var10.field1279;
                    return;
                }
            }
            if (arg7 && this.field1282.field3509 != -1) {
                this.field1283 = (int) (Math.random() * (double) this.field1282.field3515.length);
                this.field1279 -= (int) (Math.random() * (double) this.field1282.field3507[this.field1283]);
            }
        }
    }

    @ObfuscatedName("ce.y(I)Ldh;")
    public final class128 method1115() {
        if (this.field1282 != null) {
            int var1 = client.field645 - this.field1279;
            if (var1 > 100 && this.field1282.field3509 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1282.field3507[this.field1283]) {
                            break label47;
                        }
                        var1 -= this.field1282.field3507[this.field1283];
                        this.field1283++;
                    } while (this.field1283 < this.field1282.field3515.length);
                    this.field1283 -= this.field1282.field3509;
                } while (this.field1283 >= 0 && this.field1283 < this.field1282.field3515.length);
                this.field1282 = null;
            }
            this.field1279 = client.field645 - var1;
        }
        class254 var2 = class254.method1148(this.field1281);
        if (var2.field3378 != null) {
            var2 = var2.method4158();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1278 == 1 || this.field1278 == 3) {
            var3 = var2.field3353;
            var4 = var2.field3383;
        } else {
            var3 = var2.field3383;
            var4 = var2.field3353;
        }
        int var5 = (var3 >> 1) + this.field1280;
        int var6 = (var3 + 1 >> 1) + this.field1280;
        int var7 = (var4 >> 1) + this.field1276;
        int var8 = (var4 + 1 >> 1) + this.field1276;
        int[][] var9 = class56.field491[this.field1277];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1280 << 7) + (var3 << 6);
        int var12 = (this.field1276 << 7) + (var4 << 6);
        return var2.method4148(this.field1284, this.field1278, var9, var11, var10, var12, this.field1282, this.field1283);
    }
}
