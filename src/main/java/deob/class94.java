package deob;

@ObfuscatedName("cu")
public class class94 extends class136 {

    @ObfuscatedName("cu.u")
    public int field1290;

    @ObfuscatedName("cu.f")
    public int field1287;

    @ObfuscatedName("cu.b")
    public int field1288;

    @ObfuscatedName("cu.g")
    public int field1289;

    @ObfuscatedName("cu.z")
    public int field1291;

    @ObfuscatedName("cu.p")
    public int field1286;

    @ObfuscatedName("cu.h")
    public class259 field1292;

    @ObfuscatedName("cu.y")
    public int field1293;

    @ObfuscatedName("cu.w")
    public int field1294;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class136 arg8) {
        this.field1290 = arg0;
        this.field1287 = arg1;
        this.field1288 = arg2;
        this.field1289 = arg3;
        this.field1291 = arg4;
        this.field1286 = arg5;
        if (arg6 != -1) {
            this.field1292 = class259.method154(arg6);
            this.field1293 = 0;
            this.field1294 = client.field655 - 1;
            if (this.field1292.field3534 == 0 && arg8 != null && arg8 instanceof class94) {
                class94 var10 = (class94) arg8;
                if (this.field1292 == var10.field1292) {
                    this.field1293 = var10.field1293;
                    this.field1294 = var10.field1294;
                    return;
                }
            }
            if (arg7 && this.field1292.field3525 != -1) {
                this.field1293 = (int) (Math.random() * (double) this.field1292.field3521.length);
                this.field1294 -= (int) (Math.random() * (double) this.field1292.field3523[this.field1293]);
            }
        }
    }

    @ObfuscatedName("cu.w(I)Ldf;")
    public final class128 method1103() {
        if (this.field1292 != null) {
            int var1 = client.field655 - this.field1294;
            if (var1 > 100 && this.field1292.field3525 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1292.field3523[this.field1293]) {
                            break label47;
                        }
                        var1 -= this.field1292.field3523[this.field1293];
                        this.field1293++;
                    } while (this.field1293 < this.field1292.field3521.length);
                    this.field1293 -= this.field1292.field3525;
                } while (this.field1293 >= 0 && this.field1293 < this.field1292.field3521.length);
                this.field1292 = null;
            }
            this.field1294 = client.field655 - var1;
        }
        class254 var2 = class254.method3048(this.field1290);
        if (var2.field3395 != null) {
            var2 = var2.method4321();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1288 == 1 || this.field1288 == 3) {
            var3 = var2.field3370;
            var4 = var2.field3369;
        } else {
            var3 = var2.field3369;
            var4 = var2.field3370;
        }
        int var5 = (var3 >> 1) + this.field1291;
        int var6 = (var3 + 1 >> 1) + this.field1291;
        int var7 = (var4 >> 1) + this.field1286;
        int var8 = (var4 + 1 >> 1) + this.field1286;
        int[][] var9 = class56.field496[this.field1289];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1291 << 7) + (var3 << 6);
        int var12 = (this.field1286 << 7) + (var4 << 6);
        return var2.method4290(this.field1287, this.field1288, var9, var11, var10, var12, this.field1292, this.field1293);
    }
}
