package deob;

@ObfuscatedName("cs")
public final class class84 extends class141 {

    @ObfuscatedName("cs.n")
    public int field1275;

    @ObfuscatedName("cs.v")
    public int field1276;

    @ObfuscatedName("cs.y")
    public class272 field1281;

    @ObfuscatedName("cs.r")
    public int field1277;

    @ObfuscatedName("cs.h")
    public int field1279;

    @ObfuscatedName("cs.d")
    public int field1286;

    @ObfuscatedName("cs.s")
    public int field1280;

    @ObfuscatedName("cs.b")
    public int field1285 = 0;

    @ObfuscatedName("cs.e")
    public int field1283 = 0;

    @ObfuscatedName("cs.f")
    public boolean field1284 = false;

    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1275 = arg0;
        this.field1277 = arg1;
        this.field1279 = arg2;
        this.field1286 = arg3;
        this.field1280 = arg4;
        this.field1276 = arg5 + arg6;
        int var8 = Statics.method4461(this.field1275).field3420;
        if (var8 == -1) {
            this.field1284 = true;
        } else {
            this.field1284 = false;
            this.field1281 = class272.method579(var8);
        }
    }

    @ObfuscatedName("cs.n(II)V")
    public final void method1559(int arg0) {
        if (this.field1284) {
            return;
        }
        this.field1283 += arg0;
        while (this.field1283 > this.field1281.field3690[this.field1285]) {
            this.field1283 -= this.field1281.field3690[this.field1285];
            this.field1285++;
            if (this.field1285 >= this.field1281.field3688.length) {
                this.field1284 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cs.y(B)Les;")
    public final class133 method1047() {
        class257 var1 = Statics.method4461(this.field1275);
        class133 var2;
        if (this.field1284) {
            var2 = var1.method4116(-1);
        } else {
            var2 = var1.method4116(this.field1285);
        }
        return var2 == null ? null : var2;
    }
}
