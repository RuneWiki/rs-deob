package deob;

@ObfuscatedName("cl")
public class class97 extends class139 {

    @ObfuscatedName("cl.s")
    public int field1438;

    @ObfuscatedName("cl.g")
    public int field1432;

    @ObfuscatedName("cl.m")
    public int field1435;

    @ObfuscatedName("cl.h")
    public int field1434;

    @ObfuscatedName("cl.i")
    public int field1433;

    @ObfuscatedName("cl.w")
    public int field1436;

    @ObfuscatedName("cl.t")
    public class272 field1437;

    @ObfuscatedName("cl.d")
    public int field1431;

    @ObfuscatedName("cl.z")
    public int field1439;

    public class97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class139 arg8) {
        this.field1438 = arg0;
        this.field1432 = arg1;
        this.field1435 = arg2;
        this.field1434 = arg3;
        this.field1433 = arg4;
        this.field1436 = arg5;
        if (arg6 != -1) {
            this.field1437 = class272.method4180(arg6);
            this.field1431 = 0;
            this.field1439 = client.field1036 - 1;
            if (this.field1437.field3695 == 0 && arg8 != null && arg8 instanceof class97) {
                class97 var10 = (class97) arg8;
                if (this.field1437 == var10.field1437) {
                    this.field1431 = var10.field1431;
                    this.field1439 = var10.field1439;
                    return;
                }
            }
            if (arg7 && this.field1437.field3690 != -1) {
                this.field1431 = (int) (Math.random() * (double) this.field1437.field3689.length);
                this.field1439 -= (int) (Math.random() * (double) this.field1437.field3684[this.field1431]);
            }
        }
    }

    @ObfuscatedName("cl.z(I)Les;")
    public final class131 method1039() {
        if (this.field1437 != null) {
            int var1 = client.field1036 - this.field1439;
            if (var1 > 100 && this.field1437.field3690 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1437.field3684[this.field1431]) {
                            break label47;
                        }
                        var1 -= this.field1437.field3684[this.field1431];
                        this.field1431++;
                    } while (this.field1431 < this.field1437.field3689.length);
                    this.field1431 -= this.field1437.field3690;
                } while (this.field1431 >= 0 && this.field1431 < this.field1437.field3689.length);
                this.field1437 = null;
            }
            this.field1439 = client.field1036 - var1;
        }
        class267 var2 = class267.method4025(this.field1438);
        if (var2.field3559 != null) {
            var2 = var2.method4596();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1435 == 1 || this.field1435 == 3) {
            var3 = var2.field3534;
            var4 = var2.field3537;
        } else {
            var3 = var2.field3537;
            var4 = var2.field3534;
        }
        int var5 = (var3 >> 1) + this.field1433;
        int var6 = (var3 + 1 >> 1) + this.field1433;
        int var7 = (var4 >> 1) + this.field1436;
        int var8 = (var4 + 1 >> 1) + this.field1436;
        int[][] var9 = class63.field731[this.field1434];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1433 << 7) + (var3 << 6);
        int var12 = (this.field1436 << 7) + (var4 << 6);
        return var2.method4611(this.field1432, this.field1435, var9, var11, var10, var12, this.field1437, this.field1431);
    }
}
