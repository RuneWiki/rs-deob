package deob;

@ObfuscatedName("cz")
public final class class84 extends class141 {

    @ObfuscatedName("cz.b")
    public int field1271;

    @ObfuscatedName("cz.s")
    public int field1282;

    @ObfuscatedName("cz.r")
    public int field1270;

    @ObfuscatedName("cz.g")
    public int field1273;

    @ObfuscatedName("cz.x")
    public int field1274;

    @ObfuscatedName("cz.f")
    public int field1275;

    @ObfuscatedName("cz.u")
    public class268 field1276;

    @ObfuscatedName("cz.t")
    public int field1277 = 0;

    @ObfuscatedName("cz.k")
    public int field1278 = 0;

    @ObfuscatedName("cz.n")
    public boolean field1279 = false;

    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1271 = arg0;
        this.field1270 = arg1;
        this.field1273 = arg2;
        this.field1274 = arg3;
        this.field1275 = arg4;
        this.field1282 = arg5 + arg6;
        int var8 = class253.method3933(this.field1271).field3388;
        if (var8 == -1) {
            this.field1279 = true;
        } else {
            this.field1279 = false;
            this.field1276 = class268.method1560(var8);
        }
    }

    @ObfuscatedName("cz.b(II)V")
    public final void method1521(int arg0) {
        if (this.field1279) {
            return;
        }
        this.field1278 += arg0;
        while (this.field1278 > this.field1276.field3656[this.field1277]) {
            this.field1278 -= this.field1276.field3656[this.field1277];
            this.field1277++;
            if (this.field1277 >= this.field1276.field3661.length) {
                this.field1279 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cz.r(I)Lev;")
    public final class133 method983() {
        class253 var1 = class253.method3933(this.field1271);
        class133 var2;
        if (this.field1279) {
            var2 = var1.method4018(-1);
        } else {
            var2 = var1.method4018(this.field1277);
        }
        return var2 == null ? null : var2;
    }
}
