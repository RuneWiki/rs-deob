package deob;

@ObfuscatedName("ch")
public class class88 extends class130 {

    @ObfuscatedName("ch.f")
    public int field1245;

    @ObfuscatedName("ch.h")
    public int field1242;

    @ObfuscatedName("ch.e")
    public int field1243;

    @ObfuscatedName("ch.b")
    public int field1252;

    @ObfuscatedName("ch.l")
    public int field1249;

    @ObfuscatedName("ch.w")
    public int field1247;

    @ObfuscatedName("ch.d")
    public class276 field1248;

    @ObfuscatedName("ch.n")
    public int field1244;

    @ObfuscatedName("ch.s")
    public int field1250;

    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class130 arg8) {
        this.field1245 = arg0;
        this.field1242 = arg1;
        this.field1243 = arg2;
        this.field1252 = arg3;
        this.field1249 = arg4;
        this.field1247 = arg5;
        if (arg6 != -1) {
            this.field1248 = class276.method2865(arg6);
            this.field1244 = 0;
            this.field1250 = client.field633 - 1;
            if (this.field1248.field3610 == 0 && arg8 != null && arg8 instanceof class88) {
                class88 var10 = (class88) arg8;
                if (this.field1248 == var10.field1248) {
                    this.field1244 = var10.field1244;
                    this.field1250 = var10.field1250;
                    return;
                }
            }
            if (arg7 && this.field1248.field3601 != -1) {
                this.field1244 = (int) (Math.random() * (double) this.field1248.field3597.length);
                this.field1250 -= (int) (Math.random() * (double) this.field1248.field3599[this.field1244]);
            }
        }
    }

    @ObfuscatedName("ch.s(B)Lds;")
    public final class122 method1038() {
        if (this.field1248 != null) {
            int var1 = client.field633 - this.field1250;
            if (var1 > 100 && this.field1248.field3601 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1248.field3599[this.field1244]) {
                            break label47;
                        }
                        var1 -= this.field1248.field3599[this.field1244];
                        this.field1244++;
                    } while (this.field1244 < this.field1248.field3597.length);
                    this.field1244 -= this.field1248.field3601;
                } while (this.field1244 >= 0 && this.field1244 < this.field1248.field3597.length);
                this.field1248 = null;
            }
            this.field1250 = client.field633 - var1;
        }
        class271 var2 = class271.method1706(this.field1245);
        if (var2.field3472 != null) {
            var2 = var2.method4682();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1243 == 1 || this.field1243 == 3) {
            var3 = var2.field3447;
            var4 = var2.field3446;
        } else {
            var3 = var2.field3446;
            var4 = var2.field3447;
        }
        int var5 = (var3 >> 1) + this.field1249;
        int var6 = (var3 + 1 >> 1) + this.field1249;
        int var7 = (var4 >> 1) + this.field1247;
        int var8 = (var4 + 1 >> 1) + this.field1247;
        int[][] var9 = class51.field460[this.field1252];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1249 << 7) + (var3 << 6);
        int var12 = (this.field1247 << 7) + (var4 << 6);
        return var2.method4690(this.field1242, this.field1243, var9, var11, var10, var12, this.field1248, this.field1244);
    }
}
