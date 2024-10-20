package deob;

@ObfuscatedName("cc")
public final class class84 extends class141 {

    @ObfuscatedName("cc.m")
    public int field1275;

    @ObfuscatedName("cc.p")
    public int field1271;

    @ObfuscatedName("cc.i")
    public int field1272;

    @ObfuscatedName("cc.j")
    public int field1273;

    @ObfuscatedName("cc.v")
    public int field1274;

    @ObfuscatedName("cc.x")
    public int field1278;

    @ObfuscatedName("cc.e")
    public class268 field1276;

    @ObfuscatedName("cc.l")
    public int field1277 = 0;

    @ObfuscatedName("cc.b")
    public int field1270 = 0;

    @ObfuscatedName("cc.n")
    public boolean field1279 = false;

    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1275 = arg0;
        this.field1272 = arg1;
        this.field1273 = arg2;
        this.field1274 = arg3;
        this.field1278 = arg4;
        this.field1271 = arg5 + arg6;
        int var8 = class253.method4750(this.field1275).field3387;
        if (var8 == -1) {
            this.field1279 = true;
        } else {
            this.field1279 = false;
            this.field1276 = class268.method2289(var8);
        }
    }

    @ObfuscatedName("cc.m(II)V")
    public final void method1602(int arg0) {
        if (this.field1279) {
            return;
        }
        this.field1270 += arg0;
        while (this.field1270 > this.field1276.field3662[this.field1277]) {
            this.field1270 -= this.field1276.field3662[this.field1277];
            this.field1277++;
            if (this.field1277 >= this.field1276.field3660.length) {
                this.field1279 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cc.i(I)Len;")
    public final class133 method1070() {
        class253 var1 = class253.method4750(this.field1275);
        class133 var2;
        if (this.field1279) {
            var2 = var1.method4154(-1);
        } else {
            var2 = var1.method4154(this.field1277);
        }
        return var2 == null ? null : var2;
    }
}
