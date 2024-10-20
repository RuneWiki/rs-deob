package deob;

@ObfuscatedName("cq")
public class class99 extends class141 {

    @ObfuscatedName("cq.m")
    public int field1452;

    @ObfuscatedName("cq.p")
    public int field1447;

    @ObfuscatedName("cq.i")
    public int field1449;

    @ObfuscatedName("cq.j")
    public int field1451;

    @ObfuscatedName("cq.v")
    public int field1453;

    @ObfuscatedName("cq.x")
    public int field1448;

    @ObfuscatedName("cq.e")
    public class268 field1450;

    @ObfuscatedName("cq.l")
    public int field1454;

    @ObfuscatedName("cq.b")
    public int field1455;

    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class141 arg8) {
        this.field1452 = arg0;
        this.field1447 = arg1;
        this.field1449 = arg2;
        this.field1451 = arg3;
        this.field1453 = arg4;
        this.field1448 = arg5;
        if (arg6 != -1) {
            this.field1450 = class268.method2289(arg6);
            this.field1454 = 0;
            this.field1455 = client.field1054 - 1;
            if (this.field1450.field3656 == 0 && arg8 != null && arg8 instanceof class99) {
                class99 var10 = (class99) arg8;
                if (this.field1450 == var10.field1450) {
                    this.field1454 = var10.field1454;
                    this.field1455 = var10.field1455;
                    return;
                }
            }
            if (arg7 && this.field1450.field3664 != -1) {
                this.field1454 = (int) (Math.random() * (double) this.field1450.field3660.length);
                this.field1455 -= (int) (Math.random() * (double) this.field1450.field3662[this.field1454]);
            }
        }
    }

    @ObfuscatedName("cq.i(I)Len;")
    public final class133 method1070() {
        if (this.field1450 != null) {
            int var1 = client.field1054 - this.field1455;
            if (var1 > 100 && this.field1450.field3664 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1450.field3662[this.field1454]) {
                            break label47;
                        }
                        var1 -= this.field1450.field3662[this.field1454];
                        this.field1454++;
                    } while (this.field1454 < this.field1450.field3660.length);
                    this.field1454 -= this.field1450.field3664;
                } while (this.field1454 >= 0 && this.field1454 < this.field1450.field3660.length);
                this.field1450 = null;
            }
            this.field1455 = client.field1054 - var1;
        }
        class263 var2 = class263.method190(this.field1452);
        if (var2.field3519 != null) {
            var2 = var2.method4337();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1449 == 1 || this.field1449 == 3) {
            var3 = var2.field3525;
            var4 = var2.field3503;
        } else {
            var3 = var2.field3503;
            var4 = var2.field3525;
        }
        int var5 = (var3 >> 1) + this.field1453;
        int var6 = (var3 + 1 >> 1) + this.field1453;
        int var7 = (var4 >> 1) + this.field1448;
        int var8 = (var4 + 1 >> 1) + this.field1448;
        int[][] var9 = class62.field740[this.field1451];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1453 << 7) + (var3 << 6);
        int var12 = (this.field1448 << 7) + (var4 << 6);
        return var2.method4327(this.field1447, this.field1449, var9, var11, var10, var12, this.field1450, this.field1454);
    }
}
