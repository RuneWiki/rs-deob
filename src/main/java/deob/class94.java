package deob;

@ObfuscatedName("cu")
public class class94 extends class136 {

    @ObfuscatedName("cu.q")
    public int field1298;

    @ObfuscatedName("cu.w")
    public int field1295;

    @ObfuscatedName("cu.e")
    public int field1293;

    @ObfuscatedName("cu.p")
    public int field1296;

    @ObfuscatedName("cu.k")
    public int field1297;

    @ObfuscatedName("cu.l")
    public int field1300;

    @ObfuscatedName("cu.b")
    public class259 field1294;

    @ObfuscatedName("cu.i")
    public int field1299;

    @ObfuscatedName("cu.c")
    public int field1301;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class136 arg8) {
        this.field1298 = arg0;
        this.field1295 = arg1;
        this.field1293 = arg2;
        this.field1296 = arg3;
        this.field1297 = arg4;
        this.field1300 = arg5;
        if (arg6 != -1) {
            this.field1294 = class259.method67(arg6);
            this.field1299 = 0;
            this.field1301 = client.field882 - 1;
            if (this.field1294.field3530 == 0 && arg8 != null && arg8 instanceof class94) {
                class94 var10 = (class94) arg8;
                if (this.field1294 == var10.field1294) {
                    this.field1299 = var10.field1299;
                    this.field1301 = var10.field1301;
                    return;
                }
            }
            if (arg7 && this.field1294.field3516 != -1) {
                this.field1299 = (int) (Math.random() * (double) this.field1294.field3521.length);
                this.field1301 -= (int) (Math.random() * (double) this.field1294.field3523[this.field1299]);
            }
        }
    }

    @ObfuscatedName("cu.c(I)Ldm;")
    public final class128 method1087() {
        if (this.field1294 != null) {
            int var1 = client.field882 - this.field1301;
            if (var1 > 100 && this.field1294.field3516 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1294.field3523[this.field1299]) {
                            break label47;
                        }
                        var1 -= this.field1294.field3523[this.field1299];
                        this.field1299++;
                    } while (this.field1299 < this.field1294.field3521.length);
                    this.field1299 -= this.field1294.field3516;
                } while (this.field1299 >= 0 && this.field1299 < this.field1294.field3521.length);
                this.field1294 = null;
            }
            this.field1301 = client.field882 - var1;
        }
        class254 var2 = class254.method2713(this.field1298);
        if (var2.field3392 != null) {
            var2 = var2.method4212();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1293 == 1 || this.field1293 == 3) {
            var3 = var2.field3367;
            var4 = var2.field3366;
        } else {
            var3 = var2.field3366;
            var4 = var2.field3367;
        }
        int var5 = (var3 >> 1) + this.field1297;
        int var6 = (var3 + 1 >> 1) + this.field1297;
        int var7 = (var4 >> 1) + this.field1300;
        int var8 = (var4 + 1 >> 1) + this.field1300;
        int[][] var9 = class56.field517[this.field1296];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1297 << 7) + (var3 << 6);
        int var12 = (this.field1300 << 7) + (var4 << 6);
        return var2.method4231(this.field1295, this.field1293, var9, var11, var10, var12, this.field1294, this.field1299);
    }
}
