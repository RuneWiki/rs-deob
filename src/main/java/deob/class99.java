package deob;

@ObfuscatedName("cx")
public class class99 extends class141 {

    @ObfuscatedName("cx.d")
    public int field1461;

    @ObfuscatedName("cx.x")
    public int field1452;

    @ObfuscatedName("cx.k")
    public int field1455;

    @ObfuscatedName("cx.z")
    public int field1454;

    @ObfuscatedName("cx.v")
    public int field1456;

    @ObfuscatedName("cx.m")
    public int field1453;

    @ObfuscatedName("cx.b")
    public class268 field1457;

    @ObfuscatedName("cx.t")
    public int field1458;

    @ObfuscatedName("cx.p")
    public int field1459;

    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class141 arg8) {
        this.field1461 = arg0;
        this.field1452 = arg1;
        this.field1455 = arg2;
        this.field1454 = arg3;
        this.field1456 = arg4;
        this.field1453 = arg5;
        if (arg6 != -1) {
            this.field1457 = class268.method76(arg6);
            this.field1458 = 0;
            this.field1459 = client.field881 - 1;
            if (this.field1457.field3682 == 0 && arg8 != null && arg8 instanceof class99) {
                class99 var10 = (class99) arg8;
                if (this.field1457 == var10.field1457) {
                    this.field1458 = var10.field1458;
                    this.field1459 = var10.field1459;
                    return;
                }
            }
            if (arg7 && this.field1457.field3673 != -1) {
                this.field1458 = (int) (Math.random() * (double) this.field1457.field3669.length);
                this.field1459 -= (int) (Math.random() * (double) this.field1457.field3671[this.field1458]);
            }
        }
    }

    @ObfuscatedName("cx.k(I)Leh;")
    public final class133 method1060() {
        if (this.field1457 != null) {
            int var1 = client.field881 - this.field1459;
            if (var1 > 100 && this.field1457.field3673 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1457.field3671[this.field1458]) {
                            break label47;
                        }
                        var1 -= this.field1457.field3671[this.field1458];
                        this.field1458++;
                    } while (this.field1458 < this.field1457.field3669.length);
                    this.field1458 -= this.field1457.field3673;
                } while (this.field1458 >= 0 && this.field1458 < this.field1457.field3669.length);
                this.field1457 = null;
            }
            this.field1459 = client.field881 - var1;
        }
        class263 var2 = class263.method10(this.field1461);
        if (var2.field3541 != null) {
            var2 = var2.method4355();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1455 == 1 || this.field1455 == 3) {
            var3 = var2.field3508;
            var4 = var2.field3550;
        } else {
            var3 = var2.field3550;
            var4 = var2.field3508;
        }
        int var5 = (var3 >> 1) + this.field1456;
        int var6 = (var3 + 1 >> 1) + this.field1456;
        int var7 = (var4 >> 1) + this.field1453;
        int var8 = (var4 + 1 >> 1) + this.field1453;
        int[][] var9 = class62.field729[this.field1454];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1456 << 7) + (var3 << 6);
        int var12 = (this.field1453 << 7) + (var4 << 6);
        return var2.method4403(this.field1452, this.field1455, var9, var11, var10, var12, this.field1457, this.field1458);
    }
}
