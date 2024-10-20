package deob;

@ObfuscatedName("cd")
public class class94 extends class136 {

    @ObfuscatedName("cd.c")
    public int field1270;

    @ObfuscatedName("cd.x")
    public int field1264;

    @ObfuscatedName("cd.t")
    public int field1268;

    @ObfuscatedName("cd.g")
    public int field1266;

    @ObfuscatedName("cd.l")
    public int field1263;

    @ObfuscatedName("cd.u")
    public int field1267;

    @ObfuscatedName("cd.j")
    public class259 field1269;

    @ObfuscatedName("cd.v")
    public int field1265;

    @ObfuscatedName("cd.d")
    public int field1271;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class136 arg8) {
        this.field1270 = arg0;
        this.field1264 = arg1;
        this.field1268 = arg2;
        this.field1266 = arg3;
        this.field1263 = arg4;
        this.field1267 = arg5;
        if (arg6 != -1) {
            this.field1269 = class259.method1897(arg6);
            this.field1265 = 0;
            this.field1271 = client.field628 - 1;
            if (this.field1269.field3503 == 0 && arg8 != null && arg8 instanceof class94) {
                class94 var10 = (class94) arg8;
                if (this.field1269 == var10.field1269) {
                    this.field1265 = var10.field1265;
                    this.field1271 = var10.field1271;
                    return;
                }
            }
            if (arg7 && this.field1269.field3494 != -1) {
                this.field1265 = (int) (Math.random() * (double) this.field1269.field3490.length);
                this.field1271 -= (int) (Math.random() * (double) this.field1269.field3485[this.field1265]);
            }
        }
    }

    @ObfuscatedName("cd.d(B)Ldr;")
    public final class128 method1062() {
        if (this.field1269 != null) {
            int var1 = client.field628 - this.field1271;
            if (var1 > 100 && this.field1269.field3494 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1269.field3485[this.field1265]) {
                            break label47;
                        }
                        var1 -= this.field1269.field3485[this.field1265];
                        this.field1265++;
                    } while (this.field1265 < this.field1269.field3490.length);
                    this.field1265 -= this.field1269.field3494;
                } while (this.field1265 >= 0 && this.field1265 < this.field1269.field3490.length);
                this.field1269 = null;
            }
            this.field1271 = client.field628 - var1;
        }
        class254 var2 = class254.method3035(this.field1270);
        if (var2.field3363 != null) {
            var2 = var2.method4291();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1268 == 1 || this.field1268 == 3) {
            var3 = var2.field3329;
            var4 = var2.field3366;
        } else {
            var3 = var2.field3366;
            var4 = var2.field3329;
        }
        int var5 = (var3 >> 1) + this.field1263;
        int var6 = (var3 + 1 >> 1) + this.field1263;
        int var7 = (var4 >> 1) + this.field1267;
        int var8 = (var4 + 1 >> 1) + this.field1267;
        int[][] var9 = class56.field476[this.field1266];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1263 << 7) + (var3 << 6);
        int var12 = (this.field1267 << 7) + (var4 << 6);
        return var2.method4275(this.field1264, this.field1268, var9, var11, var10, var12, this.field1269, this.field1265);
    }
}
