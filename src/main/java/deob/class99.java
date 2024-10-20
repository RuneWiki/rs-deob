package deob;

@ObfuscatedName("cn")
public class class99 extends class141 {

    @ObfuscatedName("cn.a")
    public int field1437;

    @ObfuscatedName("cn.w")
    public int field1433;

    @ObfuscatedName("cn.e")
    public int field1435;

    @ObfuscatedName("cn.k")
    public int field1436;

    @ObfuscatedName("cn.u")
    public int field1438;

    @ObfuscatedName("cn.z")
    public int field1434;

    @ObfuscatedName("cn.t")
    public class272 field1439;

    @ObfuscatedName("cn.f")
    public int field1440;

    @ObfuscatedName("cn.g")
    public int field1441;

    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class141 arg8) {
        this.field1437 = arg0;
        this.field1433 = arg1;
        this.field1435 = arg2;
        this.field1436 = arg3;
        this.field1438 = arg4;
        this.field1434 = arg5;
        if (arg6 != -1) {
            this.field1439 = class272.method3881(arg6);
            this.field1440 = 0;
            this.field1441 = client.field963 - 1;
            if (this.field1439.field3681 == 0 && arg8 != null && arg8 instanceof class99) {
                class99 var10 = (class99) arg8;
                if (this.field1439 == var10.field1439) {
                    this.field1440 = var10.field1440;
                    this.field1441 = var10.field1441;
                    return;
                }
            }
            if (arg7 && this.field1439.field3683 != -1) {
                this.field1440 = (int) (Math.random() * (double) this.field1439.field3671.length);
                this.field1441 -= (int) (Math.random() * (double) this.field1439.field3676[this.field1440]);
            }
        }
    }

    @ObfuscatedName("cn.e(I)Lef;")
    public final class133 method981() {
        if (this.field1439 != null) {
            int var1 = client.field963 - this.field1441;
            if (var1 > 100 && this.field1439.field3683 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1439.field3676[this.field1440]) {
                            break label47;
                        }
                        var1 -= this.field1439.field3676[this.field1440];
                        this.field1440++;
                    } while (this.field1440 < this.field1439.field3671.length);
                    this.field1440 -= this.field1439.field3683;
                } while (this.field1440 >= 0 && this.field1440 < this.field1439.field3671.length);
                this.field1439 = null;
            }
            this.field1441 = client.field963 - var1;
        }
        class267 var2 = class267.method2129(this.field1437);
        if (var2.field3551 != null) {
            var2 = var2.method4325();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1435 == 1 || this.field1435 == 3) {
            var3 = var2.field3526;
            var4 = var2.field3544;
        } else {
            var3 = var2.field3544;
            var4 = var2.field3526;
        }
        int var5 = (var3 >> 1) + this.field1438;
        int var6 = (var3 + 1 >> 1) + this.field1438;
        int var7 = (var4 >> 1) + this.field1434;
        int var8 = (var4 + 1 >> 1) + this.field1434;
        int[][] var9 = class62.field696[this.field1436];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1438 << 7) + (var3 << 6);
        int var12 = (this.field1434 << 7) + (var4 << 6);
        return var2.method4293(this.field1433, this.field1435, var9, var11, var10, var12, this.field1439, this.field1440);
    }
}
