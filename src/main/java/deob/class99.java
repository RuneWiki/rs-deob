package deob;

@ObfuscatedName("cc")
public class class99 extends class140 {

    @ObfuscatedName("cc.d")
    public int field1537;

    @ObfuscatedName("cc.k")
    public int field1530;

    @ObfuscatedName("cc.e")
    public int field1540;

    @ObfuscatedName("cc.p")
    public int field1529;

    @ObfuscatedName("cc.q")
    public int field1533;

    @ObfuscatedName("cc.s")
    public int field1534;

    @ObfuscatedName("cc.r")
    public class261 field1535;

    @ObfuscatedName("cc.g")
    public int field1536;

    @ObfuscatedName("cc.v")
    public int field1532;

    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class140 arg8) {
        this.field1537 = arg0;
        this.field1530 = arg1;
        this.field1540 = arg2;
        this.field1529 = arg3;
        this.field1533 = arg4;
        this.field1534 = arg5;
        if (arg6 != -1) {
            this.field1535 = class261.method3613(arg6);
            this.field1536 = 0;
            this.field1532 = client.field931 - 1;
            if (this.field1535.field3604 == 0 && arg8 != null && arg8 instanceof class99) {
                class99 var10 = (class99) arg8;
                if (this.field1535 == var10.field1535) {
                    this.field1536 = var10.field1536;
                    this.field1532 = var10.field1532;
                    return;
                }
            }
            if (arg7 && this.field1535.field3609 != -1) {
                this.field1536 = (int) (Math.random() * (double) this.field1535.field3622.length);
                this.field1532 -= (int) (Math.random() * (double) this.field1535.field3611[this.field1536]);
            }
        }
    }

    @ObfuscatedName("cc.e(I)Leb;")
    public final class132 method1070() {
        if (this.field1535 != null) {
            int var1 = client.field931 - this.field1532;
            if (var1 > 100 && this.field1535.field3609 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1535.field3611[this.field1536]) {
                            break label47;
                        }
                        var1 -= this.field1535.field3611[this.field1536];
                        this.field1536++;
                    } while (this.field1536 < this.field1535.field3622.length);
                    this.field1536 -= this.field1535.field3609;
                } while (this.field1536 >= 0 && this.field1536 < this.field1535.field3622.length);
                this.field1535 = null;
            }
            this.field1532 = client.field931 - var1;
        }
        class256 var2 = class256.method2710(this.field1537);
        if (var2.field3486 != null) {
            var2 = var2.method4300();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1540 == 1 || this.field1540 == 3) {
            var3 = var2.field3455;
            var4 = var2.field3454;
        } else {
            var3 = var2.field3454;
            var4 = var2.field3455;
        }
        int var5 = (var3 >> 1) + this.field1533;
        int var6 = (var3 + 1 >> 1) + this.field1533;
        int var7 = (var4 >> 1) + this.field1534;
        int var8 = (var4 + 1 >> 1) + this.field1534;
        int[][] var9 = class62.field781[this.field1529];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1533 << 7) + (var3 << 6);
        int var12 = (this.field1534 << 7) + (var4 << 6);
        return var2.method4257(this.field1530, this.field1540, var9, var11, var10, var12, this.field1535, this.field1536);
    }
}
