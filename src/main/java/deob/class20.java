package deob;

@ObfuscatedName("z")
public final class class20 extends class94 {

    @ObfuscatedName("z.f")
    public int field294;

    @ObfuscatedName("z.t")
    public int field281;

    @ObfuscatedName("z.n")
    public int field282;

    @ObfuscatedName("z.e")
    public int field283;

    @ObfuscatedName("z.l")
    public int field280;

    @ObfuscatedName("z.d")
    public int field287;

    @ObfuscatedName("z.r")
    public class34 field286;

    @ObfuscatedName("z.k")
    public int field284 = 0;

    @ObfuscatedName("z.u")
    public int field288 = 0;

    @ObfuscatedName("z.o")
    public boolean field285 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field294 = arg0;
        this.field282 = arg1;
        this.field283 = arg2;
        this.field280 = arg3;
        this.field287 = arg4;
        this.field281 = arg5 + arg6;
        int var8 = class35.method115(this.field294).field900;
        if (var8 == -1) {
            this.field285 = true;
        } else {
            this.field285 = false;
            this.field286 = class34.method572(var8);
        }
    }

    @ObfuscatedName("z.f(IB)V")
    public final void method182(int arg0) {
        if (this.field285) {
            return;
        }
        this.field288 += arg0;
        while (this.field288 > this.field286.field887[this.field284]) {
            this.field288 -= this.field286.field887[this.field284];
            this.field284++;
            if (this.field284 >= this.field286.field890.length) {
                this.field285 = true;
                break;
            }
        }
    }

    @ObfuscatedName("z.t(I)Ldp;")
    public final class112 method13() {
        class35 var1 = class35.method115(this.field294);
        class112 var2;
        if (this.field285) {
            var2 = var1.method737(-1);
        } else {
            var2 = var1.method737(this.field284);
        }
        return var2 == null ? null : var2;
    }
}
