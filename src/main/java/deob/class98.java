package deob;

@ObfuscatedName("cl")
public class class98 extends class140 {

    @ObfuscatedName("cl.t")
    public int field1446;

    @ObfuscatedName("cl.q")
    public int field1438;

    @ObfuscatedName("cl.i")
    public int field1439;

    @ObfuscatedName("cl.a")
    public int field1440;

    @ObfuscatedName("cl.l")
    public int field1444;

    @ObfuscatedName("cl.b")
    public int field1441;

    @ObfuscatedName("cl.e")
    public class288 field1443;

    @ObfuscatedName("cl.x")
    public int field1445;

    @ObfuscatedName("cl.p")
    public int field1437;

    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class140 arg8) {
        this.field1446 = arg0;
        this.field1438 = arg1;
        this.field1439 = arg2;
        this.field1440 = arg3;
        this.field1444 = arg4;
        this.field1441 = arg5;
        if (arg6 != -1) {
            this.field1443 = class288.method2932(arg6);
            this.field1445 = 0;
            this.field1437 = client.field1108 - 1;
            if (this.field1443.field3773 == 0 && arg8 != null && arg8 instanceof class98) {
                class98 var10 = (class98) arg8;
                if (this.field1443 == var10.field1443) {
                    this.field1445 = var10.field1445;
                    this.field1437 = var10.field1437;
                    return;
                }
            }
            if (arg7 && this.field1443.field3764 != -1) {
                this.field1445 = (int) (Math.random() * (double) this.field1443.field3760.length);
                this.field1437 -= (int) (Math.random() * (double) this.field1443.field3762[this.field1445]);
            }
        }
    }

    @ObfuscatedName("cl.p(B)Lek;")
    public final class132 method1098() {
        if (this.field1443 != null) {
            int var1 = client.field1108 - this.field1437;
            if (var1 > 100 && this.field1443.field3764 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1443.field3762[this.field1445]) {
                            break label47;
                        }
                        var1 -= this.field1443.field3762[this.field1445];
                        this.field1445++;
                    } while (this.field1445 < this.field1443.field3760.length);
                    this.field1445 -= this.field1443.field3764;
                } while (this.field1445 >= 0 && this.field1445 < this.field1443.field3760.length);
                this.field1443 = null;
            }
            this.field1437 = client.field1108 - var1;
        }
        class283 var2 = class283.method4427(this.field1446);
        if (var2.field3606 != null) {
            var2 = var2.method4615();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1439 == 1 || this.field1439 == 3) {
            var3 = var2.field3608;
            var4 = var2.field3610;
        } else {
            var3 = var2.field3610;
            var4 = var2.field3608;
        }
        int var5 = (var3 >> 1) + this.field1444;
        int var6 = (var3 + 1 >> 1) + this.field1444;
        int var7 = (var4 >> 1) + this.field1441;
        int var8 = (var4 + 1 >> 1) + this.field1441;
        int[][] var9 = class63.field707[this.field1440];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1444 << 7) + (var3 << 6);
        int var12 = (this.field1441 << 7) + (var4 << 6);
        return var2.method4613(this.field1438, this.field1439, var9, var11, var10, var12, this.field1443, this.field1445);
    }
}
