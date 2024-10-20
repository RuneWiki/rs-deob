package deob;

@ObfuscatedName("cs")
public class class99 extends class141 {

    @ObfuscatedName("cs.b")
    public int field1446;

    @ObfuscatedName("cs.s")
    public int field1442;

    @ObfuscatedName("cs.r")
    public int field1441;

    @ObfuscatedName("cs.g")
    public int field1444;

    @ObfuscatedName("cs.x")
    public int field1445;

    @ObfuscatedName("cs.f")
    public int field1443;

    @ObfuscatedName("cs.u")
    public class268 field1449;

    @ObfuscatedName("cs.t")
    public int field1448;

    @ObfuscatedName("cs.k")
    public int field1447;

    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class141 arg8) {
        this.field1446 = arg0;
        this.field1442 = arg1;
        this.field1441 = arg2;
        this.field1444 = arg3;
        this.field1445 = arg4;
        this.field1443 = arg5;
        if (arg6 != -1) {
            this.field1449 = class268.method1560(arg6);
            this.field1448 = 0;
            this.field1447 = client.field872 - 1;
            if (this.field1449.field3667 == 0 && arg8 != null && arg8 instanceof class99) {
                class99 var10 = (class99) arg8;
                if (this.field1449 == var10.field1449) {
                    this.field1448 = var10.field1448;
                    this.field1447 = var10.field1447;
                    return;
                }
            }
            if (arg7 && this.field1449.field3658 != -1) {
                this.field1448 = (int) (Math.random() * (double) this.field1449.field3661.length);
                this.field1447 -= (int) (Math.random() * (double) this.field1449.field3656[this.field1448]);
            }
        }
    }

    @ObfuscatedName("cs.r(I)Lev;")
    public final class133 method983() {
        if (this.field1449 != null) {
            int var1 = client.field872 - this.field1447;
            if (var1 > 100 && this.field1449.field3658 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1449.field3656[this.field1448]) {
                            break label47;
                        }
                        var1 -= this.field1449.field3656[this.field1448];
                        this.field1448++;
                    } while (this.field1448 < this.field1449.field3661.length);
                    this.field1448 -= this.field1449.field3658;
                } while (this.field1448 >= 0 && this.field1448 < this.field1449.field3661.length);
                this.field1449 = null;
            }
            this.field1447 = client.field872 - var1;
        }
        class263 var2 = class263.method2851(this.field1446);
        if (var2.field3528 != null) {
            var2 = var2.method4228();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1441 == 1 || this.field1441 == 3) {
            var3 = var2.field3503;
            var4 = var2.field3502;
        } else {
            var3 = var2.field3502;
            var4 = var2.field3503;
        }
        int var5 = (var3 >> 1) + this.field1445;
        int var6 = (var3 + 1 >> 1) + this.field1445;
        int var7 = (var4 >> 1) + this.field1443;
        int var8 = (var4 + 1 >> 1) + this.field1443;
        int[][] var9 = class62.field709[this.field1444];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1445 << 7) + (var3 << 6);
        int var12 = (this.field1443 << 7) + (var4 << 6);
        return var2.method4215(this.field1442, this.field1441, var9, var11, var10, var12, this.field1449, this.field1448);
    }
}
