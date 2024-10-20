package deob;

@ObfuscatedName("co")
public class class93 extends class135 {

    @ObfuscatedName("co.a")
    public int field1289;

    @ObfuscatedName("co.s")
    public int field1292;

    @ObfuscatedName("co.g")
    public int field1285;

    @ObfuscatedName("co.x")
    public int field1283;

    @ObfuscatedName("co.h")
    public int field1284;

    @ObfuscatedName("co.f")
    public int field1281;

    @ObfuscatedName("co.p")
    public class280 field1286;

    @ObfuscatedName("co.m")
    public int field1288;

    @ObfuscatedName("co.q")
    public int field1280;

    public class93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class135 arg8) {
        this.field1289 = arg0;
        this.field1292 = arg1;
        this.field1285 = arg2;
        this.field1283 = arg3;
        this.field1284 = arg4;
        this.field1281 = arg5;
        if (arg6 != -1) {
            this.field1286 = class280.method3173(arg6);
            this.field1288 = 0;
            this.field1280 = client.field660 - 1;
            if (this.field1286.field3633 == 0 && arg8 != null && arg8 instanceof class93) {
                class93 var10 = (class93) arg8;
                if (this.field1286 == var10.field1286) {
                    this.field1288 = var10.field1288;
                    this.field1280 = var10.field1280;
                    return;
                }
            }
            if (arg7 && this.field1286.field3624 != -1) {
                this.field1288 = (int) (Math.random() * (double) this.field1286.field3620.length);
                this.field1280 -= (int) (Math.random() * (double) this.field1286.field3622[this.field1288]);
            }
        }
    }

    @ObfuscatedName("co.q(I)Ldv;")
    public final class127 method1112() {
        if (this.field1286 != null) {
            int var1 = client.field660 - this.field1280;
            if (var1 > 100 && this.field1286.field3624 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1286.field3622[this.field1288]) {
                            break label47;
                        }
                        var1 -= this.field1286.field3622[this.field1288];
                        this.field1288++;
                    } while (this.field1288 < this.field1286.field3620.length);
                    this.field1288 -= this.field1286.field3624;
                } while (this.field1288 >= 0 && this.field1288 < this.field1286.field3620.length);
                this.field1286 = null;
            }
            this.field1280 = client.field660 - var1;
        }
        class275 var2 = class275.method117(this.field1289);
        if (var2.field3494 != null) {
            var2 = var2.method4852();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1285 == 1 || this.field1285 == 3) {
            var3 = var2.field3469;
            var4 = var2.field3491;
        } else {
            var3 = var2.field3491;
            var4 = var2.field3469;
        }
        int var5 = (var3 >> 1) + this.field1284;
        int var6 = (var3 + 1 >> 1) + this.field1284;
        int var7 = (var4 >> 1) + this.field1281;
        int var8 = (var4 + 1 >> 1) + this.field1281;
        int[][] var9 = class56.field508[this.field1283];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1284 << 7) + (var3 << 6);
        int var12 = (this.field1281 << 7) + (var4 << 6);
        return var2.method4846(this.field1292, this.field1285, var9, var11, var10, var12, this.field1286, this.field1288);
    }
}
