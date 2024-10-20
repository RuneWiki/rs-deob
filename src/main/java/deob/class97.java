package deob;

@ObfuscatedName("cs")
public class class97 extends class139 {

    @ObfuscatedName("cs.p")
    public int field1431;

    @ObfuscatedName("cs.i")
    public int field1427;

    @ObfuscatedName("cs.w")
    public int field1425;

    @ObfuscatedName("cs.s")
    public int field1426;

    @ObfuscatedName("cs.j")
    public int field1430;

    @ObfuscatedName("cs.a")
    public int field1428;

    @ObfuscatedName("cs.t")
    public class272 field1423;

    @ObfuscatedName("cs.r")
    public int field1429;

    @ObfuscatedName("cs.m")
    public int field1424;

    public class97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class139 arg8) {
        this.field1431 = arg0;
        this.field1427 = arg1;
        this.field1425 = arg2;
        this.field1426 = arg3;
        this.field1430 = arg4;
        this.field1428 = arg5;
        if (arg6 != -1) {
            this.field1423 = class272.method2308(arg6);
            this.field1429 = 0;
            this.field1424 = client.field832 - 1;
            if (this.field1423.field3673 == 0 && arg8 != null && arg8 instanceof class97) {
                class97 var10 = (class97) arg8;
                if (this.field1423 == var10.field1423) {
                    this.field1429 = var10.field1429;
                    this.field1424 = var10.field1424;
                    return;
                }
            }
            if (arg7 && this.field1423.field3664 != -1) {
                this.field1429 = (int) (Math.random() * (double) this.field1423.field3660.length);
                this.field1424 -= (int) (Math.random() * (double) this.field1423.field3670[this.field1429]);
            }
        }
    }

    @ObfuscatedName("cs.m(I)Len;")
    public final class131 method1045() {
        if (this.field1423 != null) {
            int var1 = client.field832 - this.field1424;
            if (var1 > 100 && this.field1423.field3664 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1423.field3670[this.field1429]) {
                            break label47;
                        }
                        var1 -= this.field1423.field3670[this.field1429];
                        this.field1429++;
                    } while (this.field1429 < this.field1423.field3660.length);
                    this.field1429 -= this.field1423.field3664;
                } while (this.field1429 >= 0 && this.field1429 < this.field1423.field3660.length);
                this.field1423 = null;
            }
            this.field1424 = client.field832 - var1;
        }
        class267 var2 = class267.method2363(this.field1431);
        if (var2.field3529 != null) {
            var2 = var2.method4438();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1425 == 1 || this.field1425 == 3) {
            var3 = var2.field3512;
            var4 = var2.field3511;
        } else {
            var3 = var2.field3511;
            var4 = var2.field3512;
        }
        int var5 = (var3 >> 1) + this.field1430;
        int var6 = (var3 + 1 >> 1) + this.field1430;
        int var7 = (var4 >> 1) + this.field1428;
        int var8 = (var4 + 1 >> 1) + this.field1428;
        int[][] var9 = class62.field690[this.field1426];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1430 << 7) + (var3 << 6);
        int var12 = (this.field1428 << 7) + (var4 << 6);
        return var2.method4436(this.field1427, this.field1425, var9, var11, var10, var12, this.field1423, this.field1429);
    }
}
