package deob;

@ObfuscatedName("cw")
public class class98 extends class140 {

    @ObfuscatedName("cw.c")
    public int field1465;

    @ObfuscatedName("cw.i")
    public int field1463;

    @ObfuscatedName("cw.o")
    public int field1457;

    @ObfuscatedName("cw.j")
    public int field1458;

    @ObfuscatedName("cw.k")
    public int field1456;

    @ObfuscatedName("cw.x")
    public int field1460;

    @ObfuscatedName("cw.z")
    public class288 field1455;

    @ObfuscatedName("cw.p")
    public int field1462;

    @ObfuscatedName("cw.w")
    public int field1459;

    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class140 arg8) {
        this.field1465 = arg0;
        this.field1463 = arg1;
        this.field1457 = arg2;
        this.field1458 = arg3;
        this.field1456 = arg4;
        this.field1460 = arg5;
        if (arg6 != -1) {
            this.field1455 = class288.method3535(arg6);
            this.field1462 = 0;
            this.field1459 = client.field867 - 1;
            if (this.field1455.field3750 == 0 && arg8 != null && arg8 instanceof class98) {
                class98 var10 = (class98) arg8;
                if (this.field1455 == var10.field1455) {
                    this.field1462 = var10.field1462;
                    this.field1459 = var10.field1459;
                    return;
                }
            }
            if (arg7 && this.field1455.field3755 != -1) {
                this.field1462 = (int) (Math.random() * (double) this.field1455.field3751.length);
                this.field1459 -= (int) (Math.random() * (double) this.field1455.field3764[this.field1462]);
            }
        }
    }

    @ObfuscatedName("cw.w(B)Led;")
    public final class132 method1043() {
        if (this.field1455 != null) {
            int var1 = client.field867 - this.field1459;
            if (var1 > 100 && this.field1455.field3755 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1455.field3764[this.field1462]) {
                            break label47;
                        }
                        var1 -= this.field1455.field3764[this.field1462];
                        this.field1462++;
                    } while (this.field1462 < this.field1455.field3751.length);
                    this.field1462 -= this.field1455.field3755;
                } while (this.field1462 >= 0 && this.field1462 < this.field1455.field3751.length);
                this.field1455 = null;
            }
            this.field1459 = client.field867 - var1;
        }
        class283 var2 = class283.method4185(this.field1465);
        if (var2.field3628 != null) {
            var2 = var2.method4635();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1457 == 1 || this.field1457 == 3) {
            var3 = var2.field3603;
            var4 = var2.field3602;
        } else {
            var3 = var2.field3602;
            var4 = var2.field3603;
        }
        int var5 = (var3 >> 1) + this.field1456;
        int var6 = (var3 + 1 >> 1) + this.field1456;
        int var7 = (var4 >> 1) + this.field1460;
        int var8 = (var4 + 1 >> 1) + this.field1460;
        int[][] var9 = class63.field729[this.field1458];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1456 << 7) + (var3 << 6);
        int var12 = (this.field1460 << 7) + (var4 << 6);
        return var2.method4633(this.field1463, this.field1457, var9, var11, var10, var12, this.field1455, this.field1462);
    }
}
