package deob;

@ObfuscatedName("ce")
public class class99 extends class141 {

    @ObfuscatedName("ce.n")
    public int field1450;

    @ObfuscatedName("ce.v")
    public int field1442;

    @ObfuscatedName("ce.y")
    public int field1451;

    @ObfuscatedName("ce.r")
    public int field1444;

    @ObfuscatedName("ce.h")
    public int field1445;

    @ObfuscatedName("ce.d")
    public int field1446;

    @ObfuscatedName("ce.s")
    public class272 field1447;

    @ObfuscatedName("ce.b")
    public int field1448;

    @ObfuscatedName("ce.e")
    public int field1441;

    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class141 arg8) {
        this.field1450 = arg0;
        this.field1442 = arg1;
        this.field1451 = arg2;
        this.field1444 = arg3;
        this.field1445 = arg4;
        this.field1446 = arg5;
        if (arg6 != -1) {
            this.field1447 = class272.method579(arg6);
            this.field1448 = 0;
            this.field1441 = client.field883 - 1;
            if (this.field1447.field3693 == 0 && arg8 != null && arg8 instanceof class99) {
                class99 var10 = (class99) arg8;
                if (this.field1447 == var10.field1447) {
                    this.field1448 = var10.field1448;
                    this.field1441 = var10.field1441;
                    return;
                }
            }
            if (arg7 && this.field1447.field3685 != -1) {
                this.field1448 = (int) (Math.random() * (double) this.field1447.field3688.length);
                this.field1441 -= (int) (Math.random() * (double) this.field1447.field3690[this.field1448]);
            }
        }
    }

    @ObfuscatedName("ce.y(B)Les;")
    public final class133 method1047() {
        if (this.field1447 != null) {
            int var1 = client.field883 - this.field1441;
            if (var1 > 100 && this.field1447.field3685 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1447.field3690[this.field1448]) {
                            break label47;
                        }
                        var1 -= this.field1447.field3690[this.field1448];
                        this.field1448++;
                    } while (this.field1448 < this.field1447.field3688.length);
                    this.field1448 -= this.field1447.field3685;
                } while (this.field1448 >= 0 && this.field1448 < this.field1447.field3688.length);
                this.field1447 = null;
            }
            this.field1441 = client.field883 - var1;
        }
        class267 var2 = class267.method1587(this.field1450);
        if (var2.field3549 != null) {
            var2 = var2.method4334();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1451 == 1 || this.field1451 == 3) {
            var3 = var2.field3538;
            var4 = var2.field3537;
        } else {
            var3 = var2.field3537;
            var4 = var2.field3538;
        }
        int var5 = (var3 >> 1) + this.field1445;
        int var6 = (var3 + 1 >> 1) + this.field1445;
        int var7 = (var4 >> 1) + this.field1446;
        int var8 = (var4 + 1 >> 1) + this.field1446;
        int[][] var9 = class62.field742[this.field1444];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1445 << 7) + (var3 << 6);
        int var12 = (this.field1446 << 7) + (var4 << 6);
        return var2.method4311(this.field1442, this.field1451, var9, var11, var10, var12, this.field1447, this.field1448);
    }
}
