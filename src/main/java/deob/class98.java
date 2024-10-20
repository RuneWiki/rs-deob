package deob;

@ObfuscatedName("ct")
public class class98 extends class140 {

    @ObfuscatedName("ct.o")
    public int field1473;

    @ObfuscatedName("ct.k")
    public int field1474;

    @ObfuscatedName("ct.t")
    public int field1468;

    @ObfuscatedName("ct.d")
    public int field1469;

    @ObfuscatedName("ct.h")
    public int field1470;

    @ObfuscatedName("ct.m")
    public int field1471;

    @ObfuscatedName("ct.z")
    public class288 field1467;

    @ObfuscatedName("ct.i")
    public int field1466;

    @ObfuscatedName("ct.u")
    public int field1475;

    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class140 arg8) {
        this.field1473 = arg0;
        this.field1474 = arg1;
        this.field1468 = arg2;
        this.field1469 = arg3;
        this.field1470 = arg4;
        this.field1471 = arg5;
        if (arg6 != -1) {
            this.field1467 = class288.method1535(arg6);
            this.field1466 = 0;
            this.field1475 = client.field929 - 1;
            if (this.field1467.field3761 == 0 && arg8 != null && arg8 instanceof class98) {
                class98 var10 = (class98) arg8;
                if (this.field1467 == var10.field1467) {
                    this.field1466 = var10.field1466;
                    this.field1475 = var10.field1475;
                    return;
                }
            }
            if (arg7 && this.field1467.field3762 != -1) {
                this.field1466 = (int) (Math.random() * (double) this.field1467.field3758.length);
                this.field1475 -= (int) (Math.random() * (double) this.field1467.field3764[this.field1466]);
            }
        }
    }

    @ObfuscatedName("ct.u(I)Lei;")
    public final class132 method1081() {
        if (this.field1467 != null) {
            int var1 = client.field929 - this.field1475;
            if (var1 > 100 && this.field1467.field3762 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1467.field3764[this.field1466]) {
                            break label47;
                        }
                        var1 -= this.field1467.field3764[this.field1466];
                        this.field1466++;
                    } while (this.field1466 < this.field1467.field3758.length);
                    this.field1466 -= this.field1467.field3762;
                } while (this.field1466 >= 0 && this.field1466 < this.field1467.field3758.length);
                this.field1467 = null;
            }
            this.field1475 = client.field929 - var1;
        }
        class283 var2 = class283.method713(this.field1473);
        if (var2.field3632 != null) {
            var2 = var2.method4616();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1468 == 1 || this.field1468 == 3) {
            var3 = var2.field3607;
            var4 = var2.field3595;
        } else {
            var3 = var2.field3595;
            var4 = var2.field3607;
        }
        int var5 = (var3 >> 1) + this.field1470;
        int var6 = (var3 + 1 >> 1) + this.field1470;
        int var7 = (var4 >> 1) + this.field1471;
        int var8 = (var4 + 1 >> 1) + this.field1471;
        int[][] var9 = class63.field745[this.field1469];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1470 << 7) + (var3 << 6);
        int var12 = (this.field1471 << 7) + (var4 << 6);
        return var2.method4614(this.field1474, this.field1468, var9, var11, var10, var12, this.field1467, this.field1466);
    }
}
