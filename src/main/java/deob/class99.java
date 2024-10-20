package deob;

@ObfuscatedName("ci")
public class class99 extends class140 {

    @ObfuscatedName("ci.w")
    public int field1544;

    @ObfuscatedName("ci.s")
    public int field1535;

    @ObfuscatedName("ci.q")
    public int field1536;

    @ObfuscatedName("ci.o")
    public int field1537;

    @ObfuscatedName("ci.g")
    public int field1538;

    @ObfuscatedName("ci.v")
    public int field1539;

    @ObfuscatedName("ci.p")
    public class261 field1545;

    @ObfuscatedName("ci.e")
    public int field1541;

    @ObfuscatedName("ci.d")
    public int field1542;

    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class140 arg8) {
        this.field1544 = arg0;
        this.field1535 = arg1;
        this.field1536 = arg2;
        this.field1537 = arg3;
        this.field1538 = arg4;
        this.field1539 = arg5;
        if (arg6 != -1) {
            this.field1545 = class261.method4424(arg6);
            this.field1541 = 0;
            this.field1542 = client.field933 - 1;
            if (this.field1545.field3620 == 0 && arg8 != null && arg8 instanceof class99) {
                class99 var10 = (class99) arg8;
                if (this.field1545 == var10.field1545) {
                    this.field1541 = var10.field1541;
                    this.field1542 = var10.field1542;
                    return;
                }
            }
            if (arg7 && this.field1545.field3611 != -1) {
                this.field1541 = (int) (Math.random() * (double) this.field1545.field3607.length);
                this.field1542 -= (int) (Math.random() * (double) this.field1545.field3609[this.field1541]);
            }
        }
    }

    @ObfuscatedName("ci.q(B)Leh;")
    public final class132 method1030() {
        if (this.field1545 != null) {
            int var1 = client.field933 - this.field1542;
            if (var1 > 100 && this.field1545.field3611 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1545.field3609[this.field1541]) {
                            break label47;
                        }
                        var1 -= this.field1545.field3609[this.field1541];
                        this.field1541++;
                    } while (this.field1541 < this.field1545.field3607.length);
                    this.field1541 -= this.field1545.field3611;
                } while (this.field1541 >= 0 && this.field1541 < this.field1545.field3607.length);
                this.field1545 = null;
            }
            this.field1542 = client.field933 - var1;
        }
        class256 var2 = class256.method2861(this.field1544);
        if (var2.field3477 != null) {
            var2 = var2.method4279();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1536 == 1 || this.field1536 == 3) {
            var3 = var2.field3452;
            var4 = var2.field3445;
        } else {
            var3 = var2.field3445;
            var4 = var2.field3452;
        }
        int var5 = (var3 >> 1) + this.field1538;
        int var6 = (var3 + 1 >> 1) + this.field1538;
        int var7 = (var4 >> 1) + this.field1539;
        int var8 = (var4 + 1 >> 1) + this.field1539;
        int[][] var9 = class62.field774[this.field1537];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1538 << 7) + (var3 << 6);
        int var12 = (this.field1539 << 7) + (var4 << 6);
        return var2.method4311(this.field1535, this.field1536, var9, var11, var10, var12, this.field1545, this.field1541);
    }
}
