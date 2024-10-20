package deob;

@ObfuscatedName("cs")
public final class class83 extends class140 {

    @ObfuscatedName("cs.d")
    public int field1273;

    @ObfuscatedName("cs.z")
    public int field1277;

    @ObfuscatedName("cs.n")
    public int field1275;

    @ObfuscatedName("cs.r")
    public int field1283;

    @ObfuscatedName("cs.e")
    public int field1272;

    @ObfuscatedName("cs.y")
    public class288 field1274;

    @ObfuscatedName("cs.k")
    public int field1278;

    @ObfuscatedName("cs.s")
    public int field1279 = 0;

    @ObfuscatedName("cs.p")
    public int field1280 = 0;

    @ObfuscatedName("cs.x")
    public boolean field1281 = false;

    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1273 = arg0;
        this.field1283 = arg1;
        this.field1272 = arg2;
        this.field1278 = arg3;
        this.field1277 = arg4;
        this.field1275 = arg5 + arg6;
        int var8 = class273.method698(this.field1273).field3485;
        if (var8 == -1) {
            this.field1281 = true;
        } else {
            this.field1281 = false;
            this.field1274 = class288.method4510(var8);
        }
    }

    @ObfuscatedName("cs.d(II)V")
    public final void method1706(int arg0) {
        if (this.field1281) {
            return;
        }
        this.field1280 += arg0;
        while (this.field1280 > this.field1274.field3758[this.field1279]) {
            this.field1280 -= this.field1274.field3758[this.field1279];
            this.field1279++;
            if (this.field1279 >= this.field1274.field3764.length) {
                this.field1281 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cs.x(I)Lel;")
    public final class132 method1067() {
        class273 var1 = class273.method698(this.field1273);
        class132 var2;
        if (this.field1281) {
            var2 = var1.method4528(-1);
        } else {
            var2 = var1.method4528(this.field1279);
        }
        return var2 == null ? null : var2;
    }
}
