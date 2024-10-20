package deob;

@ObfuscatedName("cw")
public class class98 extends class140 {

    @ObfuscatedName("cw.g")
    public int field1444;

    @ObfuscatedName("cw.e")
    public int field1443;

    @ObfuscatedName("cw.b")
    public int field1445;

    @ObfuscatedName("cw.z")
    public int field1442;

    @ObfuscatedName("cw.n")
    public int field1446;

    @ObfuscatedName("cw.l")
    public int field1450;

    @ObfuscatedName("cw.s")
    public class288 field1448;

    @ObfuscatedName("cw.y")
    public int field1449;

    @ObfuscatedName("cw.c")
    public int field1447;

    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class140 arg8) {
        this.field1444 = arg0;
        this.field1443 = arg1;
        this.field1445 = arg2;
        this.field1442 = arg3;
        this.field1446 = arg4;
        this.field1450 = arg5;
        if (arg6 != -1) {
            this.field1448 = class288.method1825(arg6);
            this.field1449 = 0;
            this.field1447 = client.field913 - 1;
            if (this.field1448.field3764 == 0 && arg8 != null && arg8 instanceof class98) {
                class98 var10 = (class98) arg8;
                if (this.field1448 == var10.field1448) {
                    this.field1449 = var10.field1449;
                    this.field1447 = var10.field1447;
                    return;
                }
            }
            if (arg7 && this.field1448.field3766 != -1) {
                this.field1449 = (int) (Math.random() * (double) this.field1448.field3762.length);
                this.field1447 -= (int) (Math.random() * (double) this.field1448.field3757[this.field1449]);
            }
        }
    }

    @ObfuscatedName("cw.c(I)Lee;")
    public final class132 method1120() {
        if (this.field1448 != null) {
            int var1 = client.field913 - this.field1447;
            if (var1 > 100 && this.field1448.field3766 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1448.field3757[this.field1449]) {
                            break label47;
                        }
                        var1 -= this.field1448.field3757[this.field1449];
                        this.field1449++;
                    } while (this.field1449 < this.field1448.field3762.length);
                    this.field1449 -= this.field1448.field3766;
                } while (this.field1449 >= 0 && this.field1449 < this.field1448.field3762.length);
                this.field1448 = null;
            }
            this.field1447 = client.field913 - var1;
        }
        class283 var2 = class283.method1732(this.field1444);
        if (var2.field3633 != null) {
            var2 = var2.method4699();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1445 == 1 || this.field1445 == 3) {
            var3 = var2.field3608;
            var4 = var2.field3610;
        } else {
            var3 = var2.field3610;
            var4 = var2.field3608;
        }
        int var5 = (var3 >> 1) + this.field1446;
        int var6 = (var3 + 1 >> 1) + this.field1446;
        int var7 = (var4 >> 1) + this.field1450;
        int var8 = (var4 + 1 >> 1) + this.field1450;
        int[][] var9 = class63.field731[this.field1442];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1446 << 7) + (var3 << 6);
        int var12 = (this.field1450 << 7) + (var4 << 6);
        return var2.method4696(this.field1443, this.field1445, var9, var11, var10, var12, this.field1448, this.field1449);
    }
}
