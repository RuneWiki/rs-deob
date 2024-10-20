package deob;

@ObfuscatedName("ca")
public class class98 extends class140 {

    @ObfuscatedName("ca.d")
    public int field1450;

    @ObfuscatedName("ca.z")
    public int field1451;

    @ObfuscatedName("ca.n")
    public int field1452;

    @ObfuscatedName("ca.r")
    public int field1453;

    @ObfuscatedName("ca.e")
    public int field1454;

    @ObfuscatedName("ca.y")
    public int field1459;

    @ObfuscatedName("ca.k")
    public class288 field1455;

    @ObfuscatedName("ca.s")
    public int field1457;

    @ObfuscatedName("ca.p")
    public int field1458;

    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class140 arg8) {
        this.field1450 = arg0;
        this.field1451 = arg1;
        this.field1452 = arg2;
        this.field1453 = arg3;
        this.field1454 = arg4;
        this.field1459 = arg5;
        if (arg6 != -1) {
            this.field1455 = class288.method4510(arg6);
            this.field1457 = 0;
            this.field1458 = client.field866 - 1;
            if (this.field1455.field3756 == 0 && arg8 != null && arg8 instanceof class98) {
                class98 var10 = (class98) arg8;
                if (this.field1455 == var10.field1455) {
                    this.field1457 = var10.field1457;
                    this.field1458 = var10.field1458;
                    return;
                }
            }
            if (arg7 && this.field1455.field3760 != -1) {
                this.field1457 = (int) (Math.random() * (double) this.field1455.field3764.length);
                this.field1458 -= (int) (Math.random() * (double) this.field1455.field3758[this.field1457]);
            }
        }
    }

    @ObfuscatedName("ca.x(I)Lel;")
    public final class132 method1067() {
        if (this.field1455 != null) {
            int var1 = client.field866 - this.field1458;
            if (var1 > 100 && this.field1455.field3760 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1455.field3758[this.field1457]) {
                            break label47;
                        }
                        var1 -= this.field1455.field3758[this.field1457];
                        this.field1457++;
                    } while (this.field1457 < this.field1455.field3764.length);
                    this.field1457 -= this.field1455.field3760;
                } while (this.field1457 >= 0 && this.field1457 < this.field1455.field3764.length);
                this.field1455 = null;
            }
            this.field1458 = client.field866 - var1;
        }
        class283 var2 = class283.method3065(this.field1450);
        if (var2.field3630 != null) {
            var2 = var2.method4723();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1452 == 1 || this.field1452 == 3) {
            var3 = var2.field3605;
            var4 = var2.field3604;
        } else {
            var3 = var2.field3604;
            var4 = var2.field3605;
        }
        int var5 = (var3 >> 1) + this.field1454;
        int var6 = (var3 + 1 >> 1) + this.field1454;
        int var7 = (var4 >> 1) + this.field1459;
        int var8 = (var4 + 1 >> 1) + this.field1459;
        int[][] var9 = class63.field738[this.field1453];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1454 << 7) + (var3 << 6);
        int var12 = (this.field1459 << 7) + (var4 << 6);
        return var2.method4739(this.field1451, this.field1452, var9, var11, var10, var12, this.field1455, this.field1457);
    }
}
