package deob;

@ObfuscatedName("cs")
public class class97 extends class139 {

    @ObfuscatedName("cs.b")
    public int field1418;

    @ObfuscatedName("cs.q")
    public int field1415;

    @ObfuscatedName("cs.o")
    public int field1421;

    @ObfuscatedName("cs.p")
    public int field1416;

    @ObfuscatedName("cs.a")
    public int field1417;

    @ObfuscatedName("cs.h")
    public int field1419;

    @ObfuscatedName("cs.l")
    public class281 field1420;

    @ObfuscatedName("cs.y")
    public int field1424;

    @ObfuscatedName("cs.g")
    public int field1422;

    public class97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class139 arg8) {
        this.field1418 = arg0;
        this.field1415 = arg1;
        this.field1421 = arg2;
        this.field1416 = arg3;
        this.field1417 = arg4;
        this.field1419 = arg5;
        if (arg6 != -1) {
            this.field1420 = class281.method2838(arg6);
            this.field1424 = 0;
            this.field1422 = client.field830 - 1;
            if (this.field1420.field3697 == 0 && arg8 != null && arg8 instanceof class97) {
                class97 var10 = (class97) arg8;
                if (this.field1420 == var10.field1420) {
                    this.field1424 = var10.field1424;
                    this.field1422 = var10.field1422;
                    return;
                }
            }
            if (arg7 && this.field1420.field3688 != -1) {
                this.field1424 = (int) (Math.random() * (double) this.field1420.field3684.length);
                this.field1422 -= (int) (Math.random() * (double) this.field1420.field3693[this.field1424]);
            }
        }
    }

    @ObfuscatedName("cs.g(I)Lee;")
    public final class131 method1092() {
        if (this.field1420 != null) {
            int var1 = client.field830 - this.field1422;
            if (var1 > 100 && this.field1420.field3688 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1420.field3693[this.field1424]) {
                            break label47;
                        }
                        var1 -= this.field1420.field3693[this.field1424];
                        this.field1424++;
                    } while (this.field1424 < this.field1420.field3684.length);
                    this.field1424 -= this.field1420.field3688;
                } while (this.field1424 >= 0 && this.field1424 < this.field1420.field3684.length);
                this.field1420 = null;
            }
            this.field1422 = client.field830 - var1;
        }
        class276 var2 = class276.method1566(this.field1418);
        if (var2.field3541 != null) {
            var2 = var2.method4563();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1421 == 1 || this.field1421 == 3) {
            var3 = var2.field3534;
            var4 = var2.field3533;
        } else {
            var3 = var2.field3533;
            var4 = var2.field3534;
        }
        int var5 = (var3 >> 1) + this.field1417;
        int var6 = (var3 + 1 >> 1) + this.field1417;
        int var7 = (var4 >> 1) + this.field1419;
        int var8 = (var4 + 1 >> 1) + this.field1419;
        int[][] var9 = class62.field689[this.field1416];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1417 << 7) + (var3 << 6);
        int var12 = (this.field1419 << 7) + (var4 << 6);
        return var2.method4561(this.field1415, this.field1421, var9, var11, var10, var12, this.field1420, this.field1424);
    }
}
